package com.cg.demodozer.space;

import com.cg.demodozer.aliens.AlienSpaceShip;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.dozer.DozerBeanMapper;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceShip {
    private Integer crew;
    private String name;
    private String size;

    public static SpaceShip of(AlienSpaceShip alienSpaceShip){
        DozerBeanMapper mapper = new DozerBeanMapper();
        SpaceShip spaceShip = mapper.map(alienSpaceShip,SpaceShip.class);
        return spaceShip;
    }
}
