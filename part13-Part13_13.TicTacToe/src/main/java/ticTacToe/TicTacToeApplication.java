package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    private boolean xState;
    private boolean finished;
    private Label turn;
    private Button[] buttons;

    public TicTacToeApplication() {
        this.xState = true;
        this.finished = false;
        this.turn = new Label("Turn: X");
        this.buttons = new Button[9];

        for (int i = 0; i < 9; i++) {
            this.buttons[i] = createButton();
        }
    }

    @Override
    public void start(Stage window) throws Exception {
        // Create main layout
        BorderPane layout = new BorderPane();
        layout.setPrefSize(310, 350);

        // Create turn label
        turn.setFont(Font.font("Monospaced", 40));
        turn.setPadding(new Insets(10, 10, 10, 10));

        // Create grid sub view
        GridPane gPane = new GridPane();
        gPane.setAlignment(Pos.CENTER);
        gPane.setVgap(10);
        gPane.setHgap(10);
        gPane.setPadding(new Insets(10, 10, 10, 10));

        gPane.add(buttons[0], 1, 0);
        gPane.add(buttons[1], 2, 0);
        gPane.add(buttons[2], 3, 0);
        gPane.add(buttons[3], 1, 1);
        gPane.add(buttons[4], 2, 1);
        gPane.add(buttons[5], 3, 1);
        gPane.add(buttons[6], 1, 2);
        gPane.add(buttons[7], 2, 2);
        gPane.add(buttons[8], 3, 2);

        // Set up main layout
        layout.setTop(turn);
        layout.setCenter(gPane);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    private Button createButton() {
        Button button = new Button(" ");
        button.setFont(Font.font("Monospaced", 40));
        button.setPrefSize(90, 90);

        button.setOnAction((event) -> {
            if (this.finished) return;
            if (!button.getText().equals(" ")) return;            

            if (this.xState) {
                this.turn.setText("Turn: O");
                button.setText("X");
                this.xState = false;
            } else if (!this.xState) {
                this.turn.setText("Turn: X");
                button.setText("O");
                this.xState = true;
            }
            
            if (gameTie() || gameWon()) {
                this.turn.setText("The end!");
                this.finished = true;
            }
        });

        return button;
    }
    
    private boolean gameTie() {
        for (Button button : this.buttons) {
            if (button.getText().equals(" ")) {
                return false;
            }
        }
        return true;
    }
    
    private boolean gameWon() {
        // Check rows
        if (!buttons[0].getText().equals(" ")) {
            if (buttons[0].getText().equals(buttons[1].getText()) 
                    && buttons[0].getText().equals(buttons[2].getText())) {
                return true;
            }
        }
        if (!buttons[3].getText().equals(" ")) {
            if (buttons[3].getText().equals(buttons[4].getText()) 
                    && buttons[3].getText().equals(buttons[5].getText())) {
                return true;
            }
        }
        if (!buttons[6].getText().equals(" ")) {
            if (buttons[6].getText().equals(buttons[7].getText()) 
                    && buttons[6].getText().equals(buttons[8].getText())) {
                return true;
            }
        }

        // Check columns
        if (!buttons[0].getText().equals(" ")) {
            if (buttons[0].getText().equals(buttons[3].getText()) 
                    && buttons[0].getText().equals(buttons[6].getText())) {
                return true;
            }
        }
        if (!buttons[1].getText().equals(" ")) {
            if (buttons[1].getText().equals(buttons[4].getText()) 
                    && buttons[1].getText().equals(buttons[7].getText())) {
                return true;
            }
        }
        if (!buttons[2].getText().equals(" ")) {
            if (buttons[2].getText().equals(buttons[5].getText()) 
                    && buttons[2].getText().equals(buttons[8].getText())) {
                return true;
            }
        }

        // Check diagonals
        if (!buttons[0].getText().equals(" ")) {
            if (buttons[0].getText().equals(buttons[4].getText()) 
                    && buttons[0].getText().equals(buttons[8].getText())) {
                return true;
            }
        }
        if (!buttons[2].getText().equals(" ")) {
            if (buttons[2].getText().equals(buttons[4].getText()) 
                    && buttons[2].getText().equals(buttons[6].getText())) {
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

}
