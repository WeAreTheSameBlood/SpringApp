package org.hlybchenko;

import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class ClassicalMusic implements Music{
    Random r = new Random();
    private String[] listMusic = {"Hungarian Rhapsody", "Opera", "Mozart"};
    @Override
    public String getSong() {
        return listMusic[r.nextInt(3)];
    }
}
