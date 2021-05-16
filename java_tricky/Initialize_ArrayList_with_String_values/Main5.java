import java.util.List;
import java.util.ArrayList;
public class Main5
{   
    public static void main(String args[]) 
    {
        List<String> list = new ArrayList<>() {{
            add("Apple");
            add("Mango");
            add("Orange");
        }};
        for (String item : list) {
            System.out.println(item);
        }
    }
}
