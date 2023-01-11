import java.util.ArrayList;
import java.util.Comparator;

public class Company{
    private int income = 0;
    private int countEmployees = 0;
    private String nameCompany;
    ArrayList<Staff> employeesList = new ArrayList<>();

    public Company(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getCountEmployees() {
        return countEmployees;
    }

    public void setCountEmployees(int countEmployees) {
        this.countEmployees = countEmployees;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public ArrayList<Staff> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(ArrayList<Staff> employeesList) {
        this.employeesList = employeesList;
    }

    public void hire(Staff staff) {
        employeesList.add(staff);
        setCountEmployees(employeesList.size());
    }

    public ArrayList<Staff> hireAll(ArrayList<Staff> candidates) {
        employeesList.addAll(candidates);
        setCountEmployees(employeesList.size());
        return employeesList;
    }

    public ArrayList<Staff> fire(int id) {
        Comparator<Staff> comparator = Comparator.comparing(Staff::getId);
        employeesList.sort(comparator);
        employeesList.remove(id);
        setCountEmployees(employeesList.size());
        return employeesList;
    }

    public ArrayList<Staff> getTopSalaryStaff(int count) {
        if(count < employeesList.size() && count > 0) {
            Comparator<Staff> comparator = Comparator.comparing(Staff::getMonthSalary);
            employeesList.sort(comparator);
            ArrayList<Staff> topSalaryStaff = new ArrayList<>();
            for (int i = employeesList.size() - 1; i > employeesList.size() - count; i--){
                topSalaryStaff.add(employeesList.get(i));
            }
            return topSalaryStaff;
        }
        else {
            return new ArrayList<>();
        }
    }

    public ArrayList<Staff> getLowestSalaryStaff(int count) {
        if (count < employeesList.size() && count > 0) {
            Comparator<Staff> comparator = Comparator.comparing(Staff::getMonthSalary);
            employeesList.sort(comparator);
            ArrayList<Staff> lowestSalaryStaff = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                lowestSalaryStaff.add(employeesList.get(i));
            }
            return lowestSalaryStaff;
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public String toString() {
        return nameCompany +
                "\nincome = " + income +
                "\ncountEmployees = " + countEmployees;
    }
}
