package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class NFCe {
  public NFCe() throws Exception {
    new SwingEngine(this).render("defaults/NFCe.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new NFCe();
  }
}
