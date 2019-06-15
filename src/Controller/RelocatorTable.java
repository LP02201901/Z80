/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 *
 * @author Sunny
 */
public class RelocatorTable extends JFrame {
    
    public void hexMemory(String[][] data){
        //array bidimensional de objetos con los datos de la tabla
        //array de String's con los títulos de las columnas
        String[] columnNames = {"Memory", "Hex", "Etiquete",
        "Instruction"};
        //se crea la Tabla
        final JTable table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 400));
        //Creamos un JscrollPane y le agregamos la JTable
        JScrollPane scrollPane = new JScrollPane(table);
        //Agregamos el JScrollPane al contenedor
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        //manejamos la salida
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });  
    }

        
    public void hexFilled(String[][] data){
        //array bidimensional de objetos con los datos de la tabla
        //array de String's con los títulos de las columnas
        String[] columnNames = {"Hex", "Hex", "Hex",
        "Hex","Hex","Hex","Hex","Hex","Hex","Hex"};
        //se crea la Tabla
        final JTable table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 700));
        //Creamos un JscrollPane y le agregamos la JTable
        JScrollPane scrollPane = new JScrollPane(table);
        //Agregamos el JScrollPane al contenedor
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        //manejamos la salida
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });  
    }
        
    
    public ArrayList<String> AddData(String memory,String hex, String etiquete, String instruction){
        ArrayList<String> line = new ArrayList<String>();  
        line.add(memory);
        line.add(hex);
        line.add(etiquete);
        line.add(instruction);
        return line;
    }
    
    public ArrayList<String> AddData(String memory){
        ArrayList<String> line = new ArrayList<String>();  
        line.add(memory);
        return line;
    }
}
