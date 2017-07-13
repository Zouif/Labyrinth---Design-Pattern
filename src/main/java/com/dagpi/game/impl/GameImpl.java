package com.dagpi.game.impl;

import com.dagpi.character.Player;
import com.dagpi.character.impl.PlayerImpl;
import com.dagpi.game.Game;
import com.dagpi.game.Level;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class GameImpl implements Game {
    private ArrayList<Level> levels;
    private Player player;

    public GameImpl() {
        player = new PlayerImpl();
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
