package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupImpressora {
  public LookupImpressora() throws Exception {
    new SwingEngine(this).render("defaults/LookupImpressora.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupImpressora();
  }
}
