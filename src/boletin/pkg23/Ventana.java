/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg23;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Diego
 */
public class Ventana extends JFrame{
    String [] datos =  {"Elemento 1", "Elemento 2", "Elemento 3"};
    JFrame window = new JFrame();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JLabel nombre = new JLabel("Nombre");
    JLabel contraseña = new JLabel("Contraseña");
    JButton presionar = new JButton("Presionar");
    JButton limpiar = new JButton("Lipiar");
    JTextField name = new JTextField();
    JPasswordField password = new JPasswordField();
    JList lista = new JList(datos);
    JButton boton = new JButton("Boton");
    JTextArea area = new JTextArea();
    
    public Ventana(){
        window.setSize(500, 750);
        window.setLayout(null);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ajustarElementos();
    }
    
    public void ajustarElementos(){
        paneles();
        labelsP1();
        botonesP1();
        textoP1();
        listaP2();
        botonP2();
        textoP2();
    }
    
    public void paneles(){
        panel1.setSize(400,300);
        panel1.setLocation(50, 50);
        panel1.setBorder(new LineBorder(Color.black));
        window.add(panel1);
        panel2.setSize(400, 300);
        panel2.setLocation(50, 400);
        panel2.setBorder(new LineBorder(Color.black));
        window.add(panel2);
    }
    
    public void labelsP1(){
        panel1.setLayout(null);
        nombre.setSize(50, 20);
        nombre.setLocation(50, 75);
        panel1.add(nombre);
        contraseña.setSize(70, 20);
        contraseña.setLocation(50,125);
        panel1.add(contraseña);
    }
    
    public void botonesP1(){
        presionar.setSize(100, 25);
        presionar.setLocation(75, 250);
        panel1.add(presionar);
        limpiar.setSize(100, 25);
        limpiar.setLocation(225, 250);
        panel1.add(limpiar);
    }
    
    public void textoP1(){
        name.setSize(100, 20);
        name.setLocation(150, 75);
        panel1.add(name);
        password.setSize(100, 20);
        password.setLocation(150,125);
        panel1.add(password);
    }
    
    public void listaP2(){
        panel2.setLayout(null);
        lista.setSize(125, 150);
        lista.setLocation(25, 50);
        panel2.add(lista);
    }
    
    public void botonP2(){
        boton.setSize(75, 20);
        boton.setLocation(175, 125);
        panel2.add(boton);
    }
    
    public void textoP2(){
        area.setSize(100, 125);
        area.setLocation(275, 75);
        panel2.add(area);
    }
}
