/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package credencialine;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

/**
 *
 * @author Miguel Olivares Rodriguez
 */
public class Crear extends JFrame {

    private JPanel panel;
    private JTextField nombre;
    private JTextField apellidopaterno;
    private JTextField apellidomaterno;
    private JTextField colonia;
    private JTextField calle;
    private JTextField municipio;
    private JTextField curp;
    private JTextField fecha;
    private JTextField sexo;
    private JButton boton;

    public Crear() {

        this.setSize(650, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("<<<<PDF>>>>");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));

        Iniciar();

    }

    private void Iniciar() {

        Panel();
        Etiquetas();
        Texto();
        BotonCrear();
        BotonAbrir();
        BotonSalir();
    }

    private void Panel() {

        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void Etiquetas() {

        JLabel etiqueta0 = new JLabel("Ingresa todos lo datos que se te piden:");//texto etiqueta
        panel.add(etiqueta0);//agregamos un panel a la etiqueta
        etiqueta0.setBounds(50, 70, 400, 80);//dimension de la etiqueta x,y,ancho,alto
        etiqueta0.setForeground(Color.black);//color del texto
        etiqueta0.setFont(new Font("Calibri Light", Font.ITALIC, 22));//tipo de fuente y tamaño de la letra

        // Etiqueta para el Apellido Paterno //
        JLabel etiqueta = new JLabel("Apellido Parterno: ");
        panel.add(etiqueta);
        etiqueta.setBounds(50, 150, 200, 80);
        etiqueta.setForeground(Color.black);
        etiqueta.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        // Etiqueta para el Apellido Materno //
        JLabel etiqueta1 = new JLabel("Apellido Materno: ");
        panel.add(etiqueta1);
        etiqueta1.setBounds(50, 190, 200, 80);
        etiqueta1.setForeground(Color.black);
        etiqueta1.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        // Etiqueta para el Nombre(s) //
        JLabel etiqueta2 = new JLabel("Nombre(s): ");
        panel.add(etiqueta2);
        etiqueta2.setBounds(50, 230, 200, 80);
        etiqueta2.setForeground(Color.black);
        etiqueta2.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        // Etiqueta para la Calle y el Numero //
        JLabel etiqueta3 = new JLabel("Calle y No.: ");
        panel.add(etiqueta3);
        etiqueta3.setBounds(50, 270, 200, 80);
        etiqueta3.setForeground(Color.black);
        etiqueta3.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        // Etiqueta para la Colonia y el Codigo Postal //
        JLabel etiqueta4 = new JLabel("Colonia y C.P.: ");
        panel.add(etiqueta4);
        etiqueta4.setBounds(50, 310, 220, 80);
        etiqueta4.setForeground(Color.black);
        etiqueta4.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        // Etiqueta para el Municipio //
        JLabel etiqueta5 = new JLabel("Municipio: ");
        panel.add(etiqueta5);
        etiqueta5.setBounds(50, 350, 200, 80);
        etiqueta5.setForeground(Color.black);
        etiqueta5.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        // Etiqueta para la CURP //
        JLabel etiqueta6 = new JLabel("CURP: ");
        panel.add(etiqueta6);
        etiqueta6.setBounds(50, 390, 200, 80);
        etiqueta6.setForeground(Color.black);
        etiqueta6.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        // Etiqueta para la Fecha de Nacimiento //
        JLabel etiqueta7 = new JLabel("Fecha de Nacimiento: ");
        panel.add(etiqueta7);
        etiqueta7.setBounds(50, 430, 200, 80);
        etiqueta7.setForeground(Color.black);
        etiqueta7.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        // Etiqueta para el Sexo //
        JLabel etiqueta8 = new JLabel("Sexo: ");
        panel.add(etiqueta8);
        etiqueta8.setBounds(50, 470, 200, 80);
        etiqueta8.setForeground(Color.black);//color del texto
        etiqueta8.setFont(new Font("Calibri Light", Font.ITALIC, 22));

    }

    private void Texto() {

        // Apellido Paterno //
        apellidopaterno = new JTextField();
        apellidopaterno.setBounds(230, 165, 300, 35);
        panel.add(apellidopaterno);

        // Apellido Materno //
        apellidomaterno = new JTextField();
        apellidomaterno.setBounds(230, 205, 300, 35);
        panel.add(apellidomaterno);

        // Nombre //
        nombre = new JTextField();
        nombre.setBounds(230, 245, 300, 35);
        panel.add(nombre);

        // Calle //  
        calle = new JTextField();
        calle.setBounds(230, 285, 300, 35);
        panel.add(calle);

        // Colonia y Codigo Postal //
        colonia = new JTextField();
        colonia.setBounds(230, 325, 300, 35);
        panel.add(colonia);

        // Municipio //
        municipio = new JTextField();
        municipio.setBounds(230, 365, 300, 35);
        panel.add(municipio);

        // CURP //
        curp = new JTextField();
        curp.setBounds(230, 405, 300, 35);
        panel.add(curp);

        // Fecha de Nacimiento //
        fecha = new JTextField();
        fecha.setBounds(250, 445, 280, 35);
        panel.add(fecha);

        // Sexo //
        sexo = new JTextField();
        sexo.setBounds(230, 485, 300, 35);
        panel.add(sexo);
    }

    private void BotonCrear() {
        boton = new JButton("Crear PDF");
        boton.setBounds(100, 600, 120, 40);
        boton.setForeground(java.awt.Color.black);
        boton.setFont(new java.awt.Font("Baskerville", java.awt.Font.CENTER_BASELINE, 15));
        boton.setEnabled(true);

        panel.add(boton);

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String imagen = "C:\\Users\\migue\\Downloads\\Plantilla.jpg";
                try {
                    PDDocument documento = new PDDocument();
                    PDRectangle mypage = new PDRectangle(900, 600);
                    PDPage pagina = new PDPage(mypage);
                    documento.addPage(pagina);

                    PDImageXObject image = PDImageXObject.createFromFile(imagen, documento);
                    PDPageContentStream contenido = new PDPageContentStream(documento, pagina);

                    // contenido.drawImage(image, 4.5f, 0.3f);
                    contenido.drawImage(image, 55, 40, 600, 450);
                    contenido.beginText();

                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 14);
                    //   contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(260, pagina.getMediaBox().getHeight() - 287);
                    contenido.showText(apellidopaterno.getText());
                    contenido.endText();

                    /////// Materno...............
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 14);
                    //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(260, pagina.getMediaBox().getHeight() - 307);
                    contenido.showText(apellidomaterno.getText());
                    contenido.endText();

                    ///////// Nombre..............  
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 14);
                    //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(260, pagina.getMediaBox().getHeight() - 327);
                    contenido.showText(nombre.getText());
                    contenido.endText();

                    ////////// Calle.............
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 11);
                    //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(260, pagina.getMediaBox().getHeight() - 367);
                    contenido.showText(calle.getText());
                    contenido.endText();

                    ////////// Colonia y Codigo Postal..........
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 11);
                    //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(260, pagina.getMediaBox().getHeight() - 382);
                    contenido.showText(colonia.getText());
                    contenido.endText();

                    ///////////// Municipio..........
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 11);
                    //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(260, pagina.getMediaBox().getHeight() - 397);
                    contenido.showText(municipio.getText());
                    contenido.endText();

                    ////////// CURP.................
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 12);
                    //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(260, pagina.getMediaBox().getHeight() - 447);
                    contenido.showText(curp.getText());
                    contenido.endText();

                    //////// Fecha de Nacimiento..............
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 12);
                    //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(260, pagina.getMediaBox().getHeight() - 480);
                    contenido.showText(fecha.getText());
                    contenido.endText();
                    
                    //////////  Sexo............
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 12);
                  //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(593, pagina.getMediaBox().getHeight() - 275);                   
                    contenido.showText(sexo.getText()); 
                    contenido.endText();

                    contenido.close();

                    documento.save("C:\\Users\\migue\\Desktop\\credencial.pdf");

                } catch (Exception x) {
                    System.out.println("Error: " + x.getMessage().toString());
                }

            }
        });

    }

    private void BotonAbrir() {

        boton = new JButton("Abrir PDF");
        boton.setBounds(405, 600, 120, 40);
        boton.setForeground(java.awt.Color.black);
        boton.setFont(new java.awt.Font("Baskerville", java.awt.Font.CENTER_BASELINE, 15));
        boton.setEnabled(true);

        panel.add(boton);

        ActionListener accion = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {

                try {
                    File path = new File("C:\\Users\\migue\\Desktop\\credencial.pdf");
                    Desktop.getDesktop().open(path);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        };

        boton.addActionListener(accion);

    }

    private void BotonSalir() {
        boton = new JButton("Salir");
        boton.setBounds(574, 0, 60, 40);
        boton.setForeground(java.awt.Color.red);
        boton.setFont(new java.awt.Font("Baskerville", java.awt.Font.CENTER_BASELINE, 11));
        boton.setEnabled(true);

        panel.add(boton);

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                System.exit(0);

            }
        });
    }

}
