public class Computer {
    private final String vendor;
    private final String name;
    private CPU cpu;
    private RAM ram;
    private ROM rom;
    private Keyboard keyboard;
    private Screen screen;
    private String text;

    public Computer(String vendor, String name, CPU cpu, RAM ram, ROM rom, Keyboard keyboard, Screen screen) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.rom = rom;
        this.keyboard = keyboard;
        this.screen = screen;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return text = String.format("Производитель: %s, model: %s, \ncpu: %s, \nRAM: %s, \nROM: %s, \nKeyboard: %s, \nScreen: %s \n",
                getVendor(), getName(), cpu, ram, rom, keyboard, screen);
    }
    public void printPC() {
        System.out.println(toString());
    }

    public int getComputerWeight() {
        return (cpu.getWeightCPU() + ram.getWeightRAM() + rom.getWeightROM() + keyboard.getWeightKeyboard() + screen.getWeightScreen());
    }
    public void printComputerWeight() {
        System.out.println("Общий вес компьютера: " + getComputerWeight() + "\n");
    }

}
