public class Date
{
  private int month;
  private int day;
  private int year;

  public Date()
  {
    month = 1;
    day = 1;
    year = 2000;
  }

  public Date(int newMonth, int newDay, int newYear)
  {
    month = newMonth;
    day = newDay;
    year = newYear;
  }

  public void printDate()
  {
    System.out.println(Integer.toString(month) + "/" + day + "/" + year);
  }

  public static void main(String[] args)
  {
    Date myDate = new Date();
    myDate.printDate();

    Date otherDate = new Date(1, 31, 2000);
    otherDate.printDate();
  }
}
