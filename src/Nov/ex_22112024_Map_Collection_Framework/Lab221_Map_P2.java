package Nov.ex_22112024_Map_Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class Lab221_Map_P2 {
    public static void main(String[] args) {

      //  Map<String,Integer> map1 = new HashMap();
       // Map<String,Integer> map2 = new HashMap();
        //Map<String,Integer> map3 = new HashMap();
        Map map = new HashMap();

        //Diff between line 11 & 12 is in line 11
        // we fixed the data type.
        //in line 12 we have not fixed the data type.

        map.put("id",1);
        map.put("id",2);
        map.put("id2",2);
        map.put("id3",34);
        map.put("id4",null);
        map.put("id5",null);
        map.put(null,100);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(99));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("id3"));


    }
}
