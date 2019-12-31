package com.erlich;

public class GenericsPart2 {

    public static void main(String[] args) {
//        FootballPlayer joe = new FootballPlayer("Joe");
//        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer lionel = new SoccerPlayer("Lionel");

        Team<SoccerPlayer> barcelona = new Team<>("Barcelona");
        barcelona.addPlayer(lionel);
//        barcelona.addPlayer(joe);
//        barcelona.addPlayer(pat);

        System.out.println(barcelona.numPlayers());


    }
}
