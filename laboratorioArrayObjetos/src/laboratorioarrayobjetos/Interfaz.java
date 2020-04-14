/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioarrayobjetos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author kevin
 */
public class Interfaz extends JFrame implements ActionListener{
    JPanel p1, p2, p3;
    JLabel titulo, l2, l3, l4, l5, l6, l7, l8, l9, espacio;
    JTextArea reseña;
    JTextField t1, entradasVendidas, nombre, director, anio, cantComprar, totalVendido;
    JButton verPeliculas, verificar, comprar, total;
    ArrayList listaP;
    
    public static void main(String[] args) {
        // Creacion de los objetos de la lista
        Pelicula uno = new Pelicula("Burn", "Mike Gan", 2019, "BURN prosigue a\nuna solitaria...");
        Pelicula dos = new Pelicula("El Faro", "Robert Eggers", 2019, "Ubica su historia\nen una pequeña...");
        Pelicula tres = new Pelicula("Trolls 2", "Walt Dohrn", 2020, "Su planeta está a\npuntito de hacerse...");
        Pelicula cuatro = new Pelicula("Bad boys", "Bilall Fallah", 2020, "Desde una cárcel\nde nalta seguridad...");
        Pelicula cinco = new Pelicula("Junglee", "Chuck Russell", 2019, "Dipankar Nair mantiene\nun santuario...");
        Pelicula seis = new Pelicula("Elephant", "Mark Linfield", 2020, "Este largo se centra\nen la historia...");
        Pelicula siete = new Pelicula("Dolittle", "Stephen Gaghan", 2020, "En el camino,\nsu coraje y agudeza...");
        Pelicula ocho = new Pelicula("brahms", "William Brent Bell", 2020, "Este nuevo capítulo\nde la saga...");
        Pelicula nueve = new Pelicula("La caza", "Craig Zobel", 2020, "12 extraños se\ndespiertan en el...");
        Pelicula diez = new Pelicula("Unidos", "Dan Scanlon", 2020, "Hace bastante tiempo\nel planeta...");
        
        //Instanciando la lista
        ArrayList lista = new ArrayList();
        //Agregando datos
        lista.add(uno);
        lista.add(dos);
        lista.add(tres);
        lista.add(cuatro);
        lista.add(cinco);
        lista.add(seis);
        lista.add(siete);
        lista.add(ocho);
        lista.add(nueve);
        lista.add(diez);

        Interfaz inter = new Interfaz(lista);
    }
    public Interfaz(ArrayList list){
        this.setTitle("CARTELERA");
        setBounds(120, 70, 450, 520);
        setResizable(false);
        setLayout(new BorderLayout(20, 20));
        
        listaP=list;
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        
        titulo = new JLabel("Peliculas Hoy");
        espacio = new JLabel("                                                          ");
        l2 = new JLabel("¿Que quieres ver?");
        l3 = new JLabel("Entradas vendidas:");
        l4 = new JLabel("Nombre:");
        l5 = new JLabel("Director:");
        l6 = new JLabel("Año:");
        l7 = new JLabel("Reseña:");
        l8 = new JLabel("Cantidad a comprar:");
        l9 = new JLabel("Total Boletos Vendidos: ");
        
        
        t1 = new JTextField(12);
        entradasVendidas  = new JTextField("0", 12);
        nombre = new JTextField(12);
        director = new JTextField(12);
        anio = new JTextField(12);
        reseña = new JTextArea(3, 12);
        cantComprar = new JTextField("0",12);
        totalVendido = new JTextField("0",8);
        
        verPeliculas = new JButton("Ver cartelera");
        verPeliculas.addActionListener(this);
        verPeliculas.setActionCommand("cartelera");
        verificar = new JButton("    Verificar disponibilidad     ");
        verificar.addActionListener(this);
        verificar.setActionCommand("buscar en lista");
        comprar = new JButton("     Adquirir Boltetas     ");
        comprar.addActionListener(this);
        comprar.setActionCommand("comprar");
        total = new JButton("Calcular");
        total.addActionListener(this);
        total.setActionCommand("total");
        
        p1.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
        p2.setLayout(new FlowLayout(FlowLayout.TRAILING, 80, 10));
        p3.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 12));
        p1.setBackground(Color.cyan);
        p3.setBackground(Color.cyan);
        
        p1.add(titulo);
        p1.add(verPeliculas);
        
        p2.add(l2);
        p2.add(t1);
        p2.add(verificar);
        p2.add(l3);
        p2.add(entradasVendidas);
        p2.add(l4);
        p2.add(nombre);
        p2.add(l5);
        p2.add(director);
        p2.add(l6);
        p2.add(anio);
        p2.add(l7);
        p2.add(reseña);
        p2.add(espacio);
        p2.add(l8);
        p2.add(cantComprar);
        p2.add(comprar);
        
        p3.add(l9);
        p3.add(totalVendido);
        p3.add(total);
        
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);
        
        
        setVisible(true);
    }

    public ArrayList obtenerArray(ArrayList list){
        return list;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "cartelera":
                String cartelera="\nPELICULAS DE HOY  ";
                System.out.println(cartelera);
                        Iterator it = listaP.iterator();
                while ( it.hasNext() ) { 
                    Pelicula objeto = (Pelicula)it.next(); 
                    System.out.println("Accediendo a la cartelera"); 
                    cartelera+="\n"+objeto.getNombre();
                } 
                JOptionPane.showMessageDialog(null, cartelera);
                ;break;
            case "buscar en lista":
                System.out.println("\nBuscando pelicula...");
                if(buscarPelicula()){
                    JOptionPane.showMessageDialog(null, "Pelicula "+t1.getText()+" encontrada.");
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Pelicula no encontrada.");
                }
                
                ;break;
            case "comprar":
                
                System.out.println("\nRealizando compra");
                if(comprar()){
                    JOptionPane.showMessageDialog(null, "Compra realizada con exito.");
                }else{
                    JOptionPane.showMessageDialog(null, "Error en la compra, vuelva a intentarlo.");
                }
                ;break; 
            case "total":
                System.out.println("\nCalculando...");
                int cont = 0;
                it = listaP.iterator();
                while ( it.hasNext() ) { 
                    Pelicula objeto = (Pelicula)it.next(); 
                    cont+=objeto.getCantVendidos();
                }
                totalVendido.setText(String.valueOf(cont));
                ;break; 
        }
    }
    public boolean buscarPelicula(){
        String pelicula = t1.getText();
        boolean v = false;
        Iterator it = listaP.iterator();
        while ( it.hasNext() ) { 
            Pelicula objeto = (Pelicula)it.next(); 
            if(objeto.getNombre().equalsIgnoreCase(pelicula)){
            System.out.println("Si existe ");
            nombre.setText(objeto.getNombre());
            director.setText(objeto.getDirector());
            anio.setText(String.valueOf(objeto.getAnio()));
            reseña.setText(objeto.getResenia());
            entradasVendidas.setText(String.valueOf(objeto.getCantVendidos()));
            v=true;
            return v;
            }    
        } 
        return v;
    }
    
    public boolean comprar(){
        String pelicula = nombre.getText();
        int cont = 0;
        boolean v = false;
        Iterator it = listaP.iterator();
        while ( it.hasNext() ) { 
            Pelicula objeto = (Pelicula)it.next(); 
            if(objeto.getNombre().equalsIgnoreCase(pelicula)){
                objeto.setCantVendidos(objeto.getCantVendidos()+ Integer.parseInt(cantComprar.getText()) );
                entradasVendidas.setText(String.valueOf(objeto.getCantVendidos()));
                v=true;
                return v;
            }    
        } 
        return v;
    }
    
    
}
