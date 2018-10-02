/**
 * Created by frank on 1/6/2017.
 */

import java.util.Scanner;

public class aLaFuerza {
    public static void main(String[] args) {
    	System.out.println("Enter a sample password:");
    	Scanner scanbowski = new Scanner(System.in);
    	
    	String userpassword = scanbowski.nextLine();
    	scanbowski.close();
        ultra a = new ultra(userpassword);
        a.crackPassword();
        //a.crackPassword();
    }
}