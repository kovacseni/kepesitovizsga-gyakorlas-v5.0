package hu.nive.ujratervezes.kepesitovizsga.snowwhite;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SnowWhite {

    private List<Dwarf> sevenDwarfs;

    public SnowWhite(List<Dwarf> sevenDwarfs) {
        this.sevenDwarfs = sevenDwarfs;
    }

    public List<Dwarf> getSevenDwarfs() {
        return new ArrayList<>(sevenDwarfs);
    }

    public List<Dwarf> getSevenDwarfsOrderedByNames() {
        sevenDwarfs.sort(Comparator.comparing(Dwarf::getName));
        return new ArrayList<>(sevenDwarfs);
    }

    public List<Dwarf> getSevenDwarfsOrderedByAges() {
        sevenDwarfs.sort(Comparator.comparing(Dwarf::getAge));
        return new ArrayList<>(sevenDwarfs);
    }
}
