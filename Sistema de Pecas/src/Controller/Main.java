
package Controller;

import View.Principal;
import java.awt.Frame;

public class Main {


    public static void main(String[] args) {
        Principal pri = new Principal();
        pri.setVisible(true);
        pri.setLocationRelativeTo(null);
        pri.setExtendedState(Frame.MAXIMIZED_BOTH);
        
    }
    
}
