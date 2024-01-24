package com.teranet.rps.training.music;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class MusicConceptTest {
    private final static MusicConcept TEST_INSTITUTE = new MusicConcept(new MusicClassification[]{
            MusicClassification.IDIOPHONES,
            MusicClassification.CHORDAPHONES,
            MusicClassification.AEROPHONES
    });
    @Test
    void musicBelongsInConceptIfOneClassMatches(){
        ReleasedMusic music = new ReleasedMusic("rockMusic",
                new MusicClassification[]{MusicClassification.AEROPHONES},false);
        assertTrue(TEST_INSTITUTE.isMusicInConcept(music));
    }

    @Test
    void musicNotInConceptIfNoClassesMatch(){
        ReleasedMusic ARMusic = new ReleasedMusic("AR Rahman",new MusicClassification[]{MusicClassification.MEMBRANOPHONES},true);
        assertFalse(TEST_INSTITUTE.isMusicInConcept(ARMusic));
    }
}
