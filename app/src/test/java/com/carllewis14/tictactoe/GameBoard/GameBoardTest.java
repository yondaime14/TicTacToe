package com.carllewis14.tictactoe.GameBoard;

import android.os.Build;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertTrue;

/**
 * Simple test to see if 3 cells have same mark return true else test fail
 */
public class GameBoardTest {
    @Test
    public void isWinner() throws Exception {

        String cell11 = "x";
        String cell12 = "x";
        String cell13 = "x";

        String cell21 = "x";
        String cell22 = "o";
        String cell23 = "x";

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            assertTrue(Objects.equals(cell11, cell12) & Objects.equals(cell13, cell11));
        }
    }



}