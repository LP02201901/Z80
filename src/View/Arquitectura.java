/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;

/**
 *
 * @author Andrey
 */
public class Arquitectura extends javax.swing.JFrame {

    /**
     * Creates new form Arquitectura
     */
    public Arquitectura() {
        initComponents();
        InstructionRegister.setOpaque(true);
        Wp.setOpaque(true);
        Zp.setOpaque(true);
        Cp.setOpaque(true);
        Bp.setOpaque(true);
        Ep.setOpaque(true);
        Dp.setOpaque(true);
        Lp.setOpaque(true);
        Hp.setOpaque(true);
        W.setOpaque(true);
        Z.setOpaque(true);
        B.setOpaque(true);
        InstructionDecoder.setOpaque(true);
        C.setOpaque(true);
        D.setOpaque(true);
        E.setOpaque(true);
        L.setOpaque(true);
        H.setOpaque(true);
        IX.setOpaque(true);
        SP.setOpaque(true);
        PC.setOpaque(true);
        IY.setOpaque(true);
        Mm12.setOpaque(true);
        ControlLogic.setOpaque(true);
        A.setOpaque(true);
        Ap.setOpaque(true);
        Fp.setOpaque(true);
        F.setOpaque(true);
        TEMP.setOpaque(true);
        ACU.setOpaque(true);
        ALU.setOpaque(true);
        jLabel37.setOpaque(true);
        jLabel38.setOpaque(true);
        jLabel39.setOpaque(true);
        I.setOpaque(true);
        jLabel40.setOpaque(true);
        jLabel41.setOpaque(true);
        R.setOpaque(true);
        Mm11.setOpaque(true);
        jLabel7.setOpaque(true);
        Mux1.setOpaque(true);
        Mux2.setOpaque(true);
        jPanel1.setOpaque(true);
        jPanel2.setOpaque(true);
        jPanel3.setOpaque(true);
        Control(false, false, false, true, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false,
             false, false, false, false, false, false, false, false, false);
        /*Control(true, true, true, true, true, true, true, true, true, true,
            true, true, true, true, true, true, true, true,
            true, true, true, true, true, true, true, true, true,
             true, true, true, true, true, true, true, true, true);*/
    }

