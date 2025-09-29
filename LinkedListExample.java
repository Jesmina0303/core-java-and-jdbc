import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[]args)
    {
        LinkedList<String>list=new LinkedList<>();
        list.addFirst("jems");
        list.addLast("saif");
        list.add("sumaiya");
        System.out.println("Linked List:"+list);
        list.removeFirst();
        System.out.println("after Removing First"+list);
        list.removeLast();
        System.out.println("After Removing Last "+list);
        
        list.add("jems");
        list.add("afra");
        list.remove("sameeha");
        System.out.println("After deleting the position1:"+list);
        
        boolean found=list.contains("afra");
        System.out.println("Search afra:"+list);
        LinkedList<String>Reversedlist=new LinkedList<>();
        for(int i=list.size()-1;i<=0;i--)
        {
            Reversedlist.add(list.get(i));
            System.out.println("ReversedList:"+list);
        }

    }

    
}