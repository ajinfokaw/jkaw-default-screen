package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoMdfeUtils {
  public LctoMdfeUtils() throws Exception {
    new SwingEngine(this).render("defaults/LctoMdfeUtils.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoMdfeUtils();
  }
}
