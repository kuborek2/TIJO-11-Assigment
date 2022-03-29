package pl.edu.pwsztar.chess.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.edu.pwsztar.chess.domain.Point;
import pl.edu.pwsztar.chess.domain.RulesOfGame;
import pl.edu.pwsztar.chess.dto.FigureMoveDto;
import pl.edu.pwsztar.chess.service.ChessService;

@Service
@Transactional
public class ChessServiceImpl implements ChessService {
    private RulesOfGame bishop;
    private RulesOfGame knight;
    private RulesOfGame rook;
    // ...

    public ChessServiceImpl() {
        bishop = new RulesOfGame.Bishop();
        knight = new RulesOfGame.Knight();
        rook = new RulesOfGame.Rook();
        // ...
    }

    public boolean isCorrectMove(FigureMoveDto figureMoveDto) {

        Point sourceCoordinates = Point.convertChessCoordinatesPoint2D(figureMoveDto.getSource());
        Point desCoordinates = Point.convertChessCoordinatesPoint2D(figureMoveDto.getDestination());

        // refaktoryzacja?
        switch (figureMoveDto.getType()) {
            case BISHOP:
                // wywolaj konwerter punktow oraz popraw ponizszy kod
                return bishop.isCorrectMove(sourceCoordinates, desCoordinates);
            case KNIGHT:
                // wywolaj konwerter punktow oraz popraw ponizszy kod
                return knight.isCorrectMove(sourceCoordinates, desCoordinates);
            case ROOK:
                // wywolaj konwerter punktow oraz popraw ponizszy kod
                return rook.isCorrectMove(sourceCoordinates, desCoordinates);
        }

        return false;
    }
}
