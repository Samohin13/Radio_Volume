package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.PublicKey;


public class RadioTest {

    @Test

    public void shouldSetStationLessMin() {
        Radio radio = new Radio();

        radio.setNextStation(-1);

        int expectedStation = 0;
        int actualStation = radio.getNextStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test


    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setNextStation(9);

        int expectedStation = 9;
        int actualStation = radio.getNextStation();

        Assertions.assertEquals(expectedStation, actualStation);

    }


    @Test

    // Проверка на 10 станцию

    public void shouldNotSetStation() {
        Radio radio = new Radio();

        radio.setNextStation(10);

        int expectedStation = 0;
        int actualStation = radio.getNextStation();

        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test

    // переключаем на след станцию

    public void shouldNextStation() {
        Radio radio = new Radio();
        radio.setNextStation(9);

        radio.next();

        int expectedStation = 0;
        int actualStation = radio.getNextStation();

        Assertions.assertEquals(expectedStation, actualStation);

    }

    @Test

    public void next (){
        Radio radio = new Radio();
        radio.setNextStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getNextStation();

        Assertions.assertEquals(expected,actual);

    }

    @Test

    public void prev (){
        Radio radio = new Radio();
        radio.setNextStation(7);

        radio.prev();

        int expected = 6;
        int actual = radio.getNextStation();

        Assertions.assertEquals(expected,actual);


    }


    @Test

    // включает предыдущую станцию

    public void shouldPrevStation() {
        Radio radio = new Radio();
        radio.setNextStation(0);

        radio.prev();

        int expectedStation = 9;
        int actualStation = radio.getNextStation();

        Assertions.assertEquals(expectedStation, actualStation);

    }

    @Test
    public void shouldVolDown() {   // Уменьшение  громкости на 1
        Radio radio = new Radio();
        radio.setCurrentVol(1);

        radio.volDown();

        int expected = 0;
        int actual = radio.getCurrentVol();
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldVolUp() {  // Увелечение громкости на 1
        Radio radio = new Radio();
        radio.setCurrentVol(0);

        radio.volUp();

        int expected = 1;
        int actual = radio.getCurrentVol();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolUpMax() {   // Увелечение громкости выше Max
        Radio radio = new Radio();
        radio.setCurrentVol(101);

        radio.volUp();

        int expected = 1;
        int actual = radio.getCurrentVol();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldVolDownMin() {   // Уменьщение громкости ниже Min
        Radio radio = new Radio();
        radio.setCurrentVol(-1);

        radio.volDown();

        int expected = 0;
        int actual = radio.getCurrentVol();
        Assertions.assertEquals(expected, actual);

    }


}





