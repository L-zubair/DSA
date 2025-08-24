import java.util.LinkedList;

public class linklist2 {
    public static void main(String[] args) {
        LinkedList<String> list =new LinkedList<>();

        // adding element 
        list.add("10");
        list.add("20");
        list.add("30");
        

        //pring list
        System.out.println(list);
        list.addFirst("0");
        list.addLast("40");
        System.out.println(list);
    }
}
