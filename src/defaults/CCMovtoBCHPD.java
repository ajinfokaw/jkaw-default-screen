package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class CCMovtoBCHPD {
  public CCMovtoBCHPD() throws Exception {
    new SwingEngine(this).render("defaults/CCMovtoBCHPD.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new CCMovtoBCHPD();
  }
}
