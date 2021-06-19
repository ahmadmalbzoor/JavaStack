public class Basics{
    public static void main(String[] args)
    {
        System.out.println(print1_255());
        System.out.println(odd());
        System.out.println(sum());
        System.out.println(Iterating());
        System.out.println(max());
        System.out.println(Average());
        System.out.println(oddarry());
        System.out.println(GreaterThanY());
        System.out.println(SquareTheValues());
        System.out.println(EliminateNegativeNumbers());
        System.out.println(MaxMinAndAverage());
        System.out.println(ShiftingtheValuesintheArray());
    }
    public static Integer print1_255()
    {
        for(int i=1; i<=255;i++)
        {
            System.out.println(i) ;
        }
        return 0;
    }

    public static Integer odd()
    {
        for(int i=1; i<=255;i++)
        {
            System.out.println(i) ;
            i++;
        }
        return 0;
    }

    public static Integer sum()
    {   int sum=0;
        for(int i=1; i<=255;i++)
        {   sum+=i;
            System.out.println("New number:"+ i + "Sum:"+sum ) ;
        
        }
        return 0;
    }

    public static Integer Iterating ()
    {   
        int[] myArray = {1,3,5,7,9,13};
        for(int i=0; i<myArray.length;i++)
        {
            System.out.println(myArray[i]);
        }
        return "gggg";
    }

    public static Integer max()
    {   
        int[] myArray = {-12,-15,-1,-7,-3,-11};
        int max =myArray[0];
        for(int i=0; i<6;i++)
        {
            if (myArray[i]>max)
            {
                max=myArray[i];
            }
        }
        return max;
    }

    public static Integer Average()
    {   
        int[] myArray = {5,10,10,5,10,10};
        int sum=0;
        int avg=0;
        for(int i=0; i<6;i++)
        {
            sum+=myArray[i];
        }
        avg=sum/6;
        return avg;
    }
    public static Integer oddarry()
    {   
        int[] myArray ;
        myArray = new int[255];    // Initialization
        for(int i=1;i<255;i+=2)
        {
            myArray[i]=i;
            System.out.println(myArray[i]);
        }
        return 0;
    }
    
    public static Integer GreaterThanY()
    {
        int[] myArray = {5,10,10,5,10,10};
        int max=myArray[0],count=0,y=7;
        for(int i=1;i<6;i++)
        {
            if(myArray[i]>y)
            {
                count++;
            }
        }
        return count;
    }

    public static Integer SquareTheValues()
    {
        int[] myArray = {1, 5, 10, -2};
        for(int i=0;i<4;i++)
        {
            myArray[i]=myArray[i]*myArray[i];
            System.out.println(myArray[i]);
        }
        return 0;   
    }

    public static Integer EliminateNegativeNumbers()
    {
        int[] myArray = {1, 5, 10, -2};
        for(int i=0;i<4;i++)
        {
            if(myArray[i]<0)
            {
                myArray[i]=0;
            }
            System.out.println(myArray[i]);
        }
        return 0;
    }
    public static Integer MaxMinAndAverage()
    {
        int[] myArray = {1, 5, 10, -2};
        int max=myArray[0],min=myArray[0],sum=0,avg=1;
        for(int i=0;i<4;i++)
        {
            if(myArray[i]>max)
            {
                max=myArray[i];
            }
            if(myArray[i]<min)
            {
                min=myArray[i];
            }
            sum+=myArray[i];
        }
        avg=sum/4;
       int[] myArray1={max,min,avg};
       for(int i=0;i<3;i++)
       {
        System.out.println(myArray1[i]);
       }
       return 0;
    }
    public static Integer ShiftingtheValuesintheArray()
    {
        int[] myArray = {1, 5, 10, 7, -2};
     
        myArray[4]=0;
        for(int i=0;i<=4;i++)
        {
            myArray[i]=myArray[i+=1];
            i--;
            
            System.out.println(myArray[i]);
        }
       return 0;
    }
}
