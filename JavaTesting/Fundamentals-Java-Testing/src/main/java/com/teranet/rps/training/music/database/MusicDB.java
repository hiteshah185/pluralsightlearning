package com.teranet.rps.training.music.database;

import java.util.ArrayList;
import java.util.List;

public class MusicDB implements MusicSource{
    private static final List<MusicRecord> musicList = new ArrayList<>();

    static {
        musicList.add(new MusicRecord("Nation1",new int[]{2024},0));
        musicList.add(new MusicRecord("Cosmic Pulse", new int[]{2024}, 85)); // Electronic
        musicList.add(new MusicRecord("Melodies for the Soul", new int[]{2022, 2023}, 72)); // Ambient
        musicList.add(new MusicRecord("Rock Anthems: The Classics", new int[]{1985, 1992, 2001}, 98)); // Rock
        musicList.add(new MusicRecord("Jazz Improvisations", new int[]{2024}, 45)); // Jazz
        musicList.add(new MusicRecord("Country Road Trip", new int[]{2023, 2024}, 68)); // Country
        musicList.add(new MusicRecord("Global Grooves", new int[]{2024}, 0)); // World Music
        musicList.add(new MusicRecord("Pop Sensations", new int[]{2024}, 92)); // Pop
        musicList.add(new MusicRecord("Orchestral Masterpieces", new int[]{2020, 2024}, 57)); // Classical
        musicList.add(new MusicRecord("Hip Hop Evolution", new int[]{2023, 2024}, 89)); // Hip Hop
    }

    @Override
    public List<MusicRecord> findMusicsStartingWith(String startingString) {
        return musicList.stream()
                .filter(rec->rec.musicName().startsWith(startingString)).toList();
    }
}
