public class HumanTest {
    public static void main(String[] args) {
        Human a=new Human();
        Human h=new Human();
        a.attack(h);
        System.out.print(h.health);
    }
}