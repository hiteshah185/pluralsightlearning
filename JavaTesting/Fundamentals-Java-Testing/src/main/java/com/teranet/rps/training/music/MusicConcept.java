package com.teranet.rps.training.music;

import java.util.Arrays;

public class MusicConcept {
    public final static  MusicConcept classicalMusic = new MusicConcept(new MusicClassification[]{
            MusicClassification.AEROPHONES,
            MusicClassification.CHORDAPHONES,
            MusicClassification.IDIOPHONES
    });
    private final MusicClassification[] musicClassifications;

    public MusicConcept(MusicClassification[] musicClassifications) {
        this.musicClassifications = musicClassifications;
    }
    public boolean isMusicInConcept(ReleasedMusic releasedMusic){
        return Arrays.stream(musicClassifications)
                .toList().stream()
                .anyMatch(
                        musicClass->Arrays.stream(releasedMusic.musicClassifications()).toList().contains(musicClass));
    }
}
