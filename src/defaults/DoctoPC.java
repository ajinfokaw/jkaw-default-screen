package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class DoctoPC {
  public DoctoPC() throws Exception {
    new SwingEngine(this).render("swix/DoctoPC.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new DoctoPC();
  }
}
