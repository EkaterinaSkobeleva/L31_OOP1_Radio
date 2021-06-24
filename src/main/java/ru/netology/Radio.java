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

    public void setCurrentVolume(int volume) {
        this.currentVolume = volume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getMaxNumberRadioStation() {
        return maxNumberRadioStation;
    }

    public void setMaxNumberRadioStation(int maxNumberRadioStation) {
        this.maxNumberRadioStation = maxNumberRadioStation;
    }

    public int getMinNumberRadioStation() {
        return minNumberRadioStation;
    }

    public void setMinNumberRadioStation(int minNumberRadioStation) {
        this.minNumberRadioStation = minNumberRadioStation;
    }

    public int getCurrentNumberRadioStation() {
        return currentNumberRadioStation;
    }

    public void setCurrentNumberRadioStation(int numberRadioStation) {
        this.currentNumberRadioStation = numberRadioStation;
    }

    public void increaseNumberRadioStation() {

        if (currentNumberRadioStation < maxNumberRadioStation) {
            currentNumberRadioStation = currentNumberRadioStation + 1;
        }
        if (currentNumberRadioStation == maxNumberRadioStation) {
            currentNumberRadioStation = minNumberRadioStation;
        }
    }

    public void decreaseNumberRadioStation() {
        if (currentNumberRadioStation > minNumberRadioStation) {
            currentNumberRadioStation = currentNumberRadioStation - 1;
        }
        if (currentNumberRadioStation == minNumberRadioStation) {
            currentNumberRadioStation = maxNumberRadioStation;
        }
    }

    public boolean isOn() {
        return on;
    }
}
