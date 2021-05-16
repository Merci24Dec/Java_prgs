import java.util.Arrays;
import java.util.List;
public class Main1
{   
    public static void main(String args[]) 
    {
        List<String> list = Arrays.asList(new String[]{
                "Apple",
                "Mango",
                "Orange"
                });
        list.add("Banana");     
        for (String item : list) {
            System.out.println(item);
        }
    }
}
