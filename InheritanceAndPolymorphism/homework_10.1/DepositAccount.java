import java.time.LocalDate;

public class DepositAccount extends BankAccount {

  LocalDate lastIncome = super.getLastIncome();
  LocalDate withdrawalBlockDate = lastIncome.plusMonths(1);


  public DepositAccount() {
  }

  @Override
  public void setAmount(double amount) {
    super.setAmount(amount);
  }

  @Override
  public double getAmount() {
    return super.getAmount();
  }

  @Override
  public void put(double amountToPut) {
    super.put(amountToPut);
  }

  @Override
  public void take(double amountToTake)
  {
    LocalDate nowDate = LocalDate.now();

    if(nowDate.isAfter(withdrawalBlockDate)  && amountToTake < super.getAmount())
    {
      setAmount(amount -= amountToTake);
    }
  }
}
