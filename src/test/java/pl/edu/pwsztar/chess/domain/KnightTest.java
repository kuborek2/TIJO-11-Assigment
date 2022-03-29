package pl.edu.pwsztar.chess.domain;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KnightTest {

    private final RulesOfGame knight = new RulesOfGame.Knight();

    @Tag("Knight")
    @ParameterizedTest
    @CsvSource({
            "0, 0,  1,  2",
            "1, 1,  3,  2",
            "1, 4,  0,  2",
            "1, 4,  2,  2",
    })
    void checkCorrectMoveForKnight(int xStart, int yStart, int xStop, int yStop) {
        assertTrue(knight.isCorrectMove(new Point(xStart, yStart), new Point(xStop, yStop)));
    }

    @ParameterizedTest
    @CsvSource({
            "0,  1,  0,   2",
            "10, 10, 10,  10",
            "2, 2,  3,  3",
            "2, 2,  1,  1",
            "2, 2,  1,  3",
            "2, 2, 3, 1"
    })
    void checkIncorrectMoveForKnight(int xStart, int yStart, int xStop, int yStop) {
        assertFalse(knight.isCorrectMove(new Point(xStart, yStart), new Point(xStop, yStop)));
    }
}
