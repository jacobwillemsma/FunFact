package io.github.jacobwills.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by jacob on 9/21/14.
 */
public class ColorWheel {
    private String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    public int getColor() {
        Random randomGenerator = new Random();
        int result = randomGenerator.nextInt(mColors.length);
        int colorAsInt = Color.parseColor(mColors[result]);
        return colorAsInt;
    }
}
