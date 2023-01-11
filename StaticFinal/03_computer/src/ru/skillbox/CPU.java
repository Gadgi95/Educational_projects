public class CPU {
    private double frequency; // Частота процессора
    private int core; // кол-во ядер
    private String manufacturer; // Производитель
    private int weightCPU; // Вес
    private String textCPU;

    public CPU(double frequency, int core, String manufacturer, int weightCPU) {
        this.frequency = frequency; // частота
        this.core = core; // кол-во ядер
        this.manufacturer = manufacturer;
        this.weightCPU = weightCPU;
    }

    public String toString() {
        return textCPU = String.format("Частота: %s, кол-во ядер: %s, производитель: %s, вес: %s",
                getFrequency(), getCore(), getManufacturer(), getWeightCPU());
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getWeightCPU() {
        return weightCPU;
    }

    public void setWeightCPU(int weightCPU) {
        this.weightCPU = weightCPU;
    }
}
