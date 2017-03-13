public class Person
{
  String lastName;
  String firstName;
  String zipCode;

  public Person()
  {
    lastName = "X";
    firstName = "X";
    zipCode = "X";
  }

  public Person(String last, String first, String zip)
  {
    lastName = last;
    firstName = first;
    zipCode = zip;
  }

  public Person(String last, String first)
  {
    lastName = last;
    firstName = first;
    zipCode = "X";
  }

  public static void main(String[] args)
  {
    Person A = new Person();
    Person B = new Person("Giarratana", "Sam", "37069");
    A.display();
    B.display();
  }

  public void display()
  {
    System.out.println("Last: " + lastName);
    System.out.println("First: " + firstName);
    System.out.println("Zip: " + zipCode);
  }
}
