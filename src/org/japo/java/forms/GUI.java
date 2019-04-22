/*
 * Copyright 2019 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.forms;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.util.Locale;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.japo.java.components.BackgroundPanel;
import org.japo.java.libraries.UtilesSwing;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public final class GUI extends JFrame {

    // Colores
    private static final Color COLOR_FOCO_GANADO = Color.ORANGE;
    private static final Color COLOR_FOCO_PERDIDO = Color.LIGHT_GRAY;

    // Referencias
    private final Properties prp;

    // Componentes
    private JPanel pnlPpal;

    // Fuentes
    private Font fntDisplay;

    // Imágenes
    private Image imgBack;

    // Constructor
    public GUI(Properties prp) {
        // Conectar Referencia
        this.prp = prp;

        // Inicialización Anterior
        initBefore();

        // Creación Interfaz
        initComponents();

        // Inicialización Posterior
        initAfter();
    }

    // Construcción - GUI
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEur = new javax.swing.JLabel();
        txfEur = new javax.swing.JTextField();
        lblDol = new javax.swing.JLabel();
        txfDol = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor Euro/Dólar");
        setResizable(false);

        lblEur.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        lblEur.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEur.setText("Euros");

        txfEur.setBackground(java.awt.Color.lightGray);
        txfEur.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txfEur.setText("0.00");
        txfEur.setPreferredSize(new java.awt.Dimension(200, 50));
        txfEur.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfEurFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfEurFocusLost(evt);
            }
        });
        txfEur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfEurActionPerformed(evt);
            }
        });

        lblDol.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        lblDol.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDol.setText("Dólares");

        txfDol.setBackground(java.awt.Color.lightGray);
        txfDol.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txfDol.setText("0.00");
        txfDol.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfDolFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfDolFocusLost(evt);
            }
        });
        txfDol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfDolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDol, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEur, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfEur, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txfDol, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblDol, lblEur, txfDol, txfEur});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblEur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(txfEur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblDol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfDol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblDol, lblEur, txfDol, txfEur});

        setSize(new java.awt.Dimension(500, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txfEurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfEurActionPerformed
        procesarAccion(evt);
    }//GEN-LAST:event_txfEurActionPerformed

    private void txfDolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfDolActionPerformed
        procesarAccion(evt);
    }//GEN-LAST:event_txfDolActionPerformed

    private void txfEurFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfEurFocusGained
        procesarFocoGanado(evt);
    }//GEN-LAST:event_txfEurFocusGained

    private void txfEurFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfEurFocusLost
        procesarFocoPerdido(evt);
    }//GEN-LAST:event_txfEurFocusLost

    private void txfDolFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfDolFocusGained
        procesarFocoGanado(evt);
    }//GEN-LAST:event_txfDolFocusGained

    private void txfDolFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfDolFocusLost
        procesarFocoPerdido(evt);
    }//GEN-LAST:event_txfDolFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblDol;
    private javax.swing.JLabel lblEur;
    private javax.swing.JTextField txfDol;
    private javax.swing.JTextField txfEur;
    // End of variables declaration//GEN-END:variables
    //
    // Inicialización Anterior    
    private void initBefore() {
        // Establecer LnF
        UtilesSwing.establecerLnFProfile(prp.getProperty("look_and_feel_profile"));

        // Fuentes
        fntDisplay = UtilesSwing.generarFuenteRecurso(prp.getProperty("font_resource"));

        // Imágenes
        imgBack = UtilesSwing.importarImagenRecurso(prp.getProperty("img_back_resource"));

        // Panel Principal
        pnlPpal = new BackgroundPanel(imgBack);

        // Ventana Principal
        setContentPane(pnlPpal);
    }

    // Inicialización Posterior
    private void initAfter() {
        // Establecer Favicon
        UtilesSwing.establecerFavicon(this, prp.getProperty("img_favicon_resource"));

        // Transparencias
        lblEur.setOpaque(true);
        lblEur.setBackground(new Color(255, 255, 255, 200));
        lblDol.setOpaque(true);
        lblDol.setBackground(new Color(255, 255, 255, 200));
        
        // Fuentes
        txfEur.setFont(fntDisplay.deriveFont(Font.BOLD, 32f));
        txfDol.setFont(fntDisplay.deriveFont(Font.BOLD, 32f));

        // Ventana Principal
        setTitle(prp.getProperty("form_title"));
        int width = Integer.parseInt(prp.getProperty("form_width"));
        int height = Integer.parseInt(prp.getProperty("form_height"));
        setSize(width, height);
        setLocationRelativeTo(null);
    }

    // Evento de Accion - Respuesta
    public void procesarAccion(ActionEvent e) {
        if (e.getSource().equals(txfEur)) {
            convertirE2D();     // E >> D
        } else {
            convertirD2E();     // D >> E
        }
    }

    // E >> D
    private void convertirE2D() {
        try {
            String textoEur = txfEur.getText();
            textoEur = textoEur.replace(',', '.');
            double dineroEur = Double.parseDouble(textoEur);
            textoEur = String.format(Locale.ENGLISH, "%.2f", dineroEur);
            txfEur.setText(textoEur);
            double cambio = Double.parseDouble(prp.getProperty("factor_conversion"));
            double dineroDol = dineroEur * cambio;
            String textoDol = String.format(Locale.ENGLISH, "%.2f", dineroDol);
            txfDol.setText(textoDol);
        } catch (NumberFormatException e) {
            txfDol.setText("???");
        }
    }

    // D >> E
    private void convertirD2E() {
        try {
            String textoDol = txfDol.getText();
            textoDol = textoDol.replace(',', '.');
            double dineroDol = Double.parseDouble(textoDol);
            textoDol = String.format(Locale.ENGLISH, "%.2f", dineroDol);
            txfDol.setText(textoDol);
            double cambio = Double.parseDouble(prp.getProperty("factor_conversion"));
            double dineroEur = dineroDol / cambio;
            String textoEur = String.format(Locale.ENGLISH, "%.2f", dineroEur);
            txfEur.setText(textoEur);
        } catch (NumberFormatException e) {
            txfEur.setText("???");
        }
    }

    // Gestión Foco Ganado
    public final void procesarFocoGanado(FocusEvent e) {
        // Campo de Texto - Evento
        JTextField txfAct = (JTextField) e.getSource();

        // Color Fondo - GANADO
        txfAct.setBackground(COLOR_FOCO_GANADO);

        // Mover Cursor - PRINCIPIO
        txfAct.setSelectionStart(0);
    }

    // Gestión Foco Perdido
    public final void procesarFocoPerdido(FocusEvent e) {
        // Campo de Texto - Evento
        JTextField txfAct = (JTextField) e.getSource();

        // Color Fondo - PERDIDO
        txfAct.setBackground(COLOR_FOCO_PERDIDO);
    }
}
