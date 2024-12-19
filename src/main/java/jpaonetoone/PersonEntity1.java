package jpaonetoone;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "person_latest")
@Data
public class PersonEntity1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int pid;


    @Column(name = "name")
    private String name;



   // @OneToOne(mappedBy = "pid", cascade = CascadeType.ALL, fetch = FetchType.LAZY)

    @OneToOne(mappedBy = "person",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private AddressEntity1 addressenity;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public AddressEntity1 getAddressenity() {
        return addressenity;
    }

    public void setAddressenity(AddressEntity1 addressenity) {
        this.addressenity = addressenity;
    }
}
