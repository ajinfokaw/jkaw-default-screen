package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class CCMovto {
  public CCMovto() throws Exception {
    new SwingEngine(this).render("swix/CCMovto.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new CCMovto();
  }
}
