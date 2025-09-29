
import java.util.*;
public class LinkedHashSet{
    public static void main(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("cherry");
        set.add("Strewberry");
        System.out.println(set);

        LinkedHashSet<String>anotherSet=new LinkedHashSet<>(Arrays.asList("elderBerry","fig"));
        set.addAll(anotherSet);
        System.out.println(set);
        System.out.println("contains.Apple?:"+set.contains("Apple"));
        //remove the element
        set.remove("Banana");
        set.removeAll(Arrays.asList("Cherry","Date"));
        //is empty()
        System.out.println("Is empty?:"+set.isEmpty());

        System.out.println("Size of array:"+set.size());
        
       
        System.out.println("Elements in LinkedHashSet:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // 9. forEach() - Iterate using forEach method
        set.forEach(System.out::println);
        
        // 10. retainAll() - Retain common elements
        set.retainAll(Collections.singleton("Apple"));
        System.out.println("After retainAll: " + set);
        
        // 11. clear() - Clear the LinkedHashSet
        set.clear();
        System.out.println("Set after clear: " + set);
    }
}
        
    
