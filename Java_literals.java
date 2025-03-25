public class Java_literals {
    public static void main(String[] args) {
        /* In Java literal are fixed values that does not change while the programs run. */
        // Integer Literals -> Represents the whole numbers or no with deciaml base.
        int decimalInt = 10;
        int binaryInt = 0b1010; 
        int octalInt = 012;
        int hexadecimalInt = 0xA;

        System.out.println("Integer Literals: \n");
        System.out.println("Decimal Integer: " + decimalInt);
        System.out.println("Binary Integer: " + binaryInt);
        System.out.println("Octal Integer: " + octalInt);
        System.out.println("Hexadecimal Integer: " + hexadecimalInt+"\n");

        // Float Literals -> Represents the decimal numbers with or without decimal point.
        float floatValue = 3.14f;
        double doubleValue = 3.14;

        System.out.println("Float Literals: \n");
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue+"\n");

        // Character Literals -> Represents a single character.
        char singleChar = 'a';
        char escapeChar = '\n'; // Newline character
        
        System.out.println("Character Literals: \n");
        System.out.println("Single Character: " + singleChar);
        System.out.println("Escape Character: " + escapeChar);

        // Boolean Literals -> Represents true or false values.
        boolean trueValue = true;
        boolean falseValue = false;

        System.out.println("Boolean Literals: \n");
        System.out.println("True Value: " + trueValue);
        System.out.println("False Value: " + falseValue+"\n");

        // String Literals -> Represents a sequence of characters enclosed in double quotes.
        String stringValue = "Hello, World!";

        System.out.println("String Literals: \n");
        System.out.println("String Value: " + stringValue+"\n");

        //Null Literal -> Represents a null value.
        String nullString = null;
        
        System.out.println("Null Literal: \n");
        System.out.println("Null String: " + nullString);
    }
}
