/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author Asus
 */
public abstract class Manusia {
   //deklarasi variable
    private double TinggiBadan;
    //constructor
    public Manusia (double TB)
    {
        TinggiBadan=TB;
    }
    //getter
    public double getTB()
    {
        return TinggiBadan;
    }
    //method HtgBBI
    public abstract double HtgBBI();
    
    }
    

