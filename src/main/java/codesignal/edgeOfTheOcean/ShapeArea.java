package codesignal.edgeOfTheOcean;
/*Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.

A 1-interesting polygon is just a square with a side of length 1. An n-interesting polygon is obtained by taking the n - 1-interesting polygon and appending 1-interesting polygons to its rim, side by sid*/

public class ShapeArea {
    int shapeArea(int n) {
        int pole =0;
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 5;
        } else {
            return 2 * n + 2 * (n - 2) + shapeArea(n - 1);
        }
    }

}
