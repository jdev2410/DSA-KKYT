package com.dsa.learning.lld.parkinglot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ParkingSpot {
    private String parkingSpotId;
    private Vehicle vehicle;
}
