package ru.netology.javaqa;


public class Radio {
    public int currentRadioStation; //радио
    public int currentVol; //громкость

    public int getNextStation() {
        return currentRadioStation;
    }

    public int getCurrentVol() {
        return currentVol;
    }

    public void setCurrentVol(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        currentVol = newVolume;
    }


    public void setNextStation(int newStation) {

        if (newStation < 0) {
            return;

        }
        if (newStation > 9) {
            return;
        }
        currentRadioStation = newStation;

    }

    public void next() {          //Переключение станции вперед
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {  //Переключение станции назад
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }

    public void volDown() {                // Увелечение громкости на 1
        if (currentVol > 0) {
            currentVol = currentVol - 1;
            setCurrentVol(currentVol);

        }
    }
    public void volUp() {              // Уменьшение громкости на 1
        if (currentVol < 100) {
            currentVol = currentVol + 1;
            setCurrentVol(currentVol);

        }
    }
}














