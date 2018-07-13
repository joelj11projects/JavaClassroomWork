/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquesum;

/**
 *
 * @author Administrator
 */
public class UniqueSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(Unique(1,1,1));
    }
    
    private static int Unique(int a, int b, int c){
        
        if(a == b && b != c){
            return  c;
        }else if(b == c && c != a){
            return a;
        }else if(a == c && c != b){
            return b;
        }else if(a != b && b != c && a != c){
            return a + b + c;
        }
        else{
            return 0;
        }
        
    }
    
}
