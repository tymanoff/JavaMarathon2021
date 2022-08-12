//package day12.task4;
//
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Task4 {
//    public static void main(String[] args) {
//        MusicArtist musicArtist = new MusicArtist("loli","FifstLoli");
//        MusicArtist musicArtist1 = new MusicArtist("loli1","FifstLoli1");
//
//        List<MusicArtist> list1 = new ArrayList<>(Arrays.asList(musicArtist));
//        List<MusicArtist> list2 = new ArrayList<>(Arrays.asList(musicArtist1));
//
//        MusicBand musicBand = new MusicBand("Mus1",2000,list1);
//        MusicBand musicBand1 = new MusicBand("Mus2",2001,list2);
//
//        System.out.println(musicBand);
//
//        musicBand.transferMembers(musicBand1);
//        System.out.println(musicBand);
//    }
//}
