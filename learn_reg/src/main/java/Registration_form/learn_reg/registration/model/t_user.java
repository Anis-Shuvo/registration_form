package Registration_form.learn_reg.registration.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "t_user")
public class t_user {

    private String FullName;

    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ContactNumber;

    private String Gender;


    private String Organization;

    private String Designation;

    private String Division;


    private String District;


    private String Upazila;

    private String Address;

    private String password;

    private String RetypePassword;


    public t_user() {
        super();
    }

    public t_user(int ContactNumber) {
        super();
        this.ContactNumber = ContactNumber;

    }


    public t_user(String fullName, String email, int contactNumber, String gender, String organization, String designation, String division, String district, String upazila, String address, String password, String retypePassword) {
        FullName = fullName;
        this.email = email;
        ContactNumber = contactNumber;
        Gender = gender;
        Organization = organization;
        Designation = designation;
        Division = division;
        District = district;
        Upazila = upazila;
        Address = address;
        this.password = password;
        RetypePassword = retypePassword;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(int contactNumber) {
        ContactNumber = contactNumber;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getOrganization() {
        return Organization;
    }

    public void setOrganization(String organization) {
        Organization = organization;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getDivision() {
        return Division;
    }

    public void setDivision(String division) {
        Division = division;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getUpazila() {
        return Upazila;
    }

    public void setUpazila(String upazila) {
        Upazila = upazila;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRetypePassword() {
        return RetypePassword;
    }

    public void setRetypePassword(String retypePassword) {
        RetypePassword = retypePassword;
    }

}
