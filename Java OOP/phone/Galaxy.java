public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "Galaxy "+getVersionNumber()+ " says " + getRingTone();
        // your code here
    }
    @Override
    public String unlock() {
        // your code here
    return "Unlocking via finger print";
    }
    @Override
    public void displayInfo() {
        // your code here  
        System.out.println("Galaxy "+getVersionNumber()+" from "+getCarrier());          
    }
}