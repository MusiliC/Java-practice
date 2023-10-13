package com.myjavaprojects.musicplayer;

public class Song {
    String title;
    Double duration;
    

    public Song() {
    }

    
    public String getTitle() {
        return title;
    }

    public Double getDuration() {
        return duration;
    }

    public Song(String title, Double duration) {
        this.title = title;
        this.duration = duration;
    }


    @Override
    public String toString() {
        return "Songs title -> " + title + ", duration -> " + duration;
    }

    

    
}
