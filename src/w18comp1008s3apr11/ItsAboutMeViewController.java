package w18comp1008s3apr11;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class
 *
 * @author JWright
 */
public class ItsAboutMeViewController implements Initializable
{
    @FXML private ImageView imageView;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        imageView.setImage(new Image("JW.jpg"));
        
        //set up a "clip" to apply a rounded border to the image
        Rectangle clip = new Rectangle(imageView.getFitWidth(), 
                                       imageView.getFitHeight());
        clip.setArcWidth(60);
        clip.setArcHeight(60);
        imageView.setClip(clip);
    }    
}
