package com.myjavaprojects.musicplayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MusicPlayer {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("AlbumOne", "Nameless");
        album.addSong("Butterfly", 3.14);
        album.addSong("Bombaa Train", 4.14);
        album.addSong("Infinite love", 2.54);
        album.addSong("Tuendelee ama Tusiendelee", 5.01);
        album.addSong("Bandana ya hisa", 3.14);

        albums.add(album);

        album = new Album("AlbumTwo", "Eminem");
        album.addSong("Rap God", 3.12);
        album.addSong("Loose yourself", 6.14);
        album.addSong("Not afraid", 3.27);

        albums.add(album);

        LinkedList<Song> morningPlayList = new LinkedList<>();

        albums.get(0).addToPlaylist("Tuendelee ama Tusiendelee", morningPlayList);
        albums.get(0).addToPlaylist("Butterfly", morningPlayList);
        albums.get(1).addToPlaylist("Rap God", morningPlayList);
        albums.get(1).addToPlaylist("Not afraid", morningPlayList);

        play(morningPlayList);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> iterator = playList.listIterator();

        if (playList.size() == 0) {
            System.out.println();
            System.out.println("This playlist have no song");
        } else {
            System.out.println();
            System.out.println("Now playing " + iterator.next().toString());
            System.out.println();
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                        forward = true;

                    }
                    if (iterator.hasNext()) {
                        System.out.println("Now playing " + iterator.next().toString());
                    } else {
                        System.out.println("No song, reached to end of list");
                        forward = false;
                    }

                    break;
                case 2:
                    if (forward) {
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                            forward = false;
                        }
                    }

                    if (iterator.hasPrevious()) {
                        System.out.println("Now playing " + iterator.previous().toString());
                    } else {
                        System.out.println("We are first song");
                        forward = false;
                    }

                    break;

                case 3:
                    if (forward) {
                        if (iterator.hasPrevious()) {
                            System.out.println("Playing " + iterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the beginning of the list");
                            forward = false;
                        }
                    } else {
                        if (iterator.hasNext()) {
                            System.out.println("Playing " + iterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We are at the end fo the list");
                            forward = false;
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
                        iterator.remove();
                        if (iterator.hasNext()) {
                            System.out.println("Now playing " + iterator.next().toString());

                        } else {
                            if (iterator.hasPrevious()) {
                                System.out.println("Now playing " + iterator.previous().toString());
                            }
                        }
                    }
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available options");
        System.out.println();
        System.out.println("0 -> Quit\n"
                + "1 -> To play the next song\n"
                + "2 -> Play previous song\n"
                + "3 -> Replay current song\n"
                + "4 -> To list All song\n"
                + "5 -> Print available options\n"
                + "6 -> Delete current song\n");
                System.out.println();
         System.out.print("Choose an option: ");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("**************************");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("****************************");
    }
}
