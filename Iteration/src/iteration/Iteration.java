/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteration;

/**
 *
 * @author Administrator
 */
public class Iteration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int val [] = {11,12,13,14,15,16,17,18,19,100};
        int added = 0;
        for(int i = 0; i<10; i++){
            added = Addition(val[i], i, true);
            System.out.println(added);
        }
    }
    
    
    public static int Addition(int a, int b, boolean c){

      if(a == 0){
        return b;
      }else if(b==0){
        return a;
      }else if(a!=0 && b!=0 && c){
        return a+b;
      }else{
        return a*b;
      }

  }
    
}
