package HomeWork4.computer;

public enum Country {

    CHINA("made in China"),
    KOREA("made in Korea"),
    INDIA("made in India"),
    USA("made in USA");

    Country(String country) {
        this.country = country;
    }
    String country;
}
