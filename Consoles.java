
/**
 * Abstract class Consoles - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Consoles implements Comparable<Consoles>
{
  private String model;
  private String manufacturer;
  private int releaseYear;
  
  public Consoles()
  {
      
  }
  
  public Consoles(String model, String manufacturer, int releaseYear)
  {
      this.model = model;
      this.manufacturer = manufacturer;
      this.releaseYear = releaseYear;
  }
  
  public String getModel()
  {
      return model;
  }
  
  public String getManufacturer()
  {
      return manufacturer;
  }
  
  public int getReleaseYear()
  {
      return releaseYear;
  }
  
  public void setModel(String model)
  {
      this.model = model;
  }
  
  public void setManufacturer(String manufacturer)
  {
      this.manufacturer = manufacturer;
  }
  
  public void setReleaseYear(int releaseYear)
  {
      this. releaseYear = releaseYear;
  }
  
  abstract  public double getOnlineTotal();
}
