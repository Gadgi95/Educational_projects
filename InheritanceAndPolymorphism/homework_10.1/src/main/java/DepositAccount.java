import java.time.LocalDate;

public class DepositAccount extends BankAccount {

  LocalDate lastIncome = getLastIncome();

  public DepositAccount() {
  }

  @Override
  public void take(double amountToTake)
  {
    if(LocalDate.now().isAfter(lastIncome.plusMonths(1))  && amountToTake < getAmount())
    {
      setAmount(getAmount() - amountToTake);
    }
  }
}
