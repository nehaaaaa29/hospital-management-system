package com.hospitalManagement.HotelManagement.Service;

import com.hospitalManagement.HotelManagement.Entity.Insurance;
import com.hospitalManagement.HotelManagement.Entity.Patient;
import com.hospitalManagement.HotelManagement.Repository.InsuranceRepository;
import com.hospitalManagement.HotelManagement.Repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InsuranceService {
    private final InsuranceRepository insuranceRepository;
    private  final PatientRepository patientRepository;

    @Transactional
    public Insurance assignInsuranceToPatient(Insurance insurance,Long patientId){

        Patient patient=patientRepository.findById(patientId).orElseThrow();

        patient.setInsurance(insurance);

        insurance.setPatient(patient); //optional...
        return insurance;
    }

    @Transactional
    public Insurance updateInsuranceOfAPatient(Insurance insurance,Long patientId){

        Patient patient=patientRepository.findById(patientId).orElseThrow();

        patient.setInsurance(insurance);

        insurance.setPatient(patient); //optional...
        return insurance;
    }

    @Transactional
    public Patient removeInsuranceOfPatient(Long patientId){

        Patient patient=patientRepository.findById(patientId).orElseThrow();

        patient.setInsurance(null);


        return patient;
    }

}
