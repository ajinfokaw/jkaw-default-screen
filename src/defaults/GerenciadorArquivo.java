package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class GerenciadorArquivo {
  public GerenciadorArquivo() throws Exception {
    new SwingEngine(this).render("swix/GerenciadorArquivo.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new GerenciadorArquivo();
  }
}
