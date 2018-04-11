package w18comp1008s3apr11;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author JWright
 */
public class ContactViewController implements Initializable
{
    @FXML    private TextField firstNameTextField;
    @FXML    private TextField lastNameTextField;
    @FXML    private TextField phoneTextField;
    @FXML    private Label errMsgLabel;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        firstNameTextField.setPromptText("Enter first name");
    }    
    
    /**
     * This method will create a contact and then display it in the console
     */
    public void createContactButtonPushed()
    {
        try{
            Contact newContact = new Contact(this.firstNameTextField.getText(),
                                             this.lastNameTextField.getText(),
                                             this.phoneTextField.getText());
            this.errMsgLabel.setText("");
            System.out.printf("New Contact: %s%n", newContact);
        }
        catch (IllegalArgumentException e)
        {
            this.errMsgLabel.setText(e.getMessage());
        }
    }
    
}
