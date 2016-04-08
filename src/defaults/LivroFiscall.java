package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LivroFiscall {
  public LivroFiscall() throws Exception {
    new SwingEngine(this).render("swix/LivroFiscall.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LivroFiscall();
  }
}
