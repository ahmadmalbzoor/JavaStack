import java.util.*;
public class ClassCastException{
    public static void main(String[] args)    {
        try {
            ArrayList<Object> myList = new ArrayList<Object>();
            myList.add("13");
            myList.add("hello world");
            myList.add(48);
            myList.add("Goodbye World");
            for(int i = 0; i < myList.size(); i++) {
                Integer castedValue = (Integer) myList.get(i);
            }
            System.out.print(myList);
        } catch (Exception e) {
            System.out.println("Hey");

        }
    }
}