public class ManualTestEngineer extends Employee {
    private final String lastName;

    ManualTestEngineer(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    String getLastName() {
        return this.lastName;
    }

    String getPosition() {
        return this.getSeniority() + " Manual Test Engineer";
    }

    String getSeniority() {
        return "Junior";
    }
}
