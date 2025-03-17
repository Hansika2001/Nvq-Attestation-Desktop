/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nvqattestation;

/**
 *
 * @author Dimuthu Pinsara
 */
public class StCertificate {
     private String csn;
     private String nic;
     private String bsn;
     private String date;

    public StCertificate(String csn, String nic, String bsn, String date) {
        this.csn = csn;
        this.nic = nic;
        this.bsn = bsn;
        this.date = date;
    }

    public String getCsn() {
        return csn;
    }

    public void setCsn(String csn) {
        this.csn = csn;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getBsn() {
        return bsn;
    }

    public void setBsn(String bsn) {
        this.bsn = bsn;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
     
}
