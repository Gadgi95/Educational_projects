import java.util.Comparator;

public class Main {

  public static void main(String[] args) {

    Company myCompany = new Company("myCompany");

    for (int i = 0; i < 80; i++) {
      myCompany.hire(new Manager(myCompany));
    }

    for (int i = 0; i < 180; i++) {
      myCompany.hire(new Operator(myCompany));
    }

    for (int i = 0; i < 10; i++) {
      myCompany.hire(new TopManager(myCompany));
    }

    System.out.println("Топ зп по компании: " + myCompany.getTopSalaryStaff(15));
    System.out.println("Аутсайдеры по зп в компании: " + myCompany.getLowestSalaryStaff(30));
    System.out.println(myCompany.toString());

    int employeeListSize = myCompany.employeesList.size();
    for (int i = 0; i < employeeListSize / 2; i++) {
      myCompany.fire(i);
    }

    System.out.println("Топ зп по компании 2 список: " + myCompany.getTopSalaryStaff(15));
    System.out.println("Аутсайдеры по зп в компании 2 список: " + myCompany.getLowestSalaryStaff(30));
    System.out.println(myCompany.toString());

  }

}
