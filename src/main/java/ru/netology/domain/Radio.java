package ru.netology.domain;

class Radio {
    int currentStation;
    int minStation = 0;
    int maxStation = 9;
    int currentVolume;
    int minVolume = 0;
    int maxVolume = 100;

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
    void nextStation(int currentStation) {
        this.currentStation = currentStation;
        if (currentStation == maxStation) {
            setCurrentStation(minStation);
        } else setCurrentStation(currentStation + 1);
    }

    //Использование кнопки PREV
    void prevStation(int currentStation) {
        this.currentStation = currentStation;
        if (currentStation == minStation) {
            setCurrentStation(maxStation);
        } else setCurrentStation(currentStation - 1);
    }

    int getCurrentVolume() {
        return currentVolume;
    }

    //Увеличение громкости
    void increaseVolume(int newCurrentVolume) {
        this.currentVolume = newCurrentVolume;
        if (newCurrentVolume == maxVolume) {
            return;
        }
        this.currentVolume += 1;
    }

    //Уменьшение громкости
    void decreaseVolume(int newCurrentVolume) {
        this.currentVolume = newCurrentVolume;
        if (newCurrentVolume == minVolume) {
            return;
        }
        this.currentVolume -= 1;
    }
}

