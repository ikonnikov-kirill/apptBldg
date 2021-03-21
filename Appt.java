/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apptBldg;

/**
 *
 * @author workway
 */
public class Appt {
    private int apptCount;  
    
    public Appt (int apptCount) {
      this.apptCount=apptCount;
    }
    
    public int getNumber () {
        return this.apptCount;
    }
    }
