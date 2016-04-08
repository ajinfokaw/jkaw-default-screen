package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoNFCe {
  public LctoNFCe() throws Exception {
    new SwingEngine(this).render("defaults/LctoNFCe.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoNFCe();
  }
}
