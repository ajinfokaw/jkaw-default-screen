package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupClientesCartaCorreca {
  public LookupClientesCartaCorreca() throws Exception {
    new SwingEngine(this).render("swix/LookupClientesCartaCorreca.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupClientesCartaCorreca();
  }
}
