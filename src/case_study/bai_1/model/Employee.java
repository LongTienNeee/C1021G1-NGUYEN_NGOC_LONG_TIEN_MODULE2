package case_study.bai_1.model;

public class Employee {
    private int id;
    private String name;
    private String dateOfBirth;
    private String sex;
    private int idNO;
    private double telephoneNumber;
    private String email;
    private String level;
    private String jobPosition;
    private double salary;

    public Employee(int id,
                    String name,
                    String dateOfBirth,
                    String sex,
                    int idNO,
                    double telephoneNumber,
                    String email,
                    String level,
                    String jobPosition,
                    double salary) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.idNO = idNO;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.level = level;
        this.jobPosition = jobPosition;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getIdNO() {
        return idNO;
    }

    public void setIdNO(int idNO) {
        this.idNO = idNO;
    }

    public double getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(double telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", sex='" + sex + '\'' +
                ", idNO=" + idNO +
                ", telephoneNumber=" + telephoneNumber +
                ", email='" + email + '\'' +
                ", level='" + level + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                ", salary=" + salary +
                '}';
    }
}
