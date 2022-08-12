package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<Member> members = new ArrayList<>();

    public MusicBand(String name, int year, List<Member> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
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
                ", members=" + members +
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

    public void transferMembers(MusicBand musicBand){
        this.members.addAll(musicBand.getMembers());

    }
}
