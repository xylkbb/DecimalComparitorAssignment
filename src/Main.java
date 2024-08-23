public class Main {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    private static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        if (num1 < 0 && num2 >= 0) {
            return false;
        } else if (num1 >= 0 && num2 < 0) {
            return false;
        }

        double num1Check = num1 >= 0 ? Math.floor(num1) : Math.ceil(num1);
        double num2Check = num2 >= 0 ? Math.floor(num2) : Math.ceil(num2);

        if (num1Check != num2Check) {
            return false;
        }

        num1 -= num1Check;
        num2 -= num2Check;
        num1 *= 10;
        num2 *= 10;

        num1Check = num1 >= 0 ? Math.floor(num1) : Math.ceil(num1);
        num2Check = num2 >= 0 ? Math.floor(num2) : Math.ceil(num2);

        if (num1Check != num2Check) {
            return false;
        }

        num1 -= num1Check;
        num2 -= num2Check;
        num1 *= 10;
        num2 *= 10;

        num1Check = num1 >= 0 ? Math.floor(num1) : Math.ceil(num1);
        num2Check = num2 >= 0 ? Math.floor(num2) : Math.ceil(num2);

        if (num1Check != num2Check) {
            return false;
        }

        num1 -= num1Check;
        num2 -= num2Check;
        num1 *= 10;
        num2 *= 10;

        num1Check = num1 >= 0 ? Math.floor(num1) : Math.ceil(num1);
        num2Check = num2 >= 0 ? Math.floor(num2) : Math.ceil(num2);

        if (num1Check != num2Check) {
            return false;
        }

        return true;

        //repeat 23 to 35 two more times

    }
}