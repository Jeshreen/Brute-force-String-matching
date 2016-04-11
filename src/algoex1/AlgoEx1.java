/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoex1;

import java.util.Scanner;


/**
 *
 * @author jeshreen
 */
public class AlgoEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     long time1 = System.nanoTime();
   	 String T, P, cand;
   	 int pos;
    
   	 System.out.print("Enter a text string T: ");
   	 T = in.nextLine();
   	 System.out.print("Enter a pattern string P: ");
   	 P = in.next();
    
   	 for ( pos = 0; pos <= T.length() - P.length(); pos++ )
   	 {
   	    cand = T.substring( pos, pos+P.length() );  // Try to match this...
    
   	    if ( P.equals(cand) )
   	    {
   	       System.out.println("Found pattern at posistion: " + pos); // Found     
   	    }
   	 }
                                 long time2 = System.nanoTime();
         long time = time2 - time1;
         System.out.println("time taken in nano seconds - "+time);
    }
    
    
}
