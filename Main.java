import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner skan = new Scanner(System.in);
    System.out.println("Podaj pierwszą liczbe ");
    int x = skan.nextInt();
    System.out.println("Podaj drugą liczbe ");
    int y = skan.nextInt();
    int potega1 = (int) Math.pow(x, y);
    int potega2 = (int) Math.pow(y, x);
    int suma = potega1 + potega2;
    System.out.println("Wynik: " + suma);
  }
}