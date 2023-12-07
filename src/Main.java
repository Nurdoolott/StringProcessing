public class Main {
    public static void main(String[] args) {
        // Test cases
        StringProcessor processor = new StringProcessor();

        // Test case for isStrongPassword
        System.out.println("Test case for Strong password:");
        System.out.println("Password: Nurdoolotaiu$2023 - " + processor.isStrongPassword("Nurdoolotaiu$2023"));
        System.out.println("Password: nurdoolotaiu2023 - " + processor.isStrongPassword("nurdoolotaiu2023"));
        System.out.println();

        // Test case for calculateDigits
        System.out.println("Test case for calculateDigits:");
        System.out.println("Sentence: 12345678 - Digits: " + processor.calculateDigits("12345678")); // 3
        System.out.println("Sentence: No digits - Digits: " + processor.calculateDigits("No digits")); // 0
        System.out.println();

        // Test case for calculateWords
        System.out.println("Test case for calculateWords:");
        System.out.println("Sentence: This is a test - Words: " + processor.calculateWords("This is a test")); // 4
        System.out.println("Sentence: Nowords - Words: " + processor.calculateWords(" ")); //1
        System.out.println();

        // Test case for calculateExpression
        System.out.println("Test case for calculateExpression:");
        System.out.println("Expression: 2 + 3 * 4 - (5 / 2) - Result: " + processor.calculateExpression("2 + 3 * 4 - (5 / 2)")); // 11.5
        System.out.println("Expression: sqrt(16) - Result: " + processor.calculateExpression("sqrt(16)")); // 4.0
    }
}

