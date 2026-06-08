package com.hospitalManagement.HotelManagement.Service;

import com.hospitalManagement.HotelManagement.Entity.Appointment;
import com.hospitalManagement.HotelManagement.Entity.Doctor;
import com.hospitalManagement.HotelManagement.Entity.Patient;
import com.hospitalManagement.HotelManagement.Repository.AppointmentRepository;
import com.hospitalManagement.HotelManagement.Repository.DoctorRepository;
import com.hospitalManagement.HotelManagement.Repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class AppointmentService {
    private  final AppointmentRepository appointmentRepository;
    private  final DoctorRepository doctorRepository;
    private  final PatientRepository patientRepository;
    public  Appointment createNewAppointment(Appointment appointment,Long patientId,Long doctorId){
        Patient patient =patientRepository.findById(patientId).orElseThrow();
        Doctor doctor= doctorRepository.findById(doctorId).orElseThrow();
        appointment.setPatient(patient);
        appointment.setDoctor(doctor);

        appointmentRepository.save(appointment);
        return appointment;
    }
}
