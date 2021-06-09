package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldCreate() {
        Radio radio = new Radio();
    }

    @Test
    public void shouldInitFieldToZeroValues() {
        Radio radio = new Radio();
        int currentNumberRadioStation = 0; //дошли до 0
        int currentVolume = 0;
        int maxNumberRadioStation = 9;
        int minNumberRadioStation = 0;

        assertEquals(null, Radio.getName());
        assertEquals(0, radio.getMaxNumberRadioStation());
        assertEquals(0, radio.getMinNumberRadioStation(currentNumberRadioStation));
        // assertEquals(0, radio.getCurrentNumberRadioStation(currentNumberRadioStation));
        assertEquals(0, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(0, radio.getCurrentVolume(currentVolume));
        assertFalse(radio.isOn());
    }

    //проверка возврата к предельной радиостанции, если достигли минимума
    @Test
    public void shouldChangeNumberRadioStationBelowMin() {
        Radio radio = new Radio();
        int expected = 9; //должны вернуться на 9
        int currentNumberRadioStation = 0; //дошли до 0
        int maxNumberRadioStation = 9;
        int minNumberRadioStation = 0;

        radio.setMaxNumberRadioStation(maxNumberRadioStation);
        radio.setMinNumberRadioStation(minNumberRadioStation);

        assertEquals(expected, radio.decreaseNumberRadioStation(currentNumberRadioStation));
    }

    //проверка возврата к начальной радиостанции, если достигли максимума
    @Test
    public void shouldChangeNumberRadioStationAboveMax() {
        Radio radio = new Radio();
        int expected = 0; // должны вернуться на 0
        int currentNumberRadioStation = 9;//дошли до 9
        int maxNumberRadioStation = 9;
        int minNumberRadioStation = 0;

        radio.setMaxNumberRadioStation(maxNumberRadioStation);
        radio.setMinNumberRadioStation(minNumberRadioStation);

        assertEquals(expected, radio.increaseNumberRadioStation(currentNumberRadioStation));
    }

    //проверка увеличения номера радиостанции
    @Test
    public void shouldIncreaseNumberRadioStation() {
        Radio radio = new Radio();
        int expected = 6;
        int currentNumberRadioStation = 5;
        int maxNumberRadioStation = 9;
        int minNumberRadioStation = 0;

        radio.setMaxNumberRadioStation(maxNumberRadioStation);
        radio.setMinNumberRadioStation(minNumberRadioStation);

        assertEquals(expected, radio.increaseNumberRadioStation(currentNumberRadioStation));
    }

    //проверка уменьшения номера радиостанции
    @Test
    public void shouldDecreaseNumberRadioStation() {
        Radio radio = new Radio();
        int expected = 7;
        int currentNumberRadioStation = 8;
        int maxNumberRadioStation = 9;
        int minNumberRadioStation = 0;

        radio.setMaxNumberRadioStation(maxNumberRadioStation);
        radio.setMinNumberRadioStation(minNumberRadioStation);

        assertEquals(expected, radio.decreaseNumberRadioStation(currentNumberRadioStation));
    }

    //проверка превыщения предельного значения громкости
    @Test
    public void shouldChangeVolumeAboveMax() {
        Radio radio = new Radio();
        int currentVolume = 10; //10
        int maxVolume = 10;
        int minVolume = 0;
        int expected = 10;

        radio.setMaxVolume(maxVolume);
        radio.setMinVolume(minVolume);

        radio.increaseVolume(currentVolume);

        assertEquals(expected, radio.getCurrentVolume(currentVolume));
    }

    //проверка понижения громкости ниже возможного
    @Test
    public void shouldChangeVolumeBelowMin() {
        Radio radio = new Radio();

        int currentVolume = 0; //10
        int maxVolume = 10;
        int minVolume = 0;
        int expected = 0;

        radio.setMaxVolume(maxVolume);
        radio.setMinVolume(minVolume);

        radio.decreaseVolume(currentVolume);

        assertEquals(expected, radio.getCurrentVolume(currentVolume));
    }

    //проверка увеличения громкости
    @Test
    public void shouldChangeIncreaseVolume() {
        Radio radio = new Radio();
        int currentVolume = 7; //10
        int maxVolume = 10;
        int minVolume = 0;
        int expected = 8;

        radio.setMaxVolume(maxVolume);
        radio.setMinVolume(minVolume);

        assertEquals(expected, radio.increaseVolume(currentVolume));
    }

    //проверка уменьшения громкости
    @Test
    public void shouldChangeDecreaseVolume() {
        Radio radio = new Radio();
        int currentVolume = 7;
        int maxVolume = 10;
        int minVolume = 0;
        int expected = 6;

        radio.setMaxVolume(maxVolume);
        radio.setMinVolume(minVolume);

        assertEquals(expected, radio.decreaseVolume(currentVolume));
    }
}