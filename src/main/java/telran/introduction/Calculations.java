package telran.introduction;

public class Calculations {
public static int sum(int op1, int op2) {
   int res = op1 + op2;
   return res;
}
public static int multiply(int op1, int op2) {
    
    return op1 * op2;
}
public static int divide(int op1, int op2) {
    
    return op1 / op2;
}
public static int subtract(int op1, int op2) {
    return op1 - op2;
}
public static int sumOfDigits(int number) {
        int res = 0;
        number = Math.abs(number);
        while(number != 0) {
            res += number % 10;
            number /= 10;
        }
        return res;
}
public static int maxDigit(int number){
        int maxDigit = 0;
        number = Math.abs(number);
        while(number != 0) {
            maxDigit = Math.max(maxDigit, number % 10);
            number /= 10;
        }
        return maxDigit;
}
public static boolean isDividedOn(int number, int dividor) {
    
    return dividor != 0 && number % dividor == 0;
}
}
