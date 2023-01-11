public class Operator extends Staff{

    public Operator(Company company) {
        super(Position.Operator, company);
        setFix(40000.);
    }

    @Override
    public double getMonthSalary() {

        return  getFix();
    }
}
