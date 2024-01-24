package com.teranet.rps.training.music;

public record ReleasedMusic(String musicName,
                            MusicClassification[] musicClassifications,
                            boolean isAvailableInYourCountry) {
}
