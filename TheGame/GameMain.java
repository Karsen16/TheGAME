package TheGame;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.application.Application;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

		public class GameMain extends Application {

				private Circle circle = new Circle(50.0f, Color.RED);
				private Circle circle2 = new Circle(50.0f, Color.BLUE);
				private double newY, newX = 0;
				private double newY2, newX2 = 0;
				CheckGame game = new CheckGame();
				
				public static void main(String[] args) {
					// TODO Auto-generated method stub
					
					System.out.println("HelloWorld");
					
					launch();

				}
				
				@Override
				public void start(Stage stage) {

			        BorderPane borderPane = new BorderPane();
			        borderPane.setRight(circle);
			        borderPane.setLeft(circle2);

			        Scene scene = new Scene(borderPane, 500, 500);      
			        stage.setScene(scene); 
			        stage.show();
			        scene.setOnKeyPressed(e ->{
			            if(e.getCode() == KeyCode.RIGHT){
			                newX = newX + 10;
			                circle.setTranslateX(newX);
			                game.Hit(newX, newY, newX2, newY2);
			            }
			            else if(e.getCode() == KeyCode.LEFT){
			                newX = newX - 10;
			                circle.setTranslateX(newX);
			                game.Hit(newX, newY, newX2, newY2);
			            }
			            else if(e.getCode() == KeyCode.UP){
			                newY = newY - 10;
			                circle.setTranslateY(newY);
			                game.Hit(newX, newY, newX2, newY2);
			            }
			            else if(e.getCode() == KeyCode.DOWN){
			                newY = newY + 10;
			                circle.setTranslateY(newY);
			                game.Hit(newX, newY, newX2, newY2);
			            }
			            if(e.getCode() == KeyCode.D){
			                newX2 = newX2 + 10;
			                circle2.setTranslateX(newX2);
			                game.Hit(newX, newY, newX2, newY2);
			            }
			            else if(e.getCode() == KeyCode.A){
			                newX2 = newX2 - 10;
			                circle2.setTranslateX(newX2);
			                game.Hit(newX, newY, newX2, newY2);
			            }
			            else if(e.getCode() == KeyCode.W){
			                newY2 = newY2 - 10;
			                circle2.setTranslateY(newY2);
			                game.Hit(newX, newY, newX2, newY2);
			            }
			            else if(e.getCode() == KeyCode.S){
			                newY2 = newY2 + 10;
			                circle2.setTranslateY(newY2);
			                game.Hit(newX, newY, newX2, newY2);
			            }
			        });
			       
			        
			    }

			}