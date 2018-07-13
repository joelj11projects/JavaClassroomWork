/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goldilockchairs;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class GoldilockChairs {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        Goldilock goldilock = new Goldilock(100, 80);
        
        Scanner sc = new Scanner(new File("C:\\Users\\Administrator\\Desktop/data.csv"));
        sc.useDelimiter(",");
        while(sc.hasNext()){
            
            System.out.println(sc.next());
            
        }
        sc.close();
                   
        
        int [][] chairAndPorridge = {{30, 50}, {130,75}, {90,60}, {150, 85}, {120,70}, {200,200}, {110, 100},
            {100, 120}, {297, 90}, {66, 110}, {257,113}, {276, 191}, {280, 129}, {219, 163}, {254, 193},
            {86, 153}, {206, 147}, {71, 137}, {104, 40}, {238, 127}, {52, 146}, {129, 197}, {144, 59},
            {157, 124}, {210, 59}, {11, 54}, {268, 119}, {261, 121}, {12, 189}, {186, 108}, {174, 21}, {77, 18},
            {54, 90}, {174, 52}, {16, 129}, {59, 181}, {290, 123}, {248, 132}};
        
        for(int i = 0; i<chairAndPorridge.length; i++){
            if(chairAndPorridge[i][0]>goldilock.getGoldilockWeight() && chairAndPorridge[i][1]<goldilock.getPorridgeTemp()){
                System.out.println("Seat: " + (i+1) + " is available");
            }
        }
        
    }
    
}
