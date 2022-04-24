package org.hlybchenko;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(MusicEnum.CLASSICAL_MUSIC);
        System.out.println(musicPlayer.getName() + " + " + musicPlayer.getVolume());

        context.close();
    }
}