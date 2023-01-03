package safyrus.tp5_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * NESGame
 */
@Entity
public class NESGame {

    @Id
    private String ID;

    private String name;
    // private String altName;
    // private int players;
    // private String developer;
    // private String publisher;
    // private String date;
    // private String region;
    // private boolean licensed;
    // private String subclasse;

    public NESGame() {
        this.name = "NONE";
        this.ID = "NONE";
    }

    public NESGame(String name, String id) {
        this.name = name;
        this.ID = id;
    }

    // public NESGame(String name, String altName, int players, String developer, String publisher, String date, String region, String ID, boolean licensed, String subclasse) {
    //     this.name = name;
    //     this.altName = altName;
    //     this.players =  players;
    //     this.developer = developer;
    //     this.publisher = publisher;
    //     this.date = date;
    //     this.region = region;
    //     this.ID = ID;
    //     this.licensed = licensed;
    //     this.subclasse = subclasse;
    // }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    // public String getAltName() {
    //     return altName;
    // }

    // public String getDate() {
    //     return date;
    // }

    // public String getDeveloper() {
    //     return developer;
    // }

    // public String getID() {
    //     return ID;
    // }

    // public Boolean getLicensed() {
    //     return licensed;
    // }

    // public String getName() {
    //     return name;
    // }

    // public int getPlayers() {
    //     return players;
    // }

    // public String getPublisher() {
    //     return publisher;
    // }

    // public String getRegion() {
    //     return region;
    // }

    // public String getSubclasse() {
    //     return subclasse;
    // }

    // public void setAltName(String altName) {
    //     this.altName = altName;
    // }

    // public void setDate(String date) {
    //     this.date = date;
    // }

    // public void setDeveloper(String developer) {
    //     this.developer = developer;
    // }

    // public void setID(String iD) {
    //     ID = iD;
    // }

    // public void setLicensed(Boolean licensed) {
    //     this.licensed = licensed;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public void setPlayers(int players) {
    //     this.players = players;
    // }

    // public void setPublisher(String publisher) {
    //     this.publisher = publisher;
    // }

    // public void setRegion(String region) {
    //     this.region = region;
    // }

    // public void setSubclasse(String subclasse) {
    //     this.subclasse = subclasse;
    // }

}