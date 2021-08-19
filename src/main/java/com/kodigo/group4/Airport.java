package com.kodigo.group4;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    public static void main(String[] args) {
        //test add flights is working
        /* List<Flight> flightList = new ArrayList<Flight>();

        Flight flight_var = new Flight();
        flight_var.setFlightNumber("vuelo1");

        FlightManualAdder flightManualAdder_var = new FlightManualAdder();
        flightManualAdder_var.addFlight(flight_var);

        System.out.println("Information of the flight:" + flightManualAdder_var.getFlightList_var().get(0).getFlightNumber());
        */
        //test lists of flights
        FlightLister flightLister_var = new FlightLister();
        List<Flight> flightList = new ArrayList<Flight>();
        flightList = flightLister_var.listFlights();

        //print flight list
        for (Flight flight:flightList){
            System.out.println("flightNumber: " + flight.getFlightNumber() +" status: " + flight.getStatus());
        }


        //Test add a flight

        Flight flight_new = new Flight();
        flight_new.setFlightNumber("VueloNuevo1");
        flight_new.setStatus("onTime");
        FlightManualAdder flightAdd1= new FlightManualAdder();
        flightAdd1.addFlight(flight_new);


        //Test upddate a flight
        /*
        FlightUpdater flightAdd1= new FlightUpdater();
        flightAdd1.updateFlight("VueloNuevo1");

         */

    }


}
