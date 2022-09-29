public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Car c1 = new Car("černá");
        Car c2 = new Car("černá");
        c2.NastartovatAuto();
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        c1.carStarting();
        c2.carStarting();

    }


}
