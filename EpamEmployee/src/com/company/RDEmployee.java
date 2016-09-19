package com.company;

/**
 * Created by Serhii_Kobzar on 9/19/2016.
 */
public class RDEmployee extends EpamEmployee {

    private Direction direction;

    RDEmployee(int age, String name, Direction direction) {
        this.direction = direction;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RDEmployee)) return false;

        RDEmployee that = (RDEmployee) o;

        return direction == that.direction;
    }

    @Override
    public int hashCode() {
        return direction.hashCode();
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
