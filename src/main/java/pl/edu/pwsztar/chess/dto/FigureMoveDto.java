package pl.edu.pwsztar.chess.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@ToString
public class FigureMoveDto implements Serializable {
    private String source;
    private String destination;
    private FigureType type;

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public FigureType getType() {
        return type;
    }
}
