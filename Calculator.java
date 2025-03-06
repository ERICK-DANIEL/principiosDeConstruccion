public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println(
                "Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }

        String operand1 = args[0]; 
        String operand2 = args[2];
        isNumeric(operand1);
        isNumber2(operand2);

        int result = 0;

        switch (args[1].charAt(0)) {
            case '+':   result = Integer.parseInt(args[0]) +
                                 Integer.parseInt(args[2]);
                        break;
            case '-':   result = Integer.parseInt(args[0]) -
                                 Integer.parseInt(args[2]);
                        break;
            case '.':   result = Integer.parseInt(args[0]) *
                                 Integer.parseInt(args[2]);
                        break;
            case '/':   result = Integer.parseInt(args[0]) *
                                 Integer.parseInt(args[2]);
                        break;
        }

        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
            + ' ' + '=' + ' ' + result);
    }

    public static void isNumeric(String operand1) {
        try {
            Integer.parseInt(operand1);
        } catch (NumberFormatException e) {
            System.out.println("Entrada incorrecta: " + operand1);
            System.exit(2);
        }
    }

    public static void isNumber2(String operand2) {
        try {
            Integer.parseInt(operand2);
        } catch (NumberFormatException e) {
            System.out.println("Entrada incorrecta: " + operand2);
            System.exit(3);
        }
    }
}