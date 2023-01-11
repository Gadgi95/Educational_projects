public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Lenovo", "gaming 3 15",
                new CPU(3.0, 6, "AMD", 150),
                new RAM(RAMType.DDR4, 16384, 250),
                new ROM(ROMType.SSD, 256, 350),
                new Keyboard("цифровая", true, 450),
                new Screen(15.6, MatrixType.IPS, 1000));
        computer1.printPC();
        computer1.printComputerWeight();

        Computer computer2 = new Computer("MSI ", "GF63 Thin 9SCSR",
                new CPU(2.4, 4, "Intel", 100),
                new RAM(RAMType.DDR4, 8192, 150),
                new ROM(ROMType.SSD, 256, 350),
                new Keyboard("механическая", false, 260),
                new Screen(15.6, MatrixType.IPS, 1000));
        computer2.printPC();
        computer2.printComputerWeight();

        Computer computer3 = new Computer("ACER", "Aspire 7 A715-75G-73WN",
                new CPU(2.6, 6, "Intel", 120),
                new RAM(RAMType.DDR4, 8192, 150),
                new ROM(ROMType.SSD, 256, 350),
                new Keyboard("механическая", false, 260),
                new Screen(15.6, MatrixType.IPS, 1000));
        computer3.printPC();
        computer3.printComputerWeight();
    }
}
