public class FizzBuzz {
    interface InnerFizzBuzz {
        void print(int from, int to);
    }

    class ConsoleBasedFizzBuzz implements InnerFizzBuzz {
        @Override
        public void print(int from, int to) {
            for (int i = from; i < to; i++) {
                if (i % 15 == 0) {
                    System.out.println("FizzBuzz");
                    continue;
                }
                if (i % 3 == 0) {
                    System.out.println("Fizz");
                    continue;
                }
                if (i % 5 == 0) {
                    System.out.println("Buzz");
                    continue;
                }
                
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        ConsoleBasedFizzBuzz consoleFizzBuzz = fizzBuzz.new ConsoleBasedFizzBuzz();

        consoleFizzBuzz.print(1, 100);
    }
}
