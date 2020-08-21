package HomeWork4.computer;

import java.util.Objects;

public class Computer {
    String model;
    int year;
    long memory;
    int price;
    HardDisc hard;
    Processor proc;

    public Computer() {
    }

    public Computer(String model, int year, long memory, int price, HardDisc hard, Processor proc) {
        this.model = model;
        this.year = year;
        this.memory = memory;
        this.price = price;
        this.hard = hard;
        this.proc = proc;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getMemory() {
        return memory;
    }

    public void setMemory(long memory) {
        this.memory = memory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public HardDisc getHard() {
        return hard;
    }

    public void setHard(HardDisc hard) {
        this.hard = hard;
    }

    public Processor getProc() {
        return proc;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return year == computer.year &&
                memory == computer.memory &&
                price == computer.price &&
                model.equals(computer.model) &&
                hard.equals(computer.hard) &&
                proc.equals(computer.proc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, memory, price, hard, proc);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", memory=" + memory +
                ", price=" + price +
                ", hard=" + hard +
                ", proc=" + proc +
                '}' + "\n";
    }
}
