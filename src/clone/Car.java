package clone;

/**
 * Created by Tatyana on 09.12.2017.
 */
public class Car implements Cloneable {
    private String name;
    private Driver driver;

    public Car(String name, Driver driver) {
        this.name = name;
        this.driver = driver;
    }

    /**
     * Конструктор копирования.
     *
     * @param otherCar
     */
    public Car(Car otherCar) {
        this(otherCar.getName(), otherCar.getDriver());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Car car = (Car) o;

        if (getName() != null
                ? !getName().equals(car.getName()) : car.getName() != null) {
            return false;
        }
        return getDriver() != null ? getDriver().equals(car.getDriver())
                : car.getDriver() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result
                + (getDriver() != null ? getDriver().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{"
                + "name='" + name + '\''
                + ", driver=" + driver
                + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("Грузовик", new Driver("Василий", 45));
        Car clonedCar = (Car) car.clone();
        System.out.println(car);
        System.out.println(clonedCar);

        Driver clonedCarDriver = clonedCar.getDriver();
        clonedCarDriver.setName("Вася");

        System.out.println(car);
        System.out.println(clonedCar);
    }
}
