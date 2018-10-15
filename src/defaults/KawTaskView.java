package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class KawTaskView {
  public KawTaskView() throws Exception {
    new SwingEngine(this).render("defaults/KawTaskView.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new KawTaskView();
  }
}
