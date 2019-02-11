package com.serhat.examples.generics.challenge.mySolution;

public class Team<T> implements Comparable<Team<T>> {
    private String teamName;
    private int score;

    public Team(String teamName, int score) {
        this.teamName = teamName;
        this.score = score;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.getScore() < team.getScore()) {
            return 1;
        } else if (this.getScore() > team.getScore()) {
            return -1;
        } else {
            return 0;
        }
    }
}
