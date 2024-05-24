// Класс Car с порядковым номером и включенным объектом Engine
class Car {
    private static int nextSerialNumber = 1;
    private int serialNumber;
    private Engine engine;

    public Car(String pedalSize) {
        this.serialNumber = nextSerialNumber++;
        this.engine = new Engine(pedalSize);
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{serialNumber=" + serialNumber + ", " + engine + "}";
    }
}