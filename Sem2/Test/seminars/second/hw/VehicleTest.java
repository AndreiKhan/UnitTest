package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        motorcycle = new Motorcycle("Moto", "Rom", 2009);
        car = new Car("Dodge", "Ram", 2010);
    }

    /**
     * - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
     */
    @Test
    public void testCarIsVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    /**
     * - проверка того, объект Car создается с 4-мя колесами
     */
    @Test
    public void testCarNumWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    /**
     * - проверка того, объект Motorcycle создается с 2-мя колесами
     */
    @Test
    public void testMotorcycleNumWheels() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    /**
     * - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive())
     */
    @Test
    public void testCarSpeed() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    /**
     * - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive())
     */
    @Test
    public void testMotorcycleSpeed() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    /**
     * - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
     */
    @Test
    public void testCarPark() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    /**
     * - проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
     */
    @Test
    public void testMotorcyclePark() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

}