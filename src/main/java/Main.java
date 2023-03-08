import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1000,25);
        Employee employee4 = new Employee(3000,21);

        System.out.println(employee4);


        Employee employee2 = new Employee(2000,27);
        Employee employee6 = new Employee(2000,27);
        Employee employee3 = new Employee(2500,26);
        Employee employee5 = new Employee(3000,25);

        Set<Employee> employeeSet = new HashSet<Employee>();
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee5);
        employeeSet.add(employee6);

        for (Employee employee : employeeSet){
            System.out.println(employee.toString());
        }

    }

}
