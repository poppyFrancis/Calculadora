/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaceg.aprender.calculadora;

import java.awt.event.KeyAdapter;
import java.text.DecimalFormat;
import java.util.Arrays;
import javax.swing.text.BadLocationException;

/**
 *
 * @author talles
 */
public class interfaceGCalc extends javax.swing.JFrame {

    String str = new String();
    boolean setText = false;
    String historicoStr = new String();
    boolean verificarResult = false;// verifica se o usuario escreveu "=" no campo de texto
    
    /**
     * Creates new form interfaceCalc
     */
    public interfaceGCalc() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        historico = new javax.swing.JTextField();
        conta = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        parentese1 = new javax.swing.JButton();
        parentese2 = new javax.swing.JButton();
        resto = new javax.swing.JButton();
        pi = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        raizQuadrada = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        produto = new javax.swing.JButton();
        num1 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        decremento = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        virgula = new javax.swing.JButton();
        procentagem = new javax.swing.JButton();
        incremento = new javax.swing.JButton();
        elevar = new javax.swing.JButton();
        expressaoErrada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        historico.setFont(new java.awt.Font("Laksaman", 1, 15)); // NOI18N
        historico.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)), "Histórico"));
        historico.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        historico.setEnabled(false);
        historico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historicoActionPerformed(evt);
            }
        });

        conta.setDocument(new javax.swing.text.PlainDocument() {

            @Override
            public void insertString(int pos, String numString, javax.swing.text.AttributeSet at) throws BadLocationException{
                boolean verificar1 = false; // verifica botoes clicados
                boolean verificar2 = false; // verifica digitado
                if(setText)
                verificar1 = (numString.charAt(pos) >= '(' && numString.charAt(pos) <= '9'  && numString.charAt(pos) != '.'|| numString.charAt(pos) == '=' || numString.charAt(pos) == '^' || numString.charAt(pos) == '√');
                    else
                    verificar2 = numString.matches(".*[0-9].*") ||  (numString.equals("=")
                        || numString.equals("^") || numString.equals("√") || numString.equals("+")
                        || numString.equals("(") || numString.equals(")") || numString.equals("-")
                        || numString.equals("*") || numString.equals(",") || numString.equals("/")
                        || numString.equals("%"));

                    if(verificar1){
                        try {
                            super.insertString(pos, numString, at);
                        } catch(Exception e){
                            e.printStackTrace();
                        }
                    } else if(verificar2){
                        try{
                            System.out.println("value colocado--> " + numString);
                            if(numString.equals("=")){
                                numString = "";
                                System.out.println(numString);
                                super.insertString(pos, numString, at);
                            } else{
                                super.insertString(pos, numString, at);
                            }
                        } catch(Exception e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        );
        conta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        conta.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        conta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contaActionPerformed(evt);
            }
        });
        conta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contaKeyPressed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(255, 0, 0));
        reset.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("X");
        reset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        parentese1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        parentese1.setText("(");
        parentese1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        parentese1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentese1ActionPerformed(evt);
            }
        });

        parentese2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        parentese2.setText(")");
        parentese2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        parentese2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentese2ActionPerformed(evt);
            }
        });

        resto.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        resto.setText("m");
        resto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        resto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoActionPerformed(evt);
            }
        });

        pi.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        pi.setText("π");
        pi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });

        num7.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        num7.setText("7");
        num7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });

        num8.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        num8.setText("8");
        num8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });

        num9.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        num9.setText("9");
        num9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });

        dividir.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        dividir.setText("/");
        dividir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });

        raizQuadrada.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        raizQuadrada.setText("√");
        raizQuadrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        raizQuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizQuadradaActionPerformed(evt);
            }
        });

        num4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        num4.setText("4");
        num4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });

        num5.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        num5.setText("5");
        num5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });

        num6.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        num6.setText("6");
        num6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });

        produto.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        produto.setText("*");
        produto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoActionPerformed(evt);
            }
        });

        num1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        num1.setText("1");
        num1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        num2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        num2.setText("2");
        num2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        num3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        num3.setText("3");
        num3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });

        decremento.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        decremento.setText("-");
        decremento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        decremento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decrementoActionPerformed(evt);
            }
        });

        igual.setBackground(new java.awt.Color(51, 255, 51));
        igual.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        igual.setForeground(new java.awt.Color(255, 255, 255));
        igual.setText("=");
        igual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        num0.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        num0.setText("0");
        num0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });

        virgula.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        virgula.setText(",");
        virgula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        virgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                virgulaActionPerformed(evt);
            }
        });

        procentagem.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        procentagem.setText("%");
        procentagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        procentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procentagemActionPerformed(evt);
            }
        });

        incremento.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        incremento.setText("+");
        incremento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        incremento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incrementoActionPerformed(evt);
            }
        });

        elevar.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        elevar.setText("^");
        elevar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        elevar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conta)
            .addComponent(historico)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(parentese1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(parentese2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(raizQuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(decremento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(produto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(virgula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(procentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(incremento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elevar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(expressaoErrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(expressaoErrada, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(historico, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(parentese2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(parentese1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(raizQuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(elevar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(produto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(num3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(num2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(decremento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(incremento, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(procentagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(virgula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void historicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historicoActionPerformed

    }//GEN-LAST:event_historicoActionPerformed

    private void restoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoActionPerformed
        str = conta.getText() + " mod ";
     setText = true;
        conta.setText(String.valueOf(str));
        setText = false;
    }//GEN-LAST:event_restoActionPerformed

    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
        str = conta.getText() + "3,1416";
        setText = true;
        conta.setText(String.valueOf(str));
        setText = false;
    }//GEN-LAST:event_piActionPerformed

    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
        str = conta.getText() + "/";
        setText = true;
        conta.setText(String.valueOf(str));
        setText = false;
    }//GEN-LAST:event_dividirActionPerformed

    private void raizQuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizQuadradaActionPerformed
         str = conta.getText() + "√";
       setText = true;
        conta.setText(String.valueOf(str));
        setText = false;
    }//GEN-LAST:event_raizQuadradaActionPerformed

    private void produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoActionPerformed
         str = conta.getText() + "*";
         setText = true;
        conta.setText(String.valueOf(str));
        setText = false;
    }//GEN-LAST:event_produtoActionPerformed

    private void decrementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decrementoActionPerformed
           str = conta.getText() + "-";
           setText = true;
        conta.setText(String.valueOf(str));
        setText = false;
    }//GEN-LAST:event_decrementoActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        Resultado();
    }//GEN-LAST:event_igualActionPerformed

    private void contaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contaActionPerformed

    }//GEN-LAST:event_contaActionPerformed

    private void incrementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incrementoActionPerformed
         str = conta.getText() + "+";
        setText = true;
        conta.setText(String.valueOf(str));
        setText = false;
    }//GEN-LAST:event_incrementoActionPerformed

    private void elevarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevarActionPerformed
            str = conta.getText() + "^";
          setText = true;
        conta.setText(String.valueOf(str));
        setText = false;
    }//GEN-LAST:event_elevarActionPerformed

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
     str = conta.getText() + "0";
     setText = true;
        conta.setText(String.valueOf(str));
        setText = false;
        
    }//GEN-LAST:event_num0ActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        str = conta.getText() + "1";
        setText = true;
        conta.setText(String.valueOf(str));
        setText = false;
    }//GEN-LAST:event_num1ActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        str = conta.getText() + "2";
       setText = true;
        conta.setText(String.valueOf(str));
        setText = false;
    }//GEN-LAST:event_num2ActionPerformed

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
        str = conta.getText() + "3";
        setText = true;
        conta.setText(String.valueOf(str));
        setText = false;
    }//GEN-LAST:event_num3ActionPerformed

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
        str = conta.getText() + "6";
       setText = true;
        conta.setText(String.valueOf(str));
        setText = false;
    }//GEN-LAST:event_num6ActionPerformed

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed
        str = conta.getText() + "5";
       setText = true;
        conta.setText(String.valueOf(str));
        setText = false;
    }//GEN-LAST:event_num5ActionPerformed

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
        str = conta.getText() + "4";
       setText = true;
        conta.setText(String.valueOf(str));
        setText = false;
    }//GEN-LAST:event_num4ActionPerformed

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
       str = conta.getText() + "9";
     setText = true;
        conta.setText(String.valueOf(str));
        setText = false;;
    }//GEN-LAST:event_num9ActionPerformed

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
        str = conta.getText() + "8";
       setText = true;
        conta.setText(String.valueOf(str));
        setText = false;
    }//GEN-LAST:event_num8ActionPerformed

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
        str = conta.getText() + "7";
       setText = true;
        conta.setText(String.valueOf(str));
        setText = false;
    }//GEN-LAST:event_num7ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
         str = "";
         setText = true;
        conta.setText(String.valueOf(str));
        setText = false;
    }//GEN-LAST:event_resetActionPerformed

    private void parentese1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentese1ActionPerformed
        str = conta.getText() + "(";
        setText = true;
        conta.setText(String.valueOf(str));
        setText = false;
    }//GEN-LAST:event_parentese1ActionPerformed

    private void parentese2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentese2ActionPerformed
        str = conta.getText() + ")";
        setText = true;
        conta.setText(String.valueOf(str));
        setText = false;
    }//GEN-LAST:event_parentese2ActionPerformed

    private void virgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_virgulaActionPerformed
         str = conta.getText() + ",";
        setText = true;
        conta.setText(String.valueOf(str));
        setText = false;
    }//GEN-LAST:event_virgulaActionPerformed

    private void procentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procentagemActionPerformed
        str = conta.getText() + "%";
        setText = true;
        conta.setText(String.valueOf(str));
        setText = false;
    }//GEN-LAST:event_procentagemActionPerformed

    private void contaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contaKeyPressed
        int key = evt.getKeyCode();
        char keyChar = evt.getKeyChar();
        System.out.println(keyChar);
        if (key == evt.VK_ENTER) {
            Resultado();
	} else if(keyChar == '=' && !(conta.getText().isEmpty())){
            verificarResult = true;
            Resultado();
            verificarResult = false;
        }
    }//GEN-LAST:event_contaKeyPressed
     
    private void Resultado() {
        
        String replaceString = conta.getText().replace(',', '.');
       
       
        replaceString = replaceString.replace("%", "/100");
        replaceString = replaceString.replace(" mod ", "%");//
       
        
        String[] tmp = VerificarConta.tirarRaiz(conta.getText());
        
        for(int i = 0; i < tmp.length; i++){
            replaceString = replaceString.replace("√" + tmp[i],"sqrt(" + tmp[i] + ")");
        }
        
        if(VerificarConta.verificar(replaceString)){
        
            if(String.valueOf(new Expression(replaceString).eval()).contains("E")){

                DecimalFormat formatador = new DecimalFormat("0.###############");
                String resultadoFormatado = formatador.format(new Expression(replaceString).eval());

                str = conta.getText() + "=" + resultadoFormatado;
            } else{
                Expression expression = new Expression(replaceString);
                str = conta.getText() + " = " + expression.eval();
            }
        
        
            replaceString = str.replace('.', ',');
            expressaoErrada.setText("");
            historicoStr += " " + (replaceString) + " |";  
            setText = true;
            historico.setText(historicoStr);
            conta.setText("");
            setText = false;
        } else {
            str = "Expressão mal formada";
            expressaoErrada.setText(str);
        }
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
            java.util.logging.Logger.getLogger(interfaceGCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaceGCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaceGCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaceGCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaceGCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField conta;
    private javax.swing.JButton decremento;
    private javax.swing.JButton dividir;
    private javax.swing.JButton elevar;
    private javax.swing.JLabel expressaoErrada;
    private javax.swing.JTextField historico;
    private javax.swing.JButton igual;
    private javax.swing.JButton incremento;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JButton parentese1;
    private javax.swing.JButton parentese2;
    private javax.swing.JButton pi;
    private javax.swing.JButton procentagem;
    private javax.swing.JButton produto;
    private javax.swing.JButton raizQuadrada;
    private javax.swing.JButton reset;
    private javax.swing.JButton resto;
    private javax.swing.JButton virgula;
    // End of variables declaration//GEN-END:variables
}
