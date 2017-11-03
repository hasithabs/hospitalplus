
package model;

import java.sql.Date;


public class Leave {
    
   private String EmpId;
   private java.sql.Date Date;
   private String Discription;
   private String ReportingManager;
   private String Status;

    // getters and setters for the Leave object
    public String getEmpId() {
        return EmpId;
    }

    public java.sql.Date getDate() {
        return Date;
    }

    public String getDiscription() {
        return Discription;
    }

    public String getReportingManager() {
        return ReportingManager;
    }

    public String getStatus() {
        return Status;
    }

    public void setEmpId(String EmpId) {
        this.EmpId = EmpId;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

   

    public void setDiscription(String Discription) {
        this.Discription = Discription;
    }

    public void setReportingManager(String ReportingManager) {
        this.ReportingManager = ReportingManager;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
}
