import java.util.*;
class DBOperations {

    //method for calculating age
    public static int calculateAge(int yy){
        return 2023-yy;
    }

    public static void checkEligibility(Tier1Applicant applicant){
        String adharNumber = applicant.getAadharNumber();
        if(checkAdharNumber(adharNumber))
            applicant.setApplicationStatus("Accepted");
        else
            applicant.setApplicationStatus("Rejected");
    }

    public static void checkEligibility(Tier2Applicant applicant){
        String oldServiceRegistrationNumber = applicant.getOldServiceRegistrationNumber();
        String oldServiceProvider = applicant.getOldServiceProvider();
        if(checkValidServiceRegistrationNumber(oldServiceRegistrationNumber) && !oldServiceProvider.isBlank())
            applicant.setApplicationStatus("Accepted");
        else
            applicant.setApplicationStatus("Rejected");
    }

    public static boolean checkAdharNumber(String adharNumber){
        return adharNumber.matches("^\\d{4}-\\d{4}-\\d{4}-\\d{4}");
        //the correct adhar number contains 16 digits which are here separated by hyphen
        //the correct format would be 1234-5678-9012-3456
        //all other formats are considered invalid and are hence rejected
    }

    public static boolean checkValidServiceRegistrationNumber(String oldServiceRegistrationNumber){
        return oldServiceRegistrationNumber.matches("^[A-Z]{4}\\d{6}[A-Z]{1}");
        //it is assumed that a correct service registration number is of the form ABCD123456E
        //all other forms are considered as invalid and are hence rejected
    }
    
    // ckeck elegible female applicants

    public static List<Applicant> getEligibleFemaleApplicants(List<Applicant> applicants) {
        List<Applicant> eligibleFemaleApplicants = new ArrayList<>();
        for (Applicant applicant : applicants) {
            if (applicant instanceof Tier1Applicant) {
                Tier1Applicant tier1Applicant = (Tier1Applicant) applicant;
                if (tier1Applicant.getGender().equalsIgnoreCase("female")
                        && tier1Applicant.getApplicationStatus().equals("Accepted")) {
                    eligibleFemaleApplicants.add(tier1Applicant);
                }
            } else if (applicant instanceof Tier2Applicant) {
                Tier2Applicant tier2Applicant = (Tier2Applicant) applicant;
                if (tier2Applicant.getGender().equalsIgnoreCase("female")
                        && tier2Applicant.getApplicationStatus().equals("Accepted")) {
                    eligibleFemaleApplicants.add(tier2Applicant);
                }
            }
        }
        return eligibleFemaleApplicants;
    }
}
