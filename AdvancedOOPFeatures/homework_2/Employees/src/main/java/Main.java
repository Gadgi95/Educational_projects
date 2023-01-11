import java.util.*;

public class Main {

    private static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        Employee employeeMaxSalary = findEmployeeWithHighestSalary(staff, 2017);
        System.out.println(employeeMaxSalary);
    }

    public static Employee findEmployeeWithHighestSalary(List<Employee> staff, int year) {

        Date date = new Date();
        date.setYear(year - 1900);

        return staff.stream().max(Comparator.comparing(Employee::getSalary).
                thenComparing(employee -> employee.getWorkStart().getYear() == date.getYear()))
                .orElse(new Employee(" ", 0 , new Date()));
    }
}