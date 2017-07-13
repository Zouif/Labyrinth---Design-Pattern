package com.dagpi.character;

import com.dagpi.item.Item;

import java.util.ArrayList;

/**
 * Created by benjamin on 7/13/17.
 */
public interface Character {
    boolean addToBag(Item i);
    boolean removeFromBag(Item i);
}
