
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Administrator
 */
public class Person {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        People aisha = new People("Aisha", 22, "Consultant");
        People syed = new People("Syed", 23, "Java");
        People Daniel = new People ("Daniel", 21, "Tester");
        
        ArrayList<Object> manush = new ArrayList<Object>();
        
        manush.add(aisha);
        manush.add(syed);
        manush.add(Daniel);
        
//        System.out.println(manush.get(0).toString().contains("Aisha"));
        
        System.out.println(searchByName(manush));
        
    }
    
    private static String searchByName(ArrayList<Object> people){
        String s = "";
        
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        
        for(int i = 0; i < people.size(); i++){
            
            if(people.get(i).toString().contains(name)){
                s = people.get(i).toString();
                break;
            }else{
                s = "No Name Found";
            }
        }
        
        return s;
    }
    
}
