
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public enum Car {
    AUDI, MERCEDES, BMW;

    static Car inputCar(String message) {
        String car = Input.getString(message);
        return getCar(car);
    }

    // Method to get a list of prices for a car
    public List<Integer> getPrices() {
        switch (this) {
            case AUDI:
                return Arrays.asList(5500, 3000, 4500);
            case MERCEDES:
                return Arrays.asList(5000, 6000, 8500);
            case BMW:
                return Arrays.asList(2500, 3000, 3500);
            default:
                return Collections.emptyList();
        }
    }

    // Method to get a list of available colors for a car
    public List<Color> getColors() {
        switch (this) {
            case AUDI:
                return Arrays.asList(Color.WHITE, Color.YELLOW, Color.ORANGE);
            case MERCEDES:
                return Arrays.asList(Color.GREEN, Color.BLUE, Color.PURPLE);
            case BMW:
                return Arrays.asList(Color.PINK, Color.RED, Color.BROWN);
            default:
                return Collections.emptyList();
        }
    }

    // Method to get a list of days on which the car is sold
    public List<Day> getDaySells() {
        switch (this) {
            case AUDI:
                return Arrays.asList(Day.FRIDAY, Day.SUNDAY, Day.MONDAY);
            case MERCEDES:
                return Arrays.asList(Day.TUESDAY, Day.SATURDAY, Day.WEDNESDAY);
            case BMW:
                return Arrays.asList(Day.MONDAY, Day.SUNDAY, Day.THURSDAY);
            default:
                return Collections.emptyList();
        }
    }
    
    public static Car getCar(String car) {
        try {
            return Car.valueOf(car.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
    
}
