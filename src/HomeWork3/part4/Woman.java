package HomeWork3.part4;

public class Woman implements Behaviour {
    private String message = "yyyyy!!!!!!";

    @Override
    public void scream() {
        System.out.println(message);
    }

    public Woman() {
    }

    public Woman(String message) {
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
        return "Woman{" +
                "message='" + message + '\'' +
                '}';
    }
}
