package com.xyzcorp.javapatterns.proxy.virtual;

/**
 * @author John Ericksen
 */
public class PuzzlePiece1 {

    @SuppressWarnings("unused")
    private PuzzlePiece2 piece2;

    public PuzzlePiece1(PuzzlePiece2 piece2) {
        this.piece2 = piece2;
    }
}
