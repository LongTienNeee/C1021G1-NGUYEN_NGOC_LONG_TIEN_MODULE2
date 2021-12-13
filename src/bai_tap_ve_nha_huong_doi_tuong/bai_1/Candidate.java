package bai_tap_ve_nha_huong_doi_tuong;

import ss8_clean_code_va_refactoring.thuc_hanh.refactoring_doi_ten_va_tach_hang.Caculator;

public class Candidate {
    private int registrationNumber;
    private String name;
    private String dateOfBirth;
    private byte mathMark;
    private byte mathLiterature;
    private byte mathEnglish;

    public Candidate(int registrationNumber,
                     String name,
                     String dateOfBirth,
                     byte mathMark,
                     byte mathLiterature,
                     byte mathEnglish) {
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

    public byte getMathMark() {
        return mathMark;
    }

    public byte getMathLiterature() {
        return mathLiterature;
    }

    public byte getMathEnglish() {
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
}
