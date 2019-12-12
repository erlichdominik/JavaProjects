package com.erlich;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String name, double duration) {
        if (findSong(name) == null) {
            this.songs.add(new Song(name, duration));
            return true;
        } else {
            System.out.println("Song already exist");
            return false;
        }
    }

    public Song findSong(String name) {
        for (Song checkedSong : this.songs) {
            if (checkedSong.getName().equals(name)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addSongToThePlaylist(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;

        if ((index >= 0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album doest not have a track");
        return false;
    }

    public boolean addSongToThePlaylist(String title, LinkedList<Song> playList) {
        if (findSong(title) != null) {
            playList.add(findSong(title));
            return true;
        }
        System.out.println("This album doest not have a track");
        return false;
    }

}
