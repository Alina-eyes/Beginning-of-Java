import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Manager extends Employee {
    private final String lastName;

    private Employee[] team;

    Manager(String name, String lastName) {
        super(name);
        this.lastName = lastName;
        this.team = new Employee[] {};
    }

    void setTeamMembers(Employee ...employees) {
        this.team = new Employee[employees.length];
        for (int i = 0; i<employees.length; ++i) {
            this.team[i] = employees[i];
        }
    }

    String getLastName() {
        return this.lastName;
    }

    String getPosition() {
        return this.getSeniority() + " Manager";
    }

    String getSeniority() {
        return "Senior";
    }

    String getInfo() {
        List<String> teamNames = Arrays.stream(this.team).map(Employee::getName).toList();
        return this.getName() + " " + this.getLastName() + " is a " + this.getPosition() +
                " and has a team of " + this.team.length + " members " + Arrays.toString(teamNames.toArray());
    }
}
