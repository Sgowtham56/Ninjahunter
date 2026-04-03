import java.util.Scanner;
class fly{
    public static void main(String args[])
    {
      Scanner scan = new Scanner(System.in); 
      String name = scan.nextLine();
      int age = scan.nextInt();
      scan.nextLine();
      String place = scan.nextLine();
      System.out.println("I am "+ name);
      System.out.println("My age is "+ age);
      System.out.println("My place "+ place);

    }
}