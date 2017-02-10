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
public class Team {

    private String name;
    private ArrayList<Player> members;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if (this.members.size() < this.maxSize) {
            this.members.add(player);
        }
    }

    public void printPlayers() {
        for (Player member : this.members) {
            System.out.println(member);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.members.size();
    }

    public int goals() {
        int totalGoals = 0;
        for (Player member : members) {
            totalGoals += member.goals();
        }
        return totalGoals;
    }
}
