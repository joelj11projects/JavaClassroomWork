/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goldilockchairs;

/**
 *
 * @author Administrator
 */
public class Goldilock {
    
    private int goldilockWeight;
    private int porridgeTemp;

    @Override
    public String toString() {
        return "Goldilock{" + "goldilockWeight=" + goldilockWeight + ", porridgeTemp=" + porridgeTemp + '}';
    }

    public void setGoldilockWeight(int goldilockWeight) {
        this.goldilockWeight = goldilockWeight;
    }

    public void setPorridgeTemp(int porridgeTemp) {
        this.porridgeTemp = porridgeTemp;
    }

    public int getGoldilockWeight() {
        return goldilockWeight;
    }

    public int getPorridgeTemp() {
        return porridgeTemp;
    }

    public Goldilock(int goldilockWeight, int porridgeTemp) {
        this.goldilockWeight = goldilockWeight;
        this.porridgeTemp = porridgeTemp;
    }
    
    
}
