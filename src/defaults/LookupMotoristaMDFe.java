package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupMotoristaMDFe {
  public LookupMotoristaMDFe() throws Exception {
    new SwingEngine(this).render("defaults/LookupMotoristaMDFe.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupMotoristaMDFe();
  }
}
