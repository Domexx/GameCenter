package to.ares.gamecenter.util;

import java.util.Random;

public class RandomInteger {

    public static int getRandom(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static int getRandomNumber(int min, int max) {
        Random ran = new Random();
        if(min < 0) {
            min *= -1;
            return ((int) (ran.nextDouble() * (max + min))) - min;
        }

        max += 1;

        return (min + (int) (ran.nextDouble() * (max - min))) % max;
    }
}
