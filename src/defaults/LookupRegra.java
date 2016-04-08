package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupRegra {
  public LookupRegra() throws Exception {
    new SwingEngine(this).render("swix/LookupRegra.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupRegra();
  }
}
