package beans;


import org.springframework.stereotype.Component;

@Component
public class Manager {
    private String name;
    private int id;

    public Manager(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
