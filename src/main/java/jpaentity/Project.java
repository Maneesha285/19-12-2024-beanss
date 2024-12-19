package jpaentity;


import java.util.Date;

public class Project {
    private int id;
    private Date startdate;
    private Date enddate;

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

    public Project(int id, Date startdate, Date enddate) {
        this.id = id;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                '}';
    }
}
