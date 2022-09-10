/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

import FlightControl.domain.Airplane;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

/**
 *
 * @author logan
 */
public class TextUI {

    private FlightControl flightControl;
    private Scanner scanner;

    public TextUI(Scanner scanner, FlightControl flightControl) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }
    
    public void start() {
        startAssetControl();
        System.out.println("");
        startFlightControl();
        System.out.println("");
    }

    public void startAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            System.out.print("> ");
            String action = scanner.nextLine();
            switch (action) {
                case "1":
                    addPlane();
                    break;
                case "2":
                    addFlight();
                    break;
                case "x":
                    return;
            }
        }
    }

    public void startFlightControl() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println("");

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            System.out.print("> ");
            String action = scanner.nextLine();
            
            switch (action) {
                case "1":
                    printPlanes();
                    break;
                case "2":
                    printFlights();
                    break;
                case "3":
                    System.out.println("Give the airplane id: ");
                    printPlane(scanner.nextLine());
                    break;
                case "x":
                    return;
            }
        }
    }

    public void addPlane() {
        System.out.println("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.println("Give the airplane capacity: ");
        int cap = Integer.parseInt(scanner.nextLine());
        flightControl.addAirplane(id, cap);
    }

    public void addFlight() {
        System.out.println("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.println("Give the departure airport id: ");
        String depart = scanner.nextLine();
        System.out.println("Give the target airport id: ");
        String target = scanner.nextLine();
        flightControl.addFlight(id, depart, target);
    }
    
    public void printPlanes() {
        flightControl.getAirplanes().stream()
                .forEach(p -> System.out.println(p.toString()));
    }
    
    public void printFlights() {
        flightControl.getFlights().stream()
                .forEach(f -> System.out.println(f.toString()));
    }
    
    public void printPlane(String airplaneID) {
        System.out.println(flightControl.getAirplane(airplaneID).toString());
    }
}
