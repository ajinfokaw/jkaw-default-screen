package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class GerenciadorNFe {
  public GerenciadorNFe() throws Exception {
    new SwingEngine(this).render("defaults/GerenciadorNFe.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new GerenciadorNFe();
  }
}
