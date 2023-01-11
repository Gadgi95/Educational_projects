public class IndividualBusinessman extends Client {

  @Override
  public void put(double amountToPut) {
    if(amountToPut > 0) {
      if(amountToPut >= 1000) {
        setAmount(getAmount() + (amountToPut * 0.995));
      }

      else if(amountToPut <= 999.99) {
        setAmount(getAmount() + (amountToPut * 0.99));
      }
    }
  }

}
