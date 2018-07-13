/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage;

/**
 *
 * @author Administrator
 */
public class Motorbike extends Vehicle{
    private int numWheels;
    private int numSeats;
    private String name;

    @Override
    public String toString() {
        return "Motorbike{" + "numWheels=" + numWheels + ", numSeats=" + numSeats + ", name=" + name + '}';
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public String getName() {
        return name;
    }

    public Motorbike(int numWheels, int numSeats, String name, boolean body, int engineSize, boolean indicators) {
        super(body, engineSize, indicators);
        this.numWheels = numWheels;
        this.numSeats = numSeats;
        this.name = name;
    }

   
}
