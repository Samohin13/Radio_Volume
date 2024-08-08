package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
//следующая станция
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
// предыдущая станция
    public void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);

        radio.prev();

        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    // текущая станция
    public void currentStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(7);

        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // переключение станции вперед

    public void currentStationNext() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.next();

        Assertions.assertEquals(0, radio.getCurrentRadioStation());

    }

    @Test
    // переключение станции назад

    public void currentStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prev();

        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    // Увеличение звука
    public void volumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(67);

        radio.volumeUp();

        Assertions.assertEquals(68, radio.getCurrentVolume());
    }

    @Test
    // Уменьшение звука
    public void volumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(53);

        radio.volumeDown();

        Assertions.assertEquals(52, radio.getCurrentVolume());

    }

    @Test
    // Максимум
    public void volumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.volumeUp();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    // Меньше минимума
    public void volumeDownMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.volumeDown();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    // Больше максимума
    public void volumeUpMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.volumeUp();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        radio.volumeUp();

        Assertions.assertEquals(1, radio.getCurrentVolume());
    }


    @Test
    // Текущая станция ниже нуля
    public void currentRadioStationBelowZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void currentRadioStationAboveNumberStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void currentStationNumber() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(15);
        Assertions.assertEquals(15, radio.getCurrentRadioStation());
    }

    @Test
    public void prevNumberStation() {
        Radio radio = new Radio(20);
        radio.prev();
        Assertions.assertEquals(19, radio.getCurrentRadioStation());
    }

    @Test
    public void currentPrevStation() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(1);
        radio.prev();
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void nextNumberStation() {
        Radio radio = new Radio(20);
        radio.next();
        Assertions.assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void currentNextStation() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(0);
        radio.next();
        Assertions.assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void nextCurrentStation() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(16);
        radio.next();
        Assertions.assertEquals(17, radio.getCurrentRadioStation());
    }

    @Test
    public void setCurrentStationNumber() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(1);
        Assertions.assertEquals(1, radio.getCurrentRadioStation());
    }
}


