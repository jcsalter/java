import java.util.Scanner;
import java.text.NumberFormat;

public class MemberBenefitsSummary {

    Scanner sc = new Scanner(System.in);
    NumberFormat currency = NumberFormat.getCompactNumberInstance();
    NumberFormat percent = NumberFormat.getPercentInstance();

    // Business-rule constants (Day 2)
    final double COINSURANCE_RATE = 0.20;
    final int VISITS_ALLOWED = 12;

    //Member identity (unchanged from Day 1)
    String memberName = "Avery Chen";
    String memberId = "MBR-TRAIN-88214";
    String planName = "Blue Choice Training Plan";
    String effectiveDate = "January 1, 2026";

    // Plan facts (unchanged from Day 1)
    int groupNumber = 41027;
    int planyear = 2026;
    int visitsUsed = 4;

    // Money the program asks for (unchanged from Day 2)
    System.out.print("Enter the plan deductible: ");
    double deductibleDollars = Double.parseDouble(sc.nextLine());
    System.out.print("Enter amount paid toward the deductible");
    double amountPaidThisYear = Double.parseDouble(sc.nextLine());
    double remainingDeductible = deductibleDollars - amountPaidThisYear;

    //New for Dat 3:  visit usage recalculated after logging, then a status decision

}
