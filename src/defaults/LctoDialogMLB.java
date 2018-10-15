package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoDialogMLB {
  public LctoDialogMLB() throws Exception {
    new SwingEngine(this).render("defaults/LctoDialogMLB.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoDialogMLB();
  }
}
