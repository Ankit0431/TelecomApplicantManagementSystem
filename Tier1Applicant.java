
class Tier1Applicant extends Applicant {
    double annualIncome;
    String occupation;
    int noOfProperties;

    // constructors

    public Tier1Applicant()
    {}

    public Tier1Applicant(String firstName, String lastName, String gender, String phone, String adharNumber, String PANNumber, Address applicantAddress, Datee dateOfBirth, double annualIncome, String occupation, int noOfProperties) throws IncompleteInformation {
        super(firstName, lastName, gender,  phone, adharNumber, PANNumber, applicantAddress, dateOfBirth);
        this.annualIncome = annualIncome;
        this.occupation = occupation;
        this.noOfProperties = noOfProperties;
}
    // getters
    
    public double getAnnualIncome() {
        return annualIncome;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getNumOfProperties() {
        return noOfProperties;
    }

    // overridded method register

    public void register(){
        System.out.println("Registering Tier 1 Applicant: " + getFirstName() + " " + getLastName());
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
            System.out.println("Annual Income: " + getAnnualIncome());
            System.out.println("Occupation: " + getOccupation());
            System.out.println("Number of Properties Owned: " + getNumOfProperties());
            System.out.println("---------------------------------------");
    }
}