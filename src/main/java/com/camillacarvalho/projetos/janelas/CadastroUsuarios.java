/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.camillacarvalho.projetos.janelas;

import com.camillacarvalho.projetos.entidades.Usuario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Camilla Carvalho, Fatec Botucatu 2022
 */
public final class CadastroUsuarios extends javax.swing.JFrame {

    private List<Usuario> listaUsuariosCadastrados;

    /**
     * Creates new form CadastroUsuario
     */
    public CadastroUsuarios() {
        initComponents();
        carregarDados();
        //jComboListaUsuarios.addItem();
        
        jComboNivel.addItem("Administrador");
        //jComboNivel.addItem("Usuário Cliente");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jComboListaUsuarios = new javax.swing.JComboBox<>();
        jComboNivel = new javax.swing.JComboBox<>();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldLogin = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        idBtnSalvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabelUsuarioId = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPasswordField2.setText("jPasswordField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados do Usuário"));
        jPanel1.setToolTipText("");

        jComboListaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboListaUsuariosActionPerformed(evt);
            }
        });

        jComboNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboNivelActionPerformed(evt);
            }
        });

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Senha:");

        jLabel3.setText("Login:");

        jLabel4.setText("Nível:");

        jLabel5.setText("Usuários:");

        jButton1.setText("FECHAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        idBtnSalvar.setText("SALVAR");
        idBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idBtnSalvarActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Id:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabelUsuarioId.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboListaUsuarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelUsuarioId, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(idBtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboNivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboListaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabelUsuarioId, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idBtnSalvar)
                    .addComponent(jButton1))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idBtnSalvarActionPerformed
        int _id = 0;
        try{
            _id = Integer.parseInt(this.jLabelUsuarioId.getText());
        }
        catch(NumberFormatException ex){
            
        }
        
        String _nome = this.jTextFieldNome.getText();
        String _login = this.jTextFieldLogin.getText();
        String _senha = this.jPasswordFieldSenha.getText();
        String _nivel = this.jComboNivel.getSelectedItem().toString();

        HomeController.print(""+_id);
        HomeController.print(_nome);
        HomeController.print(_login);
        HomeController.print(_senha);
        HomeController.print(_nivel);

        if(jComboListaUsuarios.getSelectedItem().equals("Adicionar: Novo Usuário")){
            int ii=0;
            // próximo Id
            for (Usuario usuarioFromLista : HomeController.listaUsuarios) {
                if(ii <= usuarioFromLista.getId()){
                    ii = usuarioFromLista.getId()+1;
                }
            }
            Usuario usuario = new Usuario(ii, _nome, _login, _senha, _nivel);
            HomeController.addUsuario2Lista(usuario);
        }
        else{
            Usuario usuario = new Usuario(_id, _nome, _login, _senha, _nivel);
            HomeController.updateUsuario2Lista(usuario);
        }
        
        this.setVisible(false);
    }//GEN-LAST:event_idBtnSalvarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboNivelActionPerformed

    private void jComboListaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboListaUsuariosActionPerformed
        if(evt.getActionCommand().equals("comboBoxChanged")){
            if(jComboListaUsuarios.getSelectedItem()==null || jComboListaUsuarios.getSelectedItem().equals("Adicionar: Novo Usuário")){
                //this.jLabelUsuarioId.setText("0");
                this.jLabelUsuarioId.setText("");
                this.jTextFieldNome.setText("");
                this.jTextFieldLogin.setText("");
                this.jPasswordFieldSenha.setText("");
                this.jComboNivel.setSelectedItem(0);
                //System.out.println("comboBoxChanged: " + jComboListaUsuarios.getSelectedItem());
            }
            else{
                for (Usuario usuariosCadastrado : listaUsuariosCadastrados) {
                    if(usuariosCadastrado.getNome().equalsIgnoreCase(jComboListaUsuarios.getSelectedItem().toString())){
                        //System.out.println("comboBoxChanged selected: " + jComboListaUsuarios.getSelectedItem() + ", " + usuariosCadastrado.getNome());
                        this.jLabelUsuarioId.setText(""+usuariosCadastrado.getId());
                        this.jTextFieldNome.setText(usuariosCadastrado.getNome());
                        this.jTextFieldLogin.setText(usuariosCadastrado.getLogin());
                        this.jPasswordFieldSenha.setText(usuariosCadastrado.getSenha());
                        this.jComboNivel.setSelectedItem(usuariosCadastrado.getNome());
                    }
                }
            }
            
        }
    }//GEN-LAST:event_jComboListaUsuariosActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CadastroUsuarios().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton idBtnSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboListaUsuarios;
    private javax.swing.JComboBox<String> jComboNivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelUsuarioId;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

    public void setCamposEntrada() {
        this.jLabelUsuarioId.setText("0");
        this.jTextFieldNome.setText("");
        this.jTextFieldLogin.setText("");
        this.jPasswordFieldSenha.setText("");
        this.jPasswordFieldSenha.setText("");
    }

    public void carregarDados() {

        HomeController.print("carregarDadosUsuarios() in CadastroUsuarios");

        //this.jComboListaUsuarios = new javax.swing.JComboBox<>();

        File file = new File("projetoestoque.usuarios.persistencia.db");
        
        ObjectInputStream in = null;
        java.util.List<Usuario> listaUsuariosTmp = null;
        
        try {
            in = new ObjectInputStream(new FileInputStream(file));
            listaUsuariosTmp = (ArrayList<Usuario>) in.readObject();
            //listaUsuario = listaUsuariosTmp;
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
        
        if(listaUsuariosTmp==null){
            listaUsuariosTmp = new ArrayList<Usuario>();
        }
        
        listaUsuariosCadastrados = listaUsuariosTmp;
        
        this.jComboListaUsuarios.removeAllItems();
        this.jComboListaUsuarios.addItem("Adicionar: Novo Usuário");
        
        for (Usuario usuario : listaUsuariosTmp) {
            this.jComboListaUsuarios.addItem(usuario.getNome());
        }
    }

}
