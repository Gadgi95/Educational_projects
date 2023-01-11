public class LegalPerson extends Client {

  @Override
  public void take(double amountToTake) {
    if(getAmount() > amountToTake) {
      setAmount(getAmount() - (amountToTake * getTakingCommission()));
    }
  }


}
