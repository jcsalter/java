public class MemberBenefitsSummaryOld {
    public static void main(String[] args) {

        // Member identity
        String memberName = "Avery Chen";
        String memberId = "MBR-TRAIN-88214";
        String planName = "Blue Choice Training Plan";
        String effectiveDate = "January 1, 2026";

        // Plan facts
        int groupNumber = 41027;
        int planYear = 2026;
        int deductibleDollars = 1500;
        int visitsUsed = 4;

        // Report body
        System.out.println("MEMBER BENEFITS SUMMARY");
        System.out.println("-----------------------");
        System.out.println("Member: " + memberName);
        System.out.println("ID: " + memberId);
        System.out.println("Plan: " + planName);
        System.out.println("Group: " + groupNumber);
        System.out.println("Effective: " + effectiveDate);
        System.out.println("Deductible: $" + deductibleDollars);
        System.out.println("Visits used: " + visitsUsed);
        System.out.println(memberName + " is enrolled for " + planYear + ".");
    }
}
