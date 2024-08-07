package ru.netology.javaqa;


public class Radio {

    //радио
    private int currentRadioStation;
    // колличество станций
    private int numberStation;
    //громкость
    private int currentVolume;


    //коструктор с параметром
    public Radio(int numberStation) {
        this.numberStation = numberStation;
        this.currentRadioStation = 0;
    }

    //конструктор
    public Radio() {
        this(20);
    }

    // Получить текущую станцию
    public int getCurrentRadioStation() {
        return currentRadioStation;

    }

    // Получить текущую громкость
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation >= 0 && currentRadioStation < numberStation) {
            this.currentRadioStation = currentRadioStation;
        }
    }

    // Переключение на следующую станцию
    public void next() {
        if (currentRadioStation < 9) {
            currentRadioStation = (currentRadioStation + 1);
        } else {
            currentRadioStation = currentRadioStation;
        }
    }

    // Переключение на предыдущую станцию
    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = currentRadioStation;
        }
    }

    //Увелечение громкости
    public void volumeUp() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    // Уменьшение громкости
    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }

}