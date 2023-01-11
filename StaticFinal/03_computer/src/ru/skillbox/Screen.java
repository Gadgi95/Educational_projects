public class Screen {
    private double diagonal; // Диагональ экрана
    private MatrixType matrixType; // Тип матрицы (ips, tn, va)
    private int weightScreen; // Вес
    private String textScreen;

    public Screen(double diagonal, MatrixType matrixType, int weightScreen) {
        this.diagonal = diagonal;
        this.matrixType = matrixType;
        this.weightScreen = weightScreen;
    }
    public String toString() {
        return textScreen = String.format("Диагональ: %s, тип матрицы: %s, вес: %s",
                getDiagonal(), getMatrixType(), getWeightScreen());
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public MatrixType getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(MatrixType matrixType) {
        this.matrixType = matrixType;
    }

    public int getWeightScreen() {
        return weightScreen;
    }

    public void setWeightScreen(int weightScreen) {
        this.weightScreen = weightScreen;
    }

}
