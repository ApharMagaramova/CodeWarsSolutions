package kyu5;

/**
 * 5 kyu
 * <a href="https://www.codewars.com/kata/513e08acc600c94f01000001/java">RgbToHex</a>
 * <p>
 * * Details:
 * The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal representation being returned.
 * Valid decimal values for RGB are 0 - 255. Any values that fall out of that range must be rounded to the closest valid value.
 */

public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        String red = "";
        String green = "";
        String blue = "";

        if (r >= 0 && r <= 255) {
            red = (Integer.toHexString(r).length() < 2) ? ("0" + Integer.toHexString(r)) : (Integer.toHexString(r));
        } else if (r < 0) {
            red = "00";
        } else {
            red = "FF";
        }

        if (g >= 0 && g <= 255) {
            green = (Integer.toHexString(g).length() < 2) ? ("0" + Integer.toHexString(g)) : (Integer.toHexString(g));
        } else if (g < 0) {
            green = "00";
        } else {
            green = "FF";
        }

        if (b >= 0 && b <= 255) {
            blue = (Integer.toHexString(b).length() < 2) ? ("0" + Integer.toHexString(b)) : (Integer.toHexString(b));
        } else if (b < 0) {
            blue = "00";
        } else {
            blue = "FF";
        }
        return red.toUpperCase() + green.toUpperCase() + blue.toUpperCase();
    }
}
