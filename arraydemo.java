
import java.util.ArrayList;

public class arraydemo{
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("Stawberry");
        list.add("Cherry");
        list.add("Grape");
        System.out.println("arraylist:"+list);
        System.out.println("First element:"+list.get(0));
        list.set(1,"Stawberry" );
        System.out.println("Accessing of the element:"+list);
        list.remove("Cherry");
        System.out.println("After removing cherry:"+list);
        System.out.println("Contains Apple:"+list.contains(list));
        System.out.println("size of the ArrayList"+list.size());
        System.out.println("Iterating through Arraylist");
        for(String item:list)
        System.out.print(item);
        list.clear();
        System.out.println("After clearing the list:"+list);

    }

}