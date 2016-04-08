package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ClassTIPI {
  public ClassTIPI() throws Exception {
    new SwingEngine(this).render("swix/ClassTIPI.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ClassTIPI();
  }
}
