package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    @ParameterizedTest
    @CsvSource({
            "5,5",
            "0,-8",
            "0,16",
            "0,-1",
            "0,0",
            "1,1",
            "8,8",
            "9,9",
            "0,10"
    })
    void shouldCurrentStation(int expected, int newCurrentStation) {
        Radio radio = new Radio();
        radio.setCurrentStation(newCurrentStation);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "6,5",
            "1,0",
            "9,8",
            "0,9"
    })
    void shouldNextStation(int expected, int currentStation) {
        Radio radio = new Radio();
        radio.nextStation(currentStation);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "4,5",
            "0,1",
            "9,0",
            "8,9"
    })
    void shouldPrevStation(int expected, int currentStation) {
        Radio radio = new Radio();
        radio.prevStation(currentStation);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "51,50",
            "1,0",
            "100,99",
            "100,100"
    })
    void shouldIncreaseVolume(int expected, int newCurrentVolume){
        Radio radio = new Radio();
        radio.increaseVolume(newCurrentVolume);
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource({
            "49,50",
            "99,100",
            "0,1",
            "0,0"
    })
    void shouldDecreaseVolume(int expected, int newCurrentVolume){
        Radio radio = new Radio();
        radio.decreaseVolume(newCurrentVolume);
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
}

