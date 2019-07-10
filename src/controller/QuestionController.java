package controller;
import CBTdata.SQLEngine;
import Main.Signin;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.net.URL;
import java.sql.SQLException;
import java.util.Optional;
import java.util.ResourceBundle;

public class QuestionController implements Initializable
{
    @FXML
    private Label min, sec;

    @FXML
    private JFXButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btnSubmit;

    @FXML
    private Pane pane1,pane2,pane3,pane4,pane5,pane6,pane7,pane8,pane9,pane10,pane11,pane12,pane13,pane14,pane15,pane16,pane17,pane18,pane19,pane20,paneSubmit;

    @FXML
    private JFXRadioButton radioBtn4,radioBtn41;

    @FXML
    private JFXRadioButton radioBtn5,radioBtn51,radioBtn52,radioBtn53,radioBtn54;

    @FXML
    private JFXRadioButton radioBtn20,radioBtn201,radioBtn202,radioBtn203,radioBtn204;

    @FXML
    private JFXRadioButton radioBtn19,radioBtn191,radioBtn192,radioBtn193,radioBtn194;

    @FXML
    private JFXRadioButton radioBtn18,radioBtn181,radioBtn182,radioBtn183,radioBtn184;

    @FXML
    private JFXRadioButton radioBtn6,radioBtn61,radioBtn62,radioBtn63,radioBtn64;

    @FXML
    private JFXRadioButton radioBtn7,radioBtn71,radioBtn72,radioBtn73,radioBtn74;

    @FXML
    private JFXRadioButton radioBtn8,radioBtn81,radioBtn82,radioBtn83,radioBtn84;

    @FXML
    private JFXRadioButton radioBtn14,radioBtn141,radioBtn142,radioBtn143,radioBtn144;

    @FXML
    private JFXRadioButton radioBtn10,radioBtn101,radioBtn102,radioBtn103,radioBtn104;

    @FXML
    private JFXRadioButton radioBtn15,radioBtn151,radioBtn152,radioBtn153,radioBtn154;

    @FXML
    private JFXRadioButton radioBtn16,radioBtn161,radioBtn162,radioBtn163,radioBtn164;

    @FXML
    private JFXRadioButton radioBtn12,radioBtn121,radioBtn122,radioBtn123,radioBtn124;

    @FXML
    private JFXRadioButton radioBtn11,radioBtn111,radioBtn112,radioBtn113,radioBtn114;

    @FXML
    private JFXRadioButton radioBtn17,radioBtn171,radioBtn172,radioBtn173,radioBtn174;

    @FXML
    private JFXRadioButton radioBtn01,radioBtn011,radioBtn012,radioBtn013,radioBtn014;

    @FXML
    private JFXRadioButton radioBtn03,radioBtn031,radioBtn032,radioBtn033,radioBtn034;

    @FXML
    private JFXRadioButton radioBtn9,radioBtn91;

    @FXML
    private JFXRadioButton radioBtn3,radioBtn31;


    @FXML
    private JFXTextField txt2,txt21,txt22;

    @FXML
    private Text fname,lname,close;
    SQLEngine sql;
    private int mins,secs ;
    Timeline second;
    Signin su;
    Stage stage;
    int count = 0;
    ToggleGroup toggleGroup4;
    ToggleGroup toggleGroup5;
    ToggleGroup toggleGroup20;
    ToggleGroup toggleGroup19;
    ToggleGroup toggleGroup18;
    ToggleGroup toggleGroup6;
    ToggleGroup toggleGroup9;
    ToggleGroup toggleGroup3;
    ToggleGroup toggleGroup7;
    ToggleGroup toggleGroup8;
    ToggleGroup toggleGroup14;
    ToggleGroup toggleGroup10;
    ToggleGroup toggleGroup15;
    ToggleGroup toggleGroup16;
    ToggleGroup toggleGroup12;
    ToggleGroup toggleGroup11;
    ToggleGroup toggleGroup1;
    ToggleGroup toggleGroup03;
    ToggleGroup toggleGroup17;


