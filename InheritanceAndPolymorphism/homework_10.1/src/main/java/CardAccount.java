public class CardAccount extends BankAccount {

  public CardAccount() {
  }

  @Override
  public void take(double amountToTake) {
    if(amountToTake < getAmount()) {
      setAmount(getAmount() - (amountToTake * getTakingCommission()));
    }
  }
}
