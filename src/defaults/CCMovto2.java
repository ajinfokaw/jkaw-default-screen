package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class CCMovto2 {
  public CCMovto2() throws Exception {
    new SwingEngine(this).render("defaults/CCMovto2.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new CCMovto2();
  }
}
