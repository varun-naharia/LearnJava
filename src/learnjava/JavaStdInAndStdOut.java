/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author varunnaharia
 */
public class JavaStdInAndStdOut {
    
    public static void first() throws IOException {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
       
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        LearnJava.takeOption();
    }
    
    public static void second() throws IOException {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.nextLine();   //To flush stdIn:- After supplying data for int, we would hit the enter key. What nextInt() and nextDouble() does is it assigns integer to appropriate variable and keeps the enter key unread in thekeyboard buffer. so when its time to supply String the nextLine() will read the enter key from the user thinking that the user has entered the enter key.(that's we get empty output) . Unlike C, there is no fflush() to clean buffer, so we have to flush by not taking it in variable.
        String s = scan.nextLine();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        LearnJava.takeOption();
    }
    
}
