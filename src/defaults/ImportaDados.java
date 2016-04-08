package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ImportaDados {
  public ImportaDados() throws Exception {
    new SwingEngine(this).render("defaults/ImportaDados.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ImportaDados();
  }
}
