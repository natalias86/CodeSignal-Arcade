package codesignal.rainsOfReason;

import java.util.HashMap;
import java.util.Map;

/* Given two cells on the standard chess board, determine whether they have the same color or not.*/
public class ChessBoardCellColor {

    boolean chessBoardCellColor(String cell1, String cell2) {
        Map<Character, Integer> charToIntMap = new HashMap<>();
        charToIntMap.put('A', 0);
        charToIntMap.put('B', 1);
        charToIntMap.put('C', 2);
        charToIntMap.put('D', 3);
        charToIntMap.put('E', 4);
        charToIntMap.put('F', 5);
        charToIntMap.put('G', 6);
        charToIntMap.put('H', 7);
        boolean[][] board = new boolean[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0 && j % 2 == 0 || i % 2 != 0 && j % 2 != 0) {
                    board[i][j] = true;
                } else {
                    board[i][j] = false;
                }
            }
        }
        return board[charToIntMap.get(cell1.charAt(0))][cell1.charAt(1) - 1 - 48] == board[charToIntMap.get(cell2.charAt(0))][cell2.charAt(1) - 1 - 48];
    }
}
