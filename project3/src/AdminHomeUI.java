import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class AdminHomeUI {

    public JFrame view;

    public JButton btnsysconfig = new JButton("Setup System Config");
    public JButton btnadduser = new JButton("Add a New User");
    public JButton btnremoveuser = new JButton("Delete a User");
    public JButton btnchangeuser = new JButton("Update a User Class");
    public static void main(String[] args) {
        AdminHomeUI a = new AdminHomeUI();
        a.view.setVisible(true);
    }

    public AdminHomeUI() {



        this.view = new JFrame();

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setTitle("Store Management System - Admin View");
        view.setSize(1000, 600);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));

        JLabel title = new JLabel("Store Management System");

        title.setFont (title.getFont ().deriveFont (24.0f));
        view.getContentPane().add(title);

        JPanel panelUser = new JPanel(new FlowLayout());
        panelUser.add(new JLabel("Administrator"));

        view.getContentPane().add(panelUser);

        JPanel panelButtons = new JPanel(new FlowLayout());
        panelButtons.add(btnsysconfig);
        panelButtons.add(btnadduser);
        panelButtons.add(btnremoveuser);
        panelButtons.add(btnchangeuser);


        view.getContentPane().add(panelButtons);


        btnsysconfig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        btnchangeuser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        btnadduser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        btnremoveuser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        } );

    }
}
