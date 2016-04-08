package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupProdutor {
  public LookupProdutor() throws Exception {
    new SwingEngine(this).render("swix/LookupProdutor.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupProdutor();
  }
}
