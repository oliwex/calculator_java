/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


/**
 * FXML Controller class
 *
 * @author Minio
 */
public class GuiController implements Initializable
{

    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button minus;
    @FXML
    private Button plus;
    @FXML
    private Button multiply;
    @FXML
    private Button divide;    
    @FXML
    private Button equals;
    @FXML
    private Button delete;
    @FXML
    public TextField text;
    
    private static char character='.';
    
    
    @FXML
    private void setSign()
    {
        this.one.setText("1");
        this.two.setText("2");
        this.three.setText("3");
        this.four.setText("4");
        this.five.setText("5");
        this.six.setText("6");
        this.seven.setText("7");
        this.eight.setText("8");
        this.nine.setText("9");
        
        this.plus.setText("+");
        this.minus.setText("-");
        this.multiply.setText("*");
        this.divide.setText("/");
        
        this.equals.setText("=");
        this.text.setText("");
        this.delete.setText("C");
    }
    
    
    /*--liczby--*/
    @FXML
    public void setOne(ActionEvent e)
    {
        String text=this.text.getText(); //przypisanie do zmiennej text
        this.text.setText(text+"1");
    }
    
    @FXML
    public void setTwo(ActionEvent e)
    {
        String text=this.text.getText(); //przypisanie do zmiennej text
        this.text.setText(text+"2");
    }
    @FXML
    public void setThree(ActionEvent e)
    {
        String text=this.text.getText(); //przypisanie do zmiennej text
        this.text.setText(text+"3");
    }
    @FXML
    public void setFour(ActionEvent e)
    {
        String text=this.text.getText(); //przypisanie do zmiennej text
        this.text.setText(text+"4");
    }
    @FXML
    public void setFive(ActionEvent e)
    {
        String text=this.text.getText(); //przypisanie do zmiennej text
        this.text.setText(text+"5");
    }
    @FXML
    public void setSix(ActionEvent e)
    {
        String text=this.text.getText(); //przypisanie do zmiennej text
        this.text.setText(text+"6");
    }
    @FXML
    public void setSeven(ActionEvent e)
    {
        String text=this.text.getText(); //przypisanie do zmiennej text
        this.text.setText(text+"7");
    }
    @FXML
    public void setEight(ActionEvent e)
    {
        String text=this.text.getText(); //przypisanie do zmiennej text
        this.text.setText(text+"8");
    }
    @FXML
    public void setNine(ActionEvent e)
    {
        String text=this.text.getText(); //przypisanie do zmiennej text
        this.text.setText(text+"9");
    }
    @FXML
    public void deleteField(ActionEvent e)
    {
        this.text.setText("");
    }
    
    
    /*--znaki--*/
    @FXML
    public void setPlus(ActionEvent e)
    {
        String text=this.text.getText(); //przypisanie do zmiennej text
        this.text.setText(text+"+");
        this.character='+';
    }
    
    @FXML
    public void setMinus(ActionEvent e)
    {
        String text=this.text.getText(); //przypisanie do zmiennej text
        this.text.setText(text+"-");
        this.character='-';
    }
    @FXML
    public void setDivide(ActionEvent e)
    {
        String text=this.text.getText(); //przypisanie do zmiennej text
        this.text.setText(text+":");
        this.character='/';
    }
    
    @FXML
    public void setMultiply(ActionEvent e)
    {
        String text=this.text.getText(); //przypisanie do zmiennej text
        this.text.setText(text+"*");
        this.character='*';
    }
    
    
    private int getScore()
    {
        int character_position;
        int liczba_a,liczba_b,wynik=0;
    
        switch (this.character)
        {
            case '+':
            {
                character_position=this.text.getText().indexOf(this.character)+1; //pozycja znaku z polu
                liczba_a=Integer.parseInt(this.text.getText().substring(0, this.text.getText().indexOf(this.character)));//pobranie 1 liczby
                liczba_b=Integer.parseInt(this.text.getText().substring(character_position,this.text.getText().indexOf('='))); //pobranie 2 liczby
                System.out.println("A: "+liczba_a);
                System.out.println("B: "+liczba_b);
                
                wynik=liczba_a+liczba_b;
                
                break;
            }
            case '-':
            {
                character_position=this.text.getText().indexOf(this.character)+1; //pozycja znaku z polu
                liczba_a=Integer.parseInt(this.text.getText().substring(0, this.text.getText().indexOf(this.character)));//pobranie 1 liczby
                liczba_b=Integer.parseInt(this.text.getText().substring(character_position,this.text.getText().indexOf('='))); //pobranie 2 liczby
                System.out.println("A: "+liczba_a);
                System.out.println("B: "+liczba_b);
                
                wynik=liczba_a-liczba_b;
                break;
            }
            case '*':
            {
                character_position=this.text.getText().indexOf(this.character)+1; //pozycja znaku z polu
                liczba_a=Integer.parseInt(this.text.getText().substring(0, this.text.getText().indexOf(this.character)));//pobranie 1 liczby
                liczba_b=Integer.parseInt(this.text.getText().substring(character_position,this.text.getText().indexOf('='))); //pobranie 2 liczby
                System.out.println("A: "+liczba_a);
                System.out.println("B: "+liczba_b);
                
                wynik=liczba_a*liczba_b;
                break;
            }
            case '/':
            {
                character_position=this.text.getText().indexOf(this.character)+1; //pozycja znaku z polu
                liczba_a=Integer.parseInt(this.text.getText().substring(0, this.text.getText().indexOf(this.character)));//pobranie 1 liczby
                liczba_b=Integer.parseInt(this.text.getText().substring(character_position,this.text.getText().indexOf('='))); //pobranie 2 liczby
                System.out.println("A: "+liczba_a);
                System.out.println("B: "+liczba_b);
                wynik=liczba_a/liczba_b;
                    
 
                break;
            }
        }
        return wynik;
    }
    
    public void setEqual(ActionEvent e)
    {
        /*wpisanie =*/
        String text=this.text.getText(); //przypisanie do zmiennej text
        this.text.setText(text+"=");
        this.text.setText(Integer.toString(this.getScore()));
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        this.setSign();
        this.text.setText("");
    }
}
    
    
    
    
    
    

    



    

