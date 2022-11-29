package DatosCred;

import Fondo.FondoINe;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

/*@author BETTERLEE
 Seany Xochitl Bautista Aguilar*/
public class DatosIne extends JFrame {

    private JPanel panel, panel1;
    private JTextField apellidos;
    private JTextField nombre;
    private JTextField Domicilio;
    private JTextField CP;
    private JTextField calle;
    private JTextField clave;
    private JTextField anio;
    private JTextField estado;
    private JTextField localidad;
    private JTextField municipio;
    private JTextField vision;
    private JTextField seccion;
    private JTextField vigencia;

    public DatosIne() {

        this.panel = new FondoINe();
        this.setSize(870, 490);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Datos para INE");
        setLocationRelativeTo(null);

        Ventana();
    }

    private void Ventana() {

        Panel();
        Etiquetas();
        Texto();
        Guardar();
        Boton();
    }

    private void Panel() {

        panel = new JPanel();
        this.panel = new FondoINe();
        panel.setLayout(null);
        this.getContentPane().add(panel);

    }

    /*--------------Etiquetas de texto -------------------------------------------------------*/
    private void Etiquetas() {

        JLabel et = new JLabel("Nombre");
        et.setBounds(300, 140, 310, 30);
        et.setBackground(Color.black);
        et.setFont(new Font("Arial Nova", Font.BOLD, 15));
        panel.add(et);

        //---------------------------------------------------------------------------*/
        JLabel eti = new JLabel("Domicilio");
        eti.setBounds(305, 220, 310, 30);
        eti.setBackground(Color.BLACK);
        eti.setFont(new Font("Arial Nova", Font.BOLD, 15));
        panel.add(eti);

        JLabel eti0 = new JLabel("CP");
        eti0.setBounds(520, 220, 310, 30);
        eti0.setBackground(Color.BLACK);
        eti0.setFont(new Font("Arial Nova", Font.BOLD, 15));
        panel.add(eti0);
        /* *******************************************************************************/

        JLabel eti1 = new JLabel("Clave del Elector ");
        eti1.setBounds(305, 300, 310, 30);
        eti1.setBackground(Color.BLACK);
        eti1.setFont(new Font("Arial Nova", Font.BOLD, 13));
        panel.add(eti1);

        /**
         * *******************************************************************************
         */
        JLabel eti2 = new JLabel("Año de Registro");
        eti2.setBounds(620, 300, 310, 30);
        eti2.setBackground(Color.BLACK);
        eti2.setFont(new Font("Arial Nova", Font.BOLD, 13));
        panel.add(eti2);

        //-----------------------------------------------------------------------------------//
        JLabel eti3 = new JLabel("Estado");
        eti3.setBounds(305, 350, 310, 30);
        eti3.setBackground(Color.BLACK);
        eti3.setFont(new Font("Arial Nova", Font.BOLD, 13));
        panel.add(eti3);

        ////////////////////////////////////////////////////////////////////////////////////////
        JLabel eti4 = new JLabel("Localidad");
        eti4.setBounds(305, 390, 310, 30);
        eti4.setBackground(Color.BLACK);
        eti4.setFont(new Font("Arial Nova", Font.BOLD, 13));
        panel.add(eti4);

        //*************************************************************************************
        JLabel eti5 = new JLabel("Municipio");
        eti5.setBounds(505, 350, 310, 30);
        eti5.setBackground(Color.BLACK);
        eti5.setFont(new Font("Arial Nova", Font.BOLD, 13));
        panel.add(eti5);

        /*----------------------------------------------------------------------------------*/
        JLabel eti6 = new JLabel("Mision");
        eti6.setBounds(505, 390, 310, 30);
        eti6.setBackground(Color.BLACK);
        eti6.setFont(new Font("Arial Nova", Font.BOLD, 13));
        panel.add(eti6);

        /*-------------------------------------------------------------------------------------*/
        JLabel eti7 = new JLabel("Seccion");
        eti7.setBounds(705, 350, 310, 30);
        eti7.setBackground(Color.BLACK);
        eti7.setFont(new Font("Arial Nova", Font.BOLD, 13));
        panel.add(eti7);

        /*----------------------------------------------------------------------------------*/
        JLabel eti8 = new JLabel("Vigencia");
        eti8.setBounds(705, 390, 310, 30);
        eti8.setBackground(Color.BLACK);
        eti8.setFont(new Font("Arial Nova", Font.BOLD, 13));
        panel.add(eti8);
    }

