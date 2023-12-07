import java.util.regex.*;

public class StringProcessor {

    public boolean isStrongPassword(String password) {
        // Check if the password contains at least one uppercase letter, one lowercase letter,
        // one digit, and one special symbol.
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]+$";
        return Pattern.compile(regex).matcher(password).matches();
    }

    public int calculateDigits(String sentence) {
        // Count the number of digits in the given sentence.
        int digitCount = 0;
        for (char c : sentence.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        return digitCount;
    }

    public int calculateWords(String sentence) {
        // Calculate the number of words in the given sentence.
        String[] words = sentence.split("\\s+");
        return words.length;
    }

    public double calculateExpression(String expression) {
        // Use the ExpressionEvaluator class to calculate the result of the expression.
        ExpressionEvaluator evaluator = new ExpressionEvaluator();
        return evaluator.evaluate(expression);
    }

}