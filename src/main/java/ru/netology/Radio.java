package ru.netology;

public class Radio {
    private String name;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;
    private boolean on;
    private int currentNumberRadioStation;
    private int maxNumberRadioStation;
    private int minNumberRadioStation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxValue) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minValue) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        // здесь уверены, что все проверки прошли
        this.currentVolume = currentVolume;
    }

    public void increaseVolume(int currentVolume) {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 10) {
            return;
        }
    }

    public void decreaseVolume(int currentVolume) {
        if (currentVolume>0){
            currentVolume = currentVolume - 1;
        }
        if (currentVolume==0){
            return;
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

    public void setCurrentNumberRadioStation(int currentNumberRadioStation) {
        if (currentNumberRadioStation <= maxNumberRadioStation) {
            return;
        }
        if (currentNumberRadioStation >= minNumberRadioStation) {
            return;
        }
        this.currentNumberRadioStation = currentNumberRadioStation;
    }

    public void increaseNumberRadioStation(int currentNumberRadioStation) {
        if (currentNumberRadioStation < 9) {
            currentNumberRadioStation = currentNumberRadioStation+1;
        }
        if (currentNumberRadioStation == 9) {
            return;
        }
    }

    public void decreaseNumberRadioStation(int currentNumberRadioStation) {
        if (currentNumberRadioStation > 0) {
            currentNumberRadioStation = currentNumberRadioStation - 1;
        }
        if (currentNumberRadioStation == 0) {
            return;
        }
    }
    public boolean isOn() {
        return on;
    }


}
