package com.dagpi.game.impl;

import com.dagpi.cell.Cell;
import com.dagpi.character.Monster;
import com.dagpi.game.Level;
import com.dagpi.game.Maze;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by benjamin on 7/13/17.
 */
public class LevelImpl implements Level {
    private Maze maze;
    private List<Monster> monsters;

    public LevelImpl() {
        monsters = new ArrayList<Monster>();
        maze = new MazeImpl();
    }

}
