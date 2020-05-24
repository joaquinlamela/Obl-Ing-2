package interfaz;

import dominio.Persona;
import dominio.Sistema;
import java.awt.Image;
import java.awt.Toolkit;

public class VentanaMenuPrincipal extends javax.swing.JDialog {

    private Sistema sistema;

    public VentanaMenuPrincipal(Sistema unSistema) {

        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema = unSistema;
        this.iniicializarListaMenuPrincipal();
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Imagen5.png"));
        return retValue;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema unSistema) {
        this.sistema = unSistema;
    }
    
    private void iniicializarListaMenuPrincipal(){
        if (sistema.getListaUsuarios().isEmpty()) {
            this.panelUsuarios.setVisible(true);
            this.listaUsuariosVentana.setVisible(false);
            this.jScrollPane2.setVisible(false);
            this.lblNoHayUsuarios.setVisible(true);
        }else{
            this.panelUsuarios.setVisible(false);
            this.listaUsuariosVentana.setListData(sistema.getListaUsuarios().toArray());
            this.jScrollPane2.setVisible(true);
            //this.lblNoHayUsuarios.setVisible(false);
            this.listaUsuariosVentana.setVisible(true);
        }
        if (sistema.getListaProfesionales().isEmpty()) {
            this.panelProfesionales.setVisible(true);
            this.listaProfesionalesVentana.setVisible(false);
            this.jScrollPane1.setVisible(false);
            this.lblNoHayProfesionales.setVisible(true);
        }else{
            this.panelProfesionales.setVisible(false);
            this.listaProfesionalesVentana.setListData(sistema.getListaProfesionales().toArray());
            this.jScrollPane1.setVisible(true);
            this.lblNoHayProfesionales.setVisible(false);
            this.listaProfesionalesVentana.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        lblTituloVentana = new javax.swing.JLabel();
        icono = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        lblNuevoUsuario = new javax.swing.JLabel();
        lblIconoNuevoUsuario = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProfesionalesVentana = new javax.swing.JList();
        btnAgregarUsuario = new javax.swing.JLabel();
        btnAgregarProfesional = new javax.swing.JLabel();
        panelProfesionales = new javax.swing.JPanel();
        lblNoHayProfesionales = new javax.swing.JLabel();
        lblNoHayProfesionales1 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        btnAgregarProfesional1 = new javax.swing.JLabel();
        btnCerrarSistema = new javax.swing.JButton();
        panelUsuarios = new javax.swing.JPanel();
        lblNoHayUsuarios = new javax.swing.JLabel();
        lblNoHayUsuarios1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaUsuariosVentana = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1060, 800));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1060, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        panel1.setBackground(new java.awt.Color(164, 211, 249));

        lblTituloVentana.setFont(new java.awt.Font("Segoe Script", 1, 50)); // NOI18N
        lblTituloVentana.setForeground(new java.awt.Color(0, 51, 153));
        lblTituloVentana.setText("Broccoli");

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBrocoli.png"))); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(lblTituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(lblTituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(349, Short.MAX_VALUE))
        );

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 270, 800);

        panel2.setBackground(new java.awt.Color(51, 51, 51));
        panel2.setForeground(new java.awt.Color(51, 51, 51));
        panel2.setLayout(null);

        lblNuevoUsuario.setFont(new java.awt.Font("Levenim MT", 0, 65)); // NOI18N
        lblNuevoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevoUsuario.setText("Inicio de Sesión");
        panel2.add(lblNuevoUsuario);
        lblNuevoUsuario.setBounds(203, 36, 530, 91);

        lblIconoNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"))); // NOI18N
        panel2.add(lblIconoNuevoUsuario);
        lblIconoNuevoUsuario.setBounds(85, 27, 100, 100);

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Profesional");
        panel2.add(lblNombre);
        lblNombre.setBounds(470, 200, 181, 38);

        listaProfesionalesVentana.setBackground(new java.awt.Color(51, 51, 51));
        listaProfesionalesVentana.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        listaProfesionalesVentana.setForeground(new java.awt.Color(255, 255, 255));
        listaProfesionalesVentana.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaProfesionalesVentanaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaProfesionalesVentana);

        panel2.add(jScrollPane1);
        jScrollPane1.setBounds(430, 250, 230, 330);

        btnAgregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoAgregarUsuario.png"))); // NOI18N
        btnAgregarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarUsuarioMouseClicked(evt);
            }
        });
        panel2.add(btnAgregarUsuario);
        btnAgregarUsuario.setBounds(150, 600, 110, 90);

        btnAgregarProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoAgregarProf.png"))); // NOI18N
        btnAgregarProfesional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarProfesionalMouseClicked(evt);
            }
        });
        panel2.add(btnAgregarProfesional);
        btnAgregarProfesional.setBounds(570, 640, 50, 80);

        panelProfesionales.setBackground(new java.awt.Color(51, 51, 51));
        panelProfesionales.setForeground(new java.awt.Color(51, 51, 51));

        lblNoHayProfesionales.setBackground(new java.awt.Color(51, 51, 51));
        lblNoHayProfesionales.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNoHayProfesionales.setForeground(new java.awt.Color(255, 255, 255));
        lblNoHayProfesionales.setText("Registre nuevos profesionales");

        lblNoHayProfesionales1.setBackground(new java.awt.Color(51, 51, 51));
        lblNoHayProfesionales1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNoHayProfesionales1.setForeground(new java.awt.Color(255, 255, 255));
        lblNoHayProfesionales1.setText("Aun no hay profesionales");

        javax.swing.GroupLayout panelProfesionalesLayout = new javax.swing.GroupLayout(panelProfesionales);
        panelProfesionales.setLayout(panelProfesionalesLayout);
        panelProfesionalesLayout.setHorizontalGroup(
            panelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProfesionalesLayout.createSequentialGroup()
                .addComponent(lblNoHayProfesionales, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelProfesionalesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblNoHayProfesionales1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelProfesionalesLayout.setVerticalGroup(
            panelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProfesionalesLayout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(lblNoHayProfesionales1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNoHayProfesionales, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );

        panel2.add(panelProfesionales);
        panelProfesionales.setBounds(380, 240, 330, 350);

        lblNombre1.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre1.setText("Usuario");
        panel2.add(lblNombre1);
        lblNombre1.setBounds(140, 200, 181, 38);

        btnAgregarProfesional1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoAgregarProfesional.png"))); // NOI18N
        btnAgregarProfesional1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarProfesional1MouseClicked(evt);
            }
        });
        panel2.add(btnAgregarProfesional1);
        btnAgregarProfesional1.setBounds(510, 600, 100, 90);

        btnCerrarSistema.setBackground(new java.awt.Color(51, 51, 51));
        btnCerrarSistema.setForeground(new java.awt.Color(51, 51, 51));
        btnCerrarSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Close_Window_48px.png"))); // NOI18N
        btnCerrarSistema.setBorderPainted(false);
        btnCerrarSistema.setContentAreaFilled(false);
        btnCerrarSistema.setFocusPainted(false);
        btnCerrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSistemaActionPerformed(evt);
            }
        });
        panel2.add(btnCerrarSistema);
        btnCerrarSistema.setBounds(730, 10, 50, 50);

        panelUsuarios.setBackground(new java.awt.Color(51, 51, 51));
        panelUsuarios.setForeground(new java.awt.Color(51, 51, 51));

        lblNoHayUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        lblNoHayUsuarios.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNoHayUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        lblNoHayUsuarios.setText("Registre nuevos usuarios");

        lblNoHayUsuarios1.setBackground(new java.awt.Color(255, 255, 255));
        lblNoHayUsuarios1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNoHayUsuarios1.setForeground(new java.awt.Color(255, 255, 255));
        lblNoHayUsuarios1.setText("Aun no hay usuarios");

        javax.swing.GroupLayout panelUsuariosLayout = new javax.swing.GroupLayout(panelUsuarios);
        panelUsuarios.setLayout(panelUsuariosLayout);
        panelUsuariosLayout.setHorizontalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuariosLayout.createSequentialGroup()
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUsuariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNoHayUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelUsuariosLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lblNoHayUsuarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelUsuariosLayout.setVerticalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuariosLayout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(lblNoHayUsuarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNoHayUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );

        lblNoHayUsuarios.getAccessibleContext().setAccessibleParent(jScrollPane2);
        lblNoHayUsuarios1.getAccessibleContext().setAccessibleName("Aun no hay usuarios");
        lblNoHayUsuarios1.getAccessibleContext().setAccessibleDescription("");

        panel2.add(panelUsuarios);
        panelUsuarios.setBounds(40, 240, 290, 350);

        jScrollPane2.setForeground(new java.awt.Color(51, 51, 51));

        listaUsuariosVentana.setBackground(new java.awt.Color(51, 51, 51));
        listaUsuariosVentana.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        listaUsuariosVentana.setForeground(new java.awt.Color(255, 255, 255));
        listaUsuariosVentana.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaUsuariosVentana.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaUsuariosVentanaValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaUsuariosVentana);

        panel2.add(jScrollPane2);
        jScrollPane2.setBounds(80, 250, 230, 330);
        jScrollPane2.getAccessibleContext().setAccessibleParent(panel2);

        getContentPane().add(panel2);
        panel2.setBounds(275, 0, 950, 800);
        panel2.getAccessibleContext().setAccessibleParent(panel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.sistema.guardarDatosSistema();
    }//GEN-LAST:event_formWindowClosing

    private void listaUsuariosVentanaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaUsuariosVentanaValueChanged
        this.sistema.setPersonaLogueada((Persona) listaUsuariosVentana.getSelectedValue());
        VentanaMenuPrincipalUsuario ventanaPrincipalUsuarios = new VentanaMenuPrincipalUsuario(sistema);
        this.setVisible(false);
        ventanaPrincipalUsuarios.setVisible(true);
    }//GEN-LAST:event_listaUsuariosVentanaValueChanged

    private void listaProfesionalesVentanaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaProfesionalesVentanaValueChanged
        this.sistema.setPersonaLogueada((Persona) listaProfesionalesVentana.getSelectedValue());
        VentanaMenuPrincipalProfesional ventanaPrincipalProfesionales = new VentanaMenuPrincipalProfesional(sistema);
        this.setVisible(false);
        ventanaPrincipalProfesionales.setVisible(true);
    }//GEN-LAST:event_listaProfesionalesVentanaValueChanged

    private void btnAgregarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioMouseClicked
        VentanaRegistrarUsuario unA = new VentanaRegistrarUsuario(sistema);
        this.setVisible(false);
        unA.setVisible(true);
    }//GEN-LAST:event_btnAgregarUsuarioMouseClicked

    private void btnAgregarProfesionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProfesionalMouseClicked
        VentanaRegistrarProfesional ventanaRegProfesional = new VentanaRegistrarProfesional(sistema);
        this.setVisible(false);
        ventanaRegProfesional.setVisible(true);
    }//GEN-LAST:event_btnAgregarProfesionalMouseClicked

    private void btnAgregarProfesional1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProfesional1MouseClicked
        VentanaRegistrarProfesional ventanaRegProfesional = new VentanaRegistrarProfesional(sistema);
        this.setVisible(false);
        ventanaRegProfesional.setVisible(true);
    }//GEN-LAST:event_btnAgregarProfesional1MouseClicked

    private void btnCerrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSistemaActionPerformed
        this.sistema.guardarDatosSistema();
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btnCerrarSistemaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregarProfesional;
    private javax.swing.JLabel btnAgregarProfesional1;
    private javax.swing.JLabel btnAgregarUsuario;
    private javax.swing.JButton btnCerrarSistema;
    private javax.swing.JLabel icono;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblIconoNuevoUsuario;
    private javax.swing.JLabel lblNoHayProfesionales;
    private javax.swing.JLabel lblNoHayProfesionales1;
    private javax.swing.JLabel lblNoHayUsuarios;
    private javax.swing.JLabel lblNoHayUsuarios1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNuevoUsuario;
    private javax.swing.JLabel lblTituloVentana;
    private javax.swing.JList listaProfesionalesVentana;
    private javax.swing.JList listaUsuariosVentana;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelProfesionales;
    private javax.swing.JPanel panelUsuarios;
    // End of variables declaration//GEN-END:variables

}
