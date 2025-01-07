import java.util.HashMap;
import java.util.Set;
public class TrackList {
    public String getMusic(HashMap<String,String> music , String title){
        title=music.get("90mh");
        return title;
    }
    public void getMusics(HashMap<String,String> music){
        Set<String> keys =music.keySet();
        for(String key :keys){
            System.out.println(key+":"+" "+music.get(key));
        }
    }
}