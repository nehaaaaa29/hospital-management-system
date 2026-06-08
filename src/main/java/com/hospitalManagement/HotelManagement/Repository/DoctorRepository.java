package com.hospitalManagement.HotelManagement.Repository;

import com.hospitalManagement.HotelManagement.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.print.Doc;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {
}
