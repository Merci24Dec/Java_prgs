import java.util.ArrayList;
public class Main
{
    public static void main(String args[]) 
    {
        ArrayList<String> list =  new ArrayList<>();
        list.add("India");
        list.add("US");
        list.add("China");
        System.out.println(list);
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list);
        System.out.println(list2);
        list2.set(1, "Russia");
        System.out.println(list2);
    }
}
