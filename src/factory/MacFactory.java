package factory;

import Button.MacButton;
import CheckBox.MacCheckBox;
import product.Button;
import product.CheckBox;

/**
 * MacFactory
 */
public class MacFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }

    
}