/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoprogramacion1jeremytosorto12441472;

import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import proyectoprogramacion1jeremytosorto12441472.ProyectoProgramacion1JeremytOsorto12441472;

/**
 *
 * @author DELL
 */
public class GUIproyecto extends javax.swing.JFrame {
    /**
     * Creates new form GUIproyecto
     */
    DefaultComboBoxModel Model=null;
    
    
    private ArrayList<Familias> list=new ArrayList();
    static ProyectoProgramacion1JeremytOsorto12441472 proy=new ProyectoProgramacion1JeremytOsorto12441472();
    public GUIproyecto() {
        initComponents();
        Panel.setVisible(false);
        Panel2.setVisible(false);
        
        Model=new DefaultComboBoxModel(list.toArray(new Familias[0]));
        Combo.setModel(Model);
        elecciones.setModel(Model);
    }
    
    public GUIproyecto(ArrayList<Familias> list){
        this.list=list;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Txt1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        label2 = new java.awt.Label();
        Txt2 = new javax.swing.JTextField();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        Txt3 = new javax.swing.JTextField();
        label5 = new java.awt.Label();
        TF1 = new javax.swing.JTextField();
        label6 = new java.awt.Label();
        Combo = new javax.swing.JComboBox<>();
        Panel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        elecciones = new javax.swing.JComboBox<>();
        label1 = new java.awt.Label();
        N = new javax.swing.JTextField();
        C = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Bnombre = new javax.swing.JButton();
        Bfamilia = new javax.swing.JButton();
        Bcod = new javax.swing.JButton();
        PanelPrincipal = new javax.swing.JPanel();
        button1 = new java.awt.Button();
        Txt4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                PanelComponentHidden(evt);
            }
        });
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1ActionPerformed(evt);
            }
        });
        Panel.add(Txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, -1));

        jButton1.setText("Agregar Producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        label2.setText("Familia");
        Panel.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));
        Panel.add(Txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 250, -1));

        label3.setText("Nombre del producto");
        Panel.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        label4.setText("Precio Del Producto");
        Panel.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, 20));
        Panel.add(Txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 250, 20));

        label5.setText("Cantidad en Inventario del Producto");
        Panel.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        TF1.setEditable(false);
        Panel.add(TF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 250, 20));

        label6.setText("Codigo de su producto");
        Panel.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Panel.add(Combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 250, -1));

        Panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Buscar por Nombre");
        Panel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        elecciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        elecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccionesActionPerformed(evt);
            }
        });
        Panel2.add(elecciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, 20));

        label1.setText("Buscar por familia");
        Panel2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));
        Panel2.add(N, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 140, 20));

        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        Panel2.add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 140, 20));

        jLabel3.setText("Buscar por código");
        Panel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Familia", "Nombre", "Precio", "Unidades", "Código"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setResizable(false);
            Tabla.getColumnModel().getColumn(1).setResizable(false);
            Tabla.getColumnModel().getColumn(2).setResizable(false);
            Tabla.getColumnModel().getColumn(3).setResizable(false);
            Tabla.getColumnModel().getColumn(4).setResizable(false);
        }

        Panel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 500, 190));

        Bnombre.setText("Buscar por Nombre");
        Bnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnombreActionPerformed(evt);
            }
        });
        Panel2.add(Bnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 140, -1));

        Bfamilia.setText("Buscar por familia");
        Bfamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BfamiliaActionPerformed(evt);
            }
        });
        Panel2.add(Bfamilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 190, -1));

        Bcod.setText("Buscar por código");
        Bcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcodActionPerformed(evt);
            }
        });
        Panel2.add(Bcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 140, -1));

        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button1.setLabel("Agregar Familia");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        PanelPrincipal.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, -1));
        PanelPrincipal.add(Txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 20));

        jLabel1.setText("Nombre de la familia");
        PanelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jMenu1.setText("Menu");

        jMenuItem3.setText("Agregar Familias");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseClicked(evt);
            }
        });
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("Agregar Productos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Gestionar Inventario");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        Menu.add(jMenu1);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Panel.setVisible(true);
        Panel2.setVisible(false);
        PanelPrincipal.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Panel.setVisible(false);
        Panel2.setVisible(true);
        PanelPrincipal.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean a=true,b=true,c=true, f=true;
        if (Txt1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(GUIproyecto.this, "Ingrese un nombre");
            a=false;
        }
        
        if(Txt2.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(GUIproyecto.this, "Ingrese el precio");
            b=false;
        }
        
        if(Txt3.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(GUIproyecto.this, "Ingrese la cantidad de producto");
            c=false;
        }
        
        double precio=0;
        try {
            precio = Double.parseDouble(Txt2.getText().trim());
            if(precio<=0){
                JOptionPane.showMessageDialog(GUIproyecto.this, "Ingrese un precio mayor a 0");
                b=false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(GUIproyecto.this, "El precio debe ser un número válido");
            b=false;
        }
        
        int unidades=0;
        try {
            unidades = Integer.parseInt(Txt3.getText().trim());
            if(unidades<=0){
                JOptionPane.showMessageDialog(GUIproyecto.this, "Las unidades deben ser mayores a 0");
                c=false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(GUIproyecto.this, "El precio debe ser un número válido y/o un número entero");
            c=false;
        }
        
        
        
        String nom=Txt1.getText();
        Familias famselected= (Familias) Combo.getSelectedItem();
        if(Combo.getItemCount()==0){
            JOptionPane.showMessageDialog(this, "Debe crear una familia");
            f=false;
        }
        
        if(a && b && c && f){
            Producto pro=new Producto(nom, precio, unidades, famselected);
            
            Txt1.setText("");Txt2.setText("");Txt3.setText("");
            TF1.setText(String.valueOf(pro.getCodigo()));
            System.out.println(pro); //tipo de print ln.
            System.out.printf("%2f", precio); //tipo print f%
            JOptionPane.showMessageDialog(GUIproyecto.this, "Producto creado correctamente");
            proy.agregaralista(pro);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1ActionPerformed
        
    }//GEN-LAST:event_Txt1ActionPerformed

    private void PanelComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_PanelComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelComponentHidden

    private void jMenuItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Panel.setVisible(false);
        Panel2.setVisible(false);
        PanelPrincipal.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void eleccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eleccionesActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        boolean b=true;
        if(Txt4.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(GUIproyecto.this, "Ingrese el nombre de la familia");
            b=false;
        }

        if(b){
            String nombrefam=Txt4.getText();
            Familias fami=new Familias(nombrefam);
            proy.agregarfamilia(fami);
            Model.addElement(fami);

            JOptionPane.showMessageDialog(GUIproyecto.this, "Familia creada correctamente");
        }
        Txt4.setText("");
    }//GEN-LAST:event_button1ActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CActionPerformed

    private void BfamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BfamiliaActionPerformed
        Familias sec=(Familias) elecciones.getSelectedItem();
        
        if(sec!=null){
            DefaultTableModel model1=(DefaultTableModel) Tabla.getModel();
            model1.setRowCount(0);
            
            ArrayList<Producto> pr=proy.listap();
            
            for(Producto pro: pr){
                if(pro.getFami().equals(sec)){
                    model1.addRow(new Object[]{
                    
                        pro.getFami().getName(), pro.getNombre(), pro.getPrecio(), pro.getCantidad(), pro.getCodigo()
                    
                    });
                }
            }
            
        }
        else {
            JOptionPane.showMessageDialog(GUIproyecto.this, "Seleccione una familia");
        }
    }//GEN-LAST:event_BfamiliaActionPerformed

    private void BnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnombreActionPerformed
        String nomb= N.getText().trim();
        
        if(!nomb.isEmpty()){
            DefaultTableModel model1=(DefaultTableModel) Tabla.getModel();
            model1.setRowCount(0);
            
            ArrayList<Producto> pr=proy.listap();
            
            for(Producto pro: pr){
                if(pro.getNombre().equalsIgnoreCase(nomb)){
                    model1.addRow(new Object[]{
                    
                        pro.getFami().getName(), pro.getNombre(), pro.getPrecio(), pro.getCantidad(), pro.getCodigo()
                    
                    });
                    
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Ingrese un nombre para buscar");
        }
    }//GEN-LAST:event_BnombreActionPerformed

    private void BcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcodActionPerformed
        String d= C.getText().trim();
        
        
        if(!d.isEmpty()){
            
            try{
                int Cod=Integer.parseInt(d);

                DefaultTableModel model1=(DefaultTableModel) Tabla.getModel();
                model1.setRowCount(0);

                ArrayList<Producto> pr=proy.listap();

                for(Producto pro: pr){
                    if(pro.getCodigo()==Cod){
                        model1.addRow(new Object[]{

                            pro.getFami().getName(), pro.getNombre(), pro.getPrecio(), pro.getCantidad(), pro.getCodigo()

                        });

                    }
                }
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Ingrese el código");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Ingrese un código para buscar");
        }
    }//GEN-LAST:event_BcodActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIproyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIproyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIproyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIproyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIproyecto().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcod;
    private javax.swing.JButton Bfamilia;
    private javax.swing.JButton Bnombre;
    private javax.swing.JTextField C;
    private javax.swing.JComboBox<String> Combo;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JTextField N;
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JTextField TF1;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField Txt1;
    private javax.swing.JTextField Txt2;
    private javax.swing.JTextField Txt3;
    private javax.swing.JTextField Txt4;
    private java.awt.Button button1;
    private javax.swing.JComboBox<String> elecciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    // End of variables declaration//GEN-END:variables
}
