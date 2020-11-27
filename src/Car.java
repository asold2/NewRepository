public class Car
{
  private String make;
  private int year;
  private String owner;

  public Car(String make, int year){
    this.make = make;
    this.year = year;
  }

  public String getMake()
  {
    return make;
  }

  public void setMake(String make)
  {
    this.make = make;
  }

  public int getYear()
  {
    return year;
  }

  public void setYear(int year)
  {
    this.year = year;
  }

}
