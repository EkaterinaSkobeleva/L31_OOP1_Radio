package ru.netology;

public class Radio {
    private String name;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;
    private boolean on;
    private int numberRadioStation;

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
        this.minVolume = minValue;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentValue) {
        if (currentValue > maxVolume) {
            return;
        }
        if (currentValue < minVolume) {
            return;
        }
        // здесь уверены, что все проверки прошли
        this.currentVolume = currentVolume;
    }

//    public void setCurrentTemperature(int currentTemperature) {
//        if (currentTemperature <= maxTemperature) {
//            if (currentTemperature >= minTemperature) {
//                this.currentTemperature = currentTemperature;
//            }
//        }
//    }

    public boolean isOn() {
        return on;
    }


}
