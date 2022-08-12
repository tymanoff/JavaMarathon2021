package day12.task5;

import java.util.ArrayList;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> musicArtists = new ArrayList<>();

    public MusicBand(String name, int year, List<MusicArtist> musicArtists) {
        this.name = name;
        this.year = year;
        this.musicArtists = musicArtists;
    }

    public List<MusicArtist> getMembers() {
        return musicArtists;
    }

    public void setMembers(List<MusicArtist> musicArtists) {
        this.musicArtists = musicArtists;
    }

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + musicArtists +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void transferMembers(MusicBand musicBandA, MusicBand musicBandB){
        musicBandB.getMembers().addAll(musicBandA.getMembers());
        musicBandA.getMembers().clear();

    }
}
