package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupIrregularidade {
  public LookupIrregularidade() throws Exception {
    new SwingEngine(this).render("swix/LookupIrregularidade.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupIrregularidade();
  }
}
