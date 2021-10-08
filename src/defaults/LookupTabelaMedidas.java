package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupTabelaMedidas {
  public LookupTabelaMedidas() throws Exception {
    new SwingEngine(this).render("defaults/LookupTabelaMedidas.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupTabelaMedidas();
  }
}
