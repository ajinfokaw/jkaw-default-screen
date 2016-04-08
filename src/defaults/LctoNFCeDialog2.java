package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoNFCeDialog2 {
  public LctoNFCeDialog2() throws Exception {
    new SwingEngine(this).render("defaults/LctoNFCeDialog2.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoNFCeDialog2();
  }
}
