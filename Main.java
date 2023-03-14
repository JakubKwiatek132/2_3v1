import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner skan = new Scanner(System.in);
    System.out.println("Podaj pierwszą liczbe ");
      int x = skan.nextInt();
     System.out.println("Podaj drugą liczbe ");
      int y = skan.nextInt();
    int suma = x + y;
    System.out.println("Wynik: " + suma);
  }
}