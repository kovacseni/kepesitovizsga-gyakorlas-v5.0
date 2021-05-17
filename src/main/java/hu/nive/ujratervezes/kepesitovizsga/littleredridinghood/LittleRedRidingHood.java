package hu.nive.ujratervezes.kepesitovizsga.littleredridinghood;

import java.util.Objects;

public class LittleRedRidingHood extends Forest {

    protected static int cake = 10;
    private String name;

    public LittleRedRidingHood(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        cake = cake - 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LittleRedRidingHood that = (LittleRedRidingHood) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
