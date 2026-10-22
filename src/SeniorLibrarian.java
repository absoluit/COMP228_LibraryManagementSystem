public class SeniorLibrarian extends Librarian {
    private final String specialization;
    private double seniorityAllowance;

    public SeniorLibrarian(
            String name,
            String personId,
            String phoneNumber,
            String staffId,
            String department,
            double monthlySalary,
            int dailyIssueLimit,
            String specialization,
            double seniorityAllowance,
            int booksProcessed) {
        super(name, personId, phoneNumber, staffId, department, monthlySalary, dailyIssueLimit, booksProcessed);
        this.specialization = specialization;
        this.seniorityAllowance = seniorityAllowance;
    }

    @Override
    public double calculateMonthlyCompensation() {
        return getMonthlySalary() + (booksProcessed * 2) + seniorityAllowance;
    }

    @Override
    public void displayStaffDetails() {
        super.displayStaffDetails();

        System.out.println("Specialization: " +  specialization);
        System.out.println("Seniority Allowance: $" +  seniorityAllowance);
    }

    @Override
    public String getRoleDescription() {
        return "Senior Librarian";
    }
}
