public class JavaDeveloper extends Employee {
    JavaDeveloper(String name) {
        super(name);
    }

    String getPosition() {
        return this.getSeniority() + " Java Developer";
    }

    String getSeniority() {
        return "Senior";
    }
}
