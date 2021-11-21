package site.referee.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fistName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "birthday")
    private String birthday;
    @Column(name = "gender")
    private String gender;
    @Column(name = "address")
    // There may be more here
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "zip")
    private String zip;
    @Column(name = "aboutMe")
    private String aboutMe;
    @Column(name = "email")
    private String email;
    @Column(name = "altEmail")
    private String altEmail;
    @Column(name = "cell")
    private String cell;
    @Column(name = "home")
    private String home;
    @Column(name = "work")
    private String work;
    // Change Later
    @Column(name = "photo")
    private String photo;
    @Column(name = "password")
    private String password;
    @Column(name = "rank")
    private String rank;
    @Column(name = "bank")
    private String bank;
    @Column(name = "accountType")
    private String accountType;
    @Column(name = "routingNum")
    private String routingNum;
    @Column(name = "ssn")
    private String SSN;
    @Column(name = "ussfid")
    private Long USSFID;
    @Column(name = "permissions")
    private String permissions;
    @Column(name = "subscriptions")
    private String subscriptions;

    public User() {
    }

    public User(Long id, String firstName, String lastName, String birthday, String gender, String address, String city, String zip, String aboutMe, String email, String altEmail, String cell, String home, String work, String photo, String password, String rank, String bank, String accountType, String routingNum, String SSN, Long USSFID, String permissions, String subscriptions) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.aboutMe = aboutMe;
        this.email = email;
        this.altEmail = altEmail;
        this.cell = cell;
        this.home = home;
        this.work = work;
        this.photo = photo;
        this.password = password;
        this.rank = rank;
        this.bank = bank;
        this.accountType = accountType;
        this.routingNum = routingNum;
        this.SSN = SSN;
        this.USSFID = USSFID;
        this.permissions = permissions;
        this.subscriptions = subscriptions;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getAboutMe() {
        return this.aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAltEmail() {
        return this.altEmail;
    }

    public void setAltEmail(String altEmail) {
        this.altEmail = altEmail;
    }

    public String getCell() {
        return this.cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getHome() {
        return this.home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getWork() {
        return this.work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getPhoto() {
        return this.photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRank() {
        return this.rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getBank() {
        return this.bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getRoutingNum() {
        return this.routingNum;
    }

    public void setRoutingNum(String routingNum) {
        this.routingNum = routingNum;
    }

    public String getSSN() {
        return this.SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public Long getUSSFID() {
        return this.USSFID;
    }

    public void setUSSFID(Long USSFID) {
        this.USSFID = USSFID;
    }

    public String getPermissions() {
        return this.permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public String getSubscriptions() {
        return this.subscriptions;
    }

    public void setSubscriptions(String subscriptions) {
        this.subscriptions = subscriptions;
    }
}