public class PythagoreanTheorem
{
    public static double calculateHypotenuse(int legA, int legB) {
        int a=(int) Math.pow(legA,2);
        int b= (int) Math.pow(legB,2);
        int c=a+b;
        return c;
    }
    public static void main (String[] args) {
        double c=calculateHypotenuse(5,5);
        System.out.print(c);
    }
}