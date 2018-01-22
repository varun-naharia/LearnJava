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
public class LearnJava {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    static int choosenOption = 0;
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        takeOption();
    }
    
    static void takeOption() throws IOException
    {
        System.out.println("\nPlease choose one of following");
        System.out.println("1. Hello World");
        System.out.println("2. Addition of two number.");
        System.out.println("3. Square root of sum.");
        System.out.println("4. Java Stdin and Stdout-I.");
        System.out.println("5. Java Stdin and Stdout-II.");
        System.out.println("6. Java Queue.");
        System.out.println("0. Exit.\n");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            choosenOption = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!\n");
        }
        performAction();
    }
    
    static void performAction() throws IOException
    {
        switch(choosenOption)
        {
            case 1:
                HelloWorld.main();
                break;
            case 2:
                AdditionOfTwoNumber.main();
                break;
            case 3:
                SquareRootOfSum.main();
                break;
            case 4:
                JavaStdInAndStdOut.first();
                break;
            case 5:
                JavaStdInAndStdOut.second();
                break;
            case 6:
                JavaQueue.main();
                break;
            case 0:
                
                break;
            default:
                System.out.println("Invalid Option. Please try again\n");
                takeOption();
                break;
        
        }
    }
    
}
