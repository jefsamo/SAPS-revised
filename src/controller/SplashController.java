package controller;
import Main.Signin;
import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class SplashController implements Initializable
{

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Circle rect,rect1,rect2,rect3,rect4;
    Signin su;
    Stage stage;
    public void Main( Signin su,Stage stage)
    {
        this.stage = stage;
        this.su = su;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        new Splash().start();
        PathTransition pt = new PathTransition(Duration.millis(3000),new Line(0,20,1000,20),rect);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.play();

        PathTransition pt1 = new PathTransition(Duration.millis(3020),new Line(0,20,1000,20),rect1);
        pt1.setCycleCount(Timeline.INDEFINITE);
        pt1.play();

        PathTransition pt2 = new PathTransition(Duration.millis(3040),new Line(0,20,1000,20),rect2);
        pt2.setCycleCount(Timeline.INDEFINITE);
        pt2.play();

        PathTransition pt3 = new PathTransition(Duration.millis(3060),new Line(0,20,1000,20),rect3);
        pt3.setCycleCount(Timeline.INDEFINITE);
        pt3.play();

        PathTransition pt4 = new PathTransition(Duration.millis(3080),new Line(0,20,1000,20),rect4);
        pt4.setCycleCount(Timeline.INDEFINITE);
        pt4.play();
    }
    class Splash extends Thread
    {
        @Override
        public void run()
        {
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    try
                    {
                        Thread.sleep(1500);
                        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(20), anchorPane);
                        fadeTransition.setFromValue(1);
                        fadeTransition.setToValue(0);
                        fadeTransition.setCycleCount(1);
                        fadeTransition.play();

                        fadeTransition.setOnFinished(e ->
                        {
                            su.splashWindowClose();
                            su.calculationWindow();
                        });

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

}
