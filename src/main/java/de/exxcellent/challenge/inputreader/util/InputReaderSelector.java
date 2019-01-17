package de.exxcellent.challenge.inputreader.util;

import de.exxcellent.challenge.inputreader.api.InputReaderAPI;

// Util class which will return the interface implementation based on the file type
public class InputReaderSelector {
    public static InputReaderAPI getInputReader(String fileName){
        InputReaderAPI inputReader = null;
        String fileType = fileName.substring(fileName.indexOf(".")+1);
        if(fileType.equalsIgnoreCase("csv")){
            inputReader = new CSVReader(fileName);
        }
        return inputReader;
    }
}
