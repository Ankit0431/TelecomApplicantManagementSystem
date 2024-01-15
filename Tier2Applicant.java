class Tier2Applicant extends Applicant {
    String oldServiceProvider;
    Datee oldServiceCommencementDate;
    String reasonForMigration;
    String oldServiceRegistrationNumber;

    // constructors

    public Tier2Applicant(){}

    public Tier2Applicant(String firstName, String lastName, String gender, String phone, String adharNumber, String PANNumber, Address applicantAddress, Datee dateOfBirth, String oldServiceProvider,Datee oldServiceCommencementDate, String reasonForMigration, String oldServiceRegistrationNumber) throws IncompleteInformation {
        super(firstName, lastName, gender,  phone, adharNumber, PANNumber, applicantAddress, dateOfBirth);
        this.oldServiceProvider = oldServiceProvider;
        this.oldServiceCommencementDate = oldServiceCommencementDate;
        this.reasonForMigration = reasonForMigration;
        this.oldServiceRegistrationNumber = oldServiceRegistrationNumber;
    }
    // getters
    public String getOldServiceProvider() {
        return oldServiceProvider;
    }

    public Datee getOldServiceCommencementDate() {
        return oldServiceCommencementDate;
    }

    public String getReasonForMigration() {
        return reasonForMigration;
    }

    public String getOldServiceRegistrationNumber() {
        return oldServiceRegistrationNumber;
    }

    // overridded method register

    public void register(){
        System.out.println("Registering Tier 2 Applicant: " + getFirstName() + " " + getLastName());
        setApplicationStatus("Pending");
    }
    public void printApplicantInformation(){
            System.out.println("Applicant ID: " + getApplicantId());
            System.out.println("First Name: " + getFirstName());
            System.out.println("Last Name: " + getLastName());
            System.out.println("Gender: " + getGender());
            System.out.println("Date of Birth: " + getDateOfBirth());
            System.out.println("Age: " + getAge());
            System.out.println("Phone: " + getPhone());
            System.out.println("Address: " + getAddress());
            System.out.println("Aadhar Number: " + getAadharNumber());
            System.out.println("PAN Number: " + getPanNumber());
            System.out.println("Application Status: " + getApplicationStatus());
            System.out.println("Old Service Provider Name: " + getOldServiceProvider());
            System.out.println("Date of Commencement of Old Service: " + getOldServiceCommencementDate());
            System.out.println("Reason for Migration: " + getReasonForMigration());
            System.out.println("Old Service Registration Number: " + getOldServiceRegistrationNumber());
            System.out.println("---------------------------------------");
    }
}