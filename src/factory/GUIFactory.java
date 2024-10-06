package factory;

import product.Button;
import product.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
