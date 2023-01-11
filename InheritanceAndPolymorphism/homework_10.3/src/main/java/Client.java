public abstract class Client {

    private double amount;
    protected final double takingCommission = 1.01;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTakingCommission() {
        return takingCommission;
    }


    public void put(double amountToPut) {
        if(amountToPut > 0) {
            setAmount(getAmount() + amountToPut);
        }
    }
    //перегрузка с комиссией
    public void put(double amountToPut, double commissionForDeposit) {
        if(amountToPut >= 1000) {
            commissionForDeposit = 0.995;
        }
        else if(amountToPut < 1000) {
            commissionForDeposit = 0.99;
        }
        if(amountToPut > 0) {
            setAmount(getAmount() + (amountToPut * commissionForDeposit));
        }
    }

    public void take(double amountToTake) {
        if(getAmount() > amountToTake) {
            setAmount(getAmount() - amountToTake);
        }
    }
    //перегрузка с комиссией
    public void take(double amountToTake, double takingCommission) {
        takingCommission = getTakingCommission();
        if(amountToTake < getAmount()) {
            setAmount(getAmount() - (amountToTake * takingCommission));
        }
    }
}
