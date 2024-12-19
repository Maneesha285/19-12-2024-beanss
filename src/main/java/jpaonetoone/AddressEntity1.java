package jpaonetoone;

import jakarta.persistence.*;
@Entity
@Table(name = "Address")
public class AddressEntity1 {


    @Id//primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;


    @OneToOne()
    @JoinColumn(name = "pids")
    private PersonEntity1 person;


    public void setPersonEntity1(PersonEntity1 person) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public PersonEntity1 getPerson() {
        return person;
    }

    public void setPerson(PersonEntity1 person) {
        this.person = person;
    }
}
