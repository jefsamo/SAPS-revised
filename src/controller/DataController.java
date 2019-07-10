package controller;

import CBTdata.SQLEngine;
import Main.Signin;
import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.StudentModel;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DataController implements Initializable
{

    @FXML
    private TableView<StudentModel> table;

    @FXML
    private TableColumn<StudentModel, String> tblFirstname;

    @FXML
    private TableColumn<StudentModel, String> tblLastname;

    @FXML
    private TableColumn<StudentModel, String> tblScore;

    @FXML
    private JFXButton btnLoad;

    @FXML
    private ImageView arrow;
    private ObservableList<StudentModel> data;
    private SQLEngine sql;

    Signin su;
    Stage stage;

    public void Main(Signin su, Stage stage)
    {
        this.stage = stage;
        this.su = su;

    }
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        sql = new SQLEngine();

        arrow.setOnMouseClicked(e->
        {
            su.introductionWindow();
            su.settingWindowClose();
        });

    }
    @FXML
    void loadData(ActionEvent event) throws SQLException
    {
        Connection con = sql.createConnection();
        data = FXCollections.observableArrayList();
        ResultSet resultSet = con.createStatement().executeQuery("SELECT * FROM DETAIL");
        while(resultSet.next())
        {
            data.add(new StudentModel(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3)));
        }
        tblFirstname.setCellValueFactory(new PropertyValueFactory<>("firstname"));
        tblLastname.setCellValueFactory(new PropertyValueFactory<>("lastname"));
        tblScore.setCellValueFactory(new PropertyValueFactory<>("score"));
        table.setItems(null);
        table.setItems(data);


    }
}
