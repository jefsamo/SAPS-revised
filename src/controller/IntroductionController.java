package controller;

import CBTdata.SQLEngine;
import Main.Signin;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.RequiredFieldValidator;
import javafx.animation.RotateTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class IntroductionController implements Initializable
{

    @FXML
    private AnchorPane anchorPane;

//    @FXML
//    public JFXTextField firstname;
//
//    @FXML
//    public JFXTextField lastname;

    @FXML
    private ImageView setting;

    @FXML
    private JFXComboBox<String> classcombo;
    ObservableList<String> list = FXCollections.observableArrayList();

    @FXML
    private JFXButton startbtn;

    @FXML
    private JFXButton inputBtn;

    @FXML
    private JFXButton calculateBtn;

    public static String fn;
    public static String ln;
    SQLEngine sql;
    Signin su;
    Stage stage,stage2,stage3;
    public void Main( Signin su,Stage stage)
    {
        this.stage = stage;
        this.su = su;
    }
    public RequiredFieldValidator validator(String msg)
    {
        RequiredFieldValidator validator = new RequiredFieldValidator();
        validator.setOpacity(0.5);
        validator.setMessage(msg);
        return validator;
    }
    @FXML
    void start(ActionEvent event)
    {
//        if(firstname.getText().isEmpty() || lastname.getText().isEmpty() || classcombo.getSelectionModel().isSelected(0))
//        {
//            firstname.validate();
//            lastname.validate();
//        }
            su.introWindowClose();
            questionWindow();
    }
    @FXML
    void calculateAmpHrLoad(ActionEvent event)
    {
//        if(firstname.getText().isEmpty() || lastname.getText().isEmpty() || classcombo.getSelectionModel().isSelected(0))
//        {
//            firstname.validate();
//            lastname.validate();
//        }
            su.introWindowClose();
        calculateAmpere();
    }
    @FXML
    void input(ActionEvent event)
    {
//        if(firstname.getText().isEmpty() || lastname.getText().isEmpty() || classcombo.getSelectionModel().isSelected(0))
//        {
//            firstname.validate();
//            lastname.validate();
//        }
            su.introWindowClose();
            questionWindow();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
//        firstname.getValidators().add(validator("Surname is required"));
//        lastname.getValidators().add(validator("Othernames is required"));
//        list.addAll("Class","JSS1","JSS2","JSS3","SS1","SS2","SS3");
//        classcombo.setItems(list);
//        fn = firstname.getText().toString();
//        ln = lastname.getText().toString();

        setting.setOnMouseEntered(e ->{
            RotateTransition rotateTransition=new RotateTransition(Duration.seconds(2), setting);
            rotateTransition.setFromAngle(0);
            rotateTransition.setToAngle(360);
            rotateTransition.play();
        });

        setting.setOnMouseClicked(e ->{

            su.settingWindow();
            su.introWindowClose();
        });
        //stage.getIcons().add(new Image(getClass().getResourceAsStream("/Image/green computer.ico")));
    }

    public void questionWindow()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(Signin.class.getResource("/view/question.fxml"));
            AnchorPane pane = loader.load();
            QuestionController controller = loader.getController();
            //controller.details(firstname.getText().toUpperCase(),lastname.getText());
            stage3 = new Stage();
            Scene scene = new Scene(pane);
            stage3.initStyle(StageStyle.UNDECORATED);
            //stage2.getIcons().add(new Image(getClass().getResourceAsStream("/Images/green computer.ico")));
            stage3.setScene(scene);
            stage3.show();
        }
        catch(Exception e)
        {

        }
    }

    public void calculateAmpere()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(Signin.class.getResource("/view/calculateAmpere.fxml"));
            AnchorPane pane = loader.load();
            CalculateAmpereController controller = loader.getController();
            //controller.details(firstname.getText().toUpperCase(),lastname.getText());
            stage2 = new Stage();
            Scene scene = new Scene(pane);
            stage2.initStyle(StageStyle.UNDECORATED);
            //stage2.getIcons().add(new Image(getClass().getResourceAsStream("/Images/green computer.ico")));
            stage2.setScene(scene);
            stage2.show();
        }
        catch(Exception e)
        {

        }
    }

}
