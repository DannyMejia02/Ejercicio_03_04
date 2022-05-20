/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.unidad3_ejercicio02;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class VentanaC extends JFrame{
    
     private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    private JComboBox jComboBox3;
    private JComboBox jComboBox4;
    private JComboBox jComboBox5;
    
    public VentanaC(String title) throws HeadlessException {
        super(title);
        this.setSize(600,600);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(8,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
        this.iniciarCombo();
        this.iniciarBotones();
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanel1.add(this.jPanelList.get(5));
        this.jPanel1.add(this.jPanelList.get(6));
        this.jPanel1.add(this.jPanelList.get(7));
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Periodo Academico: "));
        this.jLabelList.add(new JLabel("Carrera: "));
        this.jLabelList.add(new JLabel("Modalidad: "));
        this.jLabelList.add(new JLabel("Sede: "));
        this.jLabelList.add(new JLabel("Campus: "));
        this.jLabelList.add(new JLabel("Jornada: "));
        this.jLabelList.add(new JLabel("Fecha de Registro: "));
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jLabelList.get(4));
        this.jPanelList.get(5).add(this.jLabelList.get(5));
        this.jPanelList.get(6).add(this.jLabelList.get(6));
    }
    
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.get(1).setColumns(15);
        this.jTextFieldList.get(0).setColumns(15);
        this.jPanelList.get(0).add(this.jTextFieldList.get(1));
        this.jPanelList.get(6).add(this.jTextFieldList.get(0));

    }
    
    public void iniciarCombo(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("ARQUITECTURA");
        this.jComboBox1.addItem("TELECOMUNICACIONES");
        this.jComboBox1.addItem("COMPUTACION");
        this.jComboBox1.addItem("ELECTRONICA");
        this.jComboBox1.addItem("ADMINISTACION DE EMPRESAS");
        this.jComboBox1.addItem("DERECHO");
        this.jComboBox1.addItem("MEDICINA");
        this.jComboBox1.addItem("EDUCACION INICIAL");
        this.jComboBox1.addItem("AUTOMOTRIZ");
        this.jComboBox1.addItem("INGENIERIA CIVIL");
        
        this.jPanelList.get(1).add(this.jComboBox1);
        
        this.jComboBox2 = new JComboBox();
        this.jComboBox2.addItem("PRESENCIAL");
        this.jComboBox2.addItem("VIRTUAL");
        
        this.jPanelList.get(2).add(this.jComboBox2);
        
        this.jComboBox3 = new JComboBox();
        this.jComboBox3.addItem("MATRIZ CUENCA");
        this.jComboBox3.addItem("QUITO");
        this.jComboBox3.addItem("GUAYAQUIL");
        
        this.jPanelList.get(3).add(this.jComboBox3);
        
        this.jComboBox4 = new JComboBox();
        this.jComboBox4.addItem("EL VECINO");
        this.jComboBox4.addItem("GIRON");
        this.jComboBox4.addItem("CENTENARIO");
        
        this.jPanelList.get(4).add(this.jComboBox4);
        
        this.jComboBox5 = new JComboBox();
        this.jComboBox5.addItem("DIURNA");
        this.jComboBox5.addItem("NOCTURNA");
        
        this.jPanelList.get(5).add(this.jComboBox5);
        
    }
    
    public void iniciarBotones(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Siguiente"));
        
        this.jPanelList.get(7).add(this.jButtonList.get(0));
    
    }
    
    
}
