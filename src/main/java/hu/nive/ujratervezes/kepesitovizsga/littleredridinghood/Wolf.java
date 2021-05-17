package hu.nive.ujratervezes.kepesitovizsga.littleredridinghood;

import java.util.Iterator;
import java.util.Objects;

public class Wolf extends Forest {

    private String name;

    public Wolf(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        for (Iterator<Forest> iter = playersOfTheTale.iterator(); iter.hasNext(); ) {
            Forest player = iter.next();
            if (player instanceof Grandma || player instanceof LittleRedRidingHood) {
                iter.remove();
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wolf wolf = (Wolf) o;
        return Objects.equals(name, wolf.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
