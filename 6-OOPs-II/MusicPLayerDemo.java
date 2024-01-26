/**
 * MusicPLayer
 */

class Song{

    String songName;
    float duration;

    // constructor to instantiate attributes
    Song(String songName, float duration ){
        this.songName = songName;
        this.duration = duration;
    }
}


class MusicPLayer{

    // // a class can have an object of other class as it's attribute
    // Song nowPlayingSong;

    // a method of a class can also take object of another class as an argument
    public void playSong(Song nowPlayingSong){
        System.out.println("\nNow playing.... " + nowPlayingSong.songName);
    }

    // a method can also return an object
    public Song getNowPlayingSong(Song nowPlayingSong){
        return nowPlayingSong;
    }
}

public class MusicPLayerDemo {

    public static void main(String[] args){
        Song track1 = new Song("Gangam Style", 4.5f);
        MusicPLayer musicPLayer = new MusicPLayer();

        musicPLayer.playSong(track1);
        musicPLayer.getNowPlayingSong(track1);
        Song currentSong = musicPLayer.getNowPlayingSong(track1);
        System.out.println("Current song..." + currentSong.songName);
    }
}

