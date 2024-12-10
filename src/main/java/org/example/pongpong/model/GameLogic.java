package org.example.pongpong.model;

public interface GameLogic {
    boolean isPlayer1Winner();

    boolean isPlayer2Winner();

    boolean isDraw();

    boolean isWinningCondition(Player player1, Player player2);
    boolean isDrawCondition(Player player1, Player player2);
    GameState checkGameState(Player player1, Player player2);
}