package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    // вкл Максимальной  станции
    public void currentStationMax() {
        Radio radio = new Radio(10);

        radio.next();

        int expected = 9;
        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    // вкл Максимальной  станции
    public void currentStationMin() {
        Radio radio = new Radio(0);

        radio.prev();

        int expected = 0;
        int actual = radio.getMinStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //клиент должен иметь возможность увеличивать и уменьшать
    //уровень громкости звука в пределах от 0 до 100;

    public void currentVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVol(6);

        radio.volumeUp();

        int expected = 7;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    //клиент должен иметь возможность увеличивать и уменьшать уровень
    // громкости звука в пределах от 0 до 100;
    public void currentVolDown() {
        Radio radio = new Radio();
        radio.setCurrentVol(67);

        radio.vulumeDown();

        int expected = 66;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // Максимальная громкость
    public void currentVolMax() {
        Radio radio = new Radio();
        radio.setCurrentVol(100);

        radio.volumeUp();

        int expected = 100;
        int actual = radio.getMaxVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // Минимальная громкость
    public void currentVolMin() {
        Radio radio = new Radio();
        radio.setCurrentVol(0);

        radio.vulumeDown();

        int expected = 0;
        int actual = radio.getMinVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetStationLessMin() {
        Radio radio = new Radio(-1);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetStationLessMax() {
        Radio radio = new Radio(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //если уровень громкости звука достиг минимального значения,
    // то дальнейшее нажатие на - не должно ни к чему приводить.

    public void shouldVolDownMin() {
        Radio radio = new Radio();
        radio.setCurrentVol(-1);

        radio.vulumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    // если уровень громкости звука достиг максимального значения,
    // то дальнейшее нажатие на + не должно ни к чему приводить;
    @Test
    public void shouldVolUpMax() {
        Radio radio = new Radio();
        radio.setCurrentVol(101);

        radio.volumeUp();


        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
//Если текущая радиостанция — максимальная, и клиент нажал на кнопку next на пульте,
// то текущей должна стать нулевая.
    public void nextStation() {
        Radio radio = new Radio(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
//Если текущая радиостанция — 0, и клиент нажал на кнопку prev на пульте,
// то текущей должна стать максимальная.
    public void prevStation() {
        Radio radio = new Radio(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void currentStationNext() {
        Radio radio = new Radio(7);

        radio.next();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationPrew() {
        Radio radio = new Radio(4);

        radio.prev();

        int expected = 3;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);


    }
}





















