public class testerClass{
    public static void main(String[] args)
    {
        Galaxy s9=new Galaxy("S9",99,"version","Ring Ring Ring");
        IPhone IPhoneten=new IPhone("X ",100," AT&T "," Zing ");
        s9.displayInfo();
        System.out.println(s9.ring());
        System.out.println(s9.unlock());
        IPhoneten.displayInfo();
        System.out.println(IPhoneten.ring());
        System.out.println(IPhoneten.unlock());
    }
}