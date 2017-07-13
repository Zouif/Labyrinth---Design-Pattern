package com.dagpi.character.impl;

import com.dagpi.character.Monster;
import com.dagpi.item.Item;

/**
 * Created by benjamin on 7/13/17.
 */
public class MonsterImpl extends GameCharacterAbstract implements Monster {

    @Override
    public boolean addToBag(Item i) {
        return false;
    }
    @Override
    public boolean removeFromBag(Item i){
        return false;
    }
}
