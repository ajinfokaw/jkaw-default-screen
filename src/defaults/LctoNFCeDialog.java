package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoNFCeDialog {
  public LctoNFCeDialog() throws Exception {
    new SwingEngine(this).render("defaults/LctoNFCeDialog.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoNFCeDialog();
  }
}
