package com.dsa.learning.lld.parkinglot;

import java.util.List;
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
public class ParkingLot {
    private ParkingLotNameEnum parkingLotName;
    private List<ParkingSpot> parkingSpot;
}
