public class AngularDeveloper extends Employee {
    AngularDeveloper(String name) {
        super(name);
    }

    String getPosition() {
        return this.getSeniority() + " Angular Developer";
    }

    String getSeniority() {
        return "Middle";
    }
}
