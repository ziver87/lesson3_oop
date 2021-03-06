package ru.voronezhtsev.cars;

import ru.voronezhtsev.cars.Car;

public class Minivan extends Car {
    public Minivan(String model) {
        super(model);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getType() {
        return Car.MINIVAN;
    }
}
