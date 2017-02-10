
public class NumberStatistics {
    private int amountOfNumbers;
    private int count;
    
    public NumberStatistics(){
        this.amountOfNumbers=0;
        this.count=0;
    }
    
    public void addNumber(int number){
    
        this.amountOfNumbers += number;
        this.count++;
    }
    
    public int amountOfNumbers(){
    
        return this.count;
    }
    
    public int sum(){
        return this.amountOfNumbers;
    }
    
   public double average(){
       if(this.count>0){
       return (double)this.sum()/this.count;
       }
       else{
       return 0;
       }
   }
    
}
