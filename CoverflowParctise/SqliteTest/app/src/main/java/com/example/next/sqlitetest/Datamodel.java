package com.example.next.sqlitetest;

/**
 * Created by next on 24/3/17.
 */
public class Datamodel {
    private String departmentid;
    private String empname;
    private String empid;
    private  String empdatejoining;

    public Datamodel(String empname, String empid, String empdatejoining,String departmentid) {
        this.empname = empname;
        this.empid = empid;
        this.empdatejoining = empdatejoining;
        this.departmentid = departmentid;
    }

    public Datamodel() {

    }


    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getEmpdatejoining() {
        return empdatejoining;
    }

    public void setEmpdatejoining(String empdatejoining) {
        this.empdatejoining = empdatejoining;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }
}
