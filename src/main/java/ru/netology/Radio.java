package ru.netology;

public class Radio {
    private static String name;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;
    private boolean on;
    private int currentNumberRadioStation;
    private int maxNumberRadioStation;
    private int minNumberRadioStation;

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int increaseVolume(int currentVolume) {
        // System.out.println("Innerincrease: " + currentVolume);

        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
            // System.out.println("increase1: " + currentVolume);

        }
        if (currentVolume == 10) {
            return currentVolume;
            //  System.out.println("increase2: " + currentVolume);
        }

        return currentVolume;
    }

    public int decreaseVolume(int currentVolume) {
        // System.out.println("InnerDecrease: " + currentVolume);

        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
            //  System.out.println("Decrease1: " + currentVolume);

        }
        if (currentVolume == 0) {
            //  System.out.println("Decrease2: " + currentVolume);
            return currentVolume;
        }

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        int next = increaseVolume(currentVolume);
        //  System.out.println("Next " + next);

        if (next >= maxVolume) {
            this.currentVolume = next;
        }

        int prev = decreaseVolume(currentVolume);
        // System.out.println("Prev " + prev);

        if (prev <= minVolume) {
            this.currentVolume = prev;
        }

        // System.out.println("maxVolume " + maxVolume);
        // System.out.println("maxVolume " + minVolume);
        // здесь уверены, что все проверки прошли

    }

    public int getCurrentVolume(int currentVolume) {
        setCurrentVolume(currentVolume);
        return currentVolume;
    }

    //----------------------------------------------------------------------
    public int getMaxNumberRadioStation() {
        return maxNumberRadioStation;
    }

    public void setMaxNumberRadioStation(int maxNumberRadioStation) {
        this.maxNumberRadioStation = maxNumberRadioStation;
    }

    public int getMinNumberRadioStation(int currentNumberRadioStation) {
        return minNumberRadioStation;
    }

    public void setMinNumberRadioStation(int minNumberRadioStation) {
        this.minNumberRadioStation = minNumberRadioStation;
    }


    public int increaseNumberRadioStation(int currentNumberRadioStation) {

        // System.out.println("InnerIncreaseNumberRadioStation " + currentNumberRadioStation);

        if (currentNumberRadioStation < 9) {
            currentNumberRadioStation = currentNumberRadioStation + 1;
            // System.out.println("InnerIncreaseNumberRadioStation1 " + currentNumberRadioStation);
        }
        if (currentNumberRadioStation == 9) {
            currentNumberRadioStation = 0;
            //System.out.println("InnerIncreaseNumberRadioStation2 " + currentNumberRadioStation);
        }
        return currentNumberRadioStation;
    }

    public int decreaseNumberRadioStation(int currentNumberRadioStation) {
        System.out.println("InnerDecreaseNumberRadioStation " + currentNumberRadioStation);

        if (currentNumberRadioStation > 0) {
            currentNumberRadioStation = currentNumberRadioStation - 1;
            //  System.out.println("InnerDecreaseNumberRadioStation1 " + currentNumberRadioStation);
        }
        if (currentNumberRadioStation == 0) {
            currentNumberRadioStation = 9;
            // System.out.println("InnerDecreaseNumberRadioStation2 " + currentNumberRadioStation);
        }
        return currentNumberRadioStation;
    }

    public boolean isOn() {
        return on;
    }


}
