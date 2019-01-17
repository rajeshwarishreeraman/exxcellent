package de.exxcellent.challenge.inputreader.util;

import de.exxcellent.challenge.data.FootballData;
import de.exxcellent.challenge.data.WeatherData;
import de.exxcellent.challenge.inputreader.api.InputReaderAPI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

//Implementation of the InputReaderAPI to read data from CSV files
public class CSVReader implements InputReaderAPI {
    private String fileName;
    public CSVReader(String fileName){
        this.fileName = fileName;
    }
    @Override
    public List<WeatherData> readAndConstructWeatherData() {
        List<WeatherData> weatherDataList = new ArrayList<>();
        int dayColumnNumber = 0, minColumnNumber = 0, maxColumnNumber = 0;
        BufferedReader br = null;
        try {
             ClassLoader classLoader = this.getClass().getClassLoader();
             File file = new File(classLoader.getResource(fileName).getFile());
             br = new BufferedReader(new FileReader(file));
             String line;
             String firstLine = br.readLine();
             String[] columnNames = firstLine.split(",");
             for(int i=0; i < columnNames.length; i++){
                 if(columnNames[i].equalsIgnoreCase("Day")){
                    dayColumnNumber = i;
                 }
                 else if(columnNames[i].equalsIgnoreCase("MxT")){
                     maxColumnNumber = i;
                 }
                 if(columnNames[i].equalsIgnoreCase("MnT")){
                     minColumnNumber = i;
                 }
             }
             while((line = br.readLine()) != null){
                 String[] columnValues = line.split(",");
                 WeatherData weatherData = new WeatherData();
                 int minTemp = Integer.parseInt(columnValues[minColumnNumber]);
                 int maxTemp = Integer.parseInt(columnValues[maxColumnNumber]);
                 weatherData.setDayNumber(columnValues[dayColumnNumber]);
                 weatherData.setMinTemp(minTemp);
                 weatherData.setMaxTemp(maxTemp);
                 weatherData.setTempDiff(maxTemp-minTemp);
                 weatherDataList.add(weatherData);
             }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return weatherDataList;
    }

    @Override
    public List<FootballData> readAndConstructFootballData() {
        List<FootballData> footballDataList = new ArrayList<>();
        int teamNameColumnNumber = 0, goalsColumnNumber = 0, goalsAllowedColumnNumber = 0;
        BufferedReader br = null;
        try {
            ClassLoader classLoader = this.getClass().getClassLoader();
            File file = new File(classLoader.getResource(fileName).getFile());
            br = new BufferedReader(new FileReader(file));
            String line;
            String firstLine = br.readLine();
            String[] columnNames = firstLine.split(",");
            for(int i=0; i < columnNames.length; i++){
                if(columnNames[i].equalsIgnoreCase("Team")){
                    teamNameColumnNumber = i;
                }
                else if(columnNames[i].equalsIgnoreCase("Goals")){
                    goalsColumnNumber = i;
                }
                if(columnNames[i].equalsIgnoreCase("Goals Allowed")){
                    goalsAllowedColumnNumber = i;
                }
            }
            while((line = br.readLine()) != null){
                String[] columnValues = line.split(",");
                FootballData footballData = new FootballData();
                int goals = Integer.parseInt(columnValues[goalsColumnNumber]);
                int goalsAllowed = Integer.parseInt(columnValues[goalsAllowedColumnNumber]);
               footballData.setTeamName(columnValues[teamNameColumnNumber]);
               footballData.setGoals(goals);
               footballData.setGoals(goalsAllowed);
               footballData.setDiffInGoals(Math.abs(goals-goalsAllowed));
               footballDataList.add(footballData);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return footballDataList;
    }
}
