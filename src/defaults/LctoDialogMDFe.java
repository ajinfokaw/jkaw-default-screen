package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoDialogMDFe {
  public LctoDialogMDFe() throws Exception {
    new SwingEngine(this).render("defaults/LctoDialogMDFe.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoDialogMDFe();
  }
}
