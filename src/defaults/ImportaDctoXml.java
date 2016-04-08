package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ImportaDctoXml {
  public ImportaDctoXml() throws Exception {
    new SwingEngine(this).render("defaults/ImportaDctoXml.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ImportaDctoXml();
  }
}
