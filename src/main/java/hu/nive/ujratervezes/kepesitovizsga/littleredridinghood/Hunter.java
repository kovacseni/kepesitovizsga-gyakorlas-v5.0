package hu.nive.ujratervezes.kepesitovizsga.littleredridinghood;

import java.util.Iterator;
import java.util.Objects;

public class Hunter extends Forest {

    private String name;

    public Hunter(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        hunt();
        LittleRedRidingHood.cake = LittleRedRidingHood.cake - 3;
    }

    private void hunt() {
        for (Iterator<Forest> iter = playersOfTheTale.iterator(); iter.hasNext(); ) {
            Forest player = iter.next();
            if (player instanceof Wolf) {
                iter.remove();
            }
        }
        getGrandmaAndLittleRedRidingHoodOutOfWolf();
    }

    private void getGrandmaAndLittleRedRidingHoodOutOfWolf() {
        if (!playersOfTheTale.contains(new Grandma("Nagymama"))) {
            playersOfTheTale.add(new Grandma("Nagymama"));
        }
        if (!playersOfTheTale.contains(new LittleRedRidingHood("Piroska"))) {
            playersOfTheTale.add(new LittleRedRidingHood("Piroska"));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hunter hunter = (Hunter) o;
        return Objects.equals(name, hunter.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
