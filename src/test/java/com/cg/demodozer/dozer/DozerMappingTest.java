package com.cg.demodozer.dozer;

import com.cg.demodozer.aliens.AlienSpaceShip;
import com.cg.demodozer.space.SpaceShip;
import org.dozer.DozerBeanMapper;
import org.junit.jupiter.api.Test;

public class DozerMappingTest {
    @Test
    void testMappingAnAlienSpaceShip(){
        AlienSpaceShip alienSpaceShip = new AlienSpaceShip(4, 234.7d,"TOKaZ","Large");
        SpaceShip spaceShip = SpaceShip.of(alienSpaceShip);
        System.out.println("My spaceship: " + spaceShip);

    }

    @Test
    void testMappingASpaceShip(){
        SpaceShip spaceShip = new SpaceShip(4, "fastandbig", "Xtra Large");
        DozerBeanMapper mapper = new DozerBeanMapper();
        AlienSpaceShip alienSpaceShip = mapper.map(spaceShip, AlienSpaceShip.class);
        System.out.println("My spaceship: "+ alienSpaceShip);
    }

}
