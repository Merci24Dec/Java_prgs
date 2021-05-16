import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main3
{   
    public static void main(String args[]) 
    {
        List<String> list = Stream.of(
                "Apple",
                "Mango",
                "Orange"
                ).collect(Collectors.toList());
        for (String item : list) {
            System.out.println(item);
        }
    }
}
