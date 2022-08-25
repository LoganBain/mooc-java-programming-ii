/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan
 */
public class Dog extends Animal implements NoiseCapable {
    public Dog(String dogName) {
        super(dogName);
    }
    
    public Dog() {
        super("Dog");
    }
    
    public void bark() {
        System.out.println(super.getName() + " barks");
    }
    
    @Override
    public void makeNoise() {
        bark();
    }
}
