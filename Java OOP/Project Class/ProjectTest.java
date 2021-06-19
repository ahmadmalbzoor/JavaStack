public class ProjectTest{
    public static void main(String[] args){
        Project car=new Project();
        Project car2=new Project("Opel");
        Project car3=new Project("Audi","this is adam car");
        System.out.println(car2.name);
    }
}