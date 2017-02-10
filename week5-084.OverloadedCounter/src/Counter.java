/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Counter {
    private int count;
    private boolean check;
   
    
    public Counter(int startingValue, boolean check){
        this.count = startingValue;
        this.check = check;
        
    }
    
    public Counter(int startingValue){
        this(startingValue,false);
    }
    
    public Counter(boolean check){
        this(0, check);
    }
    
    public Counter(){
        this(0,false);
    }
    
    public int value(){
        return this.count;
    }
    
    public void increase(){
       increase(1);
    }
    
    public void decrease(){
        decrease(1);
       
        
    }
    public void increase(int increaseAmount){
        if(increaseAmount<0){
        }
        else{
            this.count+= increaseAmount;
        }
    }
    public void decrease(int decreaseAmount){
       if(decreaseAmount<0){
           return;
       }
      this.count-=decreaseAmount;
      if(this.check && this.count<0){
          this.count = 0;
      }
    }
}
