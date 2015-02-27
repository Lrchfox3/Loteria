/*
 * Loteria.java
 *
 * Created on 04-05-2010, 08:58:47 PM
 */
package loteria;

import DTO.NumeroGenerado;
import Random.Aleatorio;
import bd.LoteriaController;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author lchinchilla
 */
public class Loteria1 extends javax.swing.JFrame {

    public static final String MENSAJE_GUARDAR = "Se ha guardado la información";

    public Loteria1() {
        try {
            com.gmail.lrchfox3.utilitarios.Utileria.lookAndFeelSystem();
        } catch (Exception ex) {
            Logger.getLogger(Loteria1.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnGenerar = new com.gmail.lrchfox3.controles.botones.JBotonAceptar();
        jLabel2 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNumsLoteria = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSorteados = new javax.swing.JTextArea();
        btnGuardar = new com.gmail.lrchfox3.controles.botones.JBotonAceptar();
        jBotonAceptar1 = new com.gmail.lrchfox3.controles.botones.JBotonAceptar();
        jPanel5 = new javax.swing.JPanel();
        txtResultado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtGenerados = new javax.swing.JTextPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtGeneral1 = new javax.swing.JTextField();
        txtGeneral2 = new javax.swing.JTextField();
        txtGeneral3 = new javax.swing.JTextField();
        txtGeneral4 = new javax.swing.JTextField();
        txtGeneral5 = new javax.swing.JTextField();
        txtGeneral6 = new javax.swing.JTextField();
        btnProcesar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtGeneralGenerados1 = new javax.swing.JTextField();
        txtGeneralGenerados2 = new javax.swing.JTextField();
        txtGeneralGenerados3 = new javax.swing.JTextField();
        txtGeneralGenerados4 = new javax.swing.JTextField();
        txtGeneralGenerados5 = new javax.swing.JTextField();
        txtGeneralGenerados6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtGeneralSorteados1 = new javax.swing.JTextField();
        txtGeneralSorteados2 = new javax.swing.JTextField();
        txtGeneralSorteados3 = new javax.swing.JTextField();
        txtGeneralSorteados4 = new javax.swing.JTextField();
        txtGeneralSorteados5 = new javax.swing.JTextField();
        txtGeneralSorteados6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtGeneradosPos1 = new javax.swing.JTextField();
        txtGeneradosPos2 = new javax.swing.JTextField();
        txtGeneradosPos3 = new javax.swing.JTextField();
        txtGeneradosPos4 = new javax.swing.JTextField();
        txtGeneradosPos5 = new javax.swing.JTextField();
        txtGeneradosPos6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtSorteadoPos1 = new javax.swing.JTextField();
        txtSorteadoPos2 = new javax.swing.JTextField();
        txtSorteadoPos3 = new javax.swing.JTextField();
        txtSorteadoPos4 = new javax.swing.JTextField();
        txtSorteadoPos5 = new javax.swing.JTextField();
        txtSorteadoPos6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Generador de Números de Lotería");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        btnGenerar.setText("Generar");
        btnGenerar.setToolTipText("Generar Número Lotería");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad:");

        txtNumsLoteria.setColumns(20);
        txtNumsLoteria.setRows(5);
        jScrollPane1.setViewportView(txtNumsLoteria);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 34, -1, -1));

        jTabbedPane1.addTab("Generador", jPanel2);

        txtSorteados.setColumns(20);
        txtSorteados.setRows(5);
        jScrollPane2.setViewportView(txtSorteados);

        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBotonAceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotonAceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Guardar Sorteados", jPanel3);

        jLabel4.setText("Resultado");

        jLabel5.setText("Números");

        btnVerificar.setMnemonic('V');
        btnVerificar.setText("Verificar");
        btnVerificar.setActionCommand("btnVerificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(txtGenerados);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResultado)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerificar)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                        .addComponent(btnVerificar))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Verificar Resultado", jPanel5);

        jLabel3.setText("General");

        txtGeneral1.setEditable(false);

        txtGeneral2.setEditable(false);

        txtGeneral3.setEditable(false);

        txtGeneral4.setEditable(false);

        txtGeneral5.setEditable(false);

        txtGeneral6.setEditable(false);

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        jLabel10.setText("General Generados");

        txtGeneralGenerados1.setEditable(false);

        txtGeneralGenerados2.setEditable(false);

        txtGeneralGenerados3.setEditable(false);

        txtGeneralGenerados4.setEditable(false);

        txtGeneralGenerados5.setEditable(false);

        txtGeneralGenerados6.setEditable(false);

        jLabel11.setText("General Sorteados");

        txtGeneralSorteados1.setEditable(false);

        txtGeneralSorteados2.setEditable(false);

        txtGeneralSorteados3.setEditable(false);

        txtGeneralSorteados4.setEditable(false);

        txtGeneralSorteados5.setEditable(false);

        txtGeneralSorteados6.setEditable(false);

        jLabel12.setText("Generados por Posición");

        txtGeneradosPos1.setEditable(false);

        txtGeneradosPos2.setEditable(false);

        txtGeneradosPos3.setEditable(false);

        txtGeneradosPos4.setEditable(false);

        txtGeneradosPos5.setEditable(false);

        txtGeneradosPos6.setEditable(false);

        jLabel13.setText("Sorteados por Posición");

        txtSorteadoPos1.setEditable(false);

        txtSorteadoPos2.setEditable(false);

        txtSorteadoPos3.setEditable(false);

        txtSorteadoPos4.setEditable(false);

        txtSorteadoPos5.setEditable(false);

        txtSorteadoPos6.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtGeneral1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeneral2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeneral3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeneral4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeneral5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtGeneral6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnProcesar))
                    .addComponent(jLabel10)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtGeneralGenerados1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeneralGenerados2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeneralGenerados3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeneralGenerados4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeneralGenerados5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtGeneralGenerados6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtGeneralSorteados1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeneralSorteados2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeneralSorteados3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeneralSorteados4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeneralSorteados5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtGeneralSorteados6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtGeneradosPos1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeneradosPos2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeneradosPos3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeneradosPos4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeneradosPos5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtGeneradosPos6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtSorteadoPos1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSorteadoPos2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSorteadoPos3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSorteadoPos4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSorteadoPos5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSorteadoPos6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGeneral1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneral2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneral3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneral4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneral5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneral6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcesar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGeneralGenerados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneralGenerados2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneralGenerados3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneralGenerados4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneralGenerados5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneralGenerados6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGeneralSorteados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneralSorteados2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneralSorteados3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneralSorteados4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneralSorteados5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneralSorteados6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGeneradosPos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneradosPos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneradosPos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneradosPos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneradosPos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneradosPos6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSorteadoPos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSorteadoPos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSorteadoPos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSorteadoPos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSorteadoPos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSorteadoPos6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Estadisticas", jPanel4);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        if (txtCantidad.getText().length() >= 0) {
            int cantidad = new Integer(txtCantidad.getText()).intValue();

            for (int i = 0; i < cantidad; i++) {
                try {
                    generarNumeroLoteria();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
                    Logger.getLogger(Loteria1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardarSorteados();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        try {
            int pos1 = 0, pos2 = 0, pos3 = 0, pos4 = 0, pos5 = 0;
            List<String> estadistica1 = loteriaController.generarEstadisticas(1);
            List<String> estadistica2 = loteriaController.generarEstadisticas(2);
            List<String> estadistica3 = loteriaController.generarEstadisticas(3);
            List<String> estadistica4 = loteriaController.generarEstadisticas(4);
            List<String> estadistica5 = loteriaController.generarEstadisticas(5);

            this.txtGeneral1.setText(estadistica1.get(0));
            this.txtGeneral2.setText(estadistica1.get(1));
            this.txtGeneral3.setText(estadistica1.get(2));
            this.txtGeneral4.setText(estadistica1.get(3));
            this.txtGeneral5.setText(estadistica1.get(4));
            this.txtGeneral6.setText(estadistica1.get(5));

            this.txtGeneralGenerados1.setText(estadistica2.get(0));
            this.txtGeneralGenerados2.setText(estadistica2.get(1));
            this.txtGeneralGenerados3.setText(estadistica2.get(2));
            this.txtGeneralGenerados4.setText(estadistica2.get(3));
            this.txtGeneralGenerados5.setText(estadistica2.get(4));
            this.txtGeneralGenerados6.setText(estadistica2.get(5));

            this.txtGeneralSorteados1.setText(estadistica3.get(0));
            this.txtGeneralSorteados2.setText(estadistica3.get(1));
            this.txtGeneralSorteados3.setText(estadistica3.get(2));
            this.txtGeneralSorteados4.setText(estadistica3.get(3));
            this.txtGeneralSorteados5.setText(estadistica3.get(4));
            this.txtGeneralSorteados6.setText(estadistica3.get(5));

            this.txtGeneradosPos1.setText(estadistica4.get(0));
            this.txtGeneradosPos2.setText(estadistica4.get(1));
            this.txtGeneradosPos3.setText(estadistica4.get(2));
            this.txtGeneradosPos4.setText(estadistica4.get(3));
            this.txtGeneradosPos5.setText(estadistica4.get(4));
            this.txtGeneradosPos6.setText(estadistica4.get(5));

            this.txtSorteadoPos1.setText(estadistica5.get(0));
            this.txtSorteadoPos2.setText(estadistica5.get(1));
            this.txtSorteadoPos3.setText(estadistica5.get(2));
            this.txtSorteadoPos4.setText(estadistica5.get(3));
            this.txtSorteadoPos5.setText(estadistica5.get(4));
            this.txtSorteadoPos6.setText(estadistica5.get(5));


        } catch (SQLException ex) {
            Logger.getLogger(Loteria1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        verificarResultado(); // TODO add your handling code here:
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void verificarResultado() {
        String strResultado = this.txtResultado.getText();
        List<String> arrResultado = getNumeros(strResultado);

        String[] lines = this.txtGenerados.getText().split("\\n");
        for (String line : lines) {
            List<String> arrGenerado = getNumeros(line);
            int cont = 0;
            for (String item : arrGenerado) {
                if (arrResultado.contains(item)) {
                    cont++;
                }
            }
            switch (cont) {
                case 3:
                    System.out.println("El loto # " + getLinea(arrGenerado) + " tiene " + cont + " coincidencias. Numero Gratis");
                    break;
                case 4:
                    System.out.println("El loto # " + getLinea(arrGenerado) + " tiene " + cont + " coincidencias. PREMIO lps. 200");
                    break;
                case 5:
                    System.out.println("El loto # " + getLinea(arrGenerado) + " tiene " + cont + " coincidencias. % PREMIO");
                    break;
                case 6:
                    System.out.println("El loto # " + getLinea(arrGenerado) + " tiene " + cont + " coincidencias. SUPER PREMIO");
                    break;
                default:
                    System.out.println("El loto # " + getLinea(arrGenerado) + " No tiene premio");
                    break;
            }
        }
    }

    private List getNumeros(String line) {
        List<String> arrResultado = new ArrayList<String>();
        int pos1 = line.indexOf("-");
        while (pos1 > 0) {
            arrResultado.add(line.substring(0, pos1).trim());

            line = line.substring(pos1 + 1, line.length());

            pos1 = line.indexOf("-");
        }
        if (line.length() > 0) {
            arrResultado.add(line.trim());
        }

        return arrResultado;
    }

    private String getLinea(List<String> arrResultado) {
        String linea = "";
        for (String item : arrResultado) {
            linea = linea + item + " - ";
        }
        int pos = linea.lastIndexOf("-");
        return linea.substring(0, pos - 1);
    }

    private void guardarSorteados() {
        String[] lines = txtSorteados.getText().split("\\n");
        for (String line : lines) {
            try {
                String numero = line.split(",")[0].trim();
                String strFecha = line.split(",")[1].trim();
                SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
                java.util.Date fecha = null;
                try {
                    fecha = formatoDelTexto.parse(strFecha);
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }

                int pos1 = numero.indexOf("-");
                int pos2 = numero.lastIndexOf("-");
                NumeroGenerado numGenerado = new NumeroGenerado();
                numGenerado.setNumero(numero.substring(pos1 - 2, pos2 + 3).replaceAll("-", " - "));
                numGenerado.setFecha(new java.sql.Date(fecha.getTime()));
                numGenerado.setRepeticion(0);
                txtNumsLoteria.append(numGenerado.getNumero() + "\n");
                boolean retValue = loteriaController.editarNumeroSorteado(LoteriaController.ACCION_INSERT, numGenerado);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
                Logger.getLogger(Loteria1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        txtSorteados.setText(null);
        JOptionPane.showMessageDialog(this, MENSAJE_GUARDAR);
    }

    private void generarNumeroLoteria() throws SQLException {
        Aleatorio aleatorio = new Aleatorio();
        aleatorio.calcularResultado();
        aleatorio.imprimirResultado();
        aleatorio.imprimirResultado(aleatorio.getResultadoOrdenado(true));

        NumeroGenerado numGenerado = new NumeroGenerado();
        numGenerado.setNumero(aleatorio.getStrResultado());
        numGenerado.setFecha(com.gmail.lrchfox3.utilitarios.Utileria.fechaActual(loteriaController.getCnn(), "SELECT CURRENT_TIMESTAMP AS VALOR"));
        numGenerado.setRepeticion(0);
        try {
            txtNumsLoteria.append(numGenerado.getNumero() + "\n");
            loteriaController.editarNumeroGenerado(LoteriaController.ACCION_INSERT, numGenerado);
        } catch (SQLException ex) {
            Logger.getLogger(Loteria1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.gmail.lrchfox3.controles.botones.JBotonAceptar btnGenerar;
    private com.gmail.lrchfox3.controles.botones.JBotonAceptar btnGuardar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JButton btnVerificar;
    private com.gmail.lrchfox3.controles.botones.JBotonAceptar jBotonAceptar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextPane txtGenerados;
    private javax.swing.JTextField txtGeneradosPos1;
    private javax.swing.JTextField txtGeneradosPos2;
    private javax.swing.JTextField txtGeneradosPos3;
    private javax.swing.JTextField txtGeneradosPos4;
    private javax.swing.JTextField txtGeneradosPos5;
    private javax.swing.JTextField txtGeneradosPos6;
    private javax.swing.JTextField txtGeneral1;
    private javax.swing.JTextField txtGeneral2;
    private javax.swing.JTextField txtGeneral3;
    private javax.swing.JTextField txtGeneral4;
    private javax.swing.JTextField txtGeneral5;
    private javax.swing.JTextField txtGeneral6;
    private javax.swing.JTextField txtGeneralGenerados1;
    private javax.swing.JTextField txtGeneralGenerados2;
    private javax.swing.JTextField txtGeneralGenerados3;
    private javax.swing.JTextField txtGeneralGenerados4;
    private javax.swing.JTextField txtGeneralGenerados5;
    private javax.swing.JTextField txtGeneralGenerados6;
    private javax.swing.JTextField txtGeneralSorteados1;
    private javax.swing.JTextField txtGeneralSorteados2;
    private javax.swing.JTextField txtGeneralSorteados3;
    private javax.swing.JTextField txtGeneralSorteados4;
    private javax.swing.JTextField txtGeneralSorteados5;
    private javax.swing.JTextField txtGeneralSorteados6;
    private javax.swing.JTextArea txtNumsLoteria;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtSorteadoPos1;
    private javax.swing.JTextField txtSorteadoPos2;
    private javax.swing.JTextField txtSorteadoPos3;
    private javax.swing.JTextField txtSorteadoPos4;
    private javax.swing.JTextField txtSorteadoPos5;
    private javax.swing.JTextField txtSorteadoPos6;
    private javax.swing.JTextArea txtSorteados;
    // End of variables declaration//GEN-END:variables
    private LoteriaController loteriaController = new LoteriaController();
}
