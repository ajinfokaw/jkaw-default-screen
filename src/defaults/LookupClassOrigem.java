package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupClassOrigem {
  public LookupClassOrigem() throws Exception {
    new SwingEngine(this).render("swix/LookupClassOrigem.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupClassOrigem();
  }
}
