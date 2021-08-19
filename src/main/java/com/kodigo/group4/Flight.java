package com.kodigo.group4;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Flight {
    @Getter @Setter
    String flightNumber;

    @Getter @Setter
    String status;

    @Getter @Setter
    String originCountry;

    @Getter @Setter
    String originCity;

    @Getter @Setter
    Date departureDate_Planned;

    @Getter @Setter
    Date departureTime_Planned;

    @Getter @Setter
    Date departureDate_Real;

    @Getter @Setter
    Date departureTime_Real;

    @Getter @Setter
    String destinationCountry;

    @Getter @Setter
    String destinationCity;

    @Getter @Setter
    Date ArrivalDate_Planned;

    @Getter @Setter
    Date arrivalTime_Planned;

    @Getter @Setter
    Date ArrivalDate_Real;

    @Getter @Setter
    Date arrivalTime_Real;

    @Getter @Setter
    boolean landed;

    @Getter @Setter
    String incidents;

    @Getter @Setter
    Airline airline1;


}
