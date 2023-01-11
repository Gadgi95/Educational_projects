import java.time.LocalDate;

public class BankAccount {

  private double amount = 0.0;
  private LocalDate lastIncome = LocalDate.now();
  private boolean withdrawalCompleted;
  protected final double takingCommission = 1.01;


  public BankAccount() {  }

  public void setAmount(double amount)
  {
    this.amount = amount;
  }

  public double getAmount()
  {
    return amount;
  }

  public boolean isWithdrawalCompleted() {
    return withdrawalCompleted;
  }

  public void setWithdrawalCompleted(boolean withdrawalCompleted) {
    this.withdrawalCompleted = withdrawalCompleted;
  }

  public LocalDate getLastIncome() {
    return lastIncome;
  }

  public void setLastIncome(LocalDate lastIncome) {
    this.lastIncome = lastIncome;
  }

  public double getTakingCommission() {
    return takingCommission;
  }

  public void put(double amountToPut) {
    if(amountToPut > 0)
    {
      amount += amountToPut;
      setLastIncome(LocalDate.now());
    }
  }

  public void take(double amountToTake) {
    if(amountToTake < getAmount()) {
      amount -= amountToTake;
      setWithdrawalCompleted(true);
    }
  }
  //Метод take перегружен
  public void take(double amountToTake, double takingCommission) {
    takingCommission = getTakingCommission();
    if(amountToTake < getAmount()) {
      setAmount(getAmount() - (amountToTake * takingCommission));
      setWithdrawalCompleted(true);
    }
  }

  public boolean send(BankAccount receiver, double amount) {
    take(amount);
    if(isWithdrawalCompleted())
    {
      receiver.setAmount(amount);
    }
    return true;
  }
}
