package ru.netology;

import org.junit.jupiter.api.Disabled;
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

        assertEquals(null, Radio.getName());
        assertEquals(0, radio.getMaxNumberRadioStation());
        assertEquals(0, radio.getMinNumberRadioStation());
        assertEquals(0, radio.getCurrentNumberRadioStation());
        assertEquals(0, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(0, radio.getCurrentVolume());
        assertFalse(radio.isOn());
    }

    //проверка возврата к предельной радиостанции, если достигли минимума
    @Test
    public void shouldChangeNumberRadioStationBelowMin() {
        Radio radio = new Radio();
        int expected = 9; //должны вернуться на 9
        int currentNumberRadioStation = 0; //дошли до 0

        radio.setMaxNumberRadioStation(9);
        radio.setMinNumberRadioStation(0);
        radio.setCurrentNumberRadioStation(currentNumberRadioStation);
        radio.decreaseNumberRadioStation();

        assertEquals(expected, radio.getCurrentNumberRadioStation());
    }

    //проверка возврата к начальной радиостанции, если достигли максимума
    @Test
    public void shouldChangeNumberRadioStationAboveMax() {
        Radio radio = new Radio();
        int expected = 0; // должны вернуться на 0
        int currentNumberRadioStation = 9;//дошли до 9

        radio.setMaxNumberRadioStation(9);
        radio.setMinNumberRadioStation(0);
        radio.setCurrentNumberRadioStation(currentNumberRadioStation);
        radio.increaseNumberRadioStation();

        assertEquals(expected, radio.getCurrentNumberRadioStation());
    }

    //проверка увеличения номера радиостанции
    @Test
    public void shouldIncreaseNumberRadioStation() {
        Radio radio = new Radio();
        int expected = 8;
        int numberRadioStation = 7;

        radio.setMaxNumberRadioStation(9);
        radio.setMinNumberRadioStation(0);
        radio.setCurrentNumberRadioStation(numberRadioStation);
        radio.increaseNumberRadioStation();

        assertEquals(expected, radio.getCurrentNumberRadioStation());
    }

    //проверка уменьшения номера радиостанции
    @Test
    public void shouldDecreaseNumberRadioStation() {
        Radio radio = new Radio();
        int expected = 7;
        int currentNumberRadioStation = 8;

        radio.setMaxNumberRadioStation(9);
        radio.setMinNumberRadioStation(0);
        radio.setCurrentNumberRadioStation(currentNumberRadioStation);
        radio.decreaseNumberRadioStation();

        assertEquals(expected, radio.getCurrentNumberRadioStation());
    }

    //проверка превышения предельного значения громкости
    @Test
    public void shouldChangeVolumeAboveMax() {
        Radio radio = new Radio();
        int volume = 10;
        int expected = 10;

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(volume);
        radio.increaseVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }

    //проверка понижения громкости ниже возможного
    @Test
    public void shouldChangeVolumeBelowMin() {
        Radio radio = new Radio();

        int volume = 0;
        int expected = 0;

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(volume);
        radio.decreaseVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }

    //проверка увеличения громкости
    @Test
    public void shouldChangeIncreaseVolume() {
        Radio radio = new Radio();
        int volume = 5;
        int expected = 6;

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(volume);
        radio.increaseVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }

    //проверка уменьшения громкости
    @Test
    public void shouldChangeDecreaseVolume() {
        Radio radio = new Radio();
        int volume = 9;
        int expected = 8;

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(volume);
        radio.decreaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }
}