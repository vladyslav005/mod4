package calculator;

public class SumCalculator {

    int sum(int n) throws IllegalArgumentException {
        if (n == 0) throw new IllegalArgumentException("Zero is illegal argument");

        int result = 0;
        for (int i = n; i > 0; i--)
            result += i;

        return result;
    }
}
