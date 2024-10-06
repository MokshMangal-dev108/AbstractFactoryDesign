package Button;

import product.Button;

public class WinButton implements Button{

    @Override
    public void paint() {
        System.out.println("Rendring a button in windows style");
    }
    
}
