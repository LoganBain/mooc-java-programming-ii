/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author logan
 */
public class Flight {
    
    private Airplane airplane;
    private Place destination;
    private Place departure;
    
    public Flight(Airplane airplane, Place departureAirport, Place destinationAirport) {
        this.airplane = airplane;
        this.departure = departureAirport;
        this.destination = destinationAirport;
    }
    
    public Airplane getAirplane() {
        return this.airplane;
    }
    
    public Place getDeparture() {
        return this.departure;
    }
    
    public Place getDestination() {
        return this.destination;
    }
    
    @Override
    public String toString() {
        return this.airplane + " (" + this.departure + "-" + this.destination + ")";
    }
}
