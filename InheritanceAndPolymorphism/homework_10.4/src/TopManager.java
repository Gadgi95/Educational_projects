public class TopManager extends Staff{

    public TopManager(Company company) {
        super(Position.TopManager, company);
        setFix(100000.);

    }

    @Override
    public double getMonthSalary() {
        double variable = 0;
        if(company.getIncome() >= 10000000) {
            variable = getFix() * 1.5;
        }
        return getFix() + variable;
    }

}
