 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage;
import java.util.*;

/**
 *
 * @author Administrator
 */
public class Garage {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Object> objArr = new ArrayList<Object>();
        
        Motorbike motorbike = new Motorbike(2,1,"Motorbike",true,3,true);
        Car car = new Car(4,4,"Car",true,5,true);
        
        objArr.add(motorbike);
        
        System.out.println(billVehicle(objArr));
        
    }
    
//    public void addVehicle(Object vehicle){
//        vehicle.add(vehicle);
//    }
    
    private static void addVehicle(ArrayList<Object> vehc){
        
        
        
    }
    
    private static int billVehicle(ArrayList<Object> vehc){
        int cost = 0;
        for(int i = 0; i<vehc.size(); i++){
            if(vehc.get(i).toString().contains("Motorbike")){
                cost = 1500;
                break;
            }else if(vehc.get(i).toString().contains("Car")){
                cost =2000;
                break;
            }else{
                cost = 0;
                break;
            }
        }
        
        return cost;
    }
    
}
