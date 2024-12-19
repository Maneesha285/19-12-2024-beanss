//package jpaonetomanyinserts;
//
//
//import jakarta.persistence.*;
//import jpaonetomanyinserts.EmployeeEntity;
//
//import java.sql.Date;
//import java.util.List;
//
//@Entity
//@Table(name = "project_latest_jpa")
//public class ProjectEntity {
//    public ProjectEntity(){
//
//    }
//
//   @Id
//   @Column(name = "id")
//    private int id;
//
//    @Column(name = "pname")
//    private String pname;
//
//   @Column(name = "startdate")
//    private Date startdate;
//
//   @Column(name = "enddate")
//    private Date enddate;
//
//   @OneToMany(mappedBy = "projectEntity",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    private List<jpaentity.EmployeeEntity>employeeEntities;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public Date getStartdate() {
//        return startdate;
//    }
//
//    public void setStartdate(Date startdate) {
//        this.startdate = startdate;
//    }
//
//    public Date getEnddate() {
//        return enddate;
//    }
//
//    public void setEnddate(Date enddate) {
//        this.enddate = enddate;
//    }
//
//    public List<jpaentity.EmployeeEntity> getEmployeeEntities() {
//        return employeeEntities;
//    }
//
//    public String getPname() {
//        return pname;
//    }
//
//    public void setPname(String pname) {
//        this.pname = pname;
//    }
//
//
//
//
//    public ProjectEntity(int id,String pname, Date startdate, Date enddate) {
//        this.id = id;
//        this.pname=pname;
//        this.startdate = startdate;
//        this.enddate = enddate;
//
//    }
//
//    @Override
//    public String toString() {
//        return "ProjectEntity{" +
//                "id=" + id +
//                "pname="+pname +
//                ", startdate=" + startdate +
//                ", enddate=" + enddate +
//
//                '}';
//    }
//}
