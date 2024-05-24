import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class FactoryAF {
    private List<Car> cars = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void saleCar() {
        Iterator<Customer> customerIterator = customers.iterator();

        while (customerIterator.hasNext() && !cars.isEmpty()) {
            Customer customer = customerIterator.next();
            Car car = cars.remove(0);
            customer.setCar(car);
        }

        // Ликвидация оставшихся автомобилей
        if (cars.isEmpty()) {
            System.out.println("All cars are sold.");
        } else {
            cars.clear();
            System.out.println("Remaining vehicles have been sold.");
        }
    }

    public void displayCars() {
        if (cars.isEmpty()) {
            System.out.println("No cars in warehouse.");
        } else {
            System.out.println("Cars in warehouse:");
            for (Car car : cars) {
                System.out.println(car);
            }
        }
    }

    public void displayCustomers() {
        if (customers.isEmpty()) {
            System.out.println("There is no customer willing to buy cars.");
        } else {
            System.out.println("List of customers:");
            for (Customer customer : customers) {
                System.out.println(customer);
            }
        }
    }
}