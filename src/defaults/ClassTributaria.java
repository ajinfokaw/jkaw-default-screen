package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ClassTributaria {
  public ClassTributaria() throws Exception {
    new SwingEngine(this).render("swix/ClassTributaria.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ClassTributaria();
  }
}
