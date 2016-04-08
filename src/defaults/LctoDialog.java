package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoDialog {
  public LctoDialog() throws Exception {
    new SwingEngine(this).render("defaults/LctoDialog.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoDialog();
  }
}
