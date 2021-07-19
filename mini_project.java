import java.io.FileInputStream;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Mini extends Application {
	public static void main(String[] args) {

		launch(args);
	}

	public void start(Stage primstage) throws Exception {
		// Used Group Layout
		primstage.setTitle("VIBE  ;)  ALONG");
		Group root = new Group();
		Scene myscene = new Scene(root, 1200, 790, Color.LIGHTPINK);

		// AADARSH'S VIBE ;) ALONG PROJECT
		Label lbl = new Label("Made By Aadarsh (4NM19IS001)");
		lbl.setFont(new Font("STHupo", 13));
		lbl.setLayoutX(1010);
		lbl.setLayoutY(775);

		// Heading using DropShadow Effect
		DropShadow ds = new DropShadow();
		ds.setOffsetY(3.0f);
		ds.setColor(Color.color(0.4f, 0.6f, 0.8f));
		Text t = new Text();
		t.setEffect(ds);
		t.setX(420);
		t.setY(60);
		t.setFill(Color.BLACK);
		t.setText("VIBE  ;)  ALONG");
		t.setFont(Font.font("STHupo", FontWeight.BOLD, 52));

		// Defining Buttons required for respective songs along with font and layout
		Button b1 = new Button("COUNTING STARS");
		b1.setFont(new Font("STHupo", 13));
		b1.setLayoutX(240);
		b1.setLayoutY(360);

		Button b2 = new Button("ASTRONAUT IN THE OCEAN");
		b2.setFont(new Font("STHupo", 13));
		b2.setLayoutX(515);
		b2.setLayoutY(360);

		Button b3 = new Button("RUN FREE");
		b3.setFont(new Font("STHupo", 13));
		b3.setLayoutX(860);
		b3.setLayoutY(360);

		Button b4 = new Button("BLINDING LIGHTS");
		b4.setFont(new Font("STHupo", 13));
		b4.setLayoutX(390);
		b4.setLayoutY(710);

		Button b5 = new Button("CLOSER");
		b5.setFont(new Font("STHupo", 13));
		b5.setLayoutX(715);
		b5.setLayoutY(710);

		// Adding a stop button to stop the track
		Button bs = new Button("STOP");
		bs.setFont(new Font("STHupo", 14));
		bs.setTextFill(Color.RED);
		bs.setLayoutX(580);
		bs.setLayoutY(390);

		// Defining action events for each button
		// Button uses ImageInput and AudioClip in action events
		b1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try {
					// To make sure any previous track being played stops before the other track is
					// played
					String bip = "C:\\Users\\91808\\Desktop\\project_resources\\Counting_Stars.mp3";
					String bip1 = "C:\\Users\\91808\\Desktop\\project_resources\\Astronaut_In_The_Ocean.mp3";
					String bip2 = "C:\\Users\\91808\\Desktop\\project_resources\\Run_Free.mp3";
					String bip3 = "C:\\Users\\91808\\Desktop\\project_resources\\Blinding_Lights.mp3";
					String bip4 = "C:\\Users\\91808\\Desktop\\project_resources\\Closer.mp3";
					Media hit = new Media(Paths.get(bip).toUri().toString());
					Media hit1 = new Media(Paths.get(bip1).toUri().toString());
					Media hit2 = new Media(Paths.get(bip2).toUri().toString());
					Media hit3 = new Media(Paths.get(bip3).toUri().toString());
					Media hit4 = new Media(Paths.get(bip4).toUri().toString());
					AudioClip a = new AudioClip(hit.getSource());
					AudioClip a1 = new AudioClip(hit1.getSource());
					AudioClip a2 = new AudioClip(hit2.getSource());
					AudioClip a3 = new AudioClip(hit3.getSource());
					AudioClip a4 = new AudioClip(hit4.getSource());
					a.stop();
					a1.stop();
					a2.stop();
					a3.stop();
					a4.stop();
					t.setText("VIBE  ;)  ALONG");
					t.setX(420);
					t.setY(60);

					// Playing the song chosen

					String bip5 = "C:\\Users\\91808\\Desktop\\project_resources\\Counting_Stars.mp3";
					Media hit5 = new Media(Paths.get(bip5).toUri().toString());
					AudioClip a5 = new AudioClip(hit5.getSource());
					a5.play();
					Image image = new Image(
							new FileInputStream("C:\\Users\\91808\\Desktop\\project_resources\\Counting_Stars1.jpg"));
					ImageInput imageInput = new ImageInput();
					imageInput.setSource(image);
					imageInput.setX(-45);
					imageInput.setY(-260);
					b1.setEffect(imageInput);
					t.setText("Counting Stars Playing");
					t.setX(350);
					t.setY(60);
				} catch (Exception e) {
				}
			}
		});

		b2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try {
					String bip = "C:\\Users\\91808\\Desktop\\project_resources\\Counting_Stars.mp3";
					String bip1 = "C:\\Users\\91808\\Desktop\\project_resources\\Astronaut_In_The_Ocean.mp3";
					String bip2 = "C:\\Users\\91808\\Desktop\\project_resources\\Run_Free.mp3";
					String bip3 = "C:\\Users\\91808\\Desktop\\project_resources\\Blinding_Lights.mp3";
					String bip4 = "C:\\Users\\91808\\Desktop\\project_resources\\Closer.mp3";
					Media hit = new Media(Paths.get(bip).toUri().toString());
					Media hit1 = new Media(Paths.get(bip1).toUri().toString());
					Media hit2 = new Media(Paths.get(bip2).toUri().toString());
					Media hit3 = new Media(Paths.get(bip3).toUri().toString());
					Media hit4 = new Media(Paths.get(bip4).toUri().toString());
					AudioClip a = new AudioClip(hit.getSource());
					AudioClip a1 = new AudioClip(hit1.getSource());
					AudioClip a2 = new AudioClip(hit2.getSource());
					AudioClip a3 = new AudioClip(hit3.getSource());
					AudioClip a4 = new AudioClip(hit4.getSource());
					a.stop();
					a1.stop();
					a2.stop();
					a3.stop();
					a4.stop();
					t.setText("VIBE  ;)  ALONG");
					t.setX(420);
					t.setY(60);

					String bip6 = "C:\\Users\\91808\\Desktop\\project_resources\\Astronaut_In_The_Ocean.mp3";
					Media hit6 = new Media(Paths.get(bip6).toUri().toString());
					AudioClip a6 = new AudioClip(hit6.getSource());
					a6.play();
					Image image = new Image(new FileInputStream(
							"C:\\Users\\91808\\Desktop\\project_resources\\Astronaut_In_The_Ocean1.jpg"));
					ImageInput imageInput = new ImageInput();
					imageInput.setSource(image);
					imageInput.setX(-15);
					imageInput.setY(-260);
					b2.setEffect(imageInput);
					t.setText("Astronaut In The Ocean Playing");
					t.setX(250);
					t.setY(60);
				} catch (Exception e) {
				}
			}
		});

		b3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try {
					String bip = "C:\\Users\\91808\\Desktop\\project_resources\\Counting_Stars.mp3";
					String bip1 = "C:\\Users\\91808\\Desktop\\project_resources\\Astronaut_In_The_Ocean.mp3";
					String bip2 = "C:\\Users\\91808\\Desktop\\project_resources\\Run_Free.mp3";
					String bip3 = "C:\\Users\\91808\\Desktop\\project_resources\\Blinding_Lights.mp3";
					String bip4 = "C:\\Users\\91808\\Desktop\\project_resources\\Closer.mp3";
					Media hit = new Media(Paths.get(bip).toUri().toString());
					Media hit1 = new Media(Paths.get(bip1).toUri().toString());
					Media hit2 = new Media(Paths.get(bip2).toUri().toString());
					Media hit3 = new Media(Paths.get(bip3).toUri().toString());
					Media hit4 = new Media(Paths.get(bip4).toUri().toString());
					AudioClip a = new AudioClip(hit.getSource());
					AudioClip a1 = new AudioClip(hit1.getSource());
					AudioClip a2 = new AudioClip(hit2.getSource());
					AudioClip a3 = new AudioClip(hit3.getSource());
					AudioClip a4 = new AudioClip(hit4.getSource());
					a.stop();
					a1.stop();
					a2.stop();
					a3.stop();
					a4.stop();
					t.setText("VIBE  ;)  ALONG");
					t.setX(420);
					t.setY(60);

					String bip7 = "C:\\Users\\91808\\Desktop\\project_resources\\Run_Free.mp3";
					Media hit7 = new Media(Paths.get(bip7).toUri().toString());
					AudioClip a7 = new AudioClip(hit7.getSource());
					a7.play();
					Image image = new Image(
							new FileInputStream("C:\\Users\\91808\\Desktop\\project_resources\\Run_Free1.jpg"));
					ImageInput imageInput = new ImageInput();
					imageInput.setSource(image);
					imageInput.setX(-55);
					imageInput.setY(-260);
					b3.setEffect(imageInput);
					t.setText("Run Free Playing");
					t.setX(400);
					t.setY(60);
				} catch (Exception e) {
				}
			}
		});

		b4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try {
					String bip = "C:\\Users\\91808\\Desktop\\project_resources\\Counting_Stars.mp3";
					String bip1 = "C:\\Users\\91808\\Desktop\\project_resources\\Astronaut_In_The_Ocean.mp3";
					String bip2 = "C:\\Users\\91808\\Desktop\\project_resources\\Run_Free.mp3";
					String bip3 = "C:\\Users\\91808\\Desktop\\project_resources\\Blinding_Lights.mp3";
					String bip4 = "C:\\Users\\91808\\Desktop\\project_resources\\Closer.mp3";
					Media hit = new Media(Paths.get(bip).toUri().toString());
					Media hit1 = new Media(Paths.get(bip1).toUri().toString());
					Media hit2 = new Media(Paths.get(bip2).toUri().toString());
					Media hit3 = new Media(Paths.get(bip3).toUri().toString());
					Media hit4 = new Media(Paths.get(bip4).toUri().toString());
					AudioClip a = new AudioClip(hit.getSource());
					AudioClip a1 = new AudioClip(hit1.getSource());
					AudioClip a2 = new AudioClip(hit2.getSource());
					AudioClip a3 = new AudioClip(hit3.getSource());
					AudioClip a4 = new AudioClip(hit4.getSource());
					a.stop();
					a1.stop();
					a2.stop();
					a3.stop();
					a4.stop();
					t.setText("VIBE  ;)  ALONG");
					t.setX(420);
					t.setY(60);

					String bip8 = "C:\\Users\\91808\\Desktop\\project_resources\\Blinding_Lights.mp3";
					Media hit8 = new Media(Paths.get(bip8).toUri().toString());
					AudioClip a8 = new AudioClip(hit8.getSource());
					a8.play();
					Image image = new Image(
							new FileInputStream("C:\\Users\\91808\\Desktop\\project_resources\\Blinding Lights1.jpg"));
					ImageInput imageInput = new ImageInput();
					imageInput.setSource(image);
					imageInput.setX(-45);
					imageInput.setY(-260);
					b4.setEffect(imageInput);
					t.setText("Blinding Lights Playing");
					t.setX(340);
					t.setY(60);
				} catch (Exception e) {
				}
			}
		});

		b5.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try {
					String bip = "C:\\Users\\91808\\Desktop\\project_resources\\Counting_Stars.mp3";
					String bip1 = "C:\\Users\\91808\\Desktop\\project_resources\\Astronaut_In_The_Ocean.mp3";
					String bip2 = "C:\\Users\\91808\\Desktop\\project_resources\\Run_Free.mp3";
					String bip3 = "C:\\Users\\91808\\Desktop\\project_resources\\Blinding_Lights.mp3";
					String bip4 = "C:\\Users\\91808\\Desktop\\project_resources\\Closer.mp3";
					Media hit = new Media(Paths.get(bip).toUri().toString());
					Media hit1 = new Media(Paths.get(bip1).toUri().toString());
					Media hit2 = new Media(Paths.get(bip2).toUri().toString());
					Media hit3 = new Media(Paths.get(bip3).toUri().toString());
					Media hit4 = new Media(Paths.get(bip4).toUri().toString());
					AudioClip a = new AudioClip(hit.getSource());
					AudioClip a1 = new AudioClip(hit1.getSource());
					AudioClip a2 = new AudioClip(hit2.getSource());
					AudioClip a3 = new AudioClip(hit3.getSource());
					AudioClip a4 = new AudioClip(hit4.getSource());
					a.stop();
					a1.stop();
					a2.stop();
					a3.stop();
					a4.stop();
					t.setText("VIBE  ;)  ALONG");
					t.setX(420);
					t.setY(60);

					String bip9 = "C:\\Users\\91808\\Desktop\\project_resources\\Closer.mp3";
					Media hit9 = new Media(Paths.get(bip9).toUri().toString());
					AudioClip a9 = new AudioClip(hit9.getSource());
					a9.play();
					Image image = new Image(
							new FileInputStream("C:\\Users\\91808\\Desktop\\project_resources\\Closer1.jpg"));
					ImageInput imageInput = new ImageInput();
					imageInput.setSource(image);
					imageInput.setX(-60);
					imageInput.setY(-260);
					b5.setEffect(imageInput);
					t.setText("Closer Playing");
					t.setX(420);
					t.setY(60);
				} catch (Exception e) {
				}
			}
		});

		// Stop action evet to stop any desired track that is playing
		bs.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String bip = "C:\\Users\\91808\\Desktop\\project_resources\\Counting_Stars.mp3";
				String bip1 = "C:\\Users\\91808\\Desktop\\project_resources\\Astronaut_In_The_Ocean.mp3";
				String bip2 = "C:\\Users\\91808\\Desktop\\project_resources\\Run_Free.mp3";
				String bip3 = "C:\\Users\\91808\\Desktop\\project_resources\\Blinding_Lights.mp3";
				String bip4 = "C:\\Users\\91808\\Desktop\\project_resources\\Closer.mp3";
				Media hit = new Media(Paths.get(bip).toUri().toString());
				Media hit1 = new Media(Paths.get(bip1).toUri().toString());
				Media hit2 = new Media(Paths.get(bip2).toUri().toString());
				Media hit3 = new Media(Paths.get(bip3).toUri().toString());
				Media hit4 = new Media(Paths.get(bip4).toUri().toString());
				AudioClip a = new AudioClip(hit.getSource());
				AudioClip a1 = new AudioClip(hit1.getSource());
				AudioClip a2 = new AudioClip(hit2.getSource());
				AudioClip a3 = new AudioClip(hit3.getSource());
				AudioClip a4 = new AudioClip(hit4.getSource());
				a.stop();
				a1.stop();
				a2.stop();
				a3.stop();
				a4.stop();
				t.setText("VIBE  ;)  ALONG");
				t.setX(420);
				t.setY(60);
			}
		});

		// Adding all the nodes
		root.getChildren().addAll(t, b1, b2, b3, b4, b5, bs, lbl);
		primstage.setScene(myscene);
		primstage.show();
	}

}

