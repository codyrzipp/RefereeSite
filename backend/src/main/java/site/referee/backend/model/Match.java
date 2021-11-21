package site.referee.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "matches")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "date")
    private String date;
    @Column(name = "day")
    private String day;
    @Column(name = "time")
    private String time;
    @Column(name = "level")
    private String level;
    @Column(name = "season")
    private String season;
    @Column(name = "league")
    private String league;
    @Column(name = "authority")
    private String authority;
    @Column(name = "location")
    private String location;
    @Column(name = "division")
    private String division;
    @Column(name = "gender")
    private String gender;
    @Column(name = "field")
    private String field;
    @Column(name = "client")
    private String client;
    @Column(name = "home")
    private String home;
    @Column(name = "away")
    private String away;
    @Column(name = "status")
    private String status;
    @Column(name = "matchFee")
    private String matchFee;
    @Column(name = "referee")
    private String referee;
    @Column(name = "ar1")
    private String assistant1;
    @Column(name = "ar2")
    private String assistant2;
    @Column(name = "4th")
    private String fourth;
    @Column(name = "mentor")
    private String mentor;
    @Column(name = "assessor")
    private String assessor;
    @Column(name = "assignor")
    private String assignor;

    public Match() {
    }

    public Match(Long id, String date, String day, String time, String level, 
    String season, String league, String authority, String location, String division, 
    String gender, String field, String client, String home, String away, 
    String status, String matchFee, String referee, String assistant1, String assistant2, 
    String fourth, String mentor, String assessor, String assignor) {
        this.id = id;
        this.date = date;
        this.day = day;
        this.time = time;
        this.level = level;
        this.season = season;
        this.league = league;
        this.authority = authority;
        this.location = location;
        this.division = division;
        this.gender = gender;
        this.field = field;
        this.client = client;
        this.home = home;
        this.away = away;
        this.status = status;
        this.matchFee = matchFee;
        this.referee = referee;
        this.assistant1 = assistant1;
        this.assistant2 = assistant2;
        this.fourth = fourth;
        this.mentor = mentor;
        this.assessor = assessor;
        this.assignor = assignor;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDay() {
        return this.day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSeason() {
        return this.season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getLeague() {
        return this.league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getAuthority() {
        return this.authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDivision() {
        return this.division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getField() {
        return this.field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getClient() {
        return this.client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getHome() {
        return this.home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAway() {
        return this.away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMatchFee() {
        return this.matchFee;
    }

    public void setMatchFee(String matchFee) {
        this.matchFee = matchFee;
    }

    public String getReferee() {
        return this.referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    public String getAssistant1() {
        return this.assistant1;
    }

    public void setAssistant1(String assistant1) {
        this.assistant1 = assistant1;
    }

    public String getAssistant2() {
        return this.assistant2;
    }

    public void setAssistant2(String assistant2) {
        this.assistant2 = assistant2;
    }

    public String getFourth() {
        return this.fourth;
    }

    public void setFourth(String fourth) {
        this.fourth = fourth;
    }

    public String getMentor() {
        return this.mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public String getAssessor() {
        return this.assessor;
    }

    public void setAssessor(String assessor) {
        this.assessor = assessor;
    }

    public String getAssignor() {
        return this.assignor;
    }

    public void setAssignor(String assignor) {
        this.assignor = assignor;
    }
}    