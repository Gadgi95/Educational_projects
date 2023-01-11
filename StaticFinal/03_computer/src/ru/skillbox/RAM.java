public class RAM {
    private RAMType ramType; // Тип ОЗУ
    private int volume; //Объем ОЗУ
    private int weightRAM; // Вес
    private String textRAM;

    public RAM(RAMType ramType, int volume, int weightRAM) {
        this.ramType = ramType;
        this.volume = volume;
        this.weightRAM = weightRAM;
    }

    public String toString() {
        return textRAM = String.format("Тип памяти: %s, объем в Mb: %s, вес: %s",
                getRamType(), getVolume(), getWeightRAM());
    }

    public RAMType getRamType() {
        return ramType;
    }

    public void setRamType(RAMType ramType) {
        this.ramType = ramType;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getWeightRAM() {
        return weightRAM;
    }

    public void setWeightRAM(int weightRAM) {
        this.weightRAM = weightRAM;
    }
}
