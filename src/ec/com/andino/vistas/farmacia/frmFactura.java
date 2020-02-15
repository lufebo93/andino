/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.andino.vistas.farmacia;




import java.io.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author lufeb
 */
public final class frmFactura extends javax.swing.JFrame {
    JLabel img;
    JButton open;
    JFileChooser jf=new JFileChooser();
    FileInputStream fis;
    int longitudBytes;
    TableRowSorter trsFiltro;
    DefaultTableModel modelo;
    public static int codigo;
    public static String nombreFarmaceutico;
    public static String categoria;
    public static String botones = null;
    
    /**
     * Creates new form frm
     * @throws java.io.IOException
     * @throws java.sql.SQLException
     */
    public frmFactura() throws IOException, SQLException {
       
    }
    
    public void cerrar(){
     
    }
    
    public void abrirarchivo(String archivo){
   
    }
    
    public void ordenarTabla(){
        TableRowSorter<TableModel> ordenar = new TableRowSorter<>(modelo);
        tablaInventario.setRowSorter(ordenar);
    }
    
    public void cargarTabla() throws IOException, SQLException{
     
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel44 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombreComercial = new javax.swing.JTextField();
        txtProveedor = new javax.swing.JTextField();
        cmbPresentacion = new javax.swing.JComboBox<>();
        cmbMedida = new javax.swing.JComboBox<>();
        spinCantidad = new javax.swing.JSpinner();
        spinConcentracion = new javax.swing.JSpinner();
        txtProveedor1 = new javax.swing.JTextField();
        txtProveedor2 = new javax.swing.JTextField();
        txtDoctor = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtIdEnfermeros = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaInventario = new javax.swing.JTable();
        jLabel46 = new javax.swing.JLabel();
        cmbListarPac = new javax.swing.JComboBox<>();
        txtBusquedaInv = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        BarAcerca = new javax.swing.JMenuItem();
        barManual = new javax.swing.JMenuItem();
        BarCambioClave = new javax.swing.JMenuItem();
        BarSalir = new javax.swing.JMenuItem();

        jLabel44.setText("Bienvenido");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("HE.ANDINO :: Insertar Artículos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Medicamento"));

        jLabel2.setText("N. Comerical");

        jLabel6.setText("Tipo de Producto");

        jLabel7.setText("Cantidad");

        jLabel8.setText("Proveedor");

        jLabel9.setText("Costo");

        jLabel10.setText("Precio de Venta al Publico");

        jLabel11.setText("Propiedad");

