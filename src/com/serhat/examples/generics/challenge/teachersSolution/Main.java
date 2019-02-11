package com.serhat.examples.generics.challenge.teachersSolution;

public class Main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago cubs");

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

        hawthorn.matcResult(fremantle, 1, 0);
        hawthorn.matcResult(adelaideCrows, 3, 8);

        adelaideCrows.matcResult(fremantle, 2, 1);

        //does not work!
//        footballLeague.add(baseballTeam);

        footballLeague.showLeagueTable();
    }
}
