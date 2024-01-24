package com.teranet.rps.training.music;

import com.teranet.rps.training.music.database.MusicRecord;
import com.teranet.rps.training.music.database.MusicSource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
@DisplayName("MusicService should")
public class MusicServiceTest implements MusicSource {
    private MusicService musicService;
    @BeforeEach
    void setup(){
        musicService = new MusicService(this);
    }
    @Test
    @DisplayName("Return musics from the database sorted by music name")
    void musicAreReturnedSorted(){
        List<ReleasedMusic> releasedMusicList = musicService.findMusicStartingWith("po");
        assertNotNull(releasedMusicList);
        assertEquals(1,releasedMusicList.size(),()->"One Music starting with 'po' - Pop Sensations should return from test data.");
        assertEquals("Pop Sensations",releasedMusicList.get(0).musicName());
    }
    @Nested
    @DisplayName("Throws an illegal argument")
    class ThrowsExceptionTests{
        @Test
        @DisplayName("When passed a blank string")
        void throwsExceptionOnBlank(){
            Exception thrown = assertThrows(IllegalArgumentException.class,
                    ()->musicService.findMusicStartingWith(" "));
            System.out.println(thrown.getMessage());
        }
    }


    @Override
    public List<MusicRecord> findMusicsStartingWith(String startingString) {
        List<MusicRecord> musics = new ArrayList<>();
        if(startingString.equals("po")){
            musics.add(new MusicRecord("Pop Sensations",new int[]{2024},92));
        } else if (startingString.equals("Ja")) {
            musics.add(new MusicRecord("Jazz Improvisations",new int[]{2024},45));
        }
        return musics;
    }
}
