/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catsandmouse;

import java.util.Scanner;
import java.util.regex.*;
import java.io.*;
import java.math.*;


/**
 *
 * @author java home
 */
public class CatsAndMouse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int f = input.nextInt();
        for(int a = 0; a < f; a++){
            int x = input.nextInt();
            int y = input.nextInt();
            int z = input.nextInt();
            int CatA_Dist = Math.abs(x-z);// distance of cat A is from Mouse
            int CatB_Dist = Math.abs(y-z);// distance of cat B is from Mouse
            if(CatA_Dist < CatB_Dist)
                System.out.println("Cat A");
            else if(CatA_Dist > CatB_Dist)
                System.out.println("Cat B");
            
             else if(CatB_Dist == CatA_Dist)
                System.out.println("Mouse C");// when Cat A & B meet the Mouse will run away
        }
        
    }
    
}
