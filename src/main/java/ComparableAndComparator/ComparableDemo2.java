package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Laptop implements Comparable<Laptop> {
    String name;
    int ram;
    int price;

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Laptop(String name, int ram, int price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
    }

    @Override
    public int compareTo(Laptop o) {
        // compare and sort upon ram size
        if (this.ram == o.getRam()) {
            return 0;
        } else if (this.ram > o.getRam()) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class ComparableDemo2 {
    public static void main(String[] args) {
        List<Laptop> listLaptop = new ArrayList<>();
        listLaptop.add(new Laptop("Mac", 16,1300));
        listLaptop.add(new Laptop("Windows", 8,630));
        listLaptop.add(new Laptop("Linux", 64,999));
        listLaptop.add(new Laptop("MainFrame", 32,1000));
        Collections.sort(listLaptop);
        for (Laptop i : listLaptop) {
            System.out.println(i.getRam());
        }
    }
}
