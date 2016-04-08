package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ClassOrigem {
  public ClassOrigem() throws Exception {
    new SwingEngine(this).render("swix/ClassOrigem.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ClassOrigem();
  }
}