    void Control(boolean instructionregister, boolean wp, boolean zp, boolean cp, boolean bp, boolean ep, boolean dp, boolean lp, boolean hp, boolean w,
            boolean z, boolean b, boolean instructiondecoder, boolean c, boolean d, boolean e, boolean l, boolean h,
            boolean ix, boolean sp, boolean pc, boolean iy, boolean mm12, boolean controllogic, boolean a, boolean ap, boolean fp,
             boolean f, boolean temp, boolean acu, boolean alu, boolean i, boolean r, boolean mm11, boolean mux1, boolean mux2) {
        if (wp) {
            Wp.setBackground(Color.red);
        } else {
            Wp.setBackground(Color.white);
        }

        if (instructionregister) {
            InstructionRegister.setBackground(Color.red);
        } else {
            InstructionRegister.setBackground(Color.white);
        }

        if (zp) {
            Zp.setBackground(Color.red);
        } else {
            Zp.setBackground(Color.white);
        }

        if (cp) {
            Cp.setBackground(Color.red);
        } else {
            Cp.setBackground(Color.white);
        }

        if (bp) {
            Bp.setBackground(Color.red);
        } else {
            Bp.setBackground(Color.white);
        }

        if (ep) {
            Ep.setBackground(Color.red);
        } else {
            Ep.setBackground(Color.white);
        }

        if (dp) {
            Dp.setBackground(Color.red);
        } else {
            Dp.setBackground(Color.white);
        }

        if (lp) {
            Lp.setBackground(Color.red);
        } else {
            Lp.setBackground(Color.white);
        }

        if (hp) {
            Hp.setBackground(Color.red);
        } else {
            Hp.setBackground(Color.white);
        }

        if (w) {
            W.setBackground(Color.red);
        } else {
            W.setBackground(Color.white);
        }

        if (z) {
            Z.setBackground(Color.red);
        } else {
            Z.setBackground(Color.white);
        }

        if (b) {
            B.setBackground(Color.red);
        } else {
            B.setBackground(Color.white);
        }

        if (instructiondecoder) {
            InstructionDecoder.setBackground(Color.red);
        } else {
            InstructionDecoder.setBackground(Color.white);
        }

        if (c) {
            C.setBackground(Color.red);
        } else {
            C.setBackground(Color.white);
        }

        if (d) {
            D.setBackground(Color.red);
        } else {
            D.setBackground(Color.white);
        }

        if (d) {
            E.setBackground(Color.red);
        } else {
            E.setBackground(Color.white);
        }

        if (l) {
            L.setBackground(Color.red);
        } else {
            L.setBackground(Color.white);
        }

        if (h) {
            H.setBackground(Color.red);
        } else {
            H.setBackground(Color.white);
        }

        if (ix) {
            IX.setBackground(Color.red);
        } else {
            IX.setBackground(Color.white);
        }

        if (sp) {
            SP.setBackground(Color.red);
        } else {
            SP.setBackground(Color.white);
        }

        if (pc) {
            PC.setBackground(Color.red);
        } else {
            PC.setBackground(Color.white);
        }

        if (iy) {
            IY.setBackground(Color.red);
        } else {
            IY.setBackground(Color.white);
        }

        if (mm12) {
            Mm12.setBackground(Color.red);
        } else {
            Mm12.setBackground(Color.white);
        }

        if (controllogic) {
            ControlLogic.setBackground(Color.red);
        } else {
            ControlLogic.setBackground(Color.white);
        }

        if (a) {
            A.setBackground(Color.red);
        } else {
            A.setBackground(Color.white);
        }

        if (ap) {
            Ap.setBackground(Color.red);
        } else {
            Ap.setBackground(Color.white);
        }

        if (fp) {
            Fp.setBackground(Color.red);
        } else {
            Fp.setBackground(Color.white);
        }

        if (f) {
            F.setBackground(Color.red);
        } else {
            F.setBackground(Color.white);
        }

        if (temp) {
            TEMP.setBackground(Color.red);
        } else {
            TEMP.setBackground(Color.white);
        }

        if (acu) {
            ACU.setBackground(Color.red);
        } else {
            ACU.setBackground(Color.white);
        }

        if (alu) {
            ALU.setBackground(Color.red);
        } else {
            ALU.setBackground(Color.white);
        }

        if (i) {
            I.setBackground(Color.red);
        } else {
            I.setBackground(Color.white);
        }

        if (r) {
            R.setBackground(Color.red);
        } else {
            R.setBackground(Color.white);
        }

        if (mm11) {
            Mm11.setBackground(Color.red);
        } else {
            Mm11.setBackground(Color.white);
        }

        if (mux1) {
            Mux1.setBackground(Color.red);
        } else {
            Mux1.setBackground(Color.white);
        }

        if (mux2) {
            Mux2.setBackground(Color.red);
        } else {
            Mux2.setBackground(Color.white);
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

        jPanel1 = new javax.swing.JPanel();
        InstructionRegister = new javax.swing.JLabel();
        InstructionDecoder = new javax.swing.JLabel();
        ControlLogic = new javax.swing.JLabel();
        I = new javax.swing.JLabel();
        R = new javax.swing.JLabel();
        Mm11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Mux1 = new javax.swing.JLabel();
        Mux2 = new javax.swing.JLabel();
        Wp = new javax.swing.JLabel();
        Zp = new javax.swing.JLabel();
        Cp = new javax.swing.JLabel();
        Bp = new javax.swing.JLabel();
        Ep = new javax.swing.JLabel();
        Dp = new javax.swing.JLabel();
        Lp = new javax.swing.JLabel();
        Hp = new javax.swing.JLabel();
        IX = new javax.swing.JLabel();
        SP = new javax.swing.JLabel();
        PC = new javax.swing.JLabel();
        IY = new javax.swing.JLabel();
        W = new javax.swing.JLabel();
        Z = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        D = new javax.swing.JLabel();
        E = new javax.swing.JLabel();
        L = new javax.swing.JLabel();
        H = new javax.swing.JLabel();
        Mm12 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        A = new javax.swing.JLabel();
        Ap = new javax.swing.JLabel();
        Fp = new javax.swing.JLabel();
        F = new javax.swing.JLabel();
        TEMP = new javax.swing.JLabel();
        ACU = new javax.swing.JLabel();
        ALU = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        InstructionRegister.setBackground(new java.awt.Color(204, 204, 204));
        InstructionRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InstructionRegister.setText("Instruction Register");
        InstructionRegister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        InstructionDecoder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InstructionDecoder.setText("Instruction Decoder");
        InstructionDecoder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ControlLogic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ControlLogic.setText("Control Logic");
        ControlLogic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        I.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I.setText("I");
        I.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R.setText("R");
        R.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Mm11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mm11.setText("±1");
        Mm11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Control Section");

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/abajo.png"))); // NOI18N

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/abajo.png"))); // NOI18N

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/flecha2.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(InstructionRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ControlLogic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InstructionDecoder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel38)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(I, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(Mm11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InstructionRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InstructionDecoder, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ControlLogic, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40)))
                .addGap(18, 18, 18)
                .addComponent(Mm11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Mux1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mux1.setText("MUX");
        Mux1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Mux2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mux2.setText("MUX");
        Mux2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Wp.setBackground(new java.awt.Color(255, 204, 204));
        Wp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Wp.setText("W'");
        Wp.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)));

        Zp.setBackground(new java.awt.Color(255, 204, 204));
        Zp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Zp.setText("Z'");
        Zp.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)));

        Cp.setBackground(new java.awt.Color(255, 204, 204));
        Cp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cp.setText("C'");
        Cp.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)));

        Bp.setBackground(new java.awt.Color(255, 204, 204));
        Bp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bp.setText("B'");
        Bp.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)));

        Ep.setBackground(new java.awt.Color(255, 204, 204));
        Ep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ep.setText("E'");
        Ep.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)));

        Dp.setBackground(new java.awt.Color(255, 204, 204));
        Dp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dp.setText("D'");
        Dp.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)));

        Lp.setBackground(new java.awt.Color(255, 204, 204));
        Lp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lp.setText("L'");
        Lp.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)));

        Hp.setBackground(new java.awt.Color(255, 204, 204));
        Hp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hp.setText("H'");
        Hp.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)));

        IX.setBackground(new java.awt.Color(255, 204, 204));
        IX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IX.setText("IX");
        IX.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)));

        SP.setBackground(new java.awt.Color(255, 204, 204));
        SP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SP.setText("SP");
        SP.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)));

        PC.setBackground(new java.awt.Color(255, 204, 204));
        PC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PC.setText("PC");
        PC.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)));

        IY.setBackground(new java.awt.Color(255, 204, 204));
        IY.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IY.setText("IY");
        IY.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)));

        W.setBackground(new java.awt.Color(255, 204, 204));
        W.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        W.setText("W");
        W.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)));

        Z.setBackground(new java.awt.Color(255, 204, 204));
        Z.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Z.setText("Z");
        Z.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)));

        B.setBackground(new java.awt.Color(255, 204, 204));
        B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B.setText("B");
        B.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)));

        C.setBackground(new java.awt.Color(255, 204, 204));
        C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C.setText("C");
        C.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)));

        D.setBackground(new java.awt.Color(255, 204, 204));
        D.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D.setText("D");
        D.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)));

        E.setBackground(new java.awt.Color(255, 204, 204));
        E.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E.setText("E");
        E.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)));

        L.setBackground(new java.awt.Color(255, 204, 204));
        L.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L.setText("L");
        L.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)));

        H.setBackground(new java.awt.Color(255, 204, 204));
        H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H.setText("H");
        H.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)));

        Mm12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mm12.setText("±1");
        Mm12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/V+.PNG"))); // NOI18N
        jLabel37.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)));
        jLabel37.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel37.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel37.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Dp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                        .addComponent(Bp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Hp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Cp, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                        .addComponent(Ep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Lp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(Wp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Zp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(Mux1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(W, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(E, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(C, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Z, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Mux2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(125, 125, 125))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Mm12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IY, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IX, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SP, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PC, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mux2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mux1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(W, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(Wp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Zp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Bp, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                    .addComponent(Cp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Z, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(E, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Dp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(L, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Hp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(H, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(Mm12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(IX)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IY)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PC)))
                        .addContainerGap(118, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        A.setBackground(new java.awt.Color(255, 204, 204));
        A.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A.setText("A");
        A.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 102)));

        Ap.setBackground(new java.awt.Color(255, 204, 204));
        Ap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ap.setText("A'");
        Ap.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 102)));

        Fp.setBackground(new java.awt.Color(255, 204, 204));
        Fp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fp.setText("F'");
        Fp.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 102)));

        F.setBackground(new java.awt.Color(255, 204, 204));
        F.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F.setText("F");
        F.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 102)));

        TEMP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TEMP.setText("TEMP");
        TEMP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ACU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ACU.setText("ACU");
        ACU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ALU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ALU.setText("ALU");

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/abajo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ALU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TEMP, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ACU, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(A, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Fp, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Ap, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(Fp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(TEMP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ACU, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176)
                .addComponent(ALU, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 472, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Arquitectura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arquitectura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arquitectura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arquitectura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arquitectura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel ACU;
    private javax.swing.JLabel ALU;
    private javax.swing.JLabel Ap;
    private javax.swing.JLabel B;
    private javax.swing.JLabel Bp;
    private javax.swing.JLabel C;
    private javax.swing.JLabel ControlLogic;
    private javax.swing.JLabel Cp;
    private javax.swing.JLabel D;
    private javax.swing.JLabel Dp;
    private javax.swing.JLabel E;
    private javax.swing.JLabel Ep;
    private javax.swing.JLabel F;
    private javax.swing.JLabel Fp;
    private javax.swing.JLabel H;
    private javax.swing.JLabel Hp;
    private javax.swing.JLabel I;
    private javax.swing.JLabel IX;
    private javax.swing.JLabel IY;
    private javax.swing.JLabel InstructionDecoder;
    private javax.swing.JLabel InstructionRegister;
    private javax.swing.JLabel L;
    private javax.swing.JLabel Lp;
    private javax.swing.JLabel Mm11;
    private javax.swing.JLabel Mm12;
    private javax.swing.JLabel Mux1;
    private javax.swing.JLabel Mux2;
    private javax.swing.JLabel PC;
    private javax.swing.JLabel R;
    private javax.swing.JLabel SP;
    private javax.swing.JLabel TEMP;
    private javax.swing.JLabel W;
    private javax.swing.JLabel Wp;
    private javax.swing.JLabel Z;
    private javax.swing.JLabel Zp;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
