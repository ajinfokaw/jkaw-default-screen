package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupTabelas {
  public LookupTabelas() throws Exception {
    new SwingEngine(this).render("swix/LookupTabelas.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupTabelas();
  }
}
