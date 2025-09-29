import java.util.*;
public class TreesetDemo{
    public static void main(String[]args){
        TreeSet<String>set=new TreeSet<>();
        set.add("guava");
        set.add("strawberry");
        set.add("banana");
        set.add("Date");
        TreeSet<String>anotherset=new TreeSet<>(Arrays.asList("Strawberry","Fig"));
        set.addAll(anotherset);
        System.out.println("Contains Guava:?"+set.contains("Guava"));
        set.remove("Banana");
        set.removeAll(Arrays.asList("Banana"));
        System.out.println("is empty:"+set.isEmpty());
        System.out.println("size of set:"+set.size());
        System.out.println("Element of treeset:"+set);
        Iterator<String>iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        set.forEach(System.out::println);
        set.retainAll(Collections.singleton("Banana"));
        System.out.println("After the retainAll:"+set);
        set.clear();
        System.out.println("After clearing element:"+set);
    }
}