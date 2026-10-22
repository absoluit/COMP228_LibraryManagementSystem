public class LibraryAssistant extends LibraryStaff {
    private final String shiftType;
    private double shiftAllowance;

    public LibraryAssistant(
            String name,
            String personId,
            String phoneNumber,
            String staffId,
            String department,
            double monthlySalary,
            String shiftType,
            double shiftAllowance) {
        super(name, personId, phoneNumber, staffId, department, monthlySalary);
        this.shiftType = shiftType;
        this.shiftAllowance = shiftAllowance;
    }

    public double calculateMonthlyCompensation() {
        return getMonthlySalary() + shiftAllowance;
    }

    public String getRoleDescription() {
        return "Library Assistant";
    }

    @Override
    public void displayStaffDetails() {
        super.displayStaffDetails();

        System.out.println("Shift Type: " + shiftType);
        System.out.println("Shift Allowance: " + shiftAllowance);
    }
}
