package filter;

public class Person {

    private final String name;

    private final String gender;

    private final String materialStatus;

    public Person(final String name,
                  final String gender,
                  final String materialStatus) {
        this.name = name;
        this.gender = gender;
        this.materialStatus = materialStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return materialStatus;
    }

}
