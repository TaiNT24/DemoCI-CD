/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1323;

/**
 *
 * @author nguye
 */
public class SE1323 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("HelloWorld");
        System.out.println(cF(5, 1));
    }
    
    public static int cF(int number, int result){
        if(number==0){
            return result;
        }else{
            return cF(number-1, result*number);
        }
    }
    
}
