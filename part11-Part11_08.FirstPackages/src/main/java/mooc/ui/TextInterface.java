
package mooc.ui;

import mooc.ui.UserInterface;

/**
 *
 * @author logan
 */
public class TextInterface implements UserInterface {

    @Override
    public void update() {
        System.out.println("Updating UI");
    }
    
}
