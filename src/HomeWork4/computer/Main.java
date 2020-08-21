package HomeWork4.computer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Як то ⏬⏬⏬⏬⏬⏬⏬⏬⏬ зробити правильно?????
        Computer intel1 = new Computer("HP 290 G1", 2018, 256, 11000,
                new HardDisc("intel1", Ram.SSD, 256, Country.CHINA),
                new Processor("Intel-Core-i7", 4, 3.6, Country.CHINA));
        Computer intel2 = new Computer("HP 590 G8", 2020, 512, 22000,
                new HardDisc("intel2", Ram.SSD, 512, Country.KOREA),
                new Processor("Intel-Core-i9", 8, 4.2, Country.KOREA));
        Computer intel3 = new Computer("Gm 120", 2008, 128, 500,
                new HardDisc("intel3", Ram.HDD, 128, Country.USA),
                new Processor("Intel-Core-i1", 1, 1.2, Country.USA));
        Computer intel4 = new Computer("HP 1590 G8", 2030, 5000, 220000,
                new HardDisc("intel4", Ram.SSD, 5000, Country.USA),
                new Processor("Intel-Core-i15", 8, 4.2, Country.KOREA));
        Computer hp1 = new Computer("HP1 G8", 2012, 128, 15000,
                new HardDisc("hp1 G7", Ram.SSD, 128, Country.CHINA),
                new Processor("Intel-Core-i7", 8, 4.2, Country.CHINA));
        Computer hp2 = new Computer("HP  G8", 2016, 512, 15000,
                new HardDisc("hp2", Ram.SSD, 512, Country.INDIA),
                new Processor("Intel-Core-i9", 8, 4.2, Country.USA));
        Computer hp3 = new Computer("HP m12", 2005, 512, 25000,
                new HardDisc("intel100", Ram.SSD, 512, Country.KOREA),
                new Processor("Intel-Core-i7", 8, 4.2, Country.KOREA));
        Computer hp4 = new Computer("HP 590 G8", 2002, 512, 22000,
                new HardDisc("intel100", Ram.SSD, 512, Country.USA),
                new Processor("Intel-Core-i7", 8, 4.2, Country.INDIA));

        ArrayList<Computer> computers = new ArrayList<>();
        computers.add(intel1);
        computers.add(intel2);
        computers.add(intel3);
        computers.add(intel4);
        computers.add(hp1);
        computers.add(hp2);
        computers.add(hp3);
        computers.add(hp4);

/*1*/   List<Computer> olderThan10 = computers .stream()
                .filter(year -> year.year > 2010)
                .collect(Collectors.toList());
        System.out.println(olderThan10.size());

/*2*/   List<Computer> olderThan10China = computers.stream()
                .filter(comp -> comp.year > 2010 && comp.hard.country == Country.CHINA)
                .collect(Collectors.toList());
        System.out.println(olderThan10China.size());

/*3*/   List<Computer> olderThan10NotChina = computers.stream()
                .filter(comp -> comp.year > 2010 && comp.hard.country != Country.CHINA)
                .collect(Collectors.toList());
        System.out.println(olderThan10NotChina.size());

/*4*/   List<Computer> hard500 = computers.stream()
                .filter(comp -> comp.hard.capacity > 500)
                .collect(Collectors.toList());
        System.out.println(hard500.size());

/*5*/   List<Computer> hard500i7 = computers.stream()
            .filter(comp -> comp.hard.capacity > 500 && comp.proc.typeOfProcessor.contains("i7"))
            .collect(Collectors.toList());
        System.out.println(hard500i7);

/*6*/   List<Computer> sortedHard500i7 = computers.stream()
                .filter(comp -> comp.hard.capacity > 500 && comp.proc.typeOfProcessor.contains("i7"))
                .sorted(Comparator.comparing(comp -> comp.price))
                .collect(Collectors.toList());
        System.out.println(sortedHard500i7);
    }
}
