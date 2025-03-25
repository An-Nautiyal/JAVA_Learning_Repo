public class Java_data_types {
    public static void main(String[] args) {
        //Primitive Data Types
        byte Byte = 127;
        short Short = 32767;
        int num = 2147483647;
        long Long = 9223372036854775807L;
        float Float = 3.4028235E+38F;
        double Double = 1.7976931348623157E+308;
        char Char = 'A';
        boolean Boolean = true;

        //Non-Primitive Data Types
        String String = "Hello, World!";

        System.out.println("Byte [Ranges from -128 to 127]: " + Byte);
        System.out.println("Short [Ranges from -32,768 to 32,767]: " + Short);
        System.out.println("Integer [Ranges from -2,147,483,648 to 2,147,483,647]: " + num);
        System.out.println("Long [Ranges from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807]: " + Long);
        System.out.println("Float [Approximately 3.4028235E+38]: " + Float);
        System.out.println("Double [Approximately 1.7976931348623157E+308]: " + Double);
        System.out.println("Character: " + Char);
        System.out.println("Boolean [Contain only two values True/False] : " + Boolean);
        System.out.println("String: " + String);
    
    }
}
