import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Applicant> applicants = new ArrayList<>();

        try {
            applicants.add(new Tier1Applicant("Ankit", "Pande", "Male", "8956008030", 
            "1234-3456-5678-7890", "AQZ5654", 
            new Address(15, "Shivaji Road", "Central Vista", "Delhi", "Delhi", "India"),
            new Datee(31,03,2004), 100, "Student", 0));
            
            applicants.add(new Tier1Applicant("Shreya", "Pande", "Female", "9856008030", 
            "2134-3656-4645-7210", "AED5762", 
            new Address(212, "Fenway Road", "Bakers Residence", "Boston", "MA", "USA"),
            new Datee(24,11,1998), 9000000, "Student", 4));
            
            applicants.add(new Tier1Applicant("Suresh", "Pande", "Male", "8888888030", 
            "1234-346-5678-7890", "BNF9812", 
            new Address( 15, "Krishna Nagar", "Civil Lines", "Jaipur", "Rajasthan", "India"),
            new Datee(4,05,1944), 2500000, "LIC officer", 1));
            
            applicants.add(new Tier1Applicant("Rajesh", "Kumar", "Male", "9876543210", 
            "1824-3456-5632-1290", "QQD5774", 
            new Address(42, "Gandhi Road", "Sanjay Nagar", "Bangalore", "Karnataka", "India"),
            new Datee(31,12,1989), 100, "Office", 2));
           
            applicants.add(new Tier1Applicant("Priya", "Sharma", "Female", "8765432109", 
            "1234-3456-5678-7890", "AQZ5654", 
            new Address(7, "Ashoka Enclave", "Model Town", "Ludhiana", "Punjab", "India"),
            new Datee(11,02,2009), 10000, "Call center", 0));

            applicants.add(new Tier2Applicant("Divya", "Sinha", "Female", "6543210987",
            "1234-3456-5678-7890", "AQZ5654",
            new Address(27, "Aruna Apartments", "Malviya Nagar", "Delhi", "Delhi", "India"),
            new Datee(13, 05, 2010), "VI", new Datee(11, 10, 2018), "Better service and offers", "SASD354867Q"));
            
            applicants.add(new Tier2Applicant("Rahul", "Gupta", "Male", "8765432109",
            "9876-5432-1098-7654", "XCD9876",
            new Address(27, "Surya Apartments", "Bodakdev", "Ahmedabad", "Gujarat", "India"),
            new Datee( 25, 03, 1995), "Jio", new Datee(05, 8, 2017), "Prompt customer support", "AXPQ135792H"));

            applicants.add(new Tier2Applicant("Neha", "Kumar", "Female", "7654321098",
             "5678-9012-3456-7890", "POI1234",
              new Address(18, "Sai Enclave", "Hadapsar", "Pune", "Maharashtra", "India"), 
              new Datee(10, 11, 1990), "II", new Datee(22, 9, 2016),
               "Timely delivery and great products", "QWERT432156P"));

            applicants.add(new Tier2Applicant("Amit", "Sharma", "Male", "6543210987",
             "9012-3456-7890-1234", "MNB6789",
            new Address(15, "Ganga Nagar", "Kanpur Road", "Lucknow", "Uttar Pradesh", "India"),
            new Datee(8, 07, 1988), "I", new Datee(15, 06, 2015), 
            "Excellent customer service", "LKJHG876543R"));

            applicants.add(new Tier2Applicant("Pooja", "Patel", "Female", "5432109876", 
            "3456-7890-1234-5678", "ABC3456", 
            new Address(21, "Sahyadri Residency", "Kothrud", "Pune", "Maharashtra", "India"), 
            new Datee(12, 01, 1993), "IV", new Datee(02, 04, 2019), 
            "User-friendly interface", "ASDFG654321N"));
        }   catch (IncompleteInformation e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (Applicant applicant : applicants) {
            applicant.register();
        }


        for (Applicant applicant : applicants) {
            if (applicant instanceof Tier1Applicant) {
                Tier1Applicant tier1Applicant = (Tier1Applicant) applicant;
                DBOperations.checkEligibility(tier1Applicant);
            }
            else if (applicant instanceof Tier2Applicant) {
                Tier2Applicant tier2Applicant = (Tier2Applicant) applicant;
                DBOperations.checkEligibility(tier2Applicant);
            }
        }

        for (Applicant applicant : applicants) {
            applicant.checkStatus();
        }
        for (Applicant applicant : applicants) {
            applicant.printApplicantInformation();
        }

        List<Applicant> eligibleFemaleApplicants = DBOperations.getEligibleFemaleApplicants(applicants);
        System.out.println("Eligible Female Applicants:");
        for (Applicant applicant : eligibleFemaleApplicants) {
            System.out.println(applicant.getFirstName() + " " + applicant.getLastName());
        }

        
    }

}
