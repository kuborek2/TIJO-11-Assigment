package pl.edu.pwsztar.chess.domain;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RookTest {

    private final RulesOfGame rook = new RulesOfGame.Rook();

    @Tag("Rook")
    @ParameterizedTest
    @CsvSource({
            "2, 2,  3,  2",
            "2, 2,  4,  2",
            "2, 2,  1,  2",
            "2, 2,  2,  3",
            "2, 2,  2,  1",
    })
    void checkCorrectMoveForRook(int xStart, int yStart, int xStop, int yStop) {
        assertTrue(rook.isCorrectMove(new Point(xStart, yStart), new Point(xStop, yStop)));
    }

    @ParameterizedTest
    @CsvSource({
            "0,  0,  0,   0",
            "2, 2,  3,  3",
            "2, 2,  1,  1",
            "2, 2,  1,  3",
            "2, 2, 3, 1"
    })
    void checkIncorrectMoveForRook(int xStart, int yStart, int xStop, int yStop) {
        assertFalse(rook.isCorrectMove(new Point(xStart, yStart), new Point(xStop, yStop)));
    }

}
