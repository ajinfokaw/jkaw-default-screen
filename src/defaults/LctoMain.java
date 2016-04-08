package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoMain {
  public LctoMain() throws Exception {
    new SwingEngine(this).render("defaults/LctoMain.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoMain();
  }
}
