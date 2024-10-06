package factory;

import Button.WinButton;
import CheckBox.WinCheckBox;
import product.Button;
import product.CheckBox;

/**
 * WinFactory
 */
public class WinFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }

    
}