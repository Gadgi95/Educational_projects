public class Cargo {
    private final Dimensions dimensions;
    private final int weight;
    private final String deliveryAddress;
    private final boolean property;
    private final String registrationNumber;
    private final boolean cargoFragile;

    public Cargo(Dimensions dimensions, int weight, String deliveryAddress, boolean property, String registrationNumber, boolean cargoFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.property = property;
        this.registrationNumber = registrationNumber;
        this.cargoFragile = cargoFragile;
    }
    public int getDimensions() {

        return dimensions.getHeight()*dimensions.getLength()*dimensions.getWidth();
    }
    public Cargo setDimension(Dimensions dimensions) {
        return new Cargo(dimensions, weight, deliveryAddress, property, registrationNumber, cargoFragile);
    }

    public int getWeight() {
        return weight;
    }

    public Cargo setWeight(int weight) {
        return new Cargo(dimensions, weight, deliveryAddress, property, registrationNumber, cargoFragile);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Cargo setDeliveryAddress(String deliveryAddress) {
        return new Cargo(dimensions, weight, deliveryAddress, property, registrationNumber, cargoFragile);
    }

    public boolean isProperty() {
        return property;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isCargoFragile() {
        return cargoFragile;
    }

    public void print() {
        System.out.println("Информация по доставке: \n" +
                "Гарабиты: " + getDimensions() + "\n" +
                "Адрес: " + deliveryAddress + "\n" +
                "Регистрационный номер: " + registrationNumber + "\n");
    }
}
