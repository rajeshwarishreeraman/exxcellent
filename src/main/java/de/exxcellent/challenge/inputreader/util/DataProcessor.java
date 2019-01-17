package de.exxcellent.challenge.inputreader.util;

import de.exxcellent.challenge.data.FootballData;
import de.exxcellent.challenge.data.WeatherData;
import de.exxcellent.challenge.inputreader.api.InputReaderAPI;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DataProcessor {
    public static String findMinTempSpread(String fileName){
        InputReaderAPI inputReader = InputReaderSelector.getInputReader(fileName);
        List<WeatherData> weatherDataList = inputReader.readAndConstructWeatherData();
        WeatherData minTempDiff = Collections.min(weatherDataList, Comparator.comparing(wd -> wd.getTempDiff()));
        return minTempDiff.getDayNumber();
    }

    public static String findMinGoalDiff(String fileName){
        InputReaderAPI inputReader = InputReaderSelector.getInputReader(fileName);
        List<FootballData> footballList = inputReader.readAndConstructFootballData();
        FootballData minDiffData = Collections.min(footballList, Comparator.comparing(wd -> wd.getDiffInGoals()));
        return minDiffData.getTeamName();
    }


}
