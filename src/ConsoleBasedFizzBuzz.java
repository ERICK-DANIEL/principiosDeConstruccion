/*
 * Tecnica "Extract Metod" y "Replace Nested Conditional with Guard Clauses", se eliminaron los continue
 * que no tenian importancia en el codigo y se separaron en dos metodos
 */

 public class ConsoleBasedFizzBuzz implements InnerFizzBuzz {
    @Override
    public void print(int from, int to) {
        for (int i = from; i < to; i++) {
            System.out.println(getFizzBuzzValue(i));
        }
    }

    private String getFizzBuzzValue(int number) {
        if (number % 15 == 0) return "FizzBuzz";
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";
        return String.valueOf(number);
    }
}
