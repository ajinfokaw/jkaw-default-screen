package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ClassFiscal {
  public ClassFiscal() throws Exception {
    new SwingEngine(this).render("swix/ClassFiscal.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ClassFiscal();
  }
}
