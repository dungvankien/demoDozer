package com.cg.demodozer.aliens;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlienSpaceShip {
    private Integer id;
    private Double crew;
    private String name;
    private String size;
}
