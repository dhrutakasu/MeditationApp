package com.sound.meditionsoundapp.Model;

public class ItemModel {
    String MeditationName;
    Integer MeditationIcon;

    public ItemModel(String meditationName, Integer meditationIcon) {
        MeditationName = meditationName;
        MeditationIcon = meditationIcon;
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
}
