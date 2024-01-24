package com.teranet.rps.training.music.database;

import java.util.List;

public interface MusicSource {
    List<MusicRecord> findMusicsStartingWith(String startingString);
}
