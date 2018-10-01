package p2;
import p1.*;
public class EmployeeTest {
    public static void main(String args[]){
        Employee empone = new Employee("james smith");
        Employee emptwo = new Employee("mary anne");

        empone.empAge(26);
        empone.empDesignation("seniro software engineer");
        empone.empSalary(1000);
        empone.printEmployee();

        emptwo.empAge(21);
        emptwo.empDesignation("software engineer");
        emptwo.empSalary(500);
        emptwo.printEmployee();
    }
}
