package title;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.application.Application.Parameters;


public class UserTitle extends Application {

    @Override
    public void start(Stage window) throws Exception {
        Parameters params = getParameters();
        String title = params.getNamed().get("title");
        
        window.setTitle(title);
        window.show();
    }
    
}
