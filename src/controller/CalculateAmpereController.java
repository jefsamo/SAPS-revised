package controller;

import Main.Signin;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.RequiredFieldValidator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculateAmpereController implements Initializable {

    @FXML
    private JFXTextField noOfAppliance;

    @FXML
    private JFXTextField powerRating;

    @FXML
    private JFXTextField dailyDuty;

    @FXML
    private JFXTextField weeklyDuty;

    @FXML
    private JFXTextField nominalVoltage;

    @FXML
    private JFXTextField efficiency;

    @FXML
    private Text loadAmp;

    @FXML
    private JFXButton btnAHL;

    @FXML
    private JFXButton btnResetAHL;

    @FXML
    private JFXButton btnTotalAHL;

    @FXML
    private JFXTextField wireEfficiency;

    @FXML
    private JFXTextField batteryEfficiency;

    @FXML
    private JFXTextField peakSun;

    @FXML
    private Text correctedAmpLoad;

    @FXML
    private JFXButton btnAHC;

    @FXML
    private JFXButton btnResetAHC;

    @FXML
    private JFXButton btnDirectCurrent;

    @FXML
    private Text designCurrent;

    @FXML
    private JFXTextField moduleDerate;

    @FXML
    private JFXTextField ratedOutput;

    @FXML
    private Text deratedDesign;

    @FXML
    private Text totalAHL;

    @FXML
    private Text close;

    @FXML
    private JFXButton btnResetDeratedModule;

    @FXML
    private JFXButton btnOk;

    @FXML
    private JFXButton btnNext;

    @FXML
    private Text parallelModule;

    @FXML
    private ImageView minimizeBtn;

    @FXML
    private ImageView closeBtn;

    @FXML
    private ImageView backBtn;

    String totalAhls;
    String ahls;
    String designC;
    double ahc;
    double ahl;
    double dc;
    double totalAhl;
    double mp;
    double cdd;

    Signin su;
    Stage stage,stage2,stage3;
    public void Main(Signin su, Stage stage)
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


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        noOfAppliance.getValidators().add(validator("Number of appliance is required"));
        powerRating.getValidators().add(validator("Power rating is required"));
        dailyDuty.getValidators().add(validator("Daily duty is required"));
        weeklyDuty.getValidators().add(validator("Weekly duty is required"));
        nominalVoltage.getValidators().add(validator("Nominal voltage is required"));
        efficiency.getValidators().add(validator("Efficiency is required"));

        batteryEfficiency.getValidators().add(validator("Battery Efficiency is required"));
        peakSun.getValidators().add(validator("Peak sun is required"));
        wireEfficiency.getValidators().add(validator("Wire efficiency is required"));

        moduleDerate.getValidators().add(validator("Module derate is required"));
        ratedOutput.getValidators().add(validator("MRD Rated output is required"));

        close.setOnMouseClicked(e->{
            System.exit(0);
        });

        close.setOnMouseEntered(e->{
            close.setStyle("-fx-text-fill: red");
        });

        close.setOnMouseExited(e->{
            close.setStyle("-fx-text-fill: white");
        });
        btnResetAHL.setOnMouseClicked(e->{
            noOfAppliance.setText("");
            powerRating.setText("");
            dailyDuty.setText("");
            weeklyDuty.setText("");
            nominalVoltage.setText("");
            efficiency.setText("");
            loadAmp.setText("0");

        });

        btnAHC.setOnMouseClicked(e->{

            if(totalAHL != null)
            {
                if(wireEfficiency.getText().isEmpty() || batteryEfficiency.getText().isEmpty() || peakSun.getText().isEmpty())
                {
                    wireEfficiency.validate();
                    batteryEfficiency.validate();
                    peakSun.validate();
                }

                else{
                    double ahl = Double.parseDouble(ahls);
                    double wf = Double.parseDouble(wireEfficiency.getText().toString());
                    double bf = Double.parseDouble(batteryEfficiency.getText().toString());
                    double ps = Double.parseDouble(peakSun.getText().toString());

                    ahc = ahl/(wf*bf);
                    dc = ahc/ps;

                    String ahcs = Double.toString(ahc);
                    String f = ahcs.substring(0,6);

                    String dcs = Double.toString(dc);
                    String fs = dcs.substring(0,6);
                    correctedAmpLoad.setText(f);

                    designC = fs;
                }
            }
            else{
                //totalAHL.setText("0");

            }

        });

        btnOk.setOnMouseClicked(e->{
            if(moduleDerate.getText().isEmpty() || ratedOutput.getText().isEmpty())
            {
                moduleDerate.validate();
                ratedOutput.validate();
            }
            else{
                double md = Double.parseDouble(moduleDerate.getText());
                double ro = Double.parseDouble(ratedOutput.getText());

                cdd = dc/md;
                mp = cdd/ro;

                String w  = Double.toString(cdd);
                String f = w.substring(0,6);

                String ws  = Double.toString(mp);
                String fs = ws.substring(0,6);

                deratedDesign.setText(f);
                parallelModule.setText(fs);

            }

        });

        btnDirectCurrent.setOnMouseClicked(e->{
            if(designC != null)
            {
                designCurrent.setText(designC);
            }
            else
                designCurrent.setText("0");

        });
        btnTotalAHL.setOnMouseClicked(e-> {

            if(totalAHL != null)
            {
                String f = totalAhls.substring(0,6);
                totalAHL.setText(f);

            }
            else{
                totalAHL.setText("0");

            }

        });
        btnAHL.setOnMouseClicked(e->{

            if(powerRating.getText().isEmpty() || dailyDuty.getText().isEmpty() || weeklyDuty.getText().isEmpty() || nominalVoltage.getText().isEmpty() || efficiency.getText().isEmpty() || noOfAppliance.getText().isEmpty())
            {
                powerRating.validate();
                dailyDuty.validate();
                weeklyDuty.validate();
                nominalVoltage.validate();
                efficiency.validate();
                noOfAppliance.validate();
            }

            else{
                double p = Double.parseDouble(powerRating.getText());
                double dc = Double.parseDouble(dailyDuty.getText());
                double wdc = Double.parseDouble(weeklyDuty.getText());
                double nc = Double.parseDouble(nominalVoltage.getText());
                double eff = Double.parseDouble(efficiency.getText());
                double num = Double.parseDouble(noOfAppliance.getText());

                ahl = (p*dc*wdc)/(nc*7*eff);

                totalAhl = num * ahl;
                totalAhls =Double.toString(totalAhl);

                ahls = Double.toString(ahl);
                String f = ahls.substring(0,6);
                loadAmp.setText(f);
            }

        });

    }
}