    //------------------------------------------Colocar el texto -------------------------------------//
    private void Texto() {
        //Apellidos
        //JTextArea ap = new JTextArea();
        apellidos = new JTextField();
        apellidos.setEditable(true);
        apellidos.setVisible(true);
        apellidos.setBounds(300, 170, 95, 25);
        panel.add(apellidos);

        //Nombre
        nombre = new JTextField();
        nombre.setBounds(300, 195, 95, 25);
        nombre.setVisible(true);
        panel.add(nombre);

        //Domicilio
        Domicilio = new JTextField();
        Domicilio.setBounds(300, 250, 145, 25);
        Domicilio.setVisible(true);
        panel.add(Domicilio);
        //Calle
        calle = new JTextField();
        calle.setBounds(300, 270, 145, 25);
        calle.setVisible(true);
        panel.add(calle);

        //cp
        CP = new JTextField();
        CP.setBounds(520, 250, 75, 25);
        CP.setVisible(true);
        panel.add(CP);

        //Clave del elector
        clave = new JTextField();
        clave.setBounds(420, 305, 145, 25);
        clave.setVisible(true);
        panel.add(clave);

        //año de registro
        anio = new JTextField();
        anio.setBounds(725, 305, 95, 25);
        anio.setVisible(true);
        panel.add(anio);

        // estado
        estado = new JTextField();
        estado.setBounds(350, 355, 95, 25);
        estado.setVisible(true);
        panel.add(estado);

        //localidad
        localidad = new JTextField();
        localidad.setBounds(370, 395, 115, 25);
        localidad.setVisible(true);
        panel.add(localidad);

        //municipio
        municipio = new JTextField();
        municipio.setBounds(569, 355, 115, 25);
        municipio.setVisible(true);
        panel.add(municipio);

        //vision
        vision = new JTextField();
        vision.setBounds(555, 395, 95, 25);
        vision.setVisible(true);
        panel.add(vision);

        //seccion
        seccion = new JTextField();
        seccion.setBounds(765, 355, 85, 25);
        seccion.setVisible(true);
        panel.add(seccion);

        //vigencia
        vigencia = new JTextField();
        vigencia.setBounds(765, 395, 85, 25);
        vigencia.setVisible(true);
        panel.add(vigencia);
    }

