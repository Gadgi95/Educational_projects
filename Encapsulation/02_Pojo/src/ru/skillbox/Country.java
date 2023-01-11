public class Country {
    private String nameCountry;
    private int populationSize;
    private int area;
    private String capital;
    private boolean accessToTheSea;

    public Country(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public int getPopulationSize() {
        return populationSize;
    }

    public void setPopulationSize(int populationSize) {
        this.populationSize = populationSize;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public boolean getAccessToTheSea() {
        return accessToTheSea;
    }

    public void setAccessToTheSea(boolean accessToTheSea) {
        this.accessToTheSea = accessToTheSea;
    }
}
