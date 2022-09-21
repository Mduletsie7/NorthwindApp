/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.northwindapp;

/**
 *
 * @author Mdumisi Letsie
 */
public class Northwind {
    private int ID;
    private String LastName;
    private String FirstName;
    private String Title;
    private String TOC;
    private String BirthDate;
    private String HireDate;
    private String Address;
    private String City;
    private String HomePhone;
    private String Notes;
    private int ReportsTo;
    private String PhotoPath;

    public Northwind(int ID) {
        this.ID = ID;
    }

    public Northwind(String LastName, String FirstName, String Title, String TOC, String BirthDate, String HireDate, String Address, String City, String HomePhone, String Notes, int ReportsTo, String PhotoPath) {
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.Title = Title;
        this.TOC = TOC;
        this.BirthDate = BirthDate;
        this.HireDate = HireDate;
        this.Address = Address;
        this.City = City;
        this.HomePhone = HomePhone;
        this.Notes = Notes;
        this.ReportsTo = ReportsTo;
        this.PhotoPath = PhotoPath;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getTOC() {
        return TOC;
    }

    public void setTOC(String TOC) {
        this.TOC = TOC;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    public String getHireDate() {
        return HireDate;
    }

    public void setHireDate(String HireDate) {
        this.HireDate = HireDate;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getHomePhone() {
        return HomePhone;
    }

    public void setHomePhone(String HomePhone) {
        this.HomePhone = HomePhone;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    public int getReportsTo() {
        return ReportsTo;
    }

    public void setReportsTo(int ReportsTo) {
        this.ReportsTo = ReportsTo;
    }

    public String getPhotoPath() {
        return PhotoPath;
    }

    public void setPhotoPath(String PhotoPath) {
        this.PhotoPath = PhotoPath;
    }


}
