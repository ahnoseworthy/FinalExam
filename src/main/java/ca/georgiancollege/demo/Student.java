package ca.georgiancollege.demo;

public class Student {
    int studentNumber;
    String firstName;
    String lastName;
    String telephoneNumber;
    String address;
    String province;
    int averageGrade;
    String major;

    public Student(int studentNumber, String firstName, String lastName, String telephoneNumber, String address, String province, int averageGrade, String major) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
        this.address = address;
        this.province = province;
        this.averageGrade = averageGrade;
        this.major = major;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        if(studentNumber > 200034000) {
            this.studentNumber = studentNumber;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.length() > 1) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.length() > 1) {
            this.lastName = lastName;
        }
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        if(telephoneNumber.length() == 10) {
            this.telephoneNumber = telephoneNumber;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(address.length() > 6) {
            this.address = address;
        }
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        if((province == "AB") || (province == "BC") || (province == "MB") || (province == "NB") || (province == "NL") || (province == "NS") || (province == "NT") || (province == "NU") || (province == "ON") || (province == "PE") || (province == "QC") || (province == "SK") || (province == "YT")){
            this.province = province;
        }
    }

    public int getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(int averageGrade) {
        if(averageGrade >= 0 && averageGrade <= 100) {
            this.averageGrade = averageGrade;
        }
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        if(major.length() > 5) {
            this.major = major;
        }
    }
}
