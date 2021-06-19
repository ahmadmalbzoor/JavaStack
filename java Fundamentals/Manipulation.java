public class Manipulation{
    public static void main(String[] args) {
        String concating=trimAndConcat(" hello ","  World  ");
        System.out.println(concating);
        Integer index=getIndexOrNull("coding","d");
        System.out.println(index);
        Integer index1=getIndexOrNull("hello","lo");
        System.out.println(index1);
        String index2=concatSubstring("hello",2,"world",5);//
        System.out.println(index2);
    }
    public static String trimAndConcat(String first, String last){
        String string1=first.trim();
        String string2=last.trim();
        String name=string1.concat(string2);
        return (name);  
    }
    public static Integer getIndexOrNull(String string3, char a){
        Integer index1=string3.indexOf(a);
        return index1;
    }

    public static Integer getIndexOrNull(String string4, String string5){
        Integer index7=string4.indexOf(string5);
        return index7;
    }

    public static String concatSubstring(String str1, Integer x,String str2,Integer y){
        String index10=str1.substring(0,x);
        String index11=str2.substring(0,y);
        String result=index10.concat(index11);
        return result;
    }
}