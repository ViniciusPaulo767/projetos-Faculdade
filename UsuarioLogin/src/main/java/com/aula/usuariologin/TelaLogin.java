package com.aula.usuariologin;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

    private JTextField loginTextField;
    private JPasswordField senhaPasswordField;
    private JButton loginButton;

    public TelaLogin() {
        // Configuração da janela
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criação dos componentes
        loginTextField = new JTextField(20);
        senhaPasswordField = new JPasswordField(20);
        loginButton = new JButton("Login");

        // Adiciona o listener ao botão
        loginButton.addActionListener(this::loginButtonActionPerformed);

        // Layout (exemplo simplificado)
        JPanel panel = new JPanel();
        panel.add(new JLabel("Usuário:"));
        panel.add(loginTextField);
        panel.add(new JLabel("Senha:"));
        panel.add(senhaPasswordField);
        panel.add(loginButton);

        add(panel);
    }

    // Método que você compartilhou (adaptado)
    private void loginButtonActionPerformed(ActionEvent evt) {
        String login = loginTextField.getText();
        String senha = new String(senhaPasswordField.getPassword());

        try {
            Usuario usuario = new Usuario(login, senha);
            DAO dao = new DAO();

            if (dao.existe(usuario)) {
                JOptionPane.showMessageDialog(this, "Bem-vindo, " + usuario.getNome() + "!");
                // Abre a próxima tela (ex: new TelaPrincipal().setVisible(true);)
            } else {
                JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage(), "Falha", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaLogin().setVisible(true));
    }
}
