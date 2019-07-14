package codesignal.rainbowOfClarity;

/* Given a position of a knight on the standard chessboard, find the number of different moves the knight can perform.
The knight can move to a square that is two squares horizontally and one square vertically, or two squares vertically and one square horizontally away from it. The complete move therefore looks like the letter L. Check out the image below to see all valid moves for a knight piece that is placed on one of the central squares.

*/
public class ChessKnight {
    int chessKnight(String cell) {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h;

        a = cell.charAt(0) + 2;
        b = cell.charAt(1) + 1;
        c = cell.charAt(1) - 1;
        d = cell.charAt(0) - 2;
        e = cell.charAt(0) + 1;
        f = cell.charAt(1) + 2;
        g = cell.charAt(0) - 1;
        h = cell.charAt(1) - 2;
        int counter = 0;
        if (a > 96 && a < 105 && b > 48 && b < 57) counter++;
        if (a > 96 && a < 105 && c > 48 && c < 57) counter++;
        if (d > 96 && d < 105 && c > 48 && c < 57) counter++;
        if (d > 96 && d < 105 && b > 48 && b < 57) counter++;
        if (e > 96 && e < 105 && f > 48 && f < 57) counter++;
        if (e > 96 && e < 105 && h > 48 && h < 57) counter++;
        if (g > 96 && g < 105 && h > 48 && h < 57) counter++;
        if (g > 96 && g < 105 && f > 48 && f < 57) counter++;
        return counter;

    }
}
