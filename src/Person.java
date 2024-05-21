public class Person {

    String name;
    private String schoolName = "Bingham university";
    private String password;
    private String matricNo;
    private int staffNo;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", password='" + password + '\'' +
                ", matricNo='" + matricNo + '\'' +
                ", staffNo='" + staffNo + '\'' +
                '}';
    }

    Person() {
        System.out.println("Object created");
    }

    public Person(String name, String schoolName, String password, String matricNo) {
        this.name = name;
        this.schoolName = schoolName;
        this.password = password;
        this.matricNo = matricNo;
    }

    public Person(String schoolName, String name, String password, int staffNo) {
        this.schoolName = schoolName;
        this.name = name;
        this.password = password;
        this.staffNo = staffNo;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    void setPassword(String password) {
        this.password = password;
    }
}
