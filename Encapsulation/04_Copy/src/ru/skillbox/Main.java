public class Main {

    public static void main(String[] args) {

        Dimensions dimensions1 = new Dimensions(5, 6, 5);
        Cargo cargo = new Cargo(dimensions1, 55, "Moscow", true, "556a34", true);
        cargo.print();

        Cargo spb = cargo.setDeliveryAddress("SPB, Lenina street");
        spb.print();

    }
}
