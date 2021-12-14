package bai_tap_ve_nha_huong_doi_tuong.bai_3;

public class Cadres {
    private int id;
    private String fullName;
    private String gender;
    private String country;
    private int yearOfBirth;
    private String specialized;
    private String level;
    private double levelOfSalary;
    private double subsidize;

    public Cadres(int id,
                  String fullName,
                  String gender,
                  String country,
                  int yearOfBirth,
                  String specialized,
                  String level,
                  double levelOfSalary,
                  double subsidize) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.country = country;
        this.yearOfBirth = yearOfBirth;
        this.specialized = specialized;
        this.level = level;
        this.levelOfSalary = levelOfSalary;
        this.subsidize = subsidize;
    }

    //GETTER
    public int getId() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }
    public String getGender() {
        return gender;
    }
    public String getCountry() {
        return country;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public String getSpecialized() {
        return specialized;
    }
    public String getLevel() {
        return level;
    }
    public double getLevelOfSalary() {
        return levelOfSalary;
    }
    public double getSubsidize() {
        return subsidize;
    }

    //SETTER
    public void setId(int id) {
        this.id = id;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public void setLevelOfSalary(double levelOfSalary) {
        this.levelOfSalary = levelOfSalary;
    }
    public void setSubsidize(double subsidize) {
        this.subsidize = subsidize;
    }

    public double getNetSalary(){
        return (this.levelOfSalary + this.subsidize)*450000;
    }

    @Override
    public String toString() {
        return "Cadres{" +
                "ID=" + id +
                ", fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", specialized='" + specialized + '\'' +
                ", level='" + level + '\'' +
                ", levelOfSalary=" + levelOfSalary +
                ", subsidize=" + subsidize +
                '}';
    }
}
