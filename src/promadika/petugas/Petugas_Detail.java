/*
 * Muhammad Faisal Amir
 * id.amirisback.bandung
 * Copyright 2017
 */
package promadika.petugas;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import promadika.Index;
import promadika.koneksi;
/**
 *
 * @author Faisal Amir
 */
public class Petugas_Detail extends javax.swing.JFrame {
    koneksi conn = new koneksi();
    private String sql = "";
    private String nama_foto_fromDb, path_save_foto;
    private File foto;
    private Object get_id;
    private int lebar, tinggi;
    
    
    /**
     * Creates new form Petugas
     */
    
    
    
    public Petugas_Detail(Object get_id) {
        initComponents();
        this.get_id = get_id;
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        conn.ConnectToDB();
        showData();

    }

    private Petugas_Detail() {
    }

    public void resizeImage(){
        try {
            BufferedImage imgUkuranAsli = ImageIO.read(foto);
            lebar = panel_foto.getWidth();
            tinggi = panel_foto.getHeight();
            BufferedImage imgResize = new BufferedImage(lebar, tinggi, BufferedImage.TYPE_INT_ARGB);
            Graphics2D imgTampil = imgResize.createGraphics();
            imgTampil.drawImage(imgUkuranAsli, 0, 0, lebar, tinggi, null);
            imgTampil.dispose();
            ImageIcon ImgOut = new ImageIcon(imgResize);
            foto_petugas.setText("");
            foto_petugas.setIcon(ImgOut);
        } catch (Exception e) {
            System.out.println(e);
        }   
    }
    
    public void showData(){
        try {
            sql = "Select * from data_petugas where id_petugas = '"+get_id+"'";
            conn.setStatement(conn.getConnect().createStatement());
            conn.setResultSet(conn.getStatement().executeQuery(sql));
            while(conn.getResultSet().next()){
                txt_nip_petugas.setText(": \t\t " + conn.getResultSet().getString("id_petugas"));
                txt_nama_petugas.setText(": \t\t " + conn.getResultSet().getString("nama_petugas"));
                txt_kua_cabang.setText(": \t\t KUA " + conn.getResultSet().getString("tempat_kua"));
                nama_foto_fromDb = conn.getResultSet().getString("foto");
                path_save_foto = "../Promadika/src/promadika/petugas/petugas_foto/"+nama_foto_fromDb;
                foto = new File(path_save_foto);
                resizeImage();

            }
        } catch (SQLException e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        H_Petugas = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panel_daftar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        hover_daftar = new javax.swing.JLabel();
        panel_tambah = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        hover_tambah = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        str_tambah_data = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panel_foto = new javax.swing.JPanel();
        foto_petugas = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nama_petugas = new javax.swing.JLabel();
        txt_nip_petugas = new javax.swing.JLabel();
        txt_kua_cabang = new javax.swing.JLabel();
        UpdatePet = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROMADIKA - Program Informasi Pendataan Data Nikah");
        setSize(new java.awt.Dimension(1343, 674));

        H_Petugas.setBackground(new java.awt.Color(46, 125, 50));
        H_Petugas.setPreferredSize(new java.awt.Dimension(1024, 768));

        jPanel2.setBackground(new java.awt.Color(165, 214, 167));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconProperties/header.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(27, 94, 32));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(102, 187, 106));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconProperties/Petugas_miniIcon.png"))); // NOI18N

