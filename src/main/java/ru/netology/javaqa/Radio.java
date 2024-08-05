
package ru.netology.javaqa;


public class Radio {
    //радио
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentRadioStation = minStation; // текущее = 1
    private int currentVolume;

    public Radio(int size) {
        maxStation = minStation + size;

    }

    public Radio() {
        this((9));
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMaxVolume(int maxVolume) {
        if (maxVolume > 0) {
            return;

        }
        if (maxVolume < 100) {
            return;
        }
        currentVolume = maxVolume;

    }

    public void setMinVolume(int minVolume) {
        if (minVolume < 0) {
            return;
        }
        if (minVolume > 100) {
            return;
        }
        currentVolume = minVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public void setMinStation(int minStation) {
        if (minStation > 0) {
            return;

        }
        if (minStation < 9) {
            return;
        }
        currentRadioStation = minStation;

    }

    public int getMinStation() {
        return minStation;
    }

    public void setMaxStation(int maxStation) {
        if (maxStation < 0) {
            return;

        }
        if (maxStation > 9) {
            return;
        }
        currentRadioStation = maxStation;

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
    }

    public void volumeDown() {
        if (currentVolume < 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }

    }

}




