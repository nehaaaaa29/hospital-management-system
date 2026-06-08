package com.hospitalManagement.HotelManagement;

import com.hospitalManagement.HotelManagement.Entity.Appointment;
import com.hospitalManagement.HotelManagement.Entity.Insurance;
import com.hospitalManagement.HotelManagement.Service.AppointmentService;
import com.hospitalManagement.HotelManagement.Service.InsuranceService;
import com.hospitalManagement.HotelManagement.Service.patientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class InsuranceTest {
@Autowired
private patientService patientservice;
@Autowired
    private InsuranceService insuranceService;

@Autowired
private AppointmentService appointmentService;

     @Test
    public void testAssignInsuranceToPatient(){

         Insurance insurance=Insurance.builder()
                 .provider("HDFE Ergo")
                 .policyNumber("HDFC_23G")
                 .validUntil(LocalDate.of(2030,1,1).atStartOfDay())

                 .build();
         var updatedInsurance=insuranceService.assignInsuranceToPatient(insurance,1L);

         System.out.println(updatedInsurance);

       //  patientservice.deletePatient(1L);

         var patient=insuranceService.removeInsuranceOfPatient(3L);
         System.out.println(patient);

     }
@Test
public  void CreateAppointment(){
    Appointment appointment=Appointment.builder()
            .appointmentTime(LocalDateTime.of(2027,5,4,0,0,0))
            .reason("Cancer")
            .build();
        var updatedAppointment= appointmentService.createNewAppointment(appointment,3L,2L);
    System.out.println(updatedAppointment);

}

}