        panel_daftar.setBackground(new java.awt.Color(232, 245, 233));
        panel_daftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_daftarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_daftarMouseEntered(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconProperties/icons8_Contacts_25px.png"))); // NOI18N

        hover_daftar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        hover_daftar.setText("Daftar Petugas");
        hover_daftar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hover_daftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hover_daftarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_daftarLayout = new javax.swing.GroupLayout(panel_daftar);
        panel_daftar.setLayout(panel_daftarLayout);
        panel_daftarLayout.setHorizontalGroup(
            panel_daftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_daftarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(hover_daftar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_daftarLayout.setVerticalGroup(
            panel_daftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_daftarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_daftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(hover_daftar)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_tambah.setBackground(new java.awt.Color(165, 214, 167));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconProperties/icons8_Plus_25px.png"))); // NOI18N

        hover_tambah.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        hover_tambah.setText("Tambah Petugas");
        hover_tambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hover_tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hover_tambahMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_tambahLayout = new javax.swing.GroupLayout(panel_tambah);
        panel_tambah.setLayout(panel_tambahLayout);
        panel_tambahLayout.setHorizontalGroup(
            panel_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tambahLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(hover_tambah)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        panel_tambahLayout.setVerticalGroup(
            panel_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tambahLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(hover_tambah)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(165, 214, 167));
        jPanel8.setPreferredSize(new java.awt.Dimension(171, 47));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("Menu Pilihan");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconProperties/icons8_Menu_2_25px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_daftar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(52, 52, 52))
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(panel_daftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Copyright - Promadika 2017  ||  Telkom University");

        jLabel10.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("______________________________________________________________________________________________________________________________________________________________________");

        str_tambah_data.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        str_tambah_data.setForeground(new java.awt.Color(255, 255, 255));
        str_tambah_data.setText("Detail Data Petugas");
        str_tambah_data.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(200, 230, 201));

        panel_foto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));

        foto_petugas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foto_petugas.setText("FOTO PETUGAS");

        javax.swing.GroupLayout panel_fotoLayout = new javax.swing.GroupLayout(panel_foto);
        panel_foto.setLayout(panel_fotoLayout);
        panel_fotoLayout.setHorizontalGroup(
            panel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto_petugas, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        panel_fotoLayout.setVerticalGroup(
            panel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto_petugas, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );

        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));

        jLabel6.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("NIP");

        jLabel7.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("NAMA");

        jLabel5.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("CABANG");

        txt_nama_petugas.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        txt_nama_petugas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_nama_petugas.setText(":");

        txt_nip_petugas.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        txt_nip_petugas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_nip_petugas.setText(":");

        txt_kua_cabang.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        txt_kua_cabang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_kua_cabang.setText(":");

        UpdatePet.setBackground(new java.awt.Color(0, 0, 255));
        UpdatePet.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        UpdatePet.setForeground(new java.awt.Color(255, 255, 255));
        UpdatePet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconProperties/icons8_Edit_25px.png"))); // NOI18N
        UpdatePet.setText("UBAH");
        UpdatePet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nip_petugas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_kua_cabang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_nama_petugas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(78, 78, 78))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdatePet, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txt_nip_petugas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nama_petugas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_kua_cabang, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdatePet, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(panel_foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout H_PetugasLayout = new javax.swing.GroupLayout(H_Petugas);
        H_Petugas.setLayout(H_PetugasLayout);
        H_PetugasLayout.setHorizontalGroup(
            H_PetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(H_PetugasLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(H_PetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(H_PetugasLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(str_tambah_data)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, H_PetugasLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(H_PetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))))
            .addGroup(H_PetugasLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        H_PetugasLayout.setVerticalGroup(
            H_PetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(H_PetugasLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(H_PetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(H_PetugasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(str_tambah_data, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(16, 16, 16))))
        );

        jScrollPane1.setViewportView(H_Petugas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        Index index = new Index();
        index.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void panel_daftarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_daftarMouseEntered
        // TODO add your handling code here:
        setBackground(new Color(232,245,233));

    }//GEN-LAST:event_panel_daftarMouseEntered

    private void panel_daftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_daftarMouseClicked
        // TODO add your handling code here:
        setBackground(new Color(232,245,233));
    }//GEN-LAST:event_panel_daftarMouseClicked

    private void hover_daftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover_daftarMouseClicked
        // TODO add your handling code here:
            Petugas_List p_list = new Petugas_List();
            p_list.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_hover_daftarMouseClicked

    private void hover_tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover_tambahMouseClicked
        // TODO add your handling code here:
            Petugas p = new Petugas();
            p.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_hover_tambahMouseClicked

    private void UpdatePetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePetActionPerformed
        // TODO add your handling code here:
        
        Petugas_Edit editClass = new Petugas_Edit(get_id);
        editClass.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_UpdatePetActionPerformed

    void setHover(JPanel panel){
        panel.setBackground(new Color(232,245,233));
    }
    
    void getHover(JPanel panel){
        panel.setBackground(new Color(165,214,167));
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Petugas_Detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Petugas_Detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Petugas_Detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Petugas_Detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Petugas_Detail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel H_Petugas;
    private javax.swing.JButton UpdatePet;
    private javax.swing.JLabel foto_petugas;
    private javax.swing.JLabel hover_daftar;
    private javax.swing.JLabel hover_tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_daftar;
    private javax.swing.JPanel panel_foto;
    private javax.swing.JPanel panel_tambah;
    private javax.swing.JLabel str_tambah_data;
    private javax.swing.JLabel txt_kua_cabang;
    private javax.swing.JLabel txt_nama_petugas;
    private javax.swing.JLabel txt_nip_petugas;
    // End of variables declaration//GEN-END:variables
}