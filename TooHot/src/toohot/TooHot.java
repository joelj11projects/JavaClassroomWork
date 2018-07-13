/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toohot;

/**
 *
 * @author Administrator
 */
public class TooHot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        if(TooHot(60, true)){
            System.out.println("It's Too HOT!");
        }else{
            System.out.println("Too COLD!");
        }
        
    }
    
    private static boolean TooHot(int temp, boolean isSummer){
        
        if(isSummer){
            if(temp >= 60 && temp <= 100){
                return true;
            }else{
                return false;
            }
        }else{
            if(temp >= 60 && temp <= 90){
                return true;
            }else{
                return false;
            }
        }
        
    }
    
}
