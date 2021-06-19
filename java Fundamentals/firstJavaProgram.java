import java.lang.Math;

public class Pythagoreantheorem {

  public static double calculateHypotenuse(int legA, int legB) {
      // calling the sqrt static method of the Math class
    return Math.sqrt(legAlegA + legBlegB);
  }

  public static void main(String[] args) {
    int a = 4;
    int b = 8;
    double c = calculateHypotenuse(a, b);
    System.out.println("The Hypotenuse of a triangle with the sides " + a + " and " + b + " is: " + String.format("%.2f", c));
  }
}