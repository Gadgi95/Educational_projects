public class Bicycle {
    private String brandName;
    private int gear = 1;

    public Bicycle(String brandName) {
        this.brandName = brandName;
    }

    public Bicycle(String brandName, int gear) {
        this.brandName = brandName;
        this.gear = gear;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
