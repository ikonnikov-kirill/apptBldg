/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apptBldg;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author workway
 */
public class Building {
    //private int apptNumber=1;

    private Appt[][] block;
    Scanner scanner = new Scanner(System.in);
    int apptCount = 0;

    public Building() {
        Random guess = new Random();

        block = new Appt[guess.nextInt(10 - 5) + 5][];
        for (int i = 0; i < block.length; i++) {
            block[i] = new Appt[guess.nextInt(4 - 1) + 1];
        }

        for (int i = 0; i < block.length; i++) {
            for (int j = 0; j < block[i].length; j++) // for(Appt i:block)      
            // for (int []j:block)
            {
                block[i][j] = new Appt(++apptCount);
            }
        }

        System.out.println(
                "new building created, " + block.length + " levels and " + apptCount + " appartments");
    }

    public void callAppt() {
        while (true) {
            System.out.println("please enter appartment number from 1 to " + apptCount);
            int d = scanner.nextInt();
            if (d < 1 | d > apptCount) 
                System.out.println("Appartment " + d + " does not exist, "
                        + "please enter appartment number from 1 to " + apptCount);
            
            if (d == 0) 
                System.exit(0);
            

            for (Appt[] x:block)
                for (Appt y:x)
                    if (y.getNumber() == d) 
                        System.out.println("called appartment " + d);
            
        }
    }
    }