    public void Main( Signin su,Stage stage)
    {
        this.stage = stage;
        this.su = su;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

        //stage.getIcons().add(new Image(getClass().getResourceAsStream("/Images/green computer.ico")));
        toggleGroup4 = new ToggleGroup();
        radioBtn4.setToggleGroup(toggleGroup4);
        radioBtn41.setToggleGroup(toggleGroup4);
        toggleGroup4.selectToggle(radioBtn4);

        toggleGroup3 = new ToggleGroup();
        radioBtn3.setToggleGroup(toggleGroup3);
        radioBtn31.setToggleGroup(toggleGroup3);
        toggleGroup3.selectToggle(radioBtn31);

        toggleGroup5 = new ToggleGroup();
        radioBtn5.setToggleGroup(toggleGroup5);
        radioBtn51.setToggleGroup(toggleGroup5);
        radioBtn52.setToggleGroup(toggleGroup5);
        radioBtn53.setToggleGroup(toggleGroup5);
        radioBtn54.setToggleGroup(toggleGroup5);
        toggleGroup5.selectToggle(radioBtn54);

        toggleGroup03 = new ToggleGroup();
        radioBtn03.setToggleGroup(toggleGroup03);
        radioBtn031.setToggleGroup(toggleGroup03);
        radioBtn032.setToggleGroup(toggleGroup03);
        radioBtn033.setToggleGroup(toggleGroup03);
        radioBtn034.setToggleGroup(toggleGroup03);
        toggleGroup03.selectToggle(radioBtn034);

        toggleGroup20 = new ToggleGroup();
        radioBtn20.setToggleGroup(toggleGroup20);
        radioBtn201.setToggleGroup(toggleGroup20);
        radioBtn202.setToggleGroup(toggleGroup20);
        radioBtn203.setToggleGroup(toggleGroup20);
        radioBtn204.setToggleGroup(toggleGroup20);
        toggleGroup20.selectToggle(radioBtn204);

        toggleGroup1 = new ToggleGroup();
        radioBtn01.setToggleGroup(toggleGroup1);
        radioBtn011.setToggleGroup(toggleGroup1);
        radioBtn012.setToggleGroup(toggleGroup1);
        radioBtn013.setToggleGroup(toggleGroup1);
        radioBtn014.setToggleGroup(toggleGroup1);
        toggleGroup1.selectToggle(radioBtn014);

        toggleGroup19 = new ToggleGroup();
        radioBtn19.setToggleGroup(toggleGroup19);
        radioBtn191.setToggleGroup(toggleGroup19);
        radioBtn192.setToggleGroup(toggleGroup19);
        radioBtn193.setToggleGroup(toggleGroup19);
        radioBtn194.setToggleGroup(toggleGroup19);
        toggleGroup19.selectToggle(radioBtn194);

        toggleGroup17 = new ToggleGroup();
        radioBtn17.setToggleGroup(toggleGroup17);
        radioBtn171.setToggleGroup(toggleGroup17);
        radioBtn172.setToggleGroup(toggleGroup17);
        radioBtn173.setToggleGroup(toggleGroup17);
        radioBtn174.setToggleGroup(toggleGroup17);
        toggleGroup17.selectToggle(radioBtn174);

        toggleGroup15 = new ToggleGroup();
        radioBtn15.setToggleGroup(toggleGroup15);
        radioBtn151.setToggleGroup(toggleGroup15);
        radioBtn152.setToggleGroup(toggleGroup15);
        radioBtn153.setToggleGroup(toggleGroup15);
        radioBtn154.setToggleGroup(toggleGroup15);
        toggleGroup15.selectToggle(radioBtn154);

        toggleGroup12 = new ToggleGroup();
        radioBtn12.setToggleGroup(toggleGroup12);
        radioBtn121.setToggleGroup(toggleGroup12);
        radioBtn122.setToggleGroup(toggleGroup12);
        radioBtn123.setToggleGroup(toggleGroup12);
        radioBtn124.setToggleGroup(toggleGroup12);
        toggleGroup12.selectToggle(radioBtn124);


        toggleGroup16 = new ToggleGroup();
        radioBtn16.setToggleGroup(toggleGroup16);
        radioBtn161.setToggleGroup(toggleGroup16);
        radioBtn162.setToggleGroup(toggleGroup16);
        radioBtn163.setToggleGroup(toggleGroup16);
        radioBtn164.setToggleGroup(toggleGroup16);
        toggleGroup16.selectToggle(radioBtn164);

        toggleGroup18 = new ToggleGroup();
        radioBtn18.setToggleGroup(toggleGroup18);
        radioBtn181.setToggleGroup(toggleGroup18);
        radioBtn182.setToggleGroup(toggleGroup18);
        radioBtn183.setToggleGroup(toggleGroup18);
        radioBtn184.setToggleGroup(toggleGroup18);
        toggleGroup18.selectToggle(radioBtn184);

        toggleGroup10 = new ToggleGroup();
        radioBtn10.setToggleGroup(toggleGroup10);
        radioBtn101.setToggleGroup(toggleGroup10);
        radioBtn102.setToggleGroup(toggleGroup10);
        radioBtn103.setToggleGroup(toggleGroup10);
        radioBtn104.setToggleGroup(toggleGroup10);
        toggleGroup10.selectToggle(radioBtn104);

        toggleGroup11 = new ToggleGroup();
        radioBtn11.setToggleGroup(toggleGroup11);
        radioBtn111.setToggleGroup(toggleGroup11);
        radioBtn112.setToggleGroup(toggleGroup11);
        radioBtn113.setToggleGroup(toggleGroup11);
        radioBtn114.setToggleGroup(toggleGroup11);
        toggleGroup11.selectToggle(radioBtn114);

        toggleGroup6 = new ToggleGroup();
        radioBtn6.setToggleGroup(toggleGroup6);
        radioBtn61.setToggleGroup(toggleGroup6);
        radioBtn62.setToggleGroup(toggleGroup6);
        radioBtn63.setToggleGroup(toggleGroup6);
        radioBtn64.setToggleGroup(toggleGroup6);
        toggleGroup6.selectToggle(radioBtn64);

        toggleGroup7 = new ToggleGroup();
        radioBtn7.setToggleGroup(toggleGroup7);
        radioBtn71.setToggleGroup(toggleGroup7);
        radioBtn72.setToggleGroup(toggleGroup7);
        radioBtn73.setToggleGroup(toggleGroup7);
        radioBtn74.setToggleGroup(toggleGroup7);
        toggleGroup7.selectToggle(radioBtn74);

        toggleGroup8 = new ToggleGroup();
        radioBtn8.setToggleGroup(toggleGroup8);
        radioBtn81.setToggleGroup(toggleGroup8);
        radioBtn82.setToggleGroup(toggleGroup8);
        radioBtn83.setToggleGroup(toggleGroup8);
        radioBtn84.setToggleGroup(toggleGroup8);
        toggleGroup8.selectToggle(radioBtn84);

        toggleGroup14 = new ToggleGroup();
        radioBtn14.setToggleGroup(toggleGroup14);
        radioBtn141.setToggleGroup(toggleGroup14);
        radioBtn142.setToggleGroup(toggleGroup14);
        radioBtn143.setToggleGroup(toggleGroup14);
        radioBtn144.setToggleGroup(toggleGroup14);
        toggleGroup14.selectToggle(radioBtn144);

        toggleGroup9 = new ToggleGroup();
        radioBtn9.setToggleGroup(toggleGroup9);
        radioBtn91.setToggleGroup(toggleGroup9);
        toggleGroup9.selectToggle(radioBtn91);

        mins = 20;
        secs = 59;
        min.setText(Integer.toString(mins));
        sec.setText(Integer.toString(secs));
        second = new Timeline();
        second.setCycleCount(Animation.INDEFINITE);
        second.getKeyFrames().add(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                secs--;
                sec.setText(Integer.toString(secs));
                if(secs == 0)
                {
                    if(mins == 0)
                    {

                        paneSubmit.toFront();
                        mark();
                        sql = new SQLEngine();
                        try {
                            sql.insertIntoTable(fname.getText(),lname.getText(),Integer.toString((count*10)/2));
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                    mins--;
                    secs = 59;
                    min.setText(Integer.toString(mins));
                    second.playFromStart();
                    sec.setText(Integer.toString(secs));
                }
            }
        }));
        second.playFromStart();
        close.setOnMouseClicked(e->{
            System.exit(0);
        });
        close.setOnMouseEntered(e->{
            close.setStyle("-fx-text-fill: red");
        });

