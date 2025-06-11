public class Car {
          String model;
        int year;

        public Car(String model, int year){
            this.model = model;
            this.year = year;
        }

        @Override
        public String toString() {
            return "Model " + model + ", tahun " + year;
        }

        void sound(){

        }; // tidak dapat menggunakan abstract method
    }

