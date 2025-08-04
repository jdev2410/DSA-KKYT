package com.dsa.learning.lld.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class MainParkingLot {
    private int emptySpotsInWingOne = 8;
    private int emptySpotsInWingTwo = 8;

    public static void main(String[] args) throws InterruptedException {
        Vehicle vehicle = Vehicle.builder().vehicleType(VehicleTypeEnum.BIKE).numberPlate("PB65 KA2568")
                .build();
        MainParkingLot mainParkingLot= new MainParkingLot();
        mainParkingLot.parkMyVehicle(vehicle);
    }
    public void parkMyVehicle(Vehicle vehicle) throws InterruptedException {
        if (emptySpotsInWingOne >= 1) {
            List<ParkingSpot> parkingSpotList = new ArrayList<>();
            parkingSpotList.add(ParkingSpot.builder().parkingSpotId("A1")
                    .vehicle(vehicle)
                    .build());
            ParkingLot parkingLot = ParkingLot.builder().parkingLotName(ParkingLotNameEnum.WING_1).parkingSpot(parkingSpotList).build();
            System.out.println("Vehicle is getting parked...");
            Thread.sleep(3000);
            emptySpotsInWingOne--;
            System.out.println("Your Vehicle got parked in " + parkingLot.getParkingLotName() + " parking");
        } else {
            System.out.println("Parking filled in Wing-A");
        }

    }
}
