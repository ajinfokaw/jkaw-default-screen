package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupAliqINSS {
  public LookupAliqINSS() throws Exception {
    new SwingEngine(this).render("swix/LookupAliqINSS.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupAliqINSS();
  }
}
