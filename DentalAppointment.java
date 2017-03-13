import java.util.Scanner;

public class DentalAppointment
{
  Person person;
  Date date;
  Time time;
  int duration;

  // includes duration
  public DentalAppointment(String l, String f, int m, int d, int y, int h, int min, int dur)
  {
    person = new Person(l , f);
    date = new Date(m, d, y);
    time = new Time(h, min);
    if(dur > 240)
    {
      duration = 30;
    }
    else if(dur < 30)
    {
      duration = 30;
    }
    else
      duration = dur;
  }

  //does not include duration
  public DentalAppointment(String l, String f, int m, int d, int y, int h, int min)
  {
    person = new Person(l , f);
    date = new Date(m, d, y);
    time = new Time(h, min);
    duration = 30;
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    String lastInput, firstInput;
    int month, day, year, hours, minutes, duration;

    DentalAppointment[] appointments = new DentalAppointment[3];
    for(int i = 0; i < 3; i++)
    {
      System.out.print("Enter last name: ");
      lastInput = sc.next();
      System.out.print("Enter first name: ");
      firstInput = sc.next();
      System.out.print("Enter month: ");
      month = sc.nextInt();
      System.out.print("Enter day: ");
      day = sc.nextInt();
      System.out.print("Enter year: ");
      year = sc.nextInt();
      System.out.print("Enter hours: ");
      hours = sc.nextInt();
      System.out.print("Enter minutes: ");
      minutes = sc.nextInt();
      System.out.print("Enter duration ");
      duration = sc.nextInt();
      System.out.println();

      appointments[i] = new DentalAppointment(lastInput, firstInput, month, day, year, hours, minutes, duration);
    }
    for(int j = 0; j < appointments.length; j++)
    {
      appointments[j].display();
    }
  }
  public void display()
  {
    person.display();
    date.printDate();
    time.Display();
    System.out.print("Duration: ");
    System.out.println(duration);
    System.out.println("");
  }
}
