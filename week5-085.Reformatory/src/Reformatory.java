public class Reformatory {
    
    
        private int weightMeasured;
        
    public Reformatory(){
        this.weightMeasured=0;
    }    
    
    public int weight(Person person) {
       
       this.weightMeasured++;
       return person.getWeight();
    }
    public void feed(Person person){
        int weightBeforeEating = person.getWeight();
        person.setWeight(weightBeforeEating);
    }
    
    public int totalWeightsMeasured(){
        return this.weightMeasured;
    }
}
