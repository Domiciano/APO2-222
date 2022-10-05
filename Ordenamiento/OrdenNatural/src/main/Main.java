package main;

import model.Artist;
import model.Track;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

//Collections.sort -> Mas rapido
//Arrays.sort
public class Main {

    public static void main(String[] args) {
        Track t1 = new Track(
                "Thriller",
                new Artist("Michael Jackson", "USA"),
                380,
                78
        );

        Track t2 = new Track(
                "Otra noche en Miami",
                new Artist("Bad Bunny", "Puerto Rico"),
                290,
                12
        );

        Track t3 = new Track(
                "Efecto",
                new Artist("Bad Bunny", "Puerto Rico"),
                170,
                8
        );

        Track t4 = new Track(
                "Billie Jean",
                new Artist("Michael Jackson", "USA"),
                420,
                15
        );

        Track t5 = new Track(
                "Dakiti",
                new Artist("Bad Bunny", "Puerto"),
                410,
                25
        );

        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(t1);
        tracks.add(t2);
        tracks.add(t3);
        tracks.add(t4);
        tracks.add(t5);


        Collections.sort(tracks);

        for(Track track : tracks){
            System.out.println(
                    track.getArtist().getName()+", "+
                    track.getTitle() + ", "+
                    track.getRank());
        }

        //Interfaz Comparator
        Collections.sort(tracks, (a,b)->{
            //Comparamos a y b
            return a.getRank()-b.getRank();
        });

        System.out.println("-----------");
        for(Track track : tracks){
            System.out.println(
                    track.getArtist().getName()+", "+
                            track.getTitle() + ", "+
                            track.getRank());
        }



        //Interfaz Comparator
        Comparator<Track> comparator = new Comparator<Track>() {
            @Override
            public int compare(Track o1, Track o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        };

        Collections.sort(tracks, (o1,o2)->{
            return o1.getTitle().compareTo(o2.getTitle());
        });

        System.out.println("-----------");
        for(Track track : tracks){
            System.out.println(
                    track.getArtist().getName()+", "+
                            track.getTitle() + ", "+
                            track.getRank());
        }


    }

}
