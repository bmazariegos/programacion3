/**
 * @author BRYAN ESTUARDO MAZARIEGOS DAVILA
 *  0901-17-1001
 *  Control de sueldos de los empleados en planilla y total por cada deparamento 
 */
package lab3;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Lab3 extends javax.swing.JFrame {

    /**
     * Creates new form Lab3
     */
    private final String StrPlanilla[][] = new String[10][6];
    private final int StrTotalDepar[][] = new int[6][2];
    public Lab3() {
        initComponents();
        setLocation(200,100);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Info = new javax.swing.JTable();
        BtnLlenar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tbl_TotalDepartamento = new javax.swing.JTable();
        BtnTotalDepartamento = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tbl_Info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Departamento", "Nombre  empleado", "Sueldo base", "Total Deduciones", "Total Percepciones", "Sueldo liquido"
            }
        ));
        jScrollPane1.setViewportView(Tbl_Info);

        BtnLlenar.setText("Llenar");
        BtnLlenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLlenarActionPerformed(evt);
            }
        });

        Tbl_TotalDepartamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Departamnto", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tbl_TotalDepartamento);
        if (Tbl_TotalDepartamento.getColumnModel().getColumnCount() > 0) {
            Tbl_TotalDepartamento.getColumnModel().getColumn(0).setResizable(false);
            Tbl_TotalDepartamento.getColumnModel().getColumn(1).setResizable(false);
        }

        BtnTotalDepartamento.setText("<html>\nCalcular Total </br>\nDepartamento");
        BtnTotalDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTotalDepartamentoActionPerformed(evt);
            }
        });

        BtnLimpiar.setText("Nuevo calculo");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(BtnLlenar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(BtnTotalDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnTotalDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLlenar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int llenado(int IMinimo, int IMaximo){
        return((int)Math.floor(Math.random()*(IMaximo-IMinimo+1)+IMinimo));
        
    }
    
    private void BtnLlenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLlenarActionPerformed
        // TODO add your handling code here:
        int IFila,ICol;
        String StrSimbolo = null;
        //Obtenemos el modelo de la tabla en la cual vamos a trabajar
        DefaultTableModel modelo = (DefaultTableModel) Tbl_Info.getModel();
        //Creamos un arreglo de tipo Objeto donde guardaremos los datos de cada columna
        Object[] Fila = new  Object[6];
        //Ciclo de llenado de la tabla o matriz
        for(IFila=0;IFila<=9;IFila++)
        {
            for(ICol=0;ICol<=5;ICol++)
            {
                switch(ICol)
               {
                    case 0:
                        StrSimbolo="";
                        StrPlanilla[IFila][ICol] = Integer.toString(llenado(6,0));
                        break;
                    case 1:
                        StrSimbolo="";
                        StrPlanilla[IFila][ICol] = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
                        break;
                    case 2:
                        StrSimbolo="Q  ";
                        StrPlanilla[IFila][ICol] = Integer.toString(llenado(5000,2000));
                        break;
                    case 3:
                        StrSimbolo="Q  ";
                        StrPlanilla[IFila][ICol] = Integer.toString(llenado(1000,100));
                        break;
                    case 4:
                        StrSimbolo="Q  ";
                        StrPlanilla[IFila][ICol] = Integer.toString(llenado(1000,0));
                        break;
                    case 5:
                        StrSimbolo="Q  ";
                        int ISueldoBase = Integer.parseInt(StrPlanilla[IFila][2]);
                        int ITotalDeduciones = Integer.parseInt(StrPlanilla[IFila][3]);
                        int ITotalPercepciones =Integer.parseInt(StrPlanilla[IFila][4]);
                        StrPlanilla[IFila][ICol]= Integer.toString((ISueldoBase-ITotalDeduciones)+ ITotalPercepciones);
                        break;
               }
                Fila[ICol]=StrSimbolo+StrPlanilla[IFila][ICol];
            }
            //agregamos el arreglo de la cada fila a la tabla
            modelo.addRow(Fila);
            //Asignamos y/o aplicamos el modelo a nuestra tabla
            Tbl_Info.setModel(modelo);
        }
        
    }//GEN-LAST:event_BtnLlenarActionPerformed

    private void BtnTotalDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTotalDepartamentoActionPerformed
        // TODO add your handling code here:
        int IFila=0,ICon=1;
        int ITotales;
        //Obtenemos el modelo de la tabla en la cual vamos a trabajar
        DefaultTableModel modelo = (DefaultTableModel) Tbl_TotalDepartamento.getModel();
        //Creamos un arreglo de tipo Objeto donde guardaremos los datos de cada columna
        Object[] DatosEmp = new  Object[2];
        while(IFila!=5)
        {
        StrTotalDepar[IFila][0]=ICon;
        StrTotalDepar[IFila][1]=0;
        IFila++;
        }
        while(ICon!=6){
           ITotales=0; 
        for(IFila=0;IFila<=9;IFila++)
        {
            if(StrPlanilla[IFila][0].equals(Integer.toString(ICon))){
                StrTotalDepar[ICon][1] += Integer.parseInt(StrPlanilla[IFila][5]);
                ITotales = StrTotalDepar[ICon][1];
            }
        }
        DatosEmp[0]= Integer.toString(ICon);
        DatosEmp[1]= Integer.toString(ITotales);
        ICon++;
        //agregamos el arreglo de la cada fila a la tabla
        modelo.addRow(DatosEmp);
        //Asignamos y/o aplicamos el modelo a nuestra tabla
        Tbl_TotalDepartamento.setModel(modelo);
        }
    }//GEN-LAST:event_BtnTotalDepartamentoActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        // TODO add your handling code here:
        int IFila,ICol;
        //Obtenemos el modelo de la tabla en la cual vamos a trabajar
        for(IFila=0;IFila<=9;IFila++)
        {
            for(ICol=0;ICol<=5;ICol++)
            {
                StrPlanilla[IFila][ICol]="";
                if(IFila<5)
                {
                    StrTotalDepar[IFila][0]= 0;
                    StrTotalDepar[IFila][1]= 0;
                }
                
            }
        }
        Tbl_Info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Departamento", "Nombre  empleado", "Sueldo base", "Total Deduciones", "Total Percepciones", "Sueldo liquido"
            }
        ));
        Tbl_TotalDepartamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Departamnto", "Total"
            }
        ));
    }//GEN-LAST:event_BtnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Lab3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnLlenar;
    private javax.swing.JButton BtnTotalDepartamento;
    private javax.swing.JTable Tbl_Info;
    private javax.swing.JTable Tbl_TotalDepartamento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