        close.setOnMouseExited(e->{
            close.setStyle("-fx-text-fill: white");
        });

        btn1.setOnMouseClicked(e->{
            pane1.toFront();
            btn1.setStyle("-fx-background-color:  #33cc94");
            btn1.setStyle("-fx-border-color:  #ffffff");
        });
        btn2.setOnMouseClicked(e->{
            pane2.toFront();
            btn2.setStyle("-fx-background-color:  #33cc94");
            btn2.setStyle("-fx-border-color:  #ffffff");
        });
        btn3.setOnMouseClicked(e->{
            pane3.toFront();
            btn3.setStyle("-fx-background-color:  #33cc94");
            btn3.setStyle("-fx-border-color:  #ffffff");
        });
        btn4.setOnMouseClicked(e->{
            pane4.toFront();
            btn4.setStyle("-fx-background-color:  #33cc94");
            btn4.setStyle("-fx-border-color:  #ffffff");
        });
        btn5.setOnMouseClicked(e->{
            pane5.toFront();
            btn5.setStyle("-fx-background-color:  #33cc94");
            btn5.setStyle("-fx-border-color:  #ffffff");
        });
        btn6.setOnMouseClicked(e->{
            pane6.toFront();
            btn6.setStyle("-fx-background-color:  #33cc94");
            btn6.setStyle("-fx-border-color:  #ffffff");
        });
        btn7.setOnMouseClicked(e->{
            pane7.toFront();
            btn7.setStyle("-fx-background-color:  #33cc94");
            btn7.setStyle("-fx-border-color:  #ffffff");
        });
        btn8.setOnMouseClicked(e->{
            pane8.toFront();
            btn8.setStyle("-fx-background-color:  #33cc94");
            btn8.setStyle("-fx-border-color:  #ffffff");
        });
        btn9.setOnMouseClicked(e->{
            pane9.toFront();
            btn9.setStyle("-fx-background-color:  #33cc94");
            btn9.setStyle("-fx-border-color:  #ffffff");
        });
        btn10.setOnMouseClicked(e->{
            pane10.toFront();
            btn10.setStyle("-fx-background-color:  #33cc94");
            btn10.setStyle("-fx-border-color:  #ffffff");
        });
        btn11.setOnMouseClicked(e->{
            pane11.toFront();
            btn11.setStyle("-fx-background-color:  #33cc94");
            btn11.setStyle("-fx-border-color:  #ffffff");
        });
        btn12.setOnMouseClicked(e->{
            pane12.toFront();
            btn12.setStyle("-fx-background-color:  #33cc94");
            btn12.setStyle("-fx-border-color:  #ffffff");
        });
        btn13.setOnMouseClicked(e->{
            pane13.toFront();
            btn13.setStyle("-fx-background-color:  #33cc94");
            btn13.setStyle("-fx-border-color:  #ffffff");
        });
        btn14.setOnMouseClicked(e->{
            pane14.toFront();
            btn14.setStyle("-fx-background-color:  #33cc94");
            btn14.setStyle("-fx-border-color:  #ffffff");
        });
        btn15.setOnMouseClicked(e->{
            pane15.toFront();
            btn15.setStyle("-fx-background-color:  #33cc94");
            btn15.setStyle("-fx-border-color:  #ffffff");
        });
        btn16.setOnMouseClicked(e->{
            pane16.toFront();
            btn16.setStyle("-fx-background-color:  #33cc94");
            btn16.setStyle("-fx-border-color:  #ffffff");
        });
        btn17.setOnMouseClicked(e->{
            pane17.toFront();
            btn17.setStyle("-fx-background-color:  #33cc94");
            btn17.setStyle("-fx-border-color:  #ffffff");
        });
        btn18.setOnMouseClicked(e->{
            pane18.toFront();
            btn18.setStyle("-fx-background-color:  #33cc94");
            btn18.setStyle("-fx-border-color:  #ffffff");
        });
        btn19.setOnMouseClicked(e->{
            pane19.toFront();
            btn19.setStyle("-fx-background-color:  #33cc94");
            btn19.setStyle("-fx-border-color:  #ffffff");
        });
        btn20.setOnMouseClicked(e->{
            pane20.toFront();
            btn20.setStyle("-fx-background-color:  #33cc94");
            btn20.setStyle("-fx-border-color:  #ffffff");
        });
        btnSubmit.setOnMouseClicked(e->{
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Submit");
            alert.setHeaderText("Do you want to Submit?");
            alert.setContentText("Are you ok with this?");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get().equals(ButtonType.OK) )
            {
                paneSubmit.toFront();
                mark();
                sql = new SQLEngine();
                try {
                    sql.insertIntoTable(fname.getText(),lname.getText(),Integer.toString((count*10)/2));
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            } else {
                alert.hide();
            }
        });
    }
    public void mouseEntered(MouseEvent event)
    {
        close.setStyle("-fx-fill: red");
    }
    public void mouseExited(MouseEvent event)
    {
        close.setStyle("-fx-fill: white");
    }


    public void mark()
    {
        if (toggleGroup5.getSelectedToggle().equals(this.radioBtn53))
        {
            count++;
        }
       
        if (toggleGroup1.getSelectedToggle().equals(this.radioBtn012))
        {
            count++;
        }
        if (toggleGroup03.getSelectedToggle().equals(this.radioBtn033)) {
            count++;
        }
        if (toggleGroup20.getSelectedToggle().equals(this.radioBtn201)) {
            count++;
        }

        if (toggleGroup19.getSelectedToggle().equals(this.radioBtn192)) {
            count++;
        }
        if (toggleGroup18.getSelectedToggle().equals(this.radioBtn18)) {
            count++;
        }
        if (toggleGroup4.getSelectedToggle().equals(this.radioBtn4)) {
            count++;
        }
        if (toggleGroup6.getSelectedToggle().equals(this.radioBtn62)) {
            count++;
        }
        if (toggleGroup9.getSelectedToggle().equals(this.radioBtn9)) {
            count++;
        }
        if (toggleGroup3.getSelectedToggle().equals(this.radioBtn31)) {
            count++;
        }
        if (toggleGroup7.getSelectedToggle().equals(this.radioBtn71)) {
            count++;
        }

        if (toggleGroup8.getSelectedToggle().equals(this.radioBtn83)) {
            count++;
        }

        if (toggleGroup14.getSelectedToggle().equals(this.radioBtn141)) {
            count++;
        }
        if (toggleGroup10.getSelectedToggle().equals(this.radioBtn102)) {
            count++;
        }

        if (toggleGroup11.getSelectedToggle().equals(this.radioBtn111)) {
            count++;
        }
        if (toggleGroup15.getSelectedToggle().equals(this.radioBtn151)) {
            count++;
        }
        if (toggleGroup12.getSelectedToggle().equals(this.radioBtn12)) {
            count++;
        }
        if (toggleGroup16.getSelectedToggle().equals(this.radioBtn162)) {
            count++;
        }
        if (txt2.getText().toString().equalsIgnoreCase("making call") || txt2.getText().toString().equalsIgnoreCase("making calls") || txt2.getText().toString().equalsIgnoreCase("calls") || txt2.getText().toString().equalsIgnoreCase("calling") || txt2.getText().toString().contains("calls")
                && txt21.getText().toString().contains("print") || txt21.getText().toString().contains("printing") && txt22.getText().toString().contains("storage") || txt22.getText().toString().contains("store")) {
            count++;
        }
        else
        {

        }
    }

    public void details(String fn,String ln)
    {
        lname.setText(ln);
        fname.setText(fn);
    }

}
