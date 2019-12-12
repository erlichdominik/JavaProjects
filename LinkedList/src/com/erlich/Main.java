package com.erlich;

import java.util.*;

public class Main {
    // Create a program that implements a playlist for songs
    // Create a Song class having Title and Duration for a song.
    // The program will have an Album class containing a list of songs.
    // The albums will be stored in an ArrayList
    // Songs from different albums can be added to the playlist and will appear in the list in the order
    // they are added.
    // Once the songs have been added to the playlist, create a menu of options to:-
    // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
    // List the songs in the playlist
    // A song must exist in an album before it can be added to the playlist (so you can only play songs that
    // you own).
    // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
    // started tracking the direction we were going.
    // As an optional extra, provide an option to remove the current song from the playlist
    // (hint: listiterator.remove()
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
//        Customer customer = new Customer(54.22,"rak");
//        Customer anotherCustomer = new Customer(22.22,"rak");
//        anotherCustomer = customer;
//        System.out.println(customer.getName() + customer.getValue());
        Album album = new Album("Stormbringer", "Deep purple");

        album.addSong("Holy man", 4.6);
        album.addSong("Hold on", 4.22);
        album.addSong("The gypsy", 4.3);
        album.addSong("Soldier of fortune", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("High bool shooter", 6.23);
        albums.add(album);


        album = new Album("Rak", "Mak");

        album.addSong("szpak", 420);
        album.addSong("mak", 4230);
        album.addSong("trak", 420);
        album.addSong("kwak", 4220);
        album.addSong("lak", 201);
        album.addSong("żak", 4120);
        album.addSong("fak", 4210);
        album.addSong("spak", 420);

        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();

        albums.get(0).addSongToThePlaylist("Hold on", playList);
        albums.get(0).addSongToThePlaylist(4, playList);
        albums.get(1).addSongToThePlaylist(2, playList);
        albums.get(1).addSongToThePlaylist(4, playList);

        play(playList);

    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean movingForward = true;

        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing (" + listIterator.next().toString() + ")");
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Playlist stopped");
                    quit = true;
                    break;
                case 1:
                    if (!movingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        movingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing: (" + listIterator.next().toString() + ")");
                    } else {
                        System.out.println("We reached the end of the list");
                        movingForward = false;
                    }
                    break;
                case 2:
                    if (movingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        movingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing: (" + listIterator.previous().toString() + ")");
                    } else {
                        System.out.println("We reached the end of the list");
                        movingForward = true;
                    }
                    break;
                case 3:
                    if (movingForward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replying (" + listIterator.previous().toString() + ")");
                            movingForward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replying (" + listIterator.next().toString() + ")");
                            movingForward = true;
                        } else {
                            System.out.println("We are at the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                     if (playList.size() > 0) {
                         listIterator.remove();

                         if (listIterator.hasNext()) {
                             System.out.println("Now playing " + listIterator.next());
                         } else if(listIterator.hasPrevious()) {
                             System.out.println("Now playing " + listIterator.previous());
                         }
                     }
                     break;
            }
        }
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("===================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("===================");
    }

    private static void printMenu() {
        System.out.println("Available options:\n" +
                "0 - quit\n" +
                "1 - go next\n" +
                "2- go backward\n" +
                "3 - reply song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print menu\n" +
                "6 - delete current song from the playlist");
    }

}
