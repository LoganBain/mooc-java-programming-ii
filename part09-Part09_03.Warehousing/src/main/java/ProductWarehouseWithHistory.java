/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory productHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.productHistory = new ChangeHistory();
        this.productHistory.add(initialBalance);
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.productHistory.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double amountGot = super.takeFromWarehouse(amount);
        this.productHistory.add(super.getBalance());
        return amountGot;
    }
    
    public String history() {
        return this.productHistory.toString();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.productHistory.toString());
        System.out.println("Largest amount of product: " + this.productHistory.maxValue());
        System.out.println("Smallest amount of product: " + this.productHistory.minValue());
        System.out.println("Average: " + this.productHistory.average());
    }
}
