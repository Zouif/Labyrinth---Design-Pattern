package com.dagpi.cell.impl;

import com.dagpi.item.Item;
import com.dagpi.cell.Floor;

/**
 * Created by benjamin on 7/13/17.
 */
public class FloorImpl implements Floor {
    private Item item;

    public void interact(Character character) {
        if(item != null) {
            character.addToBag(item);
            item = null;
        }
    }
}
