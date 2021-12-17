package DisplayController;

public class info {

    public String empid;
    public String empname;
    public String empsalary;

    public info(){}

    public info(String empid, String empname, String empsalary) {
        this.empid = empid;
        this.empname = empname;
        this.empsalary = empsalary;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpsalary() {
        return empsalary;
    }

    public void setEmpsalary(String empsalary) {
        this.empsalary = empsalary;
    }
}
