package HomeWork3.part4;

public class Man implements Behaviour {
    private String message = "аааааааа!!!!!";
    @Override
    public void scream() {
        System.out.println(message);
    }

    public Man() {
    }

    public Man(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Man{" +
                "message='" + message + '\'' +
                '}';
    }
}
