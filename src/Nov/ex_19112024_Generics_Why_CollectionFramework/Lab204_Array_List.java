package Nov.ex_19112024_Generics_Why_CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lab204_Array_List {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));//integer check
        System.out.println(list.indexOf("3"));






    }
}
