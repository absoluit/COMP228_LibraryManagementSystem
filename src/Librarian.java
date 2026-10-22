public class Librarian extends LibraryStaff implements Reportable, Reservable {
    private final int dailyIssueLimit;
    protected int booksProcessed;

    public Librarian(
            String name,
            String personId,
            String phoneNumber,
            String staffId,
            String department,
            double monthlySalary,
            int dailyIssueLimit,
            int booksProcessed) {
        super(name, personId, phoneNumber, staffId, department, monthlySalary);
        this.dailyIssueLimit = dailyIssueLimit;
        this.booksProcessed = booksProcessed;
    }

    public double calculateLateFee(int daysOverdue) {
        if (daysOverdue < 0) {
            System.out.println("Invalid days overdue");
            return 0;
        }

        return daysOverdue * 1.00;
    }

    public double calculateLateFee(int daysOverdue, double dailyRate) {
        if (daysOverdue < 0) {
            System.out.println("Invalid days overdue");
            return 0;
        }
        if (dailyRate <= 0) {
            System.out.println("Daily rate must be greater than 0");
            return 0;
        }

        return daysOverdue * dailyRate;
    }

    @Override
    public double calculateMonthlyCompensation() {
        return getMonthlySalary() + (booksProcessed * 2);
    }

    @Override
    public String getRoleDescription() {
        return "Librarian";
    }

    @Override
    public void generateReport() {
        System.out.println("Librarian report genereated");
    }

    @Override
    public void reserveBook(String bookId) {
        if (bookId == null) {
            System.out.println("Invalid book id");
            return;
        }

        System.out.println("Reserved " + bookId);
    }
}
