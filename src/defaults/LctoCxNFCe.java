package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoCxNFCe {
  public LctoCxNFCe() throws Exception {
    new SwingEngine(this).render("defaults/LctoCxNFCe.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoCxNFCe();
  }
}
