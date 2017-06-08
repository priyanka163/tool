package com.example.next.sqlitetest;

/**
 * Created by next on 24/3/17.
 */
public class DeptMOdel {

    private  String DeptName;
    private  String DeptId;
    private String DeptHeadcount;

    public DeptMOdel(String deptName, String deptId ) {
        DeptName = deptName;
        DeptId = deptId;

    }

    public DeptMOdel() {

    }


    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public String getDeptId() {
        return DeptId;
    }

    public void setDeptId(String deptId) {
        DeptId = deptId;
    }

    public String getDeptHeadcount() {
        return DeptHeadcount;
    }

    public void setDeptHeadcount(String deptHeadcount) {
        DeptHeadcount = deptHeadcount;
    }
}
