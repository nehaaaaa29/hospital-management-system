package com.hospitalManagement.HotelManagement.Repository;

import com.hospitalManagement.HotelManagement.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {
}
