
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan
 */
public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicleRegister;
    
    public VehicleRegistry() {
        this.vehicleRegister = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (vehicleRegister.get(licensePlate) == null) {
            vehicleRegister.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        if (!vehicleRegister.containsKey(licensePlate)) {
            return null;
        }
        return vehicleRegister.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (!vehicleRegister.containsKey(licensePlate)) {
            return false;
        }
        vehicleRegister.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates() {
        for (LicensePlate licensePlate : this.vehicleRegister.keySet()) {
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> existingOwners = new ArrayList<>();
        
        for (LicensePlate licensePlate : this.vehicleRegister.keySet()) {
            String owner = this.vehicleRegister.get(licensePlate);
            if (!existingOwners.contains(owner)) {
                existingOwners.add(owner);
            }
        }
        
        for (String owner : existingOwners) {
            System.out.println(owner);
        }
    }
}
