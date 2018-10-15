package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoCTeDialog {
  public LctoCTeDialog() throws Exception {
    new SwingEngine(this).render("defaults/LctoCTeDialog.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoCTeDialog();
  }
}
