package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void currentStationMax() {   // вкл Максимальной  станции
        Radio radio = new Radio(9);

        radio.next();

        int expected = 9;
        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationMin() { // вкл Минимальной станции
        Radio radio = new Radio(0);

        radio.prev();

        int expected = 0;
        int actual = radio.getMinStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void currentStation() {
        Radio radio = new Radio();

        radio.setMaxStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void currentStationNext() {
        Radio radio = new Radio();
        radio.setMaxStation(7);

        radio.next();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void currentStationNextHigher() {
        Radio radio = new Radio();
        radio.setMaxStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void currentStationPrev() {
        Radio radio = new Radio();
        radio.setMinStation(9);

        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setCurrentVolumeUp() {
        Radio radio = new Radio();

        radio.setMaxVolume(100);

        int expected = 100;
        int actual = radio.getMaxVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeDown() {
        Radio radio = new Radio();

        radio.setMinVolume(0);

        int expected = 0;
        int actual = radio.getMinVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolMax() {
        Radio radio = new Radio();

        radio.setMaxVolume(100);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolMin() {
        Radio radio = new Radio();

        radio.setMinVolume(0);

        int expected = 100;
        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationPrevUnder() {
        Radio radio = new Radio();

        radio.setMinStation(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void setMinVol() {
        Radio radio = new Radio();

        radio.setMinVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setMaxVol() {
        Radio radio = new Radio();

        radio.setMaxStation(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void currentPrev() {
        Radio radio = new Radio();
        radio.setMaxStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeUp() {
        Radio radio = new Radio();


        radio.setMaxVolume(100);


        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void VolumeDown() {
        Radio radio = new Radio();

        radio.setMinVolume(0);


        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeUp() {
        Radio radio = new Radio();
        radio.setMinVolume(68);

        int expected = 69;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);



    }


}








