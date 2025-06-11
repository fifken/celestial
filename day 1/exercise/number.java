// public class HelloWorld {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }

public class number{
    public static void main(String[] args) {
        long longnum = 99999999999L;
        int intnum = 123456789;
        float floatnum = 3.14f;
        double doublenum = 3.141592653589793;
        char character = 'A';
        boolean bool = true;
        String str = "Hello";
        int[] intArray = {1, 2, 3, 4, 5};

        System.out.println("The number is: " + longnum);
        System.out.println("The integer is: " + intnum);
        System.out.println("The float is: " + floatnum);
        System.out.println("The double is: " + doublenum);
        System.out.println("The character is: " + character);
        System.out.println("The boolean is: " + bool);
        System.out.println("The string is: " + str);
        System.out.print("The integer array is: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }
}