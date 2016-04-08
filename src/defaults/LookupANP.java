package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupANP {
  public LookupANP() throws Exception {
    new SwingEngine(this).render("defaults/LookupANP.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupANP();
  }
}
