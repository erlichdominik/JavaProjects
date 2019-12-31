package com.erlich;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " Player already exist");
            return false;
        }
        members.add(player);
        return true;
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponents, int ourScoure, int theirScore) {
        if (ourScoure > theirScore) {
            won++;
        } else if (theirScore > ourScoure) {
            lost++;
        } else {
            tied++;
        }
        played++;

        if (opponents != null ) {
            opponents.matchResult(null,theirScore,ourScoure);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() == team.ranking()) {
        return 0;
        } else {
            return 1;
        }
    }
}
