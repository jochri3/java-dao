import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<String> fruits=new HashSet<>();
        fruits.add("pommes");
        fruits.add("mangues");
        fruits.add("pommes");
        fruits.add("ananas");
        fruits.add("mangues");
        for(String fruit:fruits){
            System.out.println(fruit);
        }
    }
}
