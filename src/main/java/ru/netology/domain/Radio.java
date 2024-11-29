package ru.netology.domain;

class Radio {
    private int currentStation;
    private int minStation = 0;
    private int maxStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {

        this.maxStation = 9;
    }

    public Radio(int quantity) {

        this.maxStation = quantity - 1;
    }

    int getCurrentStation() {
        return currentStation;
    }

    //Установка радиостанции вручную
    void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    //Использование кнопки NEXT
    void nextStation() {
        if (currentStation == maxStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    //Использование кнопки PREV
    void prevStation() {
        if (currentStation == minStation) {
            setCurrentStation(maxStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    int getCurrentVolume() {
        return currentVolume;
    }

    //Установка лимитов громкости
    void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    //Увеличение громкости
    void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume += 1;
    }

    //Уменьшение громкости
    void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume -= 1;
    }
}