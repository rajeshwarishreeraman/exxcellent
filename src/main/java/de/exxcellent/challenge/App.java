package de.exxcellent.challenge;

import de.exxcellent.challenge.inputreader.util.DataProcessor;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        // Your preparation code …

        // Your preparation code …
        //System.out.printf("Day with smallest temperature spread : %s%n", args[1]);
        if(args[0].contains("weather")) {
            String dayWithSmallestTempSpread = DataProcessor.findMinTempSpread(args[1]);
            //String dayWithSmallestTempSpread = "Someday";     // Your day analysis function call …
            System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
        }

        //String teamWithSmallestGoalSpread = "A good team"; // Your goal analysis function call …
        if(args[0].contains("football")) {
            String teamWithSmallestGoalSpread = DataProcessor.findMinGoalDiff(args[1]);
            System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
        }
    }
}
