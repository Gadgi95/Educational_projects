public abstract class Staff implements Employee
{
    private double fix;
    private double variable;
    protected Position position;
    protected Company company;
    protected static int idCounter = 1;
    protected int staffId;

    public Staff(Position position, Company company)
    {
        this.position = position;
        this.company = company;
        staffId = idCounter++;
    }

    public double getFix() {
        return fix;
    }

    public void setFix(double fix) {
        this.fix = fix;
    }

    public double getVariable() {
        return variable;
    }

    public void setVariable(double variable) {
        this.variable = variable;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getId() {
        return staffId;
    }

    public double getMonthSalary() {
        return 0;
    }

    @Override
    public String toString() {
        return "\n" + staffId + " - " + position + " - " + getMonthSalary();
    }
}
