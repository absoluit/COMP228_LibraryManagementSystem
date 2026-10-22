public abstract class Person {
    private final String personId;
    private String phoneNumber;
    private String name;
    private static int personCount;

    public Person(String name, String personId, String phoneNumber)
    {
        this.personId = personId;
        this.phoneNumber = phoneNumber;
        this.name = name;
        personCount++;
    }

    public static int getPersonCount() {
        return personCount;
    }

    public String displayBasicDetail() {
        System.out.println("Name: " + name);
        System.out.println("Person ID: " + personId);
        System.out.println("Phone Number: " + phoneNumber);
        return null;
    }

    @Override
    public String toString() {
        return "Person ID: " + personId +
                "\nName: " + name +
                "\nPhone " + phoneNumber;
    }

    public abstract String getRoleDescription();
}