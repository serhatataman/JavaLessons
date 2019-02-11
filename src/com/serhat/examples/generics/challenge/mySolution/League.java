package com.serhat.examples.generics.challenge.mySolution;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class League<T extends Team> {
    private String leagueName;
    private List<Team<T>> teamList = new LinkedList<>();

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void addToList(Team<T> team) {
        if (teamList.contains(team)) {
            System.out.println(team.getTeamName() + " is already in the list");
        } else {
            teamList.add(team);
            System.out.println(team.getTeamName() + " has been added to the " + this.leagueName);
        }
    }

    public List<Team<T>> getTeamList() {
        return teamList;
    }

    public void sort() {
        Collections.sort(teamList);
    }
}
