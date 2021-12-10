package ss8_clean_code_va_refactoring.thuc_hanh.refactoring_doi_ten_va_tach_hang;

public class Caculator {
    public static int Calculate(int firstOperand, int secondOperand, char opetator  ) {
        switch (opetator) {
            case '+':
                return ADDTION(firstOperand, secondOperand);
            case '-':
                return SUBTRACTION(firstOperand, secondOperand);
            case '*':
                return MULTIPLICATION(firstOperand, secondOperand);
            case '/':
                if (secondOperand != 0)
                    return DIVISION(firstOperand, secondOperand);
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }

    private static int MULTIPLICATION(int firstOperand, int secondOperand) {
        return firstOperand * secondOperand;
    }

    private static int DIVISION(int firstOperand, int secondOperand) {
        return firstOperand / secondOperand;
    }

    private static int SUBTRACTION(int firstOperand, int secondOperand) {
        return firstOperand - secondOperand;
    }

    private static int ADDTION(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }
}
