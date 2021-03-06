package ru.voronezhtsev.cars;

import ru.voronezhtsev.cars.Car;

/**
 * Джип
 */
public class Jeep extends Car {
    public Jeep(String model) {
        super(model);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getType() {
        return Car.JEEP;
    }
}
