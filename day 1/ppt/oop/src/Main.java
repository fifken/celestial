public class Main {
    public static void main(String[] args) {

        // Class

        Car myCar = new Car("Toyota", 2020);

        System.out.println(myCar);


        // Abstract Class

        Animal cat = new Animal() {
            @Override
            void sound() {

            }
        }; // Contoh Penggunaan Template

        Animal myDog = new Dog();

        myDog.sound(); // Outputs: The dog barks.
        myDog.sleep(); // Outputs: This animal is sleeping.

        }
}