/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class Phonebook {
        private ArrayList<Person> index;
        
        public Phonebook(){
            index = new ArrayList<Person>();
        }
        public void add(String name,String number){
            index.add(new Person(name,number));
        }
        
        public void printAll(){
        
            for(Person person: index){
                System.out.println(person);
            }
        }
        
        public String searchNumber(String name){
            for(Person person:index){
                if(person.getName().equalsIgnoreCase(name)){
                    return person.getNumber();
                }
            }
            return "number not known";
        }
            
        }
           
        

