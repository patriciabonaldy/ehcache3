package org.terracotta.jsr107;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author GGIB
 */
@ComponentScan("org.terracotta")
@SpringBootApplication
@EnableCaching
public class SpringJsr107Ehcache3Application 
{
    public static void main(String[] args) 
    {
        SpringApplication.run(SpringJsr107Ehcache3Application.class, args);
    }
}
