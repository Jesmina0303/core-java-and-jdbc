import java.util.*;
public class vectorDemo{
    public static void main(String[]args){
        Vector<String>set=new Vector<>();
        System.out.println();
        set.add("apple");
        set.add("strawberry");
        set.add("Jack fruit");
        set.add("Date");
Vector<String>anotherSet=new Vector<>(Arrays.asList("Banana","fig"));
        set.addAll(anotherSet);
        System.out.println(set);
        System.out.println("contains Strawberry?:"+set.contains("Apple"));

        //remove the element
        set.remove("apple");
        //remove all the element
        set.removeAll(Arrays.asList("JackFruit","Date"));

        System.out.println("is empty:?"+set.isEmpty());
        System.out.println("size of  array:"+set.size());
        Iterator<String>iterator =set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
           }
           //for each
           set.forEach(System.out::println);
           set.retainAll(Collections.singleton("apple"));
           System.out.println("After retailAll:"+set);
            set.clear();
            System.out.println("set allclear:"+set);
    }
}