package com.serhat.examples.generics.challenge.mySolution;

public class Main {
    public static void main(String[] args) {

        League<EsportTeam> esportTeamLeague = new League<>("League of Legends");
        Team<EsportTeam> cloud9 = new Team<>("Cloud9", 3);
        Team<EsportTeam> ex = new Team<>("Exx", 9);
        Team<EsportTeam> xax = new Team<>("Xaxx", 23);
        Team<EsportTeam> fnatic = new Team<>("Fnatic", 4);
        Team<EsportTeam> hey = new Team<>("hey", 7);


        League<HandballTeam> handballTeamLeague = new League<>("HandballTeamLeague");
        Team<HandballTeam> goat = new Team<>("Goat", 6);
        Team<HandballTeam> cow = new Team<>("Cow", 70);
        Team<HandballTeam> sheep = new Team<>("Sheep", 9);
        Team<HandballTeam> bee = new Team<>("Bee", 1);

        esportTeamLeague.addToList(cloud9);
        esportTeamLeague.addToList(fnatic);
        esportTeamLeague.addToList(ex);
        esportTeamLeague.addToList(xax);
        esportTeamLeague.addToList(hey);

        handballTeamLeague.addToList(goat);
        handballTeamLeague.addToList(cow);
        handballTeamLeague.addToList(goat);
        handballTeamLeague.addToList(sheep);
        handballTeamLeague.addToList(bee);

        esportTeamLeague.sort();
        System.out.println(esportTeamLeague.getLeagueName());
        esportTeamLeague.getTeamList().forEach(x -> System.out.println(x.getTeamName()+": "+x.getScore()));

        handballTeamLeague.sort();
        System.out.println(handballTeamLeague.getLeagueName());
        handballTeamLeague.getTeamList().forEach(x -> System.out.println(x.getTeamName()+": "+x.getScore()));


    }
}
