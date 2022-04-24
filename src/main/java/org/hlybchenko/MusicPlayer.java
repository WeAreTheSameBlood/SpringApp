package org.hlybchenko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music, music1, music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(Enum enumMusic){
        music = enumMusic != MusicEnum.CLASSICAL_MUSIC ? (music1) : (music2);
        System.out.println("Playing: " + this.music.getSong());
    }
}
