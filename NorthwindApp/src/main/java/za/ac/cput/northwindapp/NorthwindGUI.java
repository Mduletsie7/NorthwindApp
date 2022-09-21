/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.northwindapp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Mdumisi Letsie
 */
public class NorthwindGUI extends JFrame implements ActionListener {

    private static final String DATABASE_URL = "jdbc:derby://localhost:1527/Northwind";
    private static final String username = "administrator";
    private static final String password = "password";

    ImageIcon image = new ImageIcon(new ImageIcon("employee.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

    private JPanel panelWest, panelEast, panelSouth, panelNorth;

    JLabel lblImage;
    private JLabel lblID;
    private JLabel lblFirstName;
    private JLabel lblLastName;
    private JLabel lblTitle;
    private JLabel lblTOC;
    private JLabel lblBirthDate;
    private JLabel lblHireDate;
    private JLabel lblAddress;
    private JLabel lblCity;
    private JLabel lblHomePhone;
    private JLabel lblNotes;
    private JLabel lblReportsTo;
    private JLabel lblPhotoPath;

    private JTextField txtID;
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JTextField txtTitle;
    private JTextField txtTOC;
    private JTextField txtBirthDate;
    private JTextField txtHireDate;
    private JTextField txtAddress;
    private JTextField txtCity;
    private JTextField txtHomePhone;
    private JTextField txtNotes;
    private JTextField txtReportsTo;
    private JTextField txtPhotoPath;

    private JButton btnUpdate;
    private JButton btnReset;
    private JButton btnDelete;
    private JButton btnExit;

    String userGetPassword;

    public NorthwindGUI() {
        super("Employee");

        lblImage = new JLabel();
        lblImage.setText("Employee Information");
        lblImage.setIcon(image);

        panelWest = new JPanel();
        panelEast = new JPanel();
        panelSouth = new JPanel();
        panelNorth = new JPanel();

        lblID = new JLabel("Employee ID: ");
        lblLastName = new JLabel("Last Name: ");
        lblFirstName = new JLabel("Frist Name: ");
        lblTitle = new JLabel("Title: ");
        lblTOC = new JLabel("Title Of Courtesy: ");
        lblBirthDate = new JLabel("Birth Date: ");
        lblHireDate = new JLabel("Hire Date: ");
        lblAddress = new JLabel("Address: ");
        lblCity = new JLabel("City: ");
        lblHomePhone = new JLabel("Home Phone: ");
        lblNotes = new JLabel("Notes: ");
        lblReportsTo = new JLabel("Reports To: ");
        lblPhotoPath = new JLabel("Photo Path: ");

        txtID = new JTextField("");
        txtLastName = new JTextField("");
        txtFirstName = new JTextField("");
        txtTitle = new JTextField("");
        txtTOC = new JTextField("");
        txtBirthDate = new JTextField("");
        txtHireDate = new JTextField("");
        txtAddress = new JTextField("");
        txtCity = new JTextField("");
        txtHomePhone = new JTextField("");
        txtNotes = new JTextField("");
        txtReportsTo = new JTextField("");
        txtPhotoPath = new JTextField("");

        btnUpdate = new JButton("Update");
        btnReset = new JButton("Reset");
        btnDelete = new JButton("Delete");
        btnExit = new JButton("Exit");

        // ComboBox initialization
        String[] IDs = {""};
        //cboxMovieID = new JComboBox(IDs);
        //cboxMovieID.addActionListener(this);
    }

    public void setGUI() {
        panelEast.setLayout(new GridLayout(13, 1));
        panelWest.setLayout(new GridLayout(13, 1));
        panelSouth.setLayout(new GridLayout(1, 2));
        panelNorth.setLayout(new GridLayout(1, 2));

        panelWest.setPreferredSize(new Dimension(400, 120));
        panelEast.setPreferredSize(new Dimension(400, 120));
        panelSouth.setPreferredSize(new Dimension(800, 30));
        panelNorth.setPreferredSize(new Dimension(800, 120));

        this.add(panelEast, BorderLayout.EAST);
        this.add(panelWest, BorderLayout.WEST);
        this.add(panelSouth, BorderLayout.SOUTH);
        this.add(panelNorth, BorderLayout.NORTH);

        // PANEL WEST
        panelWest.add(lblID);
        panelWest.add(lblLastName);
        panelWest.add(lblFirstName);
        panelWest.add(lblTitle);
        panelWest.add(lblTOC);
        panelWest.add(lblBirthDate);
        panelWest.add(lblHireDate);
        panelWest.add(lblAddress);
        panelWest.add(lblCity);
        panelWest.add(lblHomePhone);
        panelWest.add(lblNotes);
        panelWest.add(lblReportsTo);
        panelWest.add(lblPhotoPath);

        // PANEL EAST
        panelEast.add(txtID);
        panelEast.add(txtLastName);
        panelEast.add(txtFirstName);
        panelEast.add(txtTitle);
        panelEast.add(txtTOC);
        panelEast.add(txtBirthDate);
        panelEast.add(txtHireDate);
        panelEast.add(txtAddress);
        panelEast.add(txtCity);
        panelEast.add(txtHomePhone);
        panelEast.add(txtNotes);
        panelEast.add(txtReportsTo);
        panelEast.add(txtPhotoPath);

        // TEXTFIELD ACTIONLISTENER
        txtID.addActionListener(this);

        // BUTTON ACTION LISTENERS
        btnUpdate.addActionListener(this);
        btnReset.addActionListener(this);
        btnDelete.addActionListener(this);
        btnExit.addActionListener(this);

        // PANEL SOUTH
        panelSouth.add(btnUpdate);
        panelSouth.add(btnReset);
        panelSouth.add(btnDelete);
        panelSouth.add(btnExit);

        // DISABLE BUTTONS
        btnUpdate.setEnabled(false);
        btnReset.setEnabled(false);
        btnDelete.setEnabled(false);

        // PANEL NORTH
        lblImage.setForeground(Color.white);
        lblImage.setFont(new Font("Arial", Font.PLAIN, 20));
        panelNorth.add(lblImage);
        panelNorth.setBackground(new Color(0x75A5DD));

        // FRAME PROPERTIES
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); // center screen
        this.setSize(800, 600);
        this.setVisible(true);

        // BUTTON COLORS
        btnUpdate.setBackground(new Color(0xececec));
        btnReset.setBackground(new Color(0xececec));
        btnDelete.setBackground(new Color(0xececec));
        btnExit.setBackground(new Color(0xececec));

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == txtID) {
            System.out.println("Enter button clicked!");
            int ID = Integer.parseInt(txtID.getText());
            String ReportsTo = txtReportsTo.getText();
            Northwind n = new Northwind(ID);
            if (NorthwindDAO.loadData(n)) {
                txtLastName.setText(n.getLastName());
                txtFirstName.setText(n.getFirstName());
                txtTitle.setText(n.getTitle());
                txtTOC.setText(n.getTOC());
                txtBirthDate.setText(n.getBirthDate());
                txtHireDate.setText(n.getHireDate());
                txtAddress.setText(n.getAddress());
                txtCity.setText(n.getCity());
                txtHomePhone.setText(n.getHomePhone());
                txtNotes.setText(n.getNotes());
                txtReportsTo.setText(String.valueOf(n.getReportsTo()));
                txtPhotoPath.setText(n.getPhotoPath());

                txtID.setEnabled(false);
                btnUpdate.setEnabled(true);
                btnReset.setEnabled(true);
                btnDelete.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "The Employee ID does not exist!");
            }
        }
        if (e.getSource() == btnUpdate) {
            int ID = Integer.parseInt(txtID.getText());

            String LastName = txtLastName.getText();
            String FirstName = txtFirstName.getText();
            String Title = txtTitle.getText();
            String TOC = txtTOC.getText();
            String BirthDate = txtBirthDate.getText();
            String HireDate = txtHireDate.getText();
            String Address = txtAddress.getText();
            String City = txtCity.getText();
            String HomePhone = txtHomePhone.getText();
            String Notes = txtNotes.getText();
            int ReportsTo = Integer.parseInt(txtReportsTo.getText());
            String PhotoPath = txtPhotoPath.getText();

            Northwind u = new Northwind(LastName, FirstName, Title, TOC, BirthDate, HireDate, Address, City, HomePhone, Notes, ReportsTo, PhotoPath);

            NorthwindDAO.updateData(u);

        } else if (e.getSource() == btnReset) {
            txtID.setText("");
            txtLastName.setText("");
            txtFirstName.setText("");
            txtTitle.setText("");
            txtTOC.setText("");
            txtBirthDate.setText("");
            txtHireDate.setText("");
            txtAddress.setText("");
            txtCity.setText("");
            txtHomePhone.setText("");
            txtNotes.setText("");
            txtReportsTo.setText("");
            txtPhotoPath.setText("");

            txtID.setEnabled(true);

        } else if (e.getSource() == btnDelete) {
            int ID = Integer.parseInt(txtID.getText());

            String LastName = txtLastName.getText();
            String FirstName = txtFirstName.getText();
            String Title = txtTitle.getText();
            String TOC = txtTOC.getText();
            String BirthDate = txtBirthDate.getText();
            String HireDate = txtHireDate.getText();
            String Address = txtAddress.getText();
            String City = txtCity.getText();
            String HomePhone = txtHomePhone.getText();
            String Notes = txtNotes.getText();
            int ReportsTo = Integer.parseInt(txtReportsTo.getText());
            String PhotoPath = txtPhotoPath.getText();

            Northwind d = new Northwind(LastName, FirstName, Title, TOC, BirthDate, HireDate, Address, City, HomePhone, Notes, ReportsTo, PhotoPath);
            NorthwindDAO.deleteData(d);
        } else if (e.getSource() == btnExit) {
            System.exit(0);
        }
    }

}
