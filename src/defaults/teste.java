package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class teste {
  public teste() throws Exception {
    new SwingEngine(this).render("defaults/teste.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new teste();
  }
}
