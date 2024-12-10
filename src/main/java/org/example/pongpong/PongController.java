package org.example.pongpong;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.example.pongpong.model.Game;
import org.example.pongpong.model.Player;
import org.example.pongpong.model.PongPlayer;

public class PongController {
    private Game game;

    @FXML
    private Label topLabel; // Example: Can display Player 1's score or status
    @FXML
    private Label bottomLabel; // Example: Can display Player 2's score or status
    @FXML
    private Label centerLabel; // Example: Game status (e.g., "Player 1 Wins!")
    @FXML
    private Label leftLabel; // Example: Player 1's remaining lives
    @FXML
    private Label rightLabel; // Example: Player 2's remaining lives

    // Method to set the game instance
    public void setGame(Game game) {
        this.game = game;
    }

    // Update UI elements based on the current game state
    public void updateUI() {
        topLabel.setText("Player 1 Score: " + game.getPlayer1Score());
        bottomLabel.setText("Player 2 Score: " + game.getPlayer2Score());
        leftLabel.setText("Player 1 Lives: " + game.getPlayer1().getHealth());
        rightLabel.setText("Player 2 Lives: " + game.getPlayer2().getHealth());

        if (game.isPlayer1Winner()) {
            centerLabel.setText("Player 1 Wins!");
        } else if (game.isPlayer2Winner()) {
            centerLabel.setText("Player 2 Wins!");
        } else if (game.isDraw()) {
            centerLabel.setText("It's a Draw!");
        } else {
            centerLabel.setText("Game in Progress...");
        }
    }

    @FXML
    public void initialize() {
        // Example initialization with dummy players
        Player player1 = new PongPlayer(0, 0, 50, 50, 3);
        Player player2 = new PongPlayer(0, 0, 50, 50, 3);
        setGame(new Game(player1, player2));

        System.out.println("Game initialized!");
        System.out.println(game.getPlayer1Score());
        System.out.println(game.getPlayer2Score());
    }
}
