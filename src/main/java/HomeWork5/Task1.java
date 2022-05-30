package HomeWork5;

public class Task1 {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Bob", "President", 150000, 35, "pres@gmail.com", "222333999");
        employees[1] = new Employee("Mike", "Manager", 100000, 45, "man@gmail.com", "222333998");
        employees[2] = new Employee("Joe", "Courier", 30000, 30, "cour@gmail.com", "222333997");
        employees[3] = new Employee("Ivan", "Driver", 70000, 55, "drv@gmail.com", "222333996");
        employees[4] = new Employee("Eva", "Secretary", 15000, 18, "office@gmail.com", "222333995");

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].employeeInfo();
            }
        }
    }

}
