/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Marvin Hope - 219445842 
 */
public class EmployDetails {
    private String EmployID, EmployNum, EmpSur;

    public String getEmployID() {
        return EmployID;
    }

    public void setEmployID(String EmployID) {
        this.EmployID = EmployID;
    }

    public String getEmployNum() {
        return EmployNum;
    }

    public void setEmployNum(String EmployNum) {
        this.EmployNum = EmployNum;
    }

    public String getEmpSur() {
        return EmpSur;
    }

    public void setEmpSur(String EmpSur) {
        this.EmpSur = EmpSur;
    }

    @Override
    public String toString() {
        return "Employee{" + "EmployID=" + EmployID + ", EmployNum=" + EmployNum + ", EmpSur=" + EmpSur + '}';
    }
}
