package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupColunas {
  public LookupColunas() throws Exception {
    new SwingEngine(this).render("swix/LookupColunas.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupColunas();
  }
}
