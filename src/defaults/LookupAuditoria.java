package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupAuditoria {
  public LookupAuditoria() throws Exception {
    new SwingEngine(this).render("swix/LookupAuditoria.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupAuditoria();
  }
}
