package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class TbCampos {
  public TbCampos() throws Exception {
    new SwingEngine(this).render("swix/TbCampos.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new TbCampos();
  }
}
