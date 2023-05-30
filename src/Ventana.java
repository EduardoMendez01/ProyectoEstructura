import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Ventana extends JFrame {
    private JPanel panel;
    private JPanel mapauno;

    public Ventana() {
        getContentPane().setBackground(new Color(102, 102, 102));

        JLabel lblNewLabel = new JLabel("O&E Navegación");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setLocation(0, 0);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        getContentPane().add(lblNewLabel, BorderLayout.NORTH);

        panel = new JPanel();
        panel.setBackground(new Color(128, 128, 128));
        panel.setLayout(null);
        getContentPane().add(panel, BorderLayout.CENTER);

        ImageIcon foto = new ImageIcon("logo_uabcs.png");
        JLabel icono = new JLabel();
        icono.setSize(200, 200);
        icono.setLocation(110, 20);
        icono.setIcon(new ImageIcon(
                foto.getImage().getScaledInstance(icono.getWidth(), icono.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(icono);

        JButton btnNewButton = new JButton("Mapa 1");
        btnNewButton.setBounds(100, 280, 200, 50);
        panel.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                mapa_1();
                getContentPane().remove(panel);
                getContentPane().add(mapauno, BorderLayout.CENTER);
                revalidate();
                repaint();
            }
        });

        JButton btnNewButton2 = new JButton("Mapa 2");
        btnNewButton2.setBounds(100, 350, 200, 50);
        btnNewButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                mapa_2();
                getContentPane().remove(panel);
                getContentPane().add(mapauno, BorderLayout.CENTER);
                revalidate();
                repaint();
            }
        });
        panel.add(btnNewButton2);
        

        JButton btnNewButton3 = new JButton("Mapa 3");
        btnNewButton3.setBounds(100, 420, 200, 50);
        btnNewButton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                mapa_3();
                getContentPane().remove(panel);
                getContentPane().add(mapauno, BorderLayout.CENTER);
                revalidate();
                repaint();
            }
        });
        panel.add(btnNewButton3);

        JButton btnNewButton4 = new JButton("Mapa 4");
        btnNewButton4.setBounds(100, 485, 200, 50);
        btnNewButton4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                mapa_4();
                getContentPane().remove(panel);
                getContentPane().add(mapauno, BorderLayout.CENTER);
                revalidate();
                repaint();
            }
        });
        panel.add(btnNewButton4);

    }

    public void mapa_1() {

        mapauno = new JPanel();
        mapauno.setSize(400, 700);
        mapauno.setBackground(new Color(128, 128, 128));
        mapauno.setLayout(null);

        ImageIcon foto = new ImageIcon("mapa1.png");
        JLabel icono = new JLabel();
        icono.setSize(350, 350);
        icono.setLocation(20, 20);
        icono.setIcon(new ImageIcon(
                foto.getImage().getScaledInstance(icono.getWidth(), icono.getHeight(), Image.SCALE_SMOOTH)));
        mapauno.add(icono);
        
        JButton btnNewButton_anchura = new JButton("Recorrido por anchura");
        btnNewButton_anchura.setBounds(15, 435, 165, 50);
        mapauno.add(btnNewButton_anchura);
        
        JButton btnNewButton_profundidad = new JButton("Recorrido por profundidad");
        btnNewButton_profundidad.setBounds(190, 435, 183, 50);
        mapauno.add(btnNewButton_profundidad);
        
        JButton btnNewButton_volver = new JButton("Volver");
        btnNewButton_volver.setBounds(100, 500, 183, 50);
        mapauno.add(btnNewButton_volver);
        btnNewButton_volver.addActionListener(new ActionListener() {
        	
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		// TODO Auto-generated method stub
        		panel.removeAll();
        		panel.repaint();
        		panel.revalidate();
        		
        	}
        	
        });
    }

    public void mapa_2() {

        mapauno = new JPanel();
        mapauno.setSize(400, 700);
        mapauno.setBackground(new Color(128, 128, 128));
        mapauno.setLayout(null);

        ImageIcon foto = new ImageIcon("mapa2.png");
        JLabel icono = new JLabel();
        icono.setSize(350, 350);
        icono.setLocation(20, 20);
        icono.setIcon(new ImageIcon(
                foto.getImage().getScaledInstance(icono.getWidth(), icono.getHeight(), Image.SCALE_SMOOTH)));
        mapauno.add(icono);
        
        JButton btnNewButton_anchura = new JButton("Recorrido por anchura");
        btnNewButton_anchura.setBounds(15, 435, 165, 50);
        mapauno.add(btnNewButton_anchura);
        
        JButton btnNewButton_profundidad = new JButton("Recorrido por profundidad");
        btnNewButton_profundidad.setBounds(190, 435, 183, 50);
        mapauno.add(btnNewButton_profundidad);
        
        JButton btnNewButton_volver = new JButton("Volver");
        btnNewButton_volver.setBounds(100, 500, 183, 50);
        mapauno.add(btnNewButton_volver);
        btnNewButton_volver.addActionListener(new ActionListener() {
        	
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		// TODO Auto-generated method stub
        		panel.removeAll();
        		panel.repaint();
        		panel.revalidate();
        		
        	}
        	
        });
    }
    
    public void mapa_3() {

        mapauno = new JPanel();
        mapauno.setSize(400, 700);
        mapauno.setBackground(new Color(128, 128, 128));
        mapauno.setLayout(null);

        ImageIcon foto = new ImageIcon("mapa3.png");
        JLabel icono = new JLabel();
        icono.setSize(350, 350);
        icono.setLocation(20, 20);
        icono.setIcon(new ImageIcon(
                foto.getImage().getScaledInstance(icono.getWidth(), icono.getHeight(), Image.SCALE_SMOOTH)));
        mapauno.add(icono);
        
        JButton btnNewButton_anchura = new JButton("Recorrido por anchura");
        btnNewButton_anchura.setBounds(15, 435, 165, 50);
        mapauno.add(btnNewButton_anchura);
        
        JButton btnNewButton_profundidad = new JButton("Recorrido por profundidad");
        btnNewButton_profundidad.setBounds(190, 435, 183, 50);
        mapauno.add(btnNewButton_profundidad);
        
        JButton btnNewButton_volver = new JButton("Volver");
        btnNewButton_volver.setBounds(100, 500, 183, 50);
        mapauno.add(btnNewButton_volver);
        btnNewButton_volver.addActionListener(new ActionListener() {
        	
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		// TODO Auto-generated method stub
        		panel.removeAll();
        		panel.repaint();
        		panel.revalidate();
        		
        	}
        	
        });
    }
    
    public void mapa_4() {

        mapauno = new JPanel();
        mapauno.setSize(400, 700);
        mapauno.setBackground(new Color(128, 128, 128));
        mapauno.setLayout(null);

        ImageIcon foto = new ImageIcon("mapa4.png");
        JLabel icono = new JLabel();
        icono.setSize(350, 350);
        icono.setLocation(20, 20);
        icono.setIcon(new ImageIcon(
                foto.getImage().getScaledInstance(icono.getWidth(), icono.getHeight(), Image.SCALE_SMOOTH)));
        mapauno.add(icono);
        
        JButton btnNewButton_anchura = new JButton("Recorrido por anchura");
        btnNewButton_anchura.setBounds(15, 435, 165, 50);
        mapauno.add(btnNewButton_anchura);
        
        JButton btnNewButton_profundidad = new JButton("Recorrido por profundidad");
        btnNewButton_profundidad.setBounds(190, 435, 183, 50);
        mapauno.add(btnNewButton_profundidad);
        
        JButton btnNewButton_volver = new JButton("Volver");
        btnNewButton_volver.setBounds(100, 500, 183, 50);
        mapauno.add(btnNewButton_volver);
        btnNewButton_volver.addActionListener(new ActionListener() {
        	
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		// TODO Auto-generated method stub
        		panel.removeAll();
        		panel.repaint();
        		panel.revalidate();
        		
        	}
        	
        });
    }
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 700);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.repaint();
    }
}



