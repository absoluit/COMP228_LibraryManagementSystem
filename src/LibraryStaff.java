public abstract class LibraryStaff extends Person {
    private final String staffId;
    private String department;
    private double monthlySalary;
    private static int staffCount;

    public abstract double calculateMonthlyCompensation();

    public LibraryStaff
            (
                    String name,
                    String personId,
                    String phoneNumber,
                    String staffId,
                    String department,
                    double monthlySalary) {
        super(name, personId, phoneNumber);
        this.staffId = staffId;
        this.department = department;
        this.monthlySalary = monthlySalary;
        staffCount++;
    }

    public static int getStaffCount() {
        return staffCount;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void displayStaffDetails() {
        super.displayBasicDetail();
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}