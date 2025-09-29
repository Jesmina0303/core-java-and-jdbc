import java.util.ArrayList;
public class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        //
        System.out.println("arraylist:"+list);
        //accessing the element
        System.out.println("First element"+list.get(0));
        //updating the element
        list.set(1,"Blueberry");
        System.out.println("Accessing in second element"+list);
        //remove the element
        list.remove("Cherry");
        System.out.println("After removing cherry"+list);
        System.out.println("Contains Apple:"+list.contains("Apple"));
        System.out.println("size of the ArrayList:"+list.size());
        System.out.println("Iterating through Arraylist:");
        for(String item:list){
            System.out.println(item);
        }
        
        list.clear();
        System.out.println("After clearing the list"+list);


    }
}