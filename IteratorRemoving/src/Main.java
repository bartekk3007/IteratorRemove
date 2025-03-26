import java.util.ArrayList;
import java.util.Iterator;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Andrzej");
        arrayList.add("Bartek");
        arrayList.add("Cezary");
        arrayList.add("Dariusz");
        arrayList.add("Edward");
        arrayList.add("Filip");
        arrayList.add("Jan");
        Iterator iterator = arrayList.iterator();
        iterator.next();
        iterator.remove();
        iterator.next();
        iterator.next();
        iterator.remove();
        //iterator.remove();
        arrayList.forEach(System.out::println);
    }
}