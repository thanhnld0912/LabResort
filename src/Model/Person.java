package Model;

import java.util.Date;

abstract class Person {
    protected String ID;
    protected String name;
    protected Date dob;
    protected String gender;
    protected String cid;
    protected String phoneNumber;
    protected String email;

    public Person(String ID, String name, Date dob, String gender, String cid, String phoneNumber, String email) {
        this.ID = ID;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.cid = cid;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public Person(){

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", cid='" + cid + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
