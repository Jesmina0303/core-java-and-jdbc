import java.util.HashMap;

public class HashMapExample{
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<>();
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3,"quava");
        System.out.println("HashMap:"+map);
        System.out.println();
        System.out.println("Value of 2"+map.get(2));
        System.out.println();
        map.remove(3);
        System.out.println("After removing key:"+map.remove(3));
        System.out.println();
        System.out.println("After contains key:"+map.containsKey(3));
        System.out.println("contains quava?:"+map.containsValue("quava"));
        System.out.println();
        System.out.println("Iterating over HashMap:" );
        for(Integer key:map.keySet())
        {
            System.out.println("key:"+key +",value:" +map.get(key));
            System.out.println();
        }
            System.out.println("size of HashMap:"+map.size());
            System.out.println();
            map.clear();
            System.out.println("After Clearing :"+map);

        

    }
}