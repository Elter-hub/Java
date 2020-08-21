package HomeWork4.computer;

import lombok.Data;

import java.util.Objects;

@Data
public class Processor {
    String typeOfProcessor;
    int quantityOfCores;
    double frequency;
    Country madeIn;

    public Processor() {
    }

    public Processor(String typeOfProcessor, int quantityOfCores, double frequency, Country madeIn) {
        this.typeOfProcessor = typeOfProcessor;
        this.quantityOfCores = quantityOfCores;
        this.frequency = frequency;
        this.madeIn = madeIn;
    }

    public String getTypeOfProcessor() {
        return typeOfProcessor;
    }

    public void setTypeOfProcessor(String typeOfProcessor) {
        this.typeOfProcessor = typeOfProcessor;
    }

    public int getQuantityOfCores() {
        return quantityOfCores;
    }

    public void setQuantityOfCores(int quantityOfCores) {
        this.quantityOfCores = quantityOfCores;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public Country getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(Country madeIn) {
        this.madeIn = madeIn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Processor processor = (Processor) o;
        return quantityOfCores == processor.quantityOfCores &&
                frequency == processor.frequency &&
                Objects.equals(typeOfProcessor, processor.typeOfProcessor) &&
                madeIn == processor.madeIn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfProcessor, quantityOfCores, frequency, madeIn);
    }

    @Override
    public String toString() {
        return "Processor{" +
                "typeOfProcessor='" + typeOfProcessor + '\'' +
                ", quantityOfCores=" + quantityOfCores +
                ", frequency=" + frequency +
                ", madeIn=" + madeIn +
                '}';
    }
}
