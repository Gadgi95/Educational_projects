public class Manager extends Staff{
    double tradeTurnover = 0;

    public Manager(Company company) {
        super(Position.Manager, company);
        setFix(40000.);
        setTradeTurnover(Math.random() * (140000 - 115000) + 115000);
        company.setIncome((int)company.getIncome() + (int)getTradeTurnover());
    }

    public double getTradeTurnover() {
        return tradeTurnover;
    }

    public void setTradeTurnover(double tradeTurnover) {
        this.tradeTurnover = tradeTurnover;
    }

    @Override
    public double getMonthSalary() {
        return (int)(getFix() + (getTradeTurnover() * 0.05));
    }

}
