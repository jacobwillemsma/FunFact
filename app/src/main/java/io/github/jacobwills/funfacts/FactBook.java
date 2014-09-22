package io.github.jacobwills.funfacts;

import java.util.Random;

public class FactBook {

    // Members
    private int mFactArray[] = {R.string.fact1, R.string.fact2, R.string.fact3, R.string.fact4, R.string.fact5, R.string.fact6, R.string.fact7, R.string.fact8, R.string.fact9, R.string.fact10,};

    // Methods
    public int getFact() {
        Random randomGenerator = new Random();
        int result = randomGenerator.nextInt(mFactArray.length);

        return mFactArray[result];
    }
}
