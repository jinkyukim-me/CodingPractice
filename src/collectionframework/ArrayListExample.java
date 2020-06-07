package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("JDBC");
        list.add("Servelet/JSP");
        list.add(2, "Database");
        list.add("iBATIS");

        System.out.println(list);

        int Size = list.size();
        System.out.println("총 객체수: " + Size);
        System.out.println();

        String skill = list.get(2);
        System.out.println("2: " + skill);
        System.out.println();

        for(int i=0; i<list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }
        System.out.println();

        list.remove(2);
        list.remove(2);
        System.out.println(list);
        list.remove("iBATIS");
        System.out.println(list);
        System.out.println();

        for(int i=0; i<list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }
        System.out.println();
    }
}
