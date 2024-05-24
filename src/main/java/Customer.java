// Класс Customer с ссылкой на объект Car и ФИО
class Customer {
    private String name;
    private Car car;

    public Customer(String name) {
        this.name = name;
        this.car = null;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', car=" + (car != null ? car : "none") + "}";
    }
}