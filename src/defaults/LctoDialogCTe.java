package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoDialogCTe {
  public LctoDialogCTe() throws Exception {
    new SwingEngine(this).render("defaults/LctoDialogCTe.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoDialogCTe();
  }
}