        txtNombreComercial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreComercialFocusLost(evt);
            }
        });
        txtNombreComercial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreComercialKeyTyped(evt);
            }
        });

        txtProveedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProveedorFocusLost(evt);
            }
        });
        txtProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProveedorKeyTyped(evt);
            }
        });

        cmbPresentacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Tabletas", "Píldoras", "Grageas", "Capsulas", "Supositorios", "Óvulos", "Polvo", "Pomadas", "Cremas", "Soluciones", "Jarabes", "Colirios", "Lociones", "Linimentos", "Elixir", "Enemas", "Inhaladores", "Aerosoles", "Otros" }));
        cmbPresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPresentacionActionPerformed(evt);
            }
        });

        cmbMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mg", "ug", "g", "L", "ml", "cc", "ugotas" }));
        cmbMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMedidaActionPerformed(evt);
            }
        });

        txtProveedor1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProveedor1FocusLost(evt);
            }
        });
        txtProveedor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProveedor1KeyTyped(evt);
            }
        });

        txtProveedor2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProveedor2FocusLost(evt);
            }
        });
        txtProveedor2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProveedor2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProveedor2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbPresentacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(spinConcentracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(spinCantidad)
                                            .addComponent(txtProveedor)
                                            .addComponent(txtProveedor1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(13, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmbMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinConcentracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cmbPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(spinCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtProveedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtProveedor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        txtDoctor.setEditable(false);
        txtDoctor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDoctor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Bienvenido");

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("ID");

        txtIdEnfermeros.setEditable(false);
        txtIdEnfermeros.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdEnfermeros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCategoria.setEditable(false);
        txtCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCategoria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Inventario"));

        tablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaInventario.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablaInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaInventarioMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaInventario);

        jLabel46.setText("Buscar por:");

        cmbListarPac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nombre comercial", "Nombre genérico" }));

        txtBusquedaInv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaInvKeyTyped(evt);
            }
        });

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/refresh-0.png"))); // NOI18N
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addGap(10, 10, 10)
                .addComponent(cmbListarPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBusquedaInv, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel46))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbListarPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBusquedaInv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/guardar_256px-2.png"))); // NOI18N
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/insertar_256px-0.png"))); // NOI18N
        jMenu1.setText("Inicio");

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/receta_256px-0.png"))); // NOI18N
        jMenu4.setText("Receta");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/receta_256px-0.png"))); // NOI18N
        jMenuItem4.setText("Receta");
        jMenu4.add(jMenuItem4);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/listar_256px-0.png"))); // NOI18N
        jMenuItem3.setText("Detalle");
        jMenu4.add(jMenuItem3);

        jMenu1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/orden_examen_256px-0.png"))); // NOI18N
        jMenu5.setText("Facturación");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/orden_examen_256px-0.png"))); // NOI18N
        jMenuItem2.setText("Factura");
        jMenu5.add(jMenuItem2);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/listar_256px-0.png"))); // NOI18N
        jMenuItem5.setText("Detalle");
        jMenu5.add(jMenuItem5);

        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/editar_256px-0.png"))); // NOI18N
        jMenu2.setText("Modificar");

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/receta_256px-0.png"))); // NOI18N
        jMenu6.setText("Receta");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/receta_256px-0.png"))); // NOI18N
        jMenuItem6.setText("Receta");
        jMenu6.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/listar_256px-0.png"))); // NOI18N
        jMenuItem7.setText("Detalle");
        jMenu6.add(jMenuItem7);

        jMenu2.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/orden_examen_256px-0.png"))); // NOI18N
        jMenu7.setText("Facturación");

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/orden_examen_256px-0.png"))); // NOI18N
        jMenuItem8.setText("Factura");
        jMenu7.add(jMenuItem8);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/listar_256px-0.png"))); // NOI18N
        jMenuItem9.setText("Detalle");
        jMenu7.add(jMenuItem9);

        jMenu2.add(jMenu7);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/ayuda-0.png"))); // NOI18N
        jMenu3.setText("Ayuda");

        BarAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/acerca_de_256px-0.png")));
        BarAcerca.setText("Acerca de ");
        BarAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarAcercaActionPerformed(evt);
            }
        });
        jMenu3.add(BarAcerca);

        barManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/listar_256px-0.png"))); // NOI18N
        barManual.setText("Manual de Usuario");
        barManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barManualActionPerformed(evt);
            }
        });
        jMenu3.add(barManual);

        BarCambioClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/clave_256px-0.png")));
        BarCambioClave.setText("Cambiar clave");
        BarCambioClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarCambioClaveActionPerformed(evt);
            }
        });
        jMenu3.add(BarCambioClave);

        BarSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/salir_256px-0.png")));
        BarSalir.setText("Salir");
        BarSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarSalirActionPerformed(evt);
            }
        });
        jMenu3.add(BarSalir);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdEnfermeros, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdEnfermeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProveedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProveedorFocusLost
        txtProveedor.setCaretPosition(0);
    }//GEN-LAST:event_txtProveedorFocusLost

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setToolTipText("Guardar");
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
     
              
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tablaInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaInventarioMouseClicked
//        int selectedRowIndex = tablaInventario.rowAtPoint(evt.getPoint());
//        txtCodigoProc.setText(tablaInventario.getValueAt(selectedRowIndex, 0).toString());
//        txtNombreComercial.setText(tablaInventario.getValueAt(selectedRowIndex, 1).toString());
//        txtNombreGenerico.setText(tablaInventario.getValueAt(selectedRowIndex, 2).toString());
//        spinConcentracion.setValue(tablaInventario.getValueAt(selectedRowIndex, 3).toString());
//        cmbPresentacion.setSelectedItem(tablaInventario.getValueAt(selectedRowIndex, 4).toString());
//        spinCantidad.setValue(tablaInventario.getValueAt(selectedRowIndex, 5).toString());
//        txtProveedor.setText(tablaInventario.getValueAt(selectedRowIndex, 6).toString());
//        jpcFechaIngreso.setDate(java.sql.Date.valueOf(tablaInventario.getValueAt(selectedRowIndex, 7).toString()));
//        jpcFechaCaducidad.setDate(java.sql.Date.valueOf(tablaInventario.getValueAt(selectedRowIndex, 8).toString()));
    }//GEN-LAST:event_tablaInventarioMouseClicked

    private void txtBusquedaInvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaInvKeyTyped
      
    }//GEN-LAST:event_txtBusquedaInvKeyTyped

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
      
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void txtNombreComercialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreComercialKeyTyped
       
    }//GEN-LAST:event_txtNombreComercialKeyTyped

    private void txtNombreComercialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreComercialFocusLost
        txtNombreComercial.setCaretPosition(0);
    }//GEN-LAST:event_txtNombreComercialFocusLost

    private void txtProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProveedorKeyTyped
     
    }//GEN-LAST:event_txtProveedorKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      
    }//GEN-LAST:event_formWindowClosing

    private void BarAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarAcercaActionPerformed
      
    }//GEN-LAST:event_BarAcercaActionPerformed

    private void barManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barManualActionPerformed
       
    }//GEN-LAST:event_barManualActionPerformed

    private void BarCambioClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarCambioClaveActionPerformed
       
    }//GEN-LAST:event_BarCambioClaveActionPerformed

    private void BarSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarSalirActionPerformed
    
    }//GEN-LAST:event_BarSalirActionPerformed

    private void cmbPresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPresentacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPresentacionActionPerformed

    private void cmbMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMedidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMedidaActionPerformed

    private void txtProveedor1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProveedor1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedor1FocusLost

    private void txtProveedor1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProveedor1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedor1KeyTyped

    private void txtProveedor2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProveedor2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedor2FocusLost

    private void txtProveedor2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProveedor2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedor2KeyTyped

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
//            java.util.logging.Logger.getLogger(frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BarAcerca;
    private javax.swing.JMenuItem BarCambioClave;
    private javax.swing.JMenuItem BarSalir;
    private javax.swing.JMenuItem barManual;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JComboBox<String> cmbListarPac;
    private javax.swing.JComboBox<String> cmbMedida;
    private javax.swing.JComboBox<String> cmbPresentacion;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner spinCantidad;
    private javax.swing.JSpinner spinConcentracion;
    private javax.swing.JTable tablaInventario;
    private javax.swing.JTextField txtBusquedaInv;
    public static javax.swing.JTextField txtCategoria;
    public static javax.swing.JTextField txtDoctor;
    public static javax.swing.JTextField txtIdEnfermeros;
    private javax.swing.JTextField txtNombreComercial;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtProveedor1;
    private javax.swing.JTextField txtProveedor2;
    // End of variables declaration//GEN-END:variables
}
