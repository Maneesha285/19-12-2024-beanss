package jpaentity;



public class Employee {
    private String name;
    private int id;
    private double salary;
    private int pid;
    private String dept;
    private int mid;

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public Employee(String name, int id, int pid, double salary, String dept, int mid) {
        this.name = name;
        this.id = id;
        this.pid = pid;
        this.salary = salary;
        this.dept = dept;
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", pid=" + pid +
                ", dept='" + dept + '\'' +
                ", mid=" + mid +
                '}';
    }
}
