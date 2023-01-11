public class Keyboard {
    private String typeKeyboard; // Тип клавиатуры
    private boolean backlight; // Подсветка
    private int weightKeyboard; // Вес
    private String textKeyboard;

    public Keyboard(String typeKeyboard, boolean backlight, int weightKeyboard) {
        this.typeKeyboard = typeKeyboard;
        this.backlight = backlight;
        this.weightKeyboard = weightKeyboard;
    }
    public String toString() {
        return textKeyboard = String.format("Тип клавиатуры: %s, подсветка: %s, вес: %s",
                getTypeKeyboard(), getBacklight(), getWeightKeyboard());
    }

    public String getTypeKeyboard() {
        return typeKeyboard;
    }

    public void setTypeKeyboard(String typeKeyboard) {
        this.typeKeyboard = typeKeyboard;
    }

    public boolean getBacklight() {
        return backlight;
    }

    public void setBacklight(boolean backlight) {
        this.backlight = backlight;
    }

    public int getWeightKeyboard() {
        return weightKeyboard;
    }

    public void setWeightKeyboard(int weightKeyboard) {
        this.weightKeyboard = weightKeyboard;
    }
}
