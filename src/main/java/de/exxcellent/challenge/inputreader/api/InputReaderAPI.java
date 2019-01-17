package de.exxcellent.challenge.inputreader.api;

import de.exxcellent.challenge.data.FootballData;
import de.exxcellent.challenge.data.WeatherData;

import java.util.List;

//Interface which can be implemented to read data from different file formats
public interface InputReaderAPI {
   List<WeatherData> readAndConstructWeatherData();
   List<FootballData> readAndConstructFootballData();
}
