package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupClassFiscal {
  public LookupClassFiscal() throws Exception {
    new SwingEngine(this).render("swix/LookupClassFiscal.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupClassFiscal();
  }
}
