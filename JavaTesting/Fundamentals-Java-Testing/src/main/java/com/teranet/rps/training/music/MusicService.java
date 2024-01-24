package com.teranet.rps.training.music;

import com.teranet.rps.training.music.database.MusicRecord;
import com.teranet.rps.training.music.database.MusicSource;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MusicService {
  private MusicSource musicSource;

    public MusicService(MusicSource musicSource) {
        this.musicSource = musicSource;
    }
    public List<ReleasedMusic> findMusicStartingWith(String startsWith){
        checkIfIllegalArgument(startsWith);
        List<MusicRecord> records = this.musicSource.findMusicsStartingWith(startsWith);
        List<ReleasedMusic> matchedMusics = convertRecords(records);
        matchedMusics.sort(Comparator.comparing(ReleasedMusic::musicName));
        return matchedMusics;
    }
    private void checkIfIllegalArgument(String value){
        if(value ==null || value.isBlank()){
            throw new IllegalArgumentException("Enter a string that must not be null or blank, Provided String:"+value);
        }
    }

    private ReleasedMusic convertRecord(MusicRecord musicRecord){
        List<MusicClassification> classifications = new ArrayList<>();
        for(int code:musicRecord.musicCodes()){
            classifications.add(MusicClassification.getClassificationByCode(code));
        }
        return
                new ReleasedMusic(musicRecord.musicName(),classifications.toArray(new MusicClassification[0]),musicRecord.releaseSchedule()>0);
    }
    private List<ReleasedMusic> convertRecords(List<MusicRecord> records){
        ArrayList<ReleasedMusic> releasedMusics = new ArrayList<>();
        for(MusicRecord record:records){
          releasedMusics.add(convertRecord(record));
        }
        return releasedMusics;
    }
}
