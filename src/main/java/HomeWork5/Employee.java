package HomeWork5;

public class Employee {

    private String fullName;
    private String position;
    private int salary;
    private int age;
    private String email;
    private String phone;


    public Employee(String fullName, String position, int salary, int age, String email, String phone) {
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void employeeInfo(){
        System.out.println("Employee: " + this.fullName);
        System.out.println("Age: " + this.age);
        System.out.println("Position: " + this.fullName);
        System.out.println("Salary: " + this.salary);
        System.out.println("email: " + this.email);
        System.out.println("phone: " + this.phone);
        System.out.println();

    }
}



