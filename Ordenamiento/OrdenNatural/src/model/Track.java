package model;


//Collection.sort()

//Ordenamiento natural
public class Track implements Comparable<Track>{
    private String title;
    private Artist artist;
    private int duration;
    private int rank;

    public Track(String title, Artist artist, int duration, int rank) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    //Collection.sort usa a compareTo para determinar el orden
    @Override
    public int compareTo(Track other) {
        //this, other
        //Ordenamiento por artista
        int firstCriteria = this.getArtist().getName().compareTo(
                other.getArtist().getName()
        );
        if(firstCriteria == 0){
            //negativo en desorden, positivo en orden y cero iguales
            return this.getRank() - other.getRank();
        }else{
            return firstCriteria;
        }

    }
}
