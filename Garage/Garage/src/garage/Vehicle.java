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
public abstract class Vehicle {
    
    private boolean body;
    private int engineSize;
    private boolean indicators;

    @Override
    public String toString() {
        return "Vehicle{" + "body=" + body + ", engineSize=" + engineSize + ", indicators=" + indicators + '}';
    }

    public void setBody(boolean body) {
        this.body = body;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public void setIndicators(boolean indicators) {
        this.indicators = indicators;
    }

    public boolean isBody() {
        return body;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public boolean isIndicators() {
        return indicators;
    }

    public Vehicle(boolean body, int engineSize, boolean indicators) {
        this.body = body;
        this.engineSize = engineSize;
        this.indicators = indicators;
    }
    
    
}
