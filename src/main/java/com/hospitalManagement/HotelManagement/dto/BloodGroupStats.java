package com.hospitalManagement.HotelManagement.dto;

import com.hospitalManagement.HotelManagement.Entity.type.BloodGroupType;
import lombok.Data;

@Data
public class BloodGroupStats {
    private final BloodGroupType bloodGroupType;
    private final Long count;
}
