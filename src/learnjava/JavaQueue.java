/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import static learnjava.LearnJava.choosenOption;

/**
 *
 * @author varunnaharia
 */
public class JavaQueue {
    static Queue<Integer> queue = new LinkedList<>();
    
    public static void main() throws IOException
    {
        takeOption();
    }
    
    static void takeOption() throws IOException
    {
        System.out.println("\nPlease choose one of following");
        System.out.println("1. Print Queue");
        System.out.println("2. Add to queue.");
        System.out.println("3. Remove from queue.");
        System.out.println("4. Back to main.");
        System.out.println("0. Exit.\n");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            choosenOption = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!\n");
            takeOption();
        }
        performAction();
    }
    
    public static void performAction() throws IOException
    {
        switch(choosenOption)
        {
            case 1:
                printQueue();
                break;
            case 2:
                addToQueue();
                break;
            case 3:
                removeFromQueue();
                break;
            case 4:
                LearnJava.takeOption();
                break;
            case 0:
                
                break;
            default:
                System.out.println("Invalid Option. Please try again\n");
                takeOption();
                break;
        
        }
    }
    
    public static void printQueue() throws IOException
    {
        // Display contents of the queue.
        System.out.println("Elements of queue-"+queue+"\n");
        takeOption();
    }
    
    public static void addToQueue() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] s = reader.readLine().split(" ");
        int []numbers= new  int[s.length];
        for(int k =0;k<s.length;k++)
        {
            numbers[k]= Integer.parseInt(s[k]);
        }
        
        // Adds elements {0, 1, 2, 3, 4} to queue
        for (int i=0; i<numbers.length; i++)
         queue.add(numbers[i]);
        takeOption();
    }
    
    public static void removeFromQueue() throws IOException
    {
        System.out.println(queue.remove()+" is removed from Queue\n"); 
        takeOption();
    }
}
