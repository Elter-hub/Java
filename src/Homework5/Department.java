package Homework5;

enum Department {
    Technical("Team Lead"),
    Support("Trainee"),
    Factory("Middle");

    Department(String name) {
        this.name = name;
    }
    String name;
}
