import java.util.ArrayList;
public class Project{
    String name;
    String description;
    public  ArrayList<String> elevatorPitch (String name,String description)
    {   
        ArrayList<String> elevator=new ArrayList<String>();
        this.name=name;
        this.description=description;
        elevator.add(this.name);
        elevator.add(this.description);
        return elevator;
    }
    public Project() {}
    public Project(String name) {
        this.name=name;
    }
    public Project(String name, String description) {
        this.name=name;
        this.description=description;
    }
    public String getName()
    {
        return name;
    }
    public String getDesc()
    {
        return description;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public void setDisc(String description)
    {
        this.description=description;
    }
}