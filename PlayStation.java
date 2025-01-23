
/**
 * Write a description of class PlayStation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlayStation extends Consoles
{
    
    private double price;
    private String PSNpack;
    private int PSNTime;
    
    public PlayStation()
    {
    }
    
   
    public PlayStation(String model, String manufacturer, int releaseYear, double price, String PSNpack, int PSNTime)
    {
        super(model,manufacturer,releaseYear);
        this.price = price;
        this.PSNpack = PSNpack;  //essntial, premium or deluxe
        this.PSNTime = PSNTime;  //The time the PSN pack will be valid in months
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public String getPSNPack()
    {
        return PSNpack;
    }
    
    public int getPSNTime()
    {
        return PSNTime;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public void setPSNPackage(String PSNpack)
    {
        this.PSNpack = PSNpack;
    }
    
    public void setPSNTime(int PSNTime)
    {
        this.PSNTime = PSNTime;
    }
    
    public double getOnlineTotal()
    {
        if(PSNpack == "Essential")
        return 119 * PSNTime;
        
        if(PSNpack == "Premium")
        return 150 * PSNTime;
        
        if(PSNpack == "Deluxe")
        return 200 * PSNTime;
        
        else
        return 0;
    }
    
    public boolean equals(PlayStation PS)
    {
        return this.PSNpack == PS.getPSNPack();
    }
    
     public int compareTo(Consoles c)
    {
        if(this.getClass().equals(c.getClass()))
        {
            PlayStation p = (PlayStation)c;
            if(this.getPrice() == p.getPrice())
            return 0;
         else 
             if(this.getPrice() < p.getPrice())
              return -1;
             else 
              return 1;     
        }else
        return this.getClass().getName().compareTo(c.getClass().getName());
        
    }
    
    
    @Override
    public String toString()
    {
        return getModel()  +" PSN package = " + PSNpack + getPSNPack() + " Price: R" + price;
    }

}