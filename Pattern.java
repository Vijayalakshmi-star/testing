/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int num_row= n- (n/2);
        for(int i=0;i< num_row ;i++)
        {
            for(int j=0;j<=num_row+i;j++)
            {
                if(i<=j-1)
                     System.out.printf(" ");
                else
                   System.out.printf("*");  
            }
             System.out.println();
        }
        for(int i=0;i<(num_row -1);i++)
        {
            for(int j=0;j<n-1-i;j++ )
            {
                if(i>=j)
                    System.out.printf(" ");
                else
                   System.out.printf("*"); 
            }
            System.out.println();
        }
    }
    
}
