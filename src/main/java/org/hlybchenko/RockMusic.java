package org.hlybchenko;

import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class RockMusic implements Music{
    Random r = new Random();
    private String[] listMusic = {"Wind cries Mary", "AC/DC", "Kino"};
    @Override
    public String getSong() {
        return listMusic[r.nextInt(3)];
    }
}
