import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;

public class PuzzleJava{
    public static void main(String[] args)
    {
        System.out.println(sumAllNumber());
        System.out.println(greater10());
        System.out.println(shuffle());
    }
    public static Integer sumAllNumber()
    {
        int[] myArray= {3,5,1,2,7,9,8,13,25,32};
      
        int sum=0;
        for(int i=0;i<10;i++)
        {
            sum+=myArray[i];
           
        
        }
        return sum;
    }
    public static Integer greater10()
    {    
        int[] myArray= {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> myArray1 = new ArrayList<Integer>();
        for(int i=0;i<myArray.length;i++)
            {
                if(myArray[i]>10)
                {
                    myArray1.add(myArray[i]);
                }
            }
            int[] myArray2=new int[myArray1.size()];
            for(int i=0;i<myArray1.size();i++)
            {
                myArray2[i]=myArray1.get(i);
                System.out.println(myArray2[i]);
            }
        return 0;
    }
    public static String shuffle()
    {
        ArrayList<String> myArray1 = new ArrayList<String>();
        myArray1.add("Nancy");
        myArray1.add("Jinichi");
        myArray1.add("Fujibayashi");
        myArray1.add("Momochi");
        myArray1.add("Ishikawa");
        Collections.shuffle(myArray1);
                
		System.out.println(myArray1);
        return "0";
    }
    
}