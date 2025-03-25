public class practise
 {
    static class Car
    {
        String brand;
        int speed;
        Car(String brand, int speed)
        {
            this.brand = brand;
            this.speed = speed;
        }
    }

        public static void main(String[] args) 
        {
        Car[] cars = new Car[3];
        cars[0] = new Car("Toyota", 120);
        cars[1] = new Car("BMW", 150);
        cars[2] = new Car("Audi", 140);
            for (Car car : cars)
            {
                System.out.println(car.brand + " " + car.speed);
            }
        }
 }
