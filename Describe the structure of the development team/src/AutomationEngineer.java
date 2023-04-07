public class AutomationEngineer extends Employee {
    private final String lastName;

    AutomationEngineer(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    String getLastName() {
        return this.lastName;
    }

    String getPosition() {
        return this.getSeniority() + " Automation Engineer";
    }

    String getSeniority() {
        return "Senior";
    }
}
