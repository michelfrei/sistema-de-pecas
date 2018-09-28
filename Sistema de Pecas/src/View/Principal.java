package View;

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        ClienteView.setVisible(false);
        FuncionarioView.setVisible(false);
        TravaCamposCliente();
        TravaCamposFunc();
    }

    public void TravaCamposCliente() {
        CampoNomeCliente.setEnabled(false);
        CampoAtivosCliente.setEnabled(false);
        CampoCPFCliente.setEnabled(false);
        CampoCelularCliente.setEnabled(false);
        CampoCepCliente.setEnabled(false);
        CampoCidadeCliente.setEnabled(false);
        CampoComplementoCliente.setEnabled(false);
        CampoContasCliente.setEnabled(false);
        CampoDebitoCliente.setEnabled(false);
        CampoEmailCliente.setEnabled(false);
        CampoEnderecoCliente.setEnabled(false);
        CampoEstadoCliente.setEnabled(false);
        CampoNumeroCasaCliente.setEnabled(false);
        CampoRGCliente.setEnabled(false);
        CampoTelefoneCliente.setEnabled(false);
    }

    public void DestravaCamposCliente() {
        CampoNomeCliente.setEnabled(true);
        CampoAtivosCliente.setEnabled(true);
        CampoCPFCliente.setEnabled(true);
        CampoCelularCliente.setEnabled(true);
        CampoCepCliente.setEnabled(true);
        CampoCidadeCliente.setEnabled(true);
        CampoComplementoCliente.setEnabled(true);
        CampoContasCliente.setEnabled(true);
        CampoDebitoCliente.setEnabled(true);
        CampoEmailCliente.setEnabled(true);
        CampoEnderecoCliente.setEnabled(true);
        CampoEstadoCliente.setEnabled(true);
        CampoNumeroCasaCliente.setEnabled(true);
        CampoRGCliente.setEnabled(true);
        CampoTelefoneCliente.setEnabled(true);
    }

    public void LimpaCamposCliente() {
        CampoNomeCliente.setText("");
        CampoAtivosCliente.setText("");
        CampoCPFCliente.setText("");
        CampoCelularCliente.setText("");
        CampoCepCliente.setText("");
        CampoCidadeCliente.setText("");
        CampoComplementoCliente.setText("");
        CampoContasCliente.setText("");
        CampoDebitoCliente.setText("");
        CampoEmailCliente.setText("");
        CampoEnderecoCliente.setText("");
        CampoEstadoCliente.setText("");
        CampoNumeroCasaCliente.setText("");
        CampoRGCliente.setText("");
        CampoTelefoneCliente.setText("");
    }

    public void TravaCamposFunc() {
        CampoNomeFunc.setEnabled(false);
        CampoAtivoFunc.setEnabled(false);
        CampoCPFFunc.setEnabled(false);
        CampoCelularFunc.setEnabled(false);
        CampoEmailFunc.setEnabled(false);
        CampoEnderecoFunc.setEnabled(false);
        CampoNumeroCasaFunc.setEnabled(false);
        CampoRGFunc.setEnabled(false);
        CampoTelefoneFunc.setEnabled(false);
        CampoTipoFunc.setEnabled(false);
        CampoNomeUsuarioCliente.setEnabled(false);
        CampoSenhaFunc.setEnabled(false);

    }

    public void DestravaCamposFunc() {
        CampoNomeFunc.setEnabled(true);
        CampoAtivoFunc.setEnabled(true);
        CampoCPFFunc.setEnabled(true);
        CampoCelularFunc.setEnabled(true);
        CampoEmailFunc.setEnabled(true);
        CampoEnderecoFunc.setEnabled(true);
        CampoNumeroCasaFunc.setEnabled(true);
        CampoRGFunc.setEnabled(true);
        CampoTelefoneFunc.setEnabled(true);
        CampoTipoFunc.setEnabled(true);
        CampoNomeUsuarioCliente.setEnabled(true);
        CampoSenhaFunc.setEnabled(true);
    }

    public void LimpaCamposFunc() {
        CampoSenhaFunc.setText("");
        CampoNomeUsuarioCliente.setText("");
        CampoTipoFunc.setText("");
        CampoTelefoneFunc.setText("");
        CampoRGFunc.setText("");
        CampoNumeroCasaFunc.setText("");
        CampoEnderecoFunc.setText("");
        CampoEmailFunc.setText("");
        CampoCelularFunc.setText("");
        CampoCPFFunc.setText("");
        CampoAtivoFunc.setText("");
        CampoNomeFunc.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        ClienteView = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        BotaoNovoCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BotaoNovoCliente1 = new javax.swing.JButton();
        BotaoNovoCliente2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        CampoNomeCliente = new javax.swing.JTextField();
        CampoCPFCliente = new javax.swing.JTextField();
        CampoRGCliente = new javax.swing.JTextField();
        CampoEnderecoCliente = new javax.swing.JTextField();
        CampoComplementoCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CampoNumeroCasaCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CampoCepCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CampoTelefoneCliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CampoCelularCliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        CampoEmailCliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        CampoEstadoCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        CampoCidadeCliente = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        CampoContasCliente = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        CampoDebitoCliente = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        CampoAtivosCliente = new javax.swing.JTextField();
        BotaoNovoCliente3 = new javax.swing.JButton();
        BotaoNovoCliente4 = new javax.swing.JButton();
        FuncionarioView = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        BotaoNovoFunc = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        BotaoSalvaFunc = new javax.swing.JButton();
        BotaoBuscaFunc = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        CampoNomeFunc = new javax.swing.JTextField();
        CampoCPFFunc = new javax.swing.JTextField();
        CampoRGFunc = new javax.swing.JTextField();
        CampoEnderecoFunc = new javax.swing.JTextField();
        CampoNumeroCasaFunc = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        CampoTelefoneFunc = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        CampoCelularFunc = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        CampoEmailFunc = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        CampoAtivoFunc = new javax.swing.JTextField();
        BotaoNovoCliente8 = new javax.swing.JButton();
        BotaoNovoCliente9 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        CampoTipoFunc = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        CampoNomeUsuarioCliente = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        CampoSenhaFunc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        BtnChamadaCliente = new javax.swing.JMenuItem();
        BtnChamadaFuncionario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ClienteView.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ClienteView.setClosable(true);
        ClienteView.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        ClienteView.setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 246));

        BotaoNovoCliente.setBackground(new java.awt.Color(255, 255, 255));
        BotaoNovoCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotaoNovoCliente.setText("Novo Cliente");
        BotaoNovoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoNovoCliente.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        BotaoNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoClienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Id:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome Razao:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("RG:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Endereço:");

        BotaoNovoCliente1.setBackground(new java.awt.Color(255, 255, 255));
        BotaoNovoCliente1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotaoNovoCliente1.setText("Salvar");
        BotaoNovoCliente1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoNovoCliente1.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        BotaoNovoCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoCliente1ActionPerformed(evt);
            }
        });

        BotaoNovoCliente2.setBackground(new java.awt.Color(255, 255, 255));
        BotaoNovoCliente2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotaoNovoCliente2.setText("Buscar Cliente");
        BotaoNovoCliente2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoNovoCliente2.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        BotaoNovoCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoCliente2ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Complemento:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Numero:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Cep:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Telefone:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Celular:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Email:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Estado:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Cidade:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Vencimento da conta:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Debito:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Ativo:");

        BotaoNovoCliente3.setBackground(new java.awt.Color(255, 255, 255));
        BotaoNovoCliente3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotaoNovoCliente3.setText("Alterar");
        BotaoNovoCliente3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoNovoCliente3.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        BotaoNovoCliente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoCliente3ActionPerformed(evt);
            }
        });

        BotaoNovoCliente4.setBackground(new java.awt.Color(255, 255, 255));
        BotaoNovoCliente4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotaoNovoCliente4.setText("Desativar");
        BotaoNovoCliente4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoNovoCliente4.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        BotaoNovoCliente4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoCliente4ActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoCPFCliente)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoNomeCliente)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoRGCliente)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(168, 168, 168))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoEnderecoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotaoNovoCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoNovoCliente2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoNumeroCasaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoComplementoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoCidadeCliente))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotaoNovoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoNovoCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoNovoCliente4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoContasCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoDebitoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoAtivosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoNovoCliente)
                    .addComponent(BotaoNovoCliente2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(CampoCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoRGCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(CampoTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(CampoCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(CampoEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CampoEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(CampoComplementoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CampoNumeroCasaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(CampoCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(CampoEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(CampoCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(CampoContasCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(CampoDebitoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(CampoAtivosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoNovoCliente1)
                    .addComponent(BotaoNovoCliente3)
                    .addComponent(BotaoNovoCliente4))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout ClienteViewLayout = new javax.swing.GroupLayout(ClienteView.getContentPane());
        ClienteView.getContentPane().setLayout(ClienteViewLayout);
        ClienteViewLayout.setHorizontalGroup(
            ClienteViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ClienteViewLayout.setVerticalGroup(
            ClienteViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        FuncionarioView.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FuncionarioView.setClosable(true);
        FuncionarioView.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        FuncionarioView.setVisible(true);

        BotaoNovoFunc.setBackground(new java.awt.Color(255, 255, 255));
        BotaoNovoFunc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotaoNovoFunc.setText("Novo Funcionario");
        BotaoNovoFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoNovoFunc.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        BotaoNovoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoFuncActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Id:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Nome:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("CPF:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("RG:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Endereço:");

        BotaoSalvaFunc.setBackground(new java.awt.Color(255, 255, 255));
        BotaoSalvaFunc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotaoSalvaFunc.setText("Salvar");
        BotaoSalvaFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoSalvaFunc.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        BotaoSalvaFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvaFuncActionPerformed(evt);
            }
        });

        BotaoBuscaFunc.setBackground(new java.awt.Color(255, 255, 255));
        BotaoBuscaFunc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotaoBuscaFunc.setText("Buscar Funcionario");
        BotaoBuscaFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoBuscaFunc.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        BotaoBuscaFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBuscaFuncActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Numero:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Telefone:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Celular:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Email:");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Ativo:");

        BotaoNovoCliente8.setBackground(new java.awt.Color(255, 255, 255));
        BotaoNovoCliente8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotaoNovoCliente8.setText("Alterar");
        BotaoNovoCliente8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoNovoCliente8.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        BotaoNovoCliente8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoCliente8ActionPerformed(evt);
            }
        });

        BotaoNovoCliente9.setBackground(new java.awt.Color(255, 255, 255));
        BotaoNovoCliente9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotaoNovoCliente9.setText("Desativar");
        BotaoNovoCliente9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoNovoCliente9.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        BotaoNovoCliente9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoCliente9ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Tipo:");

        CampoTipoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTipoFuncActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Nome de usuario:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Senha:");

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoCPFFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoRGFunc)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoTelefoneFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(168, 168, 168))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BotaoSalvaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoNovoCliente8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoNovoCliente9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoTipoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CampoNomeFunc))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoEnderecoFunc)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoNumeroCasaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(223, 223, 223))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CampoCelularFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CampoEmailFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CampoNomeUsuarioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CampoSenhaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CampoAtivoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(70, 70, 70)))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(BotaoNovoFunc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoBuscaFunc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(50, 50, 50))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoNovoFunc)
                    .addComponent(BotaoBuscaFunc)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(CampoTipoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(CampoNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(CampoCPFFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoRGFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(CampoTelefoneFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(CampoCelularFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(CampoEmailFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(CampoEnderecoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(CampoNumeroCasaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(CampoAtivoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(CampoNomeUsuarioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(CampoSenhaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoSalvaFunc)
                    .addComponent(BotaoNovoCliente8)
                    .addComponent(BotaoNovoCliente9))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout FuncionarioViewLayout = new javax.swing.GroupLayout(FuncionarioView.getContentPane());
        FuncionarioView.getContentPane().setLayout(FuncionarioViewLayout);
        FuncionarioViewLayout.setHorizontalGroup(
            FuncionarioViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FuncionarioViewLayout.setVerticalGroup(
            FuncionarioViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(ClienteView, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(FuncionarioView, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClienteView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FuncionarioView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(392, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ClienteView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FuncionarioView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("Cadastros");

        BtnChamadaCliente.setText("Cliente");
        BtnChamadaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnChamadaClienteActionPerformed(evt);
            }
        });
        jMenu1.add(BtnChamadaCliente);

        BtnChamadaFuncionario.setText("Funcionario");
        BtnChamadaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnChamadaFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(BtnChamadaFuncionario);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sair");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnChamadaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnChamadaClienteActionPerformed

        ClienteView.setVisible(true);


    }//GEN-LAST:event_BtnChamadaClienteActionPerformed

    private void BtnChamadaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnChamadaFuncionarioActionPerformed
        FuncionarioView.setVisible(true);
    }//GEN-LAST:event_BtnChamadaFuncionarioActionPerformed

    private void BotaoNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoClienteActionPerformed
        DestravaCamposCliente();


    }//GEN-LAST:event_BotaoNovoClienteActionPerformed

    private void BotaoNovoCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoCliente1ActionPerformed
        if (CampoNomeCliente.getText().isEmpty()
                || CampoAtivosCliente.getText().isEmpty()
                || CampoCPFCliente.getText().isEmpty()
                || CampoCelularCliente.getText().isEmpty()
                || CampoCepCliente.getText().isEmpty()
                || CampoCidadeCliente.getText().isEmpty()
                || CampoComplementoCliente.getText().isEmpty()
                || CampoContasCliente.getText().isEmpty()
                || CampoDebitoCliente.getText().isEmpty()
                || CampoEmailCliente.getText().isEmpty()
                || CampoEnderecoCliente.getText().isEmpty()
                || CampoEstadoCliente.getText().isEmpty()
                || CampoNumeroCasaCliente.getText().isEmpty()
                || CampoRGCliente.getText().isEmpty()
                || CampoTelefoneCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Há campos não preenchidos", "Sistema", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Salvo com sucesso", "Sistema", JOptionPane.INFORMATION_MESSAGE);
            LimpaCamposCliente();
            TravaCamposCliente();
        }

    }//GEN-LAST:event_BotaoNovoCliente1ActionPerformed

    private void BotaoNovoCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoCliente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoNovoCliente2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void BotaoNovoCliente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoCliente3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoNovoCliente3ActionPerformed

    private void BotaoNovoCliente4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoCliente4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoNovoCliente4ActionPerformed

    private void BotaoNovoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoFuncActionPerformed
        DestravaCamposFunc();
    }//GEN-LAST:event_BotaoNovoFuncActionPerformed

    private void BotaoSalvaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvaFuncActionPerformed
        if (CampoSenhaFunc.getText().isEmpty()
                || CampoNomeUsuarioCliente.getText().isEmpty()
                || CampoTipoFunc.getText().isEmpty()
                || CampoTelefoneFunc.getText().isEmpty()
                || CampoRGFunc.getText().isEmpty()
                || CampoNumeroCasaFunc.getText().isEmpty()
                || CampoEnderecoFunc.getText().isEmpty()
                || CampoEmailFunc.getText().isEmpty()
                || CampoCelularFunc.getText().isEmpty()
                || CampoCPFFunc.getText().isEmpty()
                || CampoAtivoFunc.getText().isEmpty()
                || CampoNomeFunc.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Há campos não preenchidos", "Sistema", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Salvo com sucesso", "Sistema", JOptionPane.INFORMATION_MESSAGE);
            LimpaCamposFunc();
            TravaCamposFunc();
        }
        
    }//GEN-LAST:event_BotaoSalvaFuncActionPerformed

    private void BotaoBuscaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBuscaFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoBuscaFuncActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void BotaoNovoCliente8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoCliente8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoNovoCliente8ActionPerformed

    private void BotaoNovoCliente9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoCliente9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoNovoCliente9ActionPerformed

    private void CampoTipoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTipoFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTipoFuncActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void VejaESinta() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoBuscaFunc;
    private javax.swing.JButton BotaoNovoCliente;
    private javax.swing.JButton BotaoNovoCliente1;
    private javax.swing.JButton BotaoNovoCliente2;
    private javax.swing.JButton BotaoNovoCliente3;
    private javax.swing.JButton BotaoNovoCliente4;
    private javax.swing.JButton BotaoNovoCliente8;
    private javax.swing.JButton BotaoNovoCliente9;
    private javax.swing.JButton BotaoNovoFunc;
    private javax.swing.JButton BotaoSalvaFunc;
    private javax.swing.JMenuItem BtnChamadaCliente;
    private javax.swing.JMenuItem BtnChamadaFuncionario;
    private javax.swing.JTextField CampoAtivoFunc;
    private javax.swing.JTextField CampoAtivosCliente;
    private javax.swing.JTextField CampoCPFCliente;
    private javax.swing.JTextField CampoCPFFunc;
    private javax.swing.JTextField CampoCelularCliente;
    private javax.swing.JTextField CampoCelularFunc;
    private javax.swing.JTextField CampoCepCliente;
    private javax.swing.JTextField CampoCidadeCliente;
    private javax.swing.JTextField CampoComplementoCliente;
    private javax.swing.JTextField CampoContasCliente;
    private javax.swing.JTextField CampoDebitoCliente;
    private javax.swing.JTextField CampoEmailCliente;
    private javax.swing.JTextField CampoEmailFunc;
    private javax.swing.JTextField CampoEnderecoCliente;
    private javax.swing.JTextField CampoEnderecoFunc;
    private javax.swing.JTextField CampoEstadoCliente;
    private javax.swing.JTextField CampoNomeCliente;
    private javax.swing.JTextField CampoNomeFunc;
    private javax.swing.JTextField CampoNomeUsuarioCliente;
    private javax.swing.JTextField CampoNumeroCasaCliente;
    private javax.swing.JTextField CampoNumeroCasaFunc;
    private javax.swing.JTextField CampoRGCliente;
    private javax.swing.JTextField CampoRGFunc;
    private javax.swing.JTextField CampoSenhaFunc;
    private javax.swing.JTextField CampoTelefoneCliente;
    private javax.swing.JTextField CampoTelefoneFunc;
    private javax.swing.JTextField CampoTipoFunc;
    private javax.swing.JInternalFrame ClienteView;
    private javax.swing.JInternalFrame ClienteView1;
    private javax.swing.JInternalFrame FuncionarioView;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
