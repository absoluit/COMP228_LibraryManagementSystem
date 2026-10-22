public class Member extends Person {
    private final String memberNumber;
    private int age;
    private String membershipType = "Basic";
    private double outstandingFees;
    private static int memberCount;

    public Member(String name, String personId, String phoneNumber, String memberNumber, int age, double outstandingFees) {
        super(name, personId, phoneNumber);
        this.memberNumber = memberNumber;
        this.age = age;
        this.outstandingFees = outstandingFees;
        memberCount++;
    }

    public static int getMemberCount() {
        return memberCount;
    }

    public void registerMember(String name, int age) {
        if (name == null) {
            System.out.println("Name is required");
            return;
        }
        if (age < 18) {
            System.out.println("Member must be at least 18 years old");
            return;
        }

        System.out.println("Basic registration complete!");
    }

    public void registerMember(String name, int age, String membershipType) {
        if (name == null) {
            System.out.println("Name is required");
            return;
        }
        if (age < 18) {
            System.out.println("Member must be at least 18 years old");
            return;
        }
        if (membershipType == null) {
            System.out.println("Membership type is required");
            return;
        }

        this.membershipType = membershipType;

        System.out.println("Member registration complete with membership type: " + membershipType);
    }

    @Override
    public String toString() {
        return
                super.toString() +
                        "\nMember Number: " + memberNumber +
                        "\nAge: " + age +
                        "\nMembership Type: " + membershipType +
                        "\nOutstanding Fees: $" + outstandingFees;
    }

    @Override
    public String getRoleDescription() {
        return "Generic Member";
    }
}