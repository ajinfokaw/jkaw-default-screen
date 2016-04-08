package main;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class MainNFe {
  public MainNFe() throws Exception {
    new SwingEngine(this).render("main/MainNFe.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new MainNFe();
  }
}
