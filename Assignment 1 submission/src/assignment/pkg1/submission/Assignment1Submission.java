/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1.submission;

import java.util.Random;

/**
 *
 * @author abduljangda
 */
public class Assignment1Submission {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rdm= new Random();
        
        int n = rdm.nextInt(10);// within the range of 0 to 9
        
        System.out.println("N  =  " + n);
        
        // how to print odd numbers. 0 and 100
        
        for (int i=0; i<=100 ; i++){
            if(i%2 != 0)
               System.out.println("i = "+ i);
        }
    }
    
}
