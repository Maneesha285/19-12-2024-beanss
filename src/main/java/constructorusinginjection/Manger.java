package constructorusinginjection;

public class Manger {
    private String name;
    private int id;
    private double salary;
    private Company company;

    public Manger() {

    }

    public Manger(String name, int id, double salary, Company company) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.company = company;
    }

}
