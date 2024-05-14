/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public enum Color {
    WHITE, YELLOW, ORANGE, GREEN, BLUE, PURPLE, PINK, RED, BROWN, NO_COLOR;
    
    public static Color getColor(String color) {
        try {
            if (color.equalsIgnoreCase("no color")) {
                return NO_COLOR;
            }
            return Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    static Color inputColor(String color_) {
        String color = Input.getString(color_);
        return getColor(color);
    }

    
}