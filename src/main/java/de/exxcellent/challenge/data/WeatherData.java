package de.exxcellent.challenge.data;

//Object to store weather data

public class WeatherData {
    private String dayNumber;
    private int minTemp;
    private int maxTemp;
    private int tempDiff;

    public String getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(String dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public int getTempDiff() {
        return tempDiff;
    }

    public void setTempDiff(int tempDiff) {
        this.tempDiff = tempDiff;
    }

    @Override
    public String toString() {
        return "Day:"+dayNumber+":Min:"+minTemp+":Max:"+maxTemp+":Diff:"+tempDiff;
    }
}
