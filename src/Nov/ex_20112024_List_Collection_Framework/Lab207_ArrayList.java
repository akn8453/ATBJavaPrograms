package Nov.ex_20112024_List_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab207_ArrayList {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("Bread"); //0
        list.add("milk"); //1
        list.add("butter"); //2
        list.add("panner");//3
        list.add("jam");//4
        list.add("cheez");//5
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));

        System.out.println("Default For loop");
        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("for each loop");
        for(Object o : list){
            System.out.println(o);
        }

        System.out.println("To print array list using iterator");
        // iterator - anchor go one by onr forward - get access.
        // HasNext() - true - if we have a next element
        // next - element

        Iterator iterator = list.iterator();
        while ((iterator.hasNext())){
            System.out.println(iterator.next());
        }


    }
}
