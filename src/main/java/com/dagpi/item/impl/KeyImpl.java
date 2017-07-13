package com.dagpi.item.impl;

import com.dagpi.character.GameCharacter;
import com.dagpi.item.Key;

/**
 * Created by benjamin on 7/13/17.
 */
public class KeyImpl implements Key {

    public boolean interactWith(GameCharacter character) {
        character.addToBag(this);

        return true;
    }
}
