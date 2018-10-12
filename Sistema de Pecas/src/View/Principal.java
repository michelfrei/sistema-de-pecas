package View;

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        ClienteView.setVisible(false);
        FuncionarioView.setVisible(false);
        ProdutoView.setVisible(false);
        CampoAtivosCliente.getModel().setSelectedItem(null);
        CampoAtivosFunc.getModel().setSelectedItem(null);
        CampoAtivosProduto.getModel().setSelectedItem(null);
        TravaCamposCliente();
        TravaCamposFunc();
        TravaCamposProd();
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
        CampoAtivosCliente.getModel().setSelectedItem(null);
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
        CampoAtivosFunc.setEnabled(false);
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
        CampoAtivosFunc.setEnabled(true);
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
        CampoAtivosFunc.getModel().setSelectedItem(null);
        CampoNomeFunc.setText("");
    }

    //--------------
    public void TravaCamposProd() {
        CampoTipoProduto.setEnabled(false);
        CampoDescProduto.setEnabled(false);
        CampoDetalhesProduto.setEnabled(false);
        CampoMarcaProduto.setEnabled(false);
        CampoOrigemProduto.setEnabled(false);
        CampoCodigoDeBarrasProduto.setEnabled(false);
        CampoFabricanteProduto.setEnabled(false);
        CampoSetorProduto.setEnabled(false);
        CampoUnidadeDeMedidaProduto.setEnabled(false);
        CampoPesoProduto.setEnabled(false);
        CampoMedidasProduto.setEnabled(false);
        CampoFotoProduto.setEnabled(false);
        CampoEstoqueProduto.setEnabled(false);
        CampoAtivosProduto.setEnabled(false);
    }

    public void DestravaCamposProd() {
        CampoTipoProduto.setEnabled(true);
        CampoDescProduto.setEnabled(true);
        CampoDetalhesProduto.setEnabled(true);
        CampoMarcaProduto.setEnabled(true);
        CampoOrigemProduto.setEnabled(true);
        CampoCodigoDeBarrasProduto.setEnabled(true);
        CampoFabricanteProduto.setEnabled(true);
        CampoSetorProduto.setEnabled(true);
        CampoUnidadeDeMedidaProduto.setEnabled(true);
        CampoPesoProduto.setEnabled(true);
        CampoMedidasProduto.setEnabled(true);
        CampoFotoProduto.setEnabled(true);
        CampoEstoqueProduto.setEnabled(true);
        CampoAtivosProduto.setEnabled(true);
    }

    public void LimpaCamposProd() {
        CampoTipoProduto.setText("");
        CampoDescProduto.setText("");
        CampoDetalhesProduto.setText("");
        CampoMarcaProduto.setText("");
        CampoOrigemProduto.setText("");
        CampoCodigoDeBarrasProduto.setText("");
        CampoFabricanteProduto.setText("");
        CampoSetorProduto.setText("");
        CampoUnidadeDeMedidaProduto.setText("");
        CampoPesoProduto.setText("");
        CampoMedidasProduto.setText("");
        CampoFotoProduto.setText("");
        CampoEstoqueProduto.setText("");
        CampoAtivosProduto.getModel().setSelectedItem(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        ProdutoView = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        BotaoNovoCliente5 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        BotaoNovoCliente6 = new javax.swing.JButton();
        BotaoNovoCliente7 = new javax.swing.JButton();
        CampoIdProduto = new javax.swing.JTextField();
        CampoDescProduto = new javax.swing.JTextField();
        CampoDetalhesProduto = new javax.swing.JTextField();
        CampoCodigoDeBarrasProduto = new javax.swing.JTextField();
        CampoTipoProduto = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        CampoFabricanteProduto = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        CampoSetorProduto = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        CampoMarcaProduto = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        CampoOrigemProduto = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        CampoUnidadeDeMedidaProduto = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        CampoPesoProduto = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        CampoMedidasProduto = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        BotaoNovoCliente10 = new javax.swing.JButton();
        BotaoNovoCliente11 = new javax.swing.JButton();
        CampoAtivosProduto = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        CampoFotoProduto = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        CampoEstoqueProduto = new javax.swing.JTextField();
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
        CampoIdCliente = new javax.swing.JTextField();
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
        BotaoNovoCliente3 = new javax.swing.JButton();
        BotaoNovoCliente4 = new javax.swing.JButton();
        CampoAtivosCliente = new javax.swing.JComboBox<>();
        FuncionarioView = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        BotaoNovoFunc = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        BotaoSalvaFunc = new javax.swing.JButton();
        BotaoBuscaFunc = new javax.swing.JButton();
        CampoIdFunc = new javax.swing.JTextField();
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
        BotaoNovoCliente8 = new javax.swing.JButton();
        BotaoNovoCliente9 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        CampoTipoFunc = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        CampoNomeUsuarioCliente = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        CampoSenhaFunc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        CampoAtivosFunc = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        BtnChamadaCliente = new javax.swing.JMenuItem();
        BtnChamadaFuncionario = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sis. auto peças");

        ProdutoView.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ProdutoView.setClosable(true);
        ProdutoView.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        ProdutoView.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        ProdutoView.setOpaque(true);
        ProdutoView.setVisible(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 246));

        BotaoNovoCliente5.setBackground(new java.awt.Color(255, 255, 255));
        BotaoNovoCliente5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotaoNovoCliente5.setText("Novo Cliente");
        BotaoNovoCliente5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoNovoCliente5.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        BotaoNovoCliente5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoCliente5ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Id:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Descrição:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Detalhes:");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Codigo de Barras:");

        BotaoNovoCliente6.setBackground(new java.awt.Color(255, 255, 255));
        BotaoNovoCliente6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotaoNovoCliente6.setText("Salvar");
        BotaoNovoCliente6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoNovoCliente6.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        BotaoNovoCliente6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoCliente6ActionPerformed(evt);
            }
        });

        BotaoNovoCliente7.setBackground(new java.awt.Color(255, 255, 255));
        BotaoNovoCliente7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotaoNovoCliente7.setText("Buscar Cliente");
        BotaoNovoCliente7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoNovoCliente7.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        BotaoNovoCliente7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoCliente7ActionPerformed(evt);
            }
        });

        CampoIdProduto.setEditable(false);
        CampoIdProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoIdProdutoActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Tipo:");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Fabricante:");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Setor:");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Marca:");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("Origem:");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("Unidade de Medida:");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("Peso:");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("Medidas:");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setText("Ativo:");

        BotaoNovoCliente10.setBackground(new java.awt.Color(255, 255, 255));
        BotaoNovoCliente10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotaoNovoCliente10.setText("Alterar");
        BotaoNovoCliente10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoNovoCliente10.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        BotaoNovoCliente10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoCliente10ActionPerformed(evt);
            }
        });

        BotaoNovoCliente11.setBackground(new java.awt.Color(255, 255, 255));
        BotaoNovoCliente11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotaoNovoCliente11.setText("Desativar");
        BotaoNovoCliente11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoNovoCliente11.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        BotaoNovoCliente11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoCliente11ActionPerformed(evt);
            }
        });

        CampoAtivosProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("Foto:");

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setText("Estoque:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CampoDescProduto))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 425, Short.MAX_VALUE)
                        .addComponent(BotaoNovoCliente6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoNovoCliente10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoNovoCliente11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoDetalhesProduto))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoOrigemProduto))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoFabricanteProduto)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoSetorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoUnidadeDeMedidaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoPesoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoMedidasProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoFotoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoAtivosProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BotaoNovoCliente5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoNovoCliente7)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoCodigoDeBarrasProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel35)
                        .addGap(8, 8, 8)
                        .addComponent(CampoTipoProduto)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoNovoCliente5)
                    .addComponent(BotaoNovoCliente7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel22)
                    .addComponent(CampoIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoDescProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(CampoDetalhesProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(CampoMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(CampoOrigemProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(CampoCodigoDeBarrasProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(CampoTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(CampoFabricanteProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(CampoSetorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(CampoUnidadeDeMedidaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(CampoPesoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(CampoMedidasProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addComponent(CampoFotoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47)
                    .addComponent(CampoEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(CampoAtivosProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoNovoCliente6)
                    .addComponent(BotaoNovoCliente10)
                    .addComponent(BotaoNovoCliente11))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout ProdutoViewLayout = new javax.swing.GroupLayout(ProdutoView.getContentPane());
        ProdutoView.getContentPane().setLayout(ProdutoViewLayout);
        ProdutoViewLayout.setHorizontalGroup(
            ProdutoViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ProdutoViewLayout.setVerticalGroup(
            ProdutoViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ClienteView.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ClienteView.setClosable(true);
        ClienteView.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        ClienteView.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        ClienteView.setOpaque(true);
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

        CampoIdCliente.setEditable(false);
        CampoIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoIdClienteActionPerformed(evt);
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

        CampoAtivosCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

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
                                .addComponent(CampoIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(CampoEnderecoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
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
                                .addComponent(CampoAtivosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(CampoIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        FuncionarioView.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FuncionarioView.setClosable(true);
        FuncionarioView.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
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

        CampoIdFunc.setEditable(false);
        CampoIdFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoIdFuncActionPerformed(evt);
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

        CampoAtivosFunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

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
                                .addComponent(CampoIdFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoNomeUsuarioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoSenhaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoAtivosFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoCelularFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoEmailFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(CampoIdFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jLabel30)
                    .addComponent(CampoNomeUsuarioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(CampoSenhaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoAtivosFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoSalvaFunc)
                    .addComponent(BotaoNovoCliente8)
                    .addComponent(BotaoNovoCliente9))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout FuncionarioViewLayout = new javax.swing.GroupLayout(FuncionarioView.getContentPane());
        FuncionarioView.getContentPane().setLayout(FuncionarioViewLayout);
        FuncionarioViewLayout.setHorizontalGroup(
            FuncionarioViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FuncionarioViewLayout.setVerticalGroup(
            FuncionarioViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDesktopPane1.setLayer(ProdutoView, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ClienteView, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(FuncionarioView, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClienteView)
                    .addComponent(FuncionarioView)
                    .addComponent(ProdutoView, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(324, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ClienteView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FuncionarioView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ProdutoView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(359, Short.MAX_VALUE))
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

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

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
        setLocationRelativeTo(null);
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
        if (    CampoNomeCliente.getText().isEmpty()
                || CampoAtivosCliente.getSelectedItem().equals(null)
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

    private void CampoIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoIdClienteActionPerformed

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
                || CampoAtivosFunc.getSelectedItem().equals(null)
                || CampoNomeFunc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Há campos não preenchidos", "Sistema", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Salvo com sucesso", "Sistema", JOptionPane.INFORMATION_MESSAGE);
            LimpaCamposFunc();
            TravaCamposFunc();
        }

    }//GEN-LAST:event_BotaoSalvaFuncActionPerformed

    private void BotaoBuscaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBuscaFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoBuscaFuncActionPerformed

    private void CampoIdFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIdFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoIdFuncActionPerformed

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

    private void BotaoNovoCliente5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoCliente5ActionPerformed
        DestravaCamposProd();
    }//GEN-LAST:event_BotaoNovoCliente5ActionPerformed

    private void BotaoNovoCliente6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoCliente6ActionPerformed
        if (    CampoTipoProduto.getText().isEmpty()
                || CampoDescProduto.getText().isEmpty()
                || CampoDetalhesProduto.getText().isEmpty()
                || CampoMarcaProduto.getText().isEmpty()
                || CampoOrigemProduto.getText().isEmpty()
                || CampoCodigoDeBarrasProduto.getText().isEmpty()
                || CampoFabricanteProduto.getText().isEmpty()
                || CampoSetorProduto.getText().isEmpty()
                || CampoUnidadeDeMedidaProduto.getText().isEmpty()
                || CampoPesoProduto.getText().isEmpty()
                || CampoMedidasProduto.getText().isEmpty()
                || CampoFotoProduto.getText().isEmpty()
                || CampoEstoqueProduto.getText().isEmpty()
                || CampoAtivosProduto.getModel().getSelectedItem().equals(null)) {
            JOptionPane.showMessageDialog(null, "Há campos não preenchidos", "Sistema", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Salvo com sucesso", "Sistema", JOptionPane.INFORMATION_MESSAGE);
            LimpaCamposProd();
            TravaCamposProd();
        }

    }//GEN-LAST:event_BotaoNovoCliente6ActionPerformed

    private void BotaoNovoCliente7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoCliente7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoNovoCliente7ActionPerformed

    private void CampoIdProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIdProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoIdProdutoActionPerformed

    private void BotaoNovoCliente10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoCliente10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoNovoCliente10ActionPerformed

    private void BotaoNovoCliente11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoCliente11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoNovoCliente11ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ProdutoView.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void LookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
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
    private javax.swing.JButton BotaoNovoCliente10;
    private javax.swing.JButton BotaoNovoCliente11;
    private javax.swing.JButton BotaoNovoCliente2;
    private javax.swing.JButton BotaoNovoCliente3;
    private javax.swing.JButton BotaoNovoCliente4;
    private javax.swing.JButton BotaoNovoCliente5;
    private javax.swing.JButton BotaoNovoCliente6;
    private javax.swing.JButton BotaoNovoCliente7;
    private javax.swing.JButton BotaoNovoCliente8;
    private javax.swing.JButton BotaoNovoCliente9;
    private javax.swing.JButton BotaoNovoFunc;
    private javax.swing.JButton BotaoSalvaFunc;
    private javax.swing.JMenuItem BtnChamadaCliente;
    private javax.swing.JMenuItem BtnChamadaFuncionario;
    private javax.swing.JComboBox<String> CampoAtivosCliente;
    private javax.swing.JComboBox<String> CampoAtivosFunc;
    private javax.swing.JComboBox<String> CampoAtivosProduto;
    private javax.swing.JTextField CampoCPFCliente;
    private javax.swing.JTextField CampoCPFFunc;
    private javax.swing.JTextField CampoCelularCliente;
    private javax.swing.JTextField CampoCelularFunc;
    private javax.swing.JTextField CampoCepCliente;
    private javax.swing.JTextField CampoCidadeCliente;
    private javax.swing.JTextField CampoCodigoDeBarrasProduto;
    private javax.swing.JTextField CampoComplementoCliente;
    private javax.swing.JTextField CampoContasCliente;
    private javax.swing.JTextField CampoDebitoCliente;
    private javax.swing.JTextField CampoDescProduto;
    private javax.swing.JTextField CampoDetalhesProduto;
    private javax.swing.JTextField CampoEmailCliente;
    private javax.swing.JTextField CampoEmailFunc;
    private javax.swing.JTextField CampoEnderecoCliente;
    private javax.swing.JTextField CampoEnderecoFunc;
    private javax.swing.JTextField CampoEstadoCliente;
    private javax.swing.JTextField CampoEstoqueProduto;
    private javax.swing.JTextField CampoFabricanteProduto;
    private javax.swing.JTextField CampoFotoProduto;
    private javax.swing.JTextField CampoIdCliente;
    private javax.swing.JTextField CampoIdFunc;
    private javax.swing.JTextField CampoIdProduto;
    private javax.swing.JTextField CampoMarcaProduto;
    private javax.swing.JTextField CampoMedidasProduto;
    private javax.swing.JTextField CampoNomeCliente;
    private javax.swing.JTextField CampoNomeFunc;
    private javax.swing.JTextField CampoNomeUsuarioCliente;
    private javax.swing.JTextField CampoNumeroCasaCliente;
    private javax.swing.JTextField CampoNumeroCasaFunc;
    private javax.swing.JTextField CampoOrigemProduto;
    private javax.swing.JTextField CampoPesoProduto;
    private javax.swing.JTextField CampoRGCliente;
    private javax.swing.JTextField CampoRGFunc;
    private javax.swing.JTextField CampoSenhaFunc;
    private javax.swing.JTextField CampoSetorProduto;
    private javax.swing.JTextField CampoTelefoneCliente;
    private javax.swing.JTextField CampoTelefoneFunc;
    private javax.swing.JTextField CampoTipoFunc;
    private javax.swing.JTextField CampoTipoProduto;
    private javax.swing.JTextField CampoUnidadeDeMedidaProduto;
    private javax.swing.JInternalFrame ClienteView;
    private javax.swing.JInternalFrame FuncionarioView;
    private javax.swing.JInternalFrame ProdutoView;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
