
package ru.netology.javaqa;


public class Radio {

    //станции
    private int maxStation = 9;
    private int minStation = 0;
    //радио
    private int currentRadioStation;
    //громкость
    private int currentVolume;
    //звук
    private int maxVolume = 100;
    private int minVolume = 0;

    //коструктор
    public Radio(int size) {
        currentRadioStation = currentRadioStation + size;
    }

    //конструктор
    public Radio() {
        this((10));
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return currentVolume;
    }

    public int getMinVolume() {
        return currentVolume;
    }

    public void setCurrentVol(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        currentVolume = newVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public int getMinStation() {
        return minStation;
    }


    public int getMaxStation() {
        return maxStation;
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

    public void volumeUp() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
        //  this.currentVolume= currentVolume;
    }

    public void vulumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
        //this.currentVolume = minVolume;
    }

}




