package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Odin", 1991);
        MusicBand musicBand2 = new MusicBand("dva", 1992);
        MusicBand musicBand3 = new MusicBand("tri", 2001);
        MusicBand musicBand4 = new MusicBand("4", 2002);
        MusicBand musicBand5 = new MusicBand("5", 2003);
        MusicBand musicBand6 = new MusicBand("6", 1995);
        MusicBand musicBand7 = new MusicBand("7", 1996);
        MusicBand musicBand8 = new MusicBand("8", 2006);
        MusicBand musicBand9 = new MusicBand("9", 2007);

        List<MusicBand> bands = new ArrayList<>(Arrays.asList(musicBand1, musicBand2, musicBand3, musicBand4, musicBand5, musicBand6, musicBand7, musicBand8, musicBand9));
        System.out.println(bands);
        Collections.shuffle(bands);
        System.out.println(bands);
        System.out.println(groupsAfter2000(bands));

    }


    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> musicBands = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                musicBands.add(band);
            }
        }
        return musicBands;
    }
}
