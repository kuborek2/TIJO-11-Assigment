package pl.edu.pwsztar.chess.domain;

public interface RulesOfGame {

    /**
     * Metoda zwraca true, tylko gdy przejscie z polozenia
     * source na destination w jednym ruchu jest zgodne
     * z zasadami gry w szachy
     */
    boolean isCorrectMove(Point source, Point destination);

    class Bishop implements RulesOfGame {

        @Override
        public boolean isCorrectMove(Point source, Point destination) {
            if(source.getX() == destination.getX() && source.getY() == destination.getY()) {
                return false;
            }

            return Math.abs(destination.getX() - source.getX()) ==
                    Math.abs(destination.getY() - source.getY());
        }
    }

    class Knight implements RulesOfGame {

        @Override
        public boolean isCorrectMove(Point source, Point destination) {
            // TODO: Prosze dokonczyc implementacje
            if( source.getX() == destination.getX() || source.getY() == destination.getY() )
                return false;
            else if ( source.getX() - destination.getX() > -3 && source.getX() - destination.getX() < 3 &&
                    source.getY() - destination.getY() > -3 && source.getY() - destination.getY() < 3 &&
                    Math.abs(source.getX() - destination.getX()) != Math.abs(source.getY() - destination.getY()) )
                return true;
            return false;
        }
    }

    class Rook implements RulesOfGame {

        @Override
        public boolean isCorrectMove(Point source, Point destination) {
            if( source.getX() == destination.getX() && source.getY() == destination.getY() )
                return false;
            else if (
                    (source.getX() == destination.getX() && source.getY() != destination.getY()) ||
                    (source.getY() == destination.getY() && source.getX() != destination.getX())
                )
                return true;
            return false;
        }
    }

    class Pawn implements RulesOfGame {

        @Override
        public boolean isCorrectMove(Point source, Point destination) {
            if( source.getX() == destination.getX() && source.getY() == destination.getY() )
                return false;
            else if (
                    (source.getX() == destination.getX() && source.getY() != destination.getY()) ||
                            (source.getY() == destination.getY() && source.getX() != destination.getX())
            )
                return true;
            return false;
        }
    }

    // TODO: Prosze dokonczyc implementacje kolejnych figur szachowych: Knight, King, Queen, Rook, Pawn
    // TODO: Prosze stosowac zaproponowane nazwy klas !!!
    // TODO: Kazda klasa powinna implementowac interfejs RulesOfGame
}
