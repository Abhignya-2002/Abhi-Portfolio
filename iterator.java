import java.util.arraylist;
import java.util.iterator;
public class main{
    public static void main(string args[]){
        Arraylist<string>  cars=new Arraylist<string>();
        cars.add("volvo");
        cars.add("ford");
        cars.add("BMW");
        cars.add("Ford");
        Iterator<string> it=cars.iterator();
        Sytem.Out.println(it.next());
    }
}