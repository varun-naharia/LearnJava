/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author varunnaharia
 */
public class AdditionOfTwoNumber {
    
    public static void main() throws IOException
    {
        int firstNumber = 0;
        int secondNumber = 0;             
        System.out.println("Please enter two number.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            firstNumber = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
       
        try{
            secondNumber = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
        int total = firstNumber + secondNumber;
        System.out.println("Total of "+ firstNumber +" and "+ secondNumber +" is "+ total);
        LearnJava.takeOption();
    }
    
}
