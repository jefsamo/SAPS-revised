package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

public class StudentModel
{
    public StringProperty firstname,lastname,score;

    public StudentModel(String firstname, String lastname, String score)
    {
        this.firstname = new SimpleStringProperty(firstname);
        this.score = new SimpleStringProperty(score);
        this.lastname = new SimpleStringProperty(lastname);
    }

    public void setFirstname(String value)
    {
        firstname.set(value);
    }

    public void setScore(String value)
    {
        score.set(value);
    }

    public void setLastname(String value)
    {
        lastname.set(value);
    }

    public String getFirstname()
    {
        return firstname.get();
    }

    public String getScore()
    {
        return score.get();
    }

    public String getLastname()
    {
        return lastname.get();
    }

}
