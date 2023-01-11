import java.util.*;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        System.out.println(staff);
    }

    public static void sortBySalaryAndAlphabet(List<Employee> Staff) {
//        Staff.sort(((Employee1, Employee2) -> Employee1.getName().compareTo(Employee2.getName())));
//        Staff.sort(((Employee1, Employee2) -> Employee1.getSalary().compareTo(Employee2.getSalary())));

//        Staff.sort(Comparator.comparing(Employee::getName));
//        Staff.sort(Comparator.comparing(Employee::getSalary));

//        Staff.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));

    }
}