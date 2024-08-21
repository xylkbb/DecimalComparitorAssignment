public class Main {


    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));

        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));

        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));

        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }


    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        if (num1 < 0 && num2 >= 0) {
            return false;
        }

        if (num1 >= 0 && num2 < 0) {
            return false;
        }

        long num1Check = Math.round(num1);
        long num2Check = Math.round(num2);
        if (num1Check != num2Check) {
            return false;
        }

        num1 -= num1Check;
        num1 *= 10;
        num2 -= num2Check;
        num2 *= 10;

        num1Check = Math.round(num1);
        num2Check = Math.round(num2);

        if (num1Check != num2Check) {
            return false;
        }

        num1 -= num1Check;
        num1 *= 100;
        num2 -= num2Check;
        num2 *= 100;

        num1Check = Math.round(num1);
        num2Check = Math.round(num2);

        if (num1Check != num2Check) {
            return false;
        }

        num1 -= num1Check;
        num1 *= 1000;
        num2 -= num2Check;
        num2 *= 1000;

        num1Check = Math.round(num1);
        num2Check = Math.round(num2);

        return num1Check == num2Check;
    }
}




