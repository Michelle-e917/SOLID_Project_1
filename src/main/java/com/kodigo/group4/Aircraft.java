package com.kodigo.group4;

import lombok.Getter;
import lombok.Setter;

public class Aircraft extends Airline{
    @Getter @Setter
    String model;

    @Getter @Setter
    int passengerCapacity;

    @Getter @Setter
    double range;

    @Getter @Setter
    int manufacturingYear;

    String showInformation(){
        return "";
    }

}
