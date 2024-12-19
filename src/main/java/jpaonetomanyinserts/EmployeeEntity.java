//package jpaonetomanyinserts;
//
//import jakarta.persistence.*;
//import jpaentity.ProjectEntity;
//
//@Entity
//@Table(name = "employee")
//public class EmployeeEntity {
//    @Id
//    private int id;
//
//    @Column(name = "name")
//    private String name;
//
//    @Column(name = "salary")
//    private double salary;
//
//    @Column(name = "dept")
//    private String dept;
//
//    @Column(name = "state")
//    private String state;
//
//    @JoinColumn(name = "pid", referencedColumnName = "id")
//    @ManyToOne(fetch = FetchType.LAZY)
////    @JoinColumn(name = "project_id")
////    private Project project;
//    private ProjectEntity projectEntity;
//  //  @Column(name = "mid")
//    //private Integer mid;
//    @Column (name = "pid", insertable = false,updatable = false)
//    private int pid;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public String getDept() {
//        return dept;
//    }
//
//    public EmployeeEntity(String state) {
//        this.state = state;
//    }
//
//    public void setDept(String dept) {
//        this.dept = dept;
//    }
//
//    public int getPid() {
//        return pid;
//    }
//
//    public void setPid(int pid) {
//        this.pid = pid;
//    }
//
//    public ProjectEntity getProjectEntity() {
//        return projectEntity;
//    }
//
//    public void setProjectEntity(ProjectEntity projectEntity) {
//        this.projectEntity = projectEntity;
//    }
//
//    public EmployeeEntity(int pid) {
//        this.pid = pid;
//    }
//
//    public EmployeeEntity()
//    {
//
//    }
//
//    public EmployeeEntity(int id, String name, double salary, String dept, String state,int pid) {
//
//        this.id = id;
//        this.name = name;
//        this.salary = salary;
//        this.dept = dept;
//        this.state=state;
//        this.pid=pid;
//        }
//
//    @Override
//    public String toString() {
//        return "EmployeeEntity{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", salary=" + salary +
//                ", dept='" + dept + '\'' +
//                ", state='" + state + '\'' +
//                ", projectEntity=" + projectEntity +
//                ", pid=" + pid +
//                '}';
//    }
//}
//
//
//
