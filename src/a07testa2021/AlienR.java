/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a07testa2021;

/**
 *
 * @author youca
 */
public class AlienR {
    
    String weird;
    String creepy;
    String scientist;

    public String getWeird() {
        return weird;
    }

    public void setWeird(String weird) {
        this.weird = weird;
    }

    public String getCreepy() {
        return creepy;
    }

    public void setCreepy(String creepy) {
        this.creepy = creepy;
    }

    public String getScientist() {
        return scientist;
    }

    public void setScientist(String scientist) {
        this.scientist = scientist;
    }

    @Override
    public String toString() {
        return "AlienR{" + "weird=" + weird + ", creepy=" + creepy + ", scientist=" + scientist + '}';
    }

    public AlienR(String weird, String creepy, String scientist) {
        this.weird = weird;
        this.creepy = creepy;
        this.scientist = scientist;
    }

    public AlienR() {
    }
    
    
}
