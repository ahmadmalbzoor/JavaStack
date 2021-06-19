java.util.Date;
public class Geometric{
    private String color="white";
    private boolean filled=false;
    private Date dateCreated=new Date;
    public Geometric()
    {

    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public String getColor()
    {
        return color;
    }
    public void setFilled(boolean filled)
    {
        this.filled=filled;
    }
    public boolean getFilled()
    {
        return filled;
    }
    public Geometric(String color, boolean filled)
    {
        this.color=color;
        thid.filled=filled;
    }
    public Date getDatecreated(){
        return Date.now();
    }

    
}