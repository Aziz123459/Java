import java.util.HashMap;

public class TestTrackList {
    public static void main(String[] args){
        HashMap<String,String> music=new HashMap<String,String>();
        music.put("heather","kakakak");
        music.put("90mh","Sorry yo , i can't be your romeo");
        music.put("f!en","fien fien fien");
        music.put("houmani","houmeniiiiii");
        TrackList gen=new TrackList();
        System.out.println(gen.getMusic(music,"90mh"));
        gen.getMusics(music);
    }
    
}