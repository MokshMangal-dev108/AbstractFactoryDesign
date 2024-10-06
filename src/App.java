import factory.GUIFactory;
import factory.MacFactory;
import factory.WinFactory;
import product.Button;
import product.CheckBox;

public class App {

    private Button button;
    private CheckBox checkBox;

    public App(GUIFactory guiFactory){
        button = guiFactory.createButton();
        checkBox = guiFactory.createCheckBox();
    }

    public void createUI(){
        button.paint();
        checkBox.paint();
    }

    public static void main(String[] args) throws Exception {
        GUIFactory guiFactory;
        String os = System.getProperty("os.name").toLowerCase();
        if(os.contains("win")){
            guiFactory = new WinFactory();
        }else if(os.contains("mac")){
            guiFactory = new MacFactory();
        }else{
            throw new RuntimeException("your os is not suitable for this program");
        }
        App app = new App(guiFactory);
        app.createUI();
    }
}
