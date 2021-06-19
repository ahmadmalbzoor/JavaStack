public class tester{
    public static void main(String[] args) 
    {
        Calculator n=new Calculator();
         n.setOperandOne(10.5);
         n.setOperation("+");
         n.setOperandTwo(5.2);
         n.performOperation();
         System.out.println(n.getResults());

    }
}