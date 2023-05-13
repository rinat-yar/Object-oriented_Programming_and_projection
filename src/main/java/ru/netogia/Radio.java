package ru.netogia;

public class Radio {
    private int currentRadioStation;
    private int currentRadioVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0){
            return;
        }
        if (currentRadioStation > 9){
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextStation() {
        if (currentRadioStation != 9){
            currentRadioStation ++;
        }else {
            currentRadioStation = 0;
        }
    }

    public void prevStation() {
        if (currentRadioStation != 0){
            currentRadioStation --;
        }else {
            currentRadioStation = 9;
        }
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }

    public void setCurrentRadioVolume(int currentRadioVolume) {
        if (currentRadioVolume < 0){
            return;
        }
        if (currentRadioVolume > 100){
            return;
        }
        this.currentRadioVolume = currentRadioVolume;
    }

    public void upVolume() {
        if (currentRadioVolume != 100){
            currentRadioVolume ++;
        }else {
            currentRadioVolume = 0;
        }
    }

    public void downVolume() {
        if (currentRadioVolume != 0){
            currentRadioVolume --;
        }else {
            currentRadioVolume = 100;
        }
    }
}