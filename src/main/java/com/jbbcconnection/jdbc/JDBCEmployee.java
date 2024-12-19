package com.jbbcconnection.jdbc;

public class JDBCEmployee {
    private String name;
    private int id;
    private double salary;
    private String dept;
    private String state;
    private int pid;
    private  int mid;

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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

//    public JDBCEmployee(String name, int id, double salary, String dept) {
//        this.name = name;
//        this.id = id;
//        this.salary = salary;
//        this.dept = dept;
//    }
}
