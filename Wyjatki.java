import java.io.IOException;

public class Wyjatki {
    public void metoda1() throws IOException {
        System.out.println("Metoda 1: ");
        metoda2();
    }
    public void metoda2() throws IOException {
        System.out.println("Metoda 2: ");
        metoda3();
    }
    public void metoda3() throws IOException {
        System.out.println("Metoda 3: ");
        metoda4();
    }
    public void metoda4() throws IOException {
        System.out.println("Metoda 4: ");
        throw new IOException("Bum bum");
    }
}
