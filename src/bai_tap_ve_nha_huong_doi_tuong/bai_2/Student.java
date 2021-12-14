package bai_tap_ve_nha_huong_doi_tuong.bai_2;

public class Student {
    private int id;
    private String fullName;
    private String dateOfBirth;
    private String gender;
    private String nameClass;
    private String academicYear;

    public Student(int id, String fullName, String dateOfBirth, String gender, String nameClass, String academicYear) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.nameClass = nameClass;
        this.academicYear = academicYear;
    }

    public int getId() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getGender() {
        return gender;
    }
    public String getNameClass() {
        return nameClass;
    }
    public String getAcademicYear() {
        return academicYear;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }
    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }
}
