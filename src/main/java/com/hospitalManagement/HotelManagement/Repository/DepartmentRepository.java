package com.hospitalManagement.HotelManagement.Repository;

import com.hospitalManagement.HotelManagement.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
