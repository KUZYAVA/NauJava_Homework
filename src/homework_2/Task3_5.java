package homework_2;

import java.util.ArrayList;
import java.util.List;

public class Task3_5 {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Иван Иванов", 30, "IT", 80000.00));
        employees.add(new Employee("Анна Петрова", 25, "Маркетинг", 60000.00));
        employees.add(new Employee("Сергей Сидоров", 40, "Продажи", 120000.00));
        employees.add(new Employee("Ольга Козлова", 35, "IT", 90000.00));
        employees.add(new Employee("Дмитрий Кузнецов", 28, "Финансы", 70000.00));

        boolean hasHighSalaryEmployee = employees.stream()
                .anyMatch(employee -> employee.getSalary() > 100000.00);

        System.out.println("Список сотрудников:");
        employees.forEach(System.out::println);

        System.out.println("Есть ли сотрудник с зарплатой более 100000.00: " + hasHighSalaryEmployee);
    }
}

class Employee {
    private String fullName;
    private Integer age;
    private String department;
    private Double salary;

    public Employee(String fullName, Integer age, String department, Double salary) {
        this.fullName = fullName;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "homework_2.Employee{" +
                "fullName=" + fullName +
                ", age=" + age +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}