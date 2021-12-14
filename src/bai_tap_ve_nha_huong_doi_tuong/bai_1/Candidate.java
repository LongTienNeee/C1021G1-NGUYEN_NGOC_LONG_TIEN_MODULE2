package bai_tap_ve_nha_huong_doi_tuong.bai_1;

import ss8_clean_code_va_refactoring.thuc_hanh.refactoring_doi_ten_va_tach_hang.Caculator;

public class Candidate {
    private int registrationNumber;
    private String name;
    private String dateOfBirth;
    private double mathMark;
    private double mathLiterature;
    private double mathEnglish;

    public Candidate(int registrationNumber,
                     String name,
                     String dateOfBirth,
                     double mathMark,
                     double mathLiterature,
                     double mathEnglish) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.mathMark = mathMark;
        this.mathLiterature = mathLiterature;
        this.mathEnglish = mathEnglish;
    }

    //getter
    public int getRegistrationNumber() {
        return this.registrationNumber;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public double getMathMark() {
        return mathMark;
    }

    public double getMathLiterature() {
        return mathLiterature;
    }

    public double getMathEnglish() {
        return mathEnglish;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setMathMark(byte mathMark) {
        this.mathMark = mathMark;
    }

    public void setMathLiterature(byte mathLiterature) {
        this.mathLiterature = mathLiterature;
    }

    public void setMathEnglish(byte mathEnglish) {
        this.mathEnglish = mathEnglish;
    }

    public double getTotalMark(){
        return this.mathMark + this.mathEnglish + this.mathEnglish;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "registrationNumber=" + registrationNumber +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", mathMark=" + mathMark +
                ", mathLiterature=" + mathLiterature +
                ", mathEnglish=" + mathEnglish +
                '}';
    }
}
