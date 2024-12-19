package insertjdbc;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
    private int pid;
    private Date startdate;
    private Date enddate;
    private String pname;
    private List<Employee> empList=new ArrayList<>();

    public List<Employee>getEmployeeList(){
        return employeeList;
    }

    public int getPid(int maxIdOfProjectId) {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Project() {

    }

    public int getpid() {
        return pid;
    }

    public void setpid(int pid) {
        this.pid = pid;
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

    public List<Employee> getEmpList() {
        return empList;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

//    public void setEmpList(List<Employee> empList) {
//        this.empList = empList;
//    }
    private List<Employee>employeeList=new ArrayList<>();

public void setEmpList(List<Employee>employeeList){
    this.employeeList=employeeList;
}
    public Project(int pid, Date startdate, Date enddate,String pname) {
        this.pid = pid;
        this.startdate = startdate;
        this.enddate = enddate;
        this.pname=pname;
    }

    @Override
    public String toString() {
        return "Project{" +
                "pid=" + pid +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                " , pname="+pname +
                '}';
    }


}
