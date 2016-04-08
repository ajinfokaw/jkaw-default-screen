package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupTabelaPrecoDir {
  public LookupTabelaPrecoDir() throws Exception {
    new SwingEngine(this).render("swix/LookupTabelaPrecoDir.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupTabelaPrecoDir();
  }
}
