import java.util.*;
public class QueueDemo{
    public static void main(String[]args){
        Queue queue=new LinkedList();
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Strawberry");
        queue.offer("Date");
        System.out.println("First element:"+queue.peek());
        System.out.println("poll element:"+queue.poll());
        System.out.println("contains Apple?:"+queue.contains("Apple"));
        System.out.println("is queue empty:"+queue.isEmpty());
        System.out.println("size of element:"+queue.size());
        System.out.println("Element of queue:");
        Iterator<String>iterator=queue.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        queue.forEach(System.out::println);
        queue.clear();
        System.out.println("After Clear Queue element:"+queue);

            
        
    }
}