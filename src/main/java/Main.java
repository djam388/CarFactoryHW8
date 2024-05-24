public class Main {
    public static void main(String[] args) {
        FactoryAF factory = new FactoryAF();

        // Добавление автомобилей
        factory.addCar(new Car("Small"));
        factory.addCar(new Car("Medium"));
        factory.addCar(new Car("Large"));

        // Добавление покупателей
        factory.addCustomer(new Customer("Customer_1"));
        factory.addCustomer(new Customer("Customer_2"));
        factory.addCustomer(new Customer("Customer_3"));
        factory.addCustomer(new Customer("Customer_4"));

        // Вывод информации перед продажей
        System.out.println("Before sales:");
        factory.displayCars();
        factory.displayCustomers();

        // Продажа автомобилей
        factory.saleCar();

        // Вывод информации после продажи
        System.out.println("\nAfter sales:");
        factory.displayCars();
        factory.displayCustomers();
    }
}