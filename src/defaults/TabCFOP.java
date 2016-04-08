package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class TabCFOP {
  public TabCFOP() throws Exception {
    new SwingEngine(this).render("swix/TabCFOP.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new TabCFOP();
  }
}
