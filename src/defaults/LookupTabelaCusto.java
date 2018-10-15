package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupTabelaCusto {
  public LookupTabelaCusto() throws Exception {
    new SwingEngine(this).render("defaults/LookupTabelaCusto.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupTabelaCusto();
  }
}
