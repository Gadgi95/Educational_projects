import java.util.Arrays;

public class Hospital {

    public static void main(String[] args) {
        System.out.println(getReport(generatePatientsTemperatures(20)));
    }

    public static float[] generatePatientsTemperatures(int patientsCount) {

        float[] patientTemp = new float[patientsCount];
        for (int i = 0; i < patientsCount; i++) {
            patientTemp[i] = (float) ((Math.random() * Math.round((39 - 33) + 1)) + 33);
        }
        return patientTemp;
    }

    public static String getReport(float[] temperatureData) {

        float countHealthy = 0;
        float sumTemperature = 0;
        int countTemperature = 0;
        for (float temperature: temperatureData)
        {
            sumTemperature += temperature;
            countTemperature++;
            if (temperature > 36.1 && temperature < 37.0)
            {
                countHealthy++;
            }
        }
        float averageTemperature = sumTemperature / countTemperature;
        String averageTemperatureString = String.format("%.2f", averageTemperature);

        String temperatureDataStringFormatted = Arrays.toString(temperatureData).
            replaceAll("[\\[\\],+]", "");

        String report =
            "Температуры пациентов: " + temperatureDataStringFormatted +
                "\nСредняя температура: " + averageTemperatureString +
                "\nКоличество здоровых: " + (int) countHealthy;

        return report;
    }
}