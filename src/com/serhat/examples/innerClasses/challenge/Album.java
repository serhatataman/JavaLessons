package com.serhat.examples.innerClasses.challenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber -1;

        if (index >= 0 && index <= this.songList.getSongs().size()) {
            playList.add(this.songList.getSongs().get(index));
            return true;
        }
        System.out.println("This album does not have a track "+ trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList) {
        Song checkedSong = songList.findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album.");
        return false;
    }

    public boolean addSong(String title, double duration) {
        return songList.addSong(title,duration);
    }

    public class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            songs = new ArrayList<>();
        }

        public Song findSong(int trackNumber) {
            int index = trackNumber -1;
            if ((index >= 0) && (index < songs.size())) {
                return songs.get(index);
            }
            return null;
        }
        public Song findSong(String title) {
            for (Song checkedSong : this.songs) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        public boolean addSong(String title, double duration) {
            if (findSong(title) == null) {
                this.songs.add(new Song(title, duration));
                return true;
            }
            return false;
        }

        public ArrayList<Song> getSongs() {
            return songs;
        }

        public void setSongs(ArrayList<Song> songs) {
            this.songs = songs;
        }
    }
}
