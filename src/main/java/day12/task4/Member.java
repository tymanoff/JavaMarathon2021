package day12.task4;

public class Member {
    private String name;
    private String firstname;

    public Member(String name, String firstname) {
        this.name = name;
        this.firstname = firstname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }
}
