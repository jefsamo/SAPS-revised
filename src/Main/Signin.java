package Main;

import controller.CalculateAmpereController;
import controller.DataController;
import controller.IntroductionController;
import controller.SplashController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Signin extends Application
{
    static Stage stage1,stage2,stage3,stage4,stage5;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        this.stage1 = primaryStage;
        splashWindow();
    }
    public void splashWindow()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(Signin.class.getResource("/view/splash.fxml"));
            AnchorPane pane = loader.load();
            SplashController controller = loader.getController();
            controller.Main(this,stage1);
            Scene scene = new Scene(pane);
            stage1.initStyle(StageStyle.UNDECORATED);
            stage1.getIcons().add(new Image(getClass().getResourceAsStream("/Image/green computer.ico")));
            stage1.setScene(scene);
            stage1.show();
        }
        catch(Exception e)
        {

        }
    }
    public void splashWindowClose()
    {
        stage1.close();
    }

    public void introductionWindow()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(Signin.class.getResource("/view/introduction.fxml"));
            AnchorPane pane = loader.load();
            IntroductionController controller = loader.getController();
            stage3 = new Stage();
            controller.Main(this,stage3);
            Scene scene = new Scene(pane);
            stage3.initStyle(StageStyle.UNDECORATED);
            stage3.getIcons().add(new Image(getClass().getResourceAsStream("/Images/green computer.ico")));
            stage3.setScene(scene);
            stage3.show();
        }
        catch(Exception e)
        {

        }
    }

    public void calculationWindow()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(Signin.class.getResource("/view/calculateAmpere.fxml"));
            AnchorPane pane = loader.load();
            CalculateAmpereController controller = loader.getController();
            stage5 = new Stage();
            controller.Main(this,stage5);
            Scene scene = new Scene(pane);
            stage5.initStyle(StageStyle.UNDECORATED);
            stage5.getIcons().add(new Image(getClass().getResourceAsStream("/Image/green computer.ico")));
            stage5.setScene(scene);
            stage5.show();
        }
        catch(Exception e)
        {

        }
    }
    public void settingWindow()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(Signin.class.getResource("/view/Data.fxml"));
            AnchorPane pane = loader.load();
            DataController controller = loader.getController();
            stage4 = new Stage();
            controller.Main(this,stage4);
            Scene scene = new Scene(pane);
            stage4.initStyle(StageStyle.UNDECORATED);
            stage4.getIcons().add(new Image(getClass().getResourceAsStream("/Images/green computer.ico")));
            stage4.setScene(scene);
            stage4.show();
        }
        catch(Exception e)
        {

        }
    }
    public void settingWindowClose()
    {
        stage4.close();
    }
    public void introWindowClose()
    {
        stage3.close();
    }

    public void questionClose()
    {
        stage1.close();
    }


}
