package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Produtoqc {
  public Produtoqc() throws Exception {
    new SwingEngine(this).render("defaults/Produtoqc.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Produtoqc();
  }
}
