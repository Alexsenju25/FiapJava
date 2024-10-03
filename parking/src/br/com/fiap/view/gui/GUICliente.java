package br.com.fiap.view.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUICliente extends JPanel {
    private JLabel lbId, lbNome, lbPlaca;
    private JTextField tfId, tfNome, tfPlaca;
    private JButton btPesquisa, btNovo, btAtualiza, btApaga, btCancelar;

    public GUICliente() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        setBackground(Color.green);
        lbId = new JLabel("ID:", JLabel.RIGHT);
        lbNome = new JLabel("Nome:", JLabel.RIGHT);
        lbPlaca = new JLabel("Placa:", JLabel.RIGHT);
        tfId = new JTextField();
        tfNome = new JTextField();
        tfPlaca = new JTextField();
        btPesquisa = new JButton(new ImageIcon(getClass().getResource("images/search_icon.png")));
        btNovo = new JButton(new ImageIcon(getClass().getResource("images/new_icon.png")));
        btAtualiza = new JButton(new ImageIcon(getClass().getResource("images/update_icon.png")));
        btApaga = new JButton(new ImageIcon(getClass().getResource("images/delete_icon.png")));
        btCancelar = new JButton(new ImageIcon(getClass().getResource("images/exit_icon.png")));

        lbId.setBounds(10, 30, 80, 25);
        tfId.setBounds(100, 30, 120, 25);
        lbNome.setBounds(10, 60, 80, 25);
        tfNome.setBounds(100, 60, 200, 25);
        lbPlaca.setBounds(10, 90, 80, 25);
        tfPlaca.setBounds(100, 90, 120, 25);
        btPesquisa.setBounds(50, 250, 60, 40);
        btNovo.setBounds(120, 250, 60, 40);
        btAtualiza.setBounds(190, 250, 60, 40);
        btApaga.setBounds(260, 250, 60, 40);
        btCancelar.setBounds(330, 250, 60, 40);

        add(lbId);
        add(tfId);
        add(lbNome);
        add(tfNome);
        add(lbPlaca);
        add(tfPlaca);
        add(btPesquisa);
        add(btNovo);
        add(btAtualiza);
        add(btApaga);
        add(btCancelar);
    }

    private void definirEventos() {
        btPesquisa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
            }
        });

        btNovo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
            }
        });

        btAtualiza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
            }
        });

        btApaga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
            }
        });

        btCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
            }
        });
    }
}
