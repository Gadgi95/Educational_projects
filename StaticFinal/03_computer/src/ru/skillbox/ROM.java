public class ROM {
    private ROMType romType; // Тип памяти
    private int memorySize; // объем памяти
    private int weightROM; // Вес
    private String textROM;

    public ROM(ROMType romType, int memorySize, int weightROM) {
        this.romType = romType;
        this.memorySize = memorySize;
        this.weightROM = weightROM;
    }

    public String toString() {
        return textROM = String.format("Тип памяти: %s, кол-во памяти: %s, вес: %s",
                getRomType(), getMemorySize(), getWeightROM());
    }

    public ROMType getRomType() {
        return romType;
    }

    public void setRomType(ROMType romType) {
        this.romType = romType;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getWeightROM() {
        return weightROM;
    }

    public void setWeightROM(int weightROM) {
        this.weightROM = weightROM;
    }
}
