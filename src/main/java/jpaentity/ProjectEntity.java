package jpaentity;


import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "project")
public class ProjectEntity {
   @Id
   @Column(name = "id")
    private int id;

   @Column(name = "startdate")
    private Date startdate;

   @Column(name = "enddate")
    private Date enddate;

   @OneToMany(mappedBy = "projectEntity",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<EmployeeEntity>employeeEntities;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public List<EmployeeEntity> getEmployeeEntities() {
        return employeeEntities;
    }

    public void setEmployeeEntities(List<EmployeeEntity> employeeEntities) {
        this.employeeEntities = employeeEntities;
    }
    public ProjectEntity(){

    }

    public ProjectEntity(int id, Date startdate, Date enddate) {
        this.id = id;
        this.startdate = startdate;
        this.enddate = enddate;

    }

    @Override
    public String toString() {
        return "ProjectEntity{" +
                "id=" + id +
                ", startdate=" + startdate +
                ", enddate=" + enddate +

                '}';
    }
}
