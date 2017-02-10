/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author user
 */
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;
    
     public NightSky(double density,int width,int height){
        this.density = density;
        this.width = width;
        this.height = height;
    }
     
    public NightSky(double density){
        this(density,20,10);
    }
    public NightSky(int width,int height){
        this(0.1,width,height);
    }
   
    
    public void printLine(){
    Random ran = new Random();
    for(int i=0;i<this.width;i++){
        double randomValue = ran.nextDouble();
        if(randomValue>this.density){
            System.out.print(" ");
        }
        else{
            System.out.print("*");
            this.starsInLastPrint++;
        }
    }
        System.out.println();
    }
    
    public void print(){
        this.starsInLastPrint=0;
        for(int i=0;i<this.height;i++){
            printLine();
            System.out.println();
        }
    }
    
    public int starsInLastPrint(){
        return this.starsInLastPrint;
    }
    }

