import java.util.Objects;

public class Employee {

    private int salary;
    private int age;
    private Car car;

    public Employee(int salary, int age) {
        this.salary = salary;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Equals is called");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary &&
                age == employee.age;

    }

    @Override
    public int hashCode() {
        System.out.println("Hashcode is called");
        return Objects.hash(salary,age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", age=" + age +
                '}';
    }
}
