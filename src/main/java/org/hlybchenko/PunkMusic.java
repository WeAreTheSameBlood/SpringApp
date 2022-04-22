package org.hlybchenko;

import org.springframework.stereotype.Component;

@Component("PunkBean")
public class PunkMusic implements Music{
    public void initM(){
        System.out.println("Init method start!");
    }

    public void destroyM(){
        System.out.println("I'm destroyed!");
    }

    @Override
    public String getSong() {
        return "I Fought the Law";
    }
}
