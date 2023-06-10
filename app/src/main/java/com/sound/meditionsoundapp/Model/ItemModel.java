package com.sound.meditionsoundapp.Model;

public class ItemModel {
    String MeditationName;
    Integer MeditationIcon;
    Integer MeditationValue;

    public ItemModel(String meditationName, Integer meditationIcon) {
        MeditationName = meditationName;
        MeditationIcon = meditationIcon;
    }

    public ItemModel(String meditationName, Integer meditationIcon, Integer meditationvalue) {
        MeditationName = meditationName;
        MeditationIcon = meditationIcon;
        MeditationValue = meditationvalue;
    }

    public String getMeditationName() {
        return MeditationName;
    }

    public void setMeditationName(String meditationName) {
        MeditationName = meditationName;
    }

    public Integer getMeditationIcon() {
        return MeditationIcon;
    }

    public void setMeditationIcon(Integer meditationIcon) {
        MeditationIcon = meditationIcon;
    }

    public Integer getMeditationValue() {
        return MeditationValue;
    }

    public void setMeditationValue(Integer meditationValue) {
        MeditationValue = meditationValue;
    }
}
