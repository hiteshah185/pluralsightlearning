package com.teranet.rps.training.music.database;

public record MusicRecord(
        String musicName,
        int[] musicCodes,
        int releaseSchedule
) {
}
