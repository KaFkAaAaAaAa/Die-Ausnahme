import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Wyjatki wyjatki = new Wyjatki();
        try {
            wyjatki.metoda1();
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
        }
         */

        /*
        Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek.
        Jeśli użytkownik poda liczbę ujemną rzuć wyjątek java.lang.IllegalArgumentException.
        Obsłuż sytuację, w której użytkownik poda ciąg znaków, który nie jest liczbą.
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");

        try {
            double liczba = scanner.nextDouble();
            if (liczba < 0)
                throw new IllegalArgumentException("Podaj liczbę większą od 0");
            System.out.println(Math.sqrt(liczba));
        }catch (IllegalArgumentException | InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
}
