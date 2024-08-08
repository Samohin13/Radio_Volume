package ru.netology.javaqa;


public class Radio {

    //радио
    private int currentRadioStation;
    // колличество станций
    private int numberStation;
    //громкость
    private int currentVolume;
    // радио тест с 20 станциями
    private int testСurrentRadio;


    //коструктор с параметром
    public Radio(int numberStation) {
        this.numberStation = numberStation;
        this.currentRadioStation = 0;
    }

    //конструктор
    public Radio() {
        this(10);
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
        if (currentRadioStation == numberStation - 1) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
    }

    public void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = numberStation - 1;
        } else {
            currentRadioStation--;
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