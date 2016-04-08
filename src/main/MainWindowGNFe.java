package main;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class MainWindowGNFe {
  public MainWindowGNFe() throws Exception {
    new SwingEngine(this).render("main/MainWindowGNFe.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new MainWindowGNFe();
  }
}
