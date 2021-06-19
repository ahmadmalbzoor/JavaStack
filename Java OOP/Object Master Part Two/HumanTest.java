public class HumanTest {
    public static void main(String[] args) {
        Human a=new Human();
        Human h=new Human();

        Wizard ahmad=new Wizard();
        Ninja khaled=new Ninja();
        a.attack(h);
        System.out.println(h.getHelth());

        ahmad.heal(ahmad);
        System.out.println(h.getHelth());
        
        ahmad.attack(h);
        ahmad.fireball(h);
        System.out.println(ahmad.getHelth());
        
        khaled.attack(ahmad);
        khaled.steal(ahmad);
        System.out.println(khaled.getHelth());
        System.out.println(ahmad.getHelth());
        
        khaled.runAway();
        System.out.println(khaled.getHelth());
    }
}