import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VehicleTest {

    // Экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Dodge", "Ram", 2010);
        assertTrue(car instanceof Vehicle);
    };

    // Объект Car создается с 4-мя колесами
    @Test
    public void checkNumWheelsOfCar() {
        Car car = new Car("Dodge", "Ram", 2010);
        assertThat (car.getNumWheels()).isEqualTo(4);
    }

    // Объект Motorcycle создается с 2-мя колесами
    @Test
    public void checkNumWheelsOfMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Super Moto", 2013);
        assertThat (motorcycle.getNumWheels()).isEqualTo(2);
    }

    // Объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    public void checkSpeedOfCar(){
        Car car = new Car("Dodge", "Ram", 2010);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    // Объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    public void checkSpeedOfMotorcycle(){
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Super Moto", 2013);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    // Проверка режима парковки (сначала testDrive, потом park)
    // т.е имитация движения транспорта до остановки (speed = 0)
    @Test
    public void checkSpeedParkOfCar(){
        Car car = new Car("Dodge", "Ram", 2010);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    // Проверка режима парковки (сначала testDrive, потом park)
    // т.е имитация движения транспорта до остановки (speed = 0)
    @Test
    public void checkSpeedParkOfMotorcycle(){
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Super Moto", 2013);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

}
