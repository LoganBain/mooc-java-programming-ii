/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan
 */
public class Cat extends Animal implements NoiseCapable {
    public Cat(String catName) {
        super(catName);
    }
    
    public Cat() {
        super("Cat");
    }
    
    public void purr() {
        System.out.println(super.getName() + " purrs");
    }
    
    @Override
    public void makeNoise() {
        purr();
    }
}
