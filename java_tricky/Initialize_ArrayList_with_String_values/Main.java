import java.util.Arrays;
import java.util.List;
public class Main
{   
    public static void main(String args[]) 
    {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(
                "Apple",
                "Mango",
                "Orange"
                ));
        for (String item : list) {
            System.out.println(item);
        }
    }
}
 
