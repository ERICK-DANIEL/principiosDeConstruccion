// Tecnica "Replace Constructor with Factory Method" se usa directamente una instancia

public class FizzBuzz {
    public static void main(String[] args) {
        InnerFizzBuzz fizzBuzz = new ConsoleBasedFizzBuzz();
        fizzBuzz.print(1, 100);
    }
}