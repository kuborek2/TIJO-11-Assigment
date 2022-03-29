package pl.edu.pwsztar.chess.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public class Point {
    private int x;
    private int y;

    private final String[] chessColumns = {"a","b","c","d","e","f","g","h"};

    Point(String stringCoordinates){
        final String[] coordinates = stringCoordinates.split("_"); // under index 0 is alphabetic coordinate and under index 1 is numeric coordinate
        this.x = Integer.parseInt(coordinates[1]);
        this.y = Arrays.asList(chessColumns).indexOf(coordinates[0]);
    }

    static public Point convertChessCoordinatesPoint2D(String stringCoordinates){
        return new Point(stringCoordinates);
    }

    @Override
    public String toString() {
        return "Point{" +
                "X=" + getX() +
                ", Y=" + getY() +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
