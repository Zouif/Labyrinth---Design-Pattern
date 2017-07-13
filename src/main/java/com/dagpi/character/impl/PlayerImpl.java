package com.dagpi.character.impl;

import com.dagpi.character.Player;
import com.dagpi.item.Item;

import java.util.ArrayList;

/**
 * Created by benjamin on 7/13/17.
 */
public class PlayerImpl extends GameCharacterAbstract implements Player {
    private ArrayList<Item> inventory;

    public PlayerImpl(){
        inventory = new ArrayList<Item>();
    }

    @Override
    public boolean addToBag(Item i) {
        inventory.add(i);
        return true;
    }

    @Override
    public boolean removeFromBag(Item i){
        return inventory.remove(i);
    }
}