    private void Guardar() {
        JButton boton = new JButton("Guardar pdf");
        boton.setBounds(0, 0, 105, 15);
        boton.setContentAreaFilled(false);
        boton.setForeground(Color.BLACK);
        panel.add(boton);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg) {

                String image3 = ("C:\\Users\\ekt\\OneDrive\\Documentos\\NetBeansProjects\\Credencial\\HarryBb.jpg");
                String image = ("C:\\Users\\ekt\\OneDrive\\Documentos\\NetBeansProjects\\Credencial\\INEH.jpg");
                String image2 = ("C:\\Users\\ekt\\OneDrive\\Documentos\\NetBeansProjects\\Credencial\\Inetras.jpg");

                try {
                    PDDocument doc = new PDDocument();
                    PDPage pagina = new PDPage();
                    PDRectangle creadf = new PDRectangle(1005, 1480);

                    doc.addPage(pagina);
                    PDImageXObject imagen2 = PDImageXObject.createFromFile(image3, doc);
                    PDImageXObject imagen = PDImageXObject.createFromFile(image, doc);
                    PDImageXObject imagen1 = PDImageXObject.createFromFile(image2, doc);

                    PDPageContentStream cont = new PDPageContentStream(doc, pagina);
                    
                    /**********************************************************************************/
                    
                    cont.drawImage(imagen, 40, 425, 540, 350); 
                    cont.drawImage(imagen2, 85, 475 , 140, 170);
                    cont.drawImage(imagen1, 40, 70, 540, 350);

                    /* ***************************Pedir el texto**************************************************/
                    cont.beginText();
                    cont.setFont(PDType1Font.TIMES_ROMAN, 12);
                    cont.newLineAtOffset(250, pagina.getMediaBox().getHeight() - 165);
                    cont.showText(apellidos.getText());
                    cont.endText();

                    //nombre
                    cont.beginText();
                    cont.setFont(PDType1Font.TIMES_ROMAN, 12);
                    cont.newLineAtOffset(250, pagina.getMediaBox().getHeight() - 166);
                    cont.showText(nombre.getText());
                    cont.endText();

                    //domicilio
                    cont.beginText();
                    cont.setFont(PDType1Font.TIMES_ROMAN, 12);
                    cont.newLineAtOffset(250, pagina.getMediaBox().getHeight() - 168);
                    cont.showText(calle.getText());
                    cont.endText();

                    cont.beginText();
                    cont.setFont(PDType1Font.TIMES_ROMAN, 12);
                    cont.newLineAtOffset(230, pagina.getMediaBox().getHeight() - 170);
                    cont.showText(Domicilio.getText());
                    cont.endText();

                    // clave del lector
                    cont.beginText();
                    cont.setFont(PDType1Font.TIMES_ROMAN, 12);
                    cont.newLineAtOffset(280, pagina.getMediaBox().getHeight() - 115);
                    cont.showText(clave.getText());
                    cont.endText();

                    //año de registro
                    cont.beginText();
                    cont.setFont(PDType1Font.TIMES_ROMAN, 12);
                    cont.newLineAtOffset(287, pagina.getMediaBox().getHeight() - 120);
                    cont.showText(anio.getText());
                    cont.endText();

                    //estado
                    cont.beginText();
                    cont.setFont(PDType1Font.TIMES_ROMAN, 12);
                    cont.newLineAtOffset(287, pagina.getMediaBox().getHeight() - 170);
                    cont.showText(estado.getText());
                    cont.endText();

                    //localidad
                    cont.beginText();
                    cont.setFont(PDType1Font.TIMES_ROMAN, 12);
                    cont.newLineAtOffset(287, pagina.getMediaBox().getHeight() - 100);
                    cont.showText(localidad.getText());
                    cont.endText();

                    //municipio
                    cont.beginText();
                    cont.setFont(PDType1Font.TIMES_ROMAN, 12);
                    cont.newLineAtOffset(297, pagina.getMediaBox().getHeight() - 170);
                    cont.showText(municipio.getText());
                    cont.endText();

                    //Mision
                    cont.beginText();
                    cont.setFont(PDType1Font.TIMES_ROMAN, 12);
                    cont.newLineAtOffset(297, pagina.getMediaBox().getHeight() - 150);
                    cont.showText(vision.getText());
                    cont.endText();

                    //seccion
                    cont.beginText();
                    cont.setFont(PDType1Font.TIMES_ROMAN, 12);
                    cont.newLineAtOffset(317, pagina.getMediaBox().getHeight() - 110);
                    cont.showText(seccion.getText());
                    cont.endText();

                    //vigencia
                    cont.beginText();
                    cont.setFont(PDType1Font.TIMES_ROMAN, 12);
                    cont.newLineAtOffset(317, pagina.getMediaBox().getHeight() - 120);
                    cont.showText(vigencia.getText());
                    cont.endText();

                    cont.close();

                    //doc.save(outfile);
                    doc.save("C:\\Users\\ekt\\OneDrive\\Documentos\\NetBeansProjects\\Credencial\\ credencial.pdf");
                    doc.close();

                } catch (Exception e) {
                    System.out.println("Captura la excepcion" + e);
                }
            }
        });
    }

    private void Boton() {
        JButton boton = new JButton("Guardar pdf");
        boton.setBounds(0, 0, 105, 15);
        boton.setContentAreaFilled(false);
        boton.setForeground(Color.BLACK);
        panel.add(boton);

        boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg) {
                try {
                    File path = new File("C:\\Users\\ekt\\OneDrive\\Documentos\\NetBeansProjects\\Credencial\\Credencial.pdf");
                    Desktop.getDesktop().open(path);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        });
        boton.setVisible(true);
        //boton.addActionListener(accion);
        panel.add(boton);

    }

}
