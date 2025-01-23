
/**
 * Write a description of class Xbox here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Xbox extends Consoles
{
   private double price;
    private int XboxLiveTime;  //Time in months
    
    public Xbox()
    {
        
    }
    
    
    public Xbox(String model, String manufacturer, int releaseYear, double price, int XboxLiveTime)
    {
        super(model,manufacturer,releaseYear);
        this.price = price;
        this.XboxLiveTime = XboxLiveTime;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public int getXboxLiveTime()
    {
        return XboxLiveTime;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public void setXboxLiveTime(int XboxLiveTime)
    {
        this.XboxLiveTime = XboxLiveTime;
    }
    
    public double getOnlineTotal()
    {
       return 175 * XboxLiveTime; 
    }
    
    public boolean equals(Xbox xbox)
    {
        return this.price == xbox.getPrice();
    }
    
    public int compareTo(Consoles c)
    {
        if(this.getClass().equals(c.getClass()))
        {
            Xbox x = (Xbox)c;
         if(this.getPrice() == x.getPrice())
          return 0;
         else
           if(this.getPrice() == x.getPrice())
              return -1;
           else
            return 1;
        }else
        return this.getClass().getName().compareTo(c.getClass().getName());
    }
    
    @Override
    public String toString()
    {
        return getModel() + "Online Play: " + "Online Total: " +getOnlineTotal() + ", "+  "Price = R" + price;  
    }

}