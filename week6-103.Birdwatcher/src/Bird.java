/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Bird {

    private String name;
    private String latinName;
    private int observations;
    private ArrayList<Bird> birds;

    public Bird() {
        birds = new ArrayList<Bird>();
    }

    public Bird(Scanner in) {
        System.out.print("Name: ");
        String name = in.nextLine();
        this.name = name;
        System.out.print("Latin Name: ");
        String latinName = in.nextLine();
        this.latinName = latinName;
        this.observations = 0;

    }

    public void addBird(Scanner in) {
        
        this.birds.add( new Bird(in));

    }

    public void statistics() {
        for (Bird bird : birds) {
            System.out.print(bird.name + " " + "(" + bird.latinName + ")" + " : " + bird.observations + " observations");
            System.out.println();
        }
    }

    public void observation(Scanner in) {
        System.out.print("What was observed:? ");
        String name = in.nextLine();
         int sighting =0;
        for (Bird bird : birds) {
           
            if (bird.name.equalsIgnoreCase(name)) {
                bird.observations++;
                 sighting++;
            }
          }
        if(sighting==0){
            System.out.println("No fuck");
        }

    }

    public void show(Scanner in) {
        System.out.print("What? ");
        String input = in.nextLine();
        for (Bird bird : this.birds) {
            if (bird.name.equals(input)) {
                System.out.println(bird);
            }
        }
    }

    public String toString() {

        return this.name + " " + "(" + this.latinName + ")" + " : " + this.observations + " observations";

    }

}
