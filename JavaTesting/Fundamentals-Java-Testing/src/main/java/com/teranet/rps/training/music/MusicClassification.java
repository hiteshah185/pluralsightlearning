package com.teranet.rps.training.music;

public enum MusicClassification {
    IDIOPHONES(101," Instruments that create sound through vibrating themselves."),
    MEMBRANOPHONES(102,"Instruments that produce sound by vibrating a membrane."),
    CHORDAPHONES(103,"Instruments in which a stretched, vibrating string produces the initial sound."),
    AEROPHONES(104,"Instruments in which a vibrating mass of air produces the initial sound.");
    private final int musicCode;
    private final String description;

    MusicClassification(int musicCode, String description) {
        this.musicCode = musicCode;
        this.description = description;
    }
}
