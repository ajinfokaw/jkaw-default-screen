package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class UnMedida {
  public UnMedida() throws Exception {
    new SwingEngine(this).render("swix/UnMedida.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new UnMedida();
  }
}
