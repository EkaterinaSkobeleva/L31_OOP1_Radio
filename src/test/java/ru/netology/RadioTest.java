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
        assertNull(Radio.name);
        assertEquals(0, radio.maxNumberRadioStation);
        assertEquals(0, radio.minNumberRadioStation);
        assertEquals(0, radio.currentNumberRadioStation);
        assertFalse(radio.On);
    }

    @Test
    public void shouldChangeFields() {
        Radio radio = new Radio();
        assertEquals(0, radio.currentNumberRadioStation);
        radio.currentNumberRadioStation = -100;
        assertEquals(-100, radio.currentNumberRadioStation);
    }

}