
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
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageFacility;
    
    public StorageFacility() {
        this.storageFacility = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.storageFacility.putIfAbsent(unit, new ArrayList<>());  
        this.storageFacility.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        if (this.storageFacility.containsKey(storageUnit)) {
            return this.storageFacility.get(storageUnit);
        }
        return new ArrayList<>();
    }
    
    public void remove(String storageUnit, String item) {
        this.storageFacility.get(storageUnit).remove(item);
        if (this.storageFacility.get(storageUnit).isEmpty()) {
            this.storageFacility.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        
        for (String unitName : this.storageFacility.keySet()) {
            units.add(unitName);
        }
        return units;
    }
}
