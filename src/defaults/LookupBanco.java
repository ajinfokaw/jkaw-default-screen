package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupBanco {
  public LookupBanco() throws Exception {
    new SwingEngine(this).render("swix/LookupBanco.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupBanco();
  }
}
