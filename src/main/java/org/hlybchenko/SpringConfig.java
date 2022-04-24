package org.hlybchenko;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.hlybchenko")
@PropertySource("musicPlayer.properties")
public class SpringConfig {

}
