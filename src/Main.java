import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {

        // MEMBERS
        System.out.println("=== MEMBERS ===");

        Member member1 = new Member(
                "Alice Johnson",
                "P001",
                "555 1234",
                "M001",
                21,
                0.00
        );

        Member member2 = new Member(
                "Jimmy Johnson",
                "P002",
                "512 1235",
                "M002",
                25,
                12.50
        );

        member1.registerMember("Alice Johnson", 21);
        member2.registerMember("Jimmy Johnson", 25, "Premium");
        System.out.println();

        Member[]  members = {member1, member2};

        for (Member member : members) {
            System.out.println(member.toString());

            System.out.println();
        }

        // OVERLOADING
        System.out.println("=== METHOD OVERLOADING ===");

        Librarian librarian1 = new Librarian(
                "Mike David",
                "P003",
                "264 8426",
                "S003",
                "Cataloging",
                7445.00,
                20,
                14
        );

        System.out.println(
                "7 days at default rate: "
                + librarian1.calculateLateFee(7));

        System.out.println(
                "7 ays at $1.50/day: $"
                + librarian1.calculateLateFee(7, 1.50));

        System.out.println();

        // STAFF OBJECTS
        SeniorLibrarian seniorLibrarian1 = new SeniorLibrarian(
          "Jeanette Mclol",
                "P004",
                "614 9479",
                "S004",
                "User Services",
                8220.00,
                25,
                "Historical Collections",
                250.00,
                13
        );

        LibraryAssistant libraryAssistant = new LibraryAssistant(
                "Sandra Bullock",
                "P005",
                "682 4101",
                "S005",
                "Research Services",
                4316.00,
                "Morning",
                150.00
        );

        // RUNTIME POLYMORPHISM
        System.out.println("=== RUNTIME POLYMORPHISM / STAFF DETAILS ===");

        LibraryStaff[] staffList = {
                librarian1,
                seniorLibrarian1,
                libraryAssistant
        };

        for (LibraryStaff staff : staffList) {

            System.out.println(staff.getRoleDescription());

            staff.displayStaffDetails();

            System.out.println(
                    "Monthly Compensation: $"
                    + staff.calculateMonthlyCompensation()
            );
            System.out.println();
        }

        // INTERFACES
        System.out.println("=== INTERFACE DEMONSTRATION ===");

        librarian1.generateReport();
        librarian1.reserveBook("B001");

        System.out.println();

        // STATIC VARIABLES
        System.out.println("=== STATIC VARIABLES ===");

        System.out.println("Total Persons: " + Person.getPersonCount());
        System.out.println("Total Staff: " + LibraryStaff.getStaffCount());
        System.out.println("Total Members: " + Member.getMemberCount());

        System.out.println();
        // VALIDATION
        System.out.println("=== VALIDATING ===");

        member1.registerMember(null, 22);
        member2.registerMember("Invalid age", 15);

        librarian1.calculateLateFee(-2);
        librarian1.calculateLateFee(2, -2.0);

        librarian1.reserveBook(null);
    }
}
