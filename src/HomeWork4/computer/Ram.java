package HomeWork4.computer;

public enum Ram {
    SSD("Good!"),
    HDD("Could be faster");

    Ram(String rate) {
        this.rate = rate;
    }

    String rate;
}
