
//abstract class Applicant

class IncompleteInformation extends Exception{
    IncompleteInformation(String s){
        super(s);
    }
}

abstract class Applicant {

    static int nextApplicantId=1;
    int applicantId;
    String firstName;
    String lastName;
    String gender;
    int age;
    String phone;
    String adharNumber;
    String PANNumber;
    String applicantStatus;
    Address applicantAddress = new Address();
    Datee dateOfBirth = new Datee();

    // constructors

    public Applicant(){}
    
    public Applicant(String firstName, String lastName, String gender, String phone, String adharNumber,
            String PANNumber, Address applicantAddress, Datee dateOfBirth) throws IncompleteInformation {

        if (firstName == null || firstName.isEmpty()) {
            throw new IncompleteInformation ("First Name is required.");
        }
        this.applicantId = nextApplicantId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender; 
        this.phone = phone;
        this.adharNumber = adharNumber;
        this.PANNumber = PANNumber;
        this.applicantAddress = applicantAddress;
        this.dateOfBirth = dateOfBirth;
        this.age = DBOperations.calculateAge(dateOfBirth.yy);
    }
    // getters
    public int getApplicantId() {
        return applicantId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public Datee getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public Address getAddress() {
        return applicantAddress;
    }

    public String getAadharNumber() {
        return adharNumber;
    }

    public String getPanNumber() {
        return PANNumber;
    }

    public String getApplicationStatus() {
        return applicantStatus;
    }

    public void setApplicationStatus(String applicantStatus) {
        this.applicantStatus = applicantStatus;
    }

    public abstract void register();
    public abstract void printApplicantInformation();

    public void checkStatus() {
        System.out.println("Applicant name: " + firstName + " " + lastName);
        System.out.println("Application Status: " + applicantStatus);
    }
}