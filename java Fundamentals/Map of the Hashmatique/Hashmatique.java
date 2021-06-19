import java.util.*;
public class Hashmatique{
    public static void main(String[] args)
    {
        System.out.print(trackList());
    }
    public static String trackList()
    {
     HashMap<String, String> trackList  = new HashMap<String, String>();
     trackList.put("title1", "Nancy Ninja");
     trackList.put("title2", "Sam Samurai");
     trackList.put("title3", "fsdd Wizard");
     trackList.put("title4", "Walter Wizard");
     String pull=(String)trackList.remove("title1");
     return "Initial Mappings are: " + trackList;
    }
}