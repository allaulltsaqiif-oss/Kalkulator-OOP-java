import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import java.text.DecimalFormat;

public class Calculator extends JFrame implements ActionListener {

    // Komponen Layar
    private JLabel expressionLabel;
    private JLabel displayLabel;
    
    // Komponen Riwayat
    private JTextArea historyArea;

    // State Kalkulasi
    private double firstOperand = 0;
    private String operator = "";
    private boolean isNewInput = true;
    private final DecimalFormat df = new DecimalFormat("#.##########");

    // Palet Warna (Obsidian Dark Theme)
    private final Color COLOR_APP_BG     = new Color(0x0F, 0x11, 0x1A);
    private final Color COLOR_SCREEN_BG  = new Color(0x18, 0x1A, 0x26);
    private final Color COLOR_BORDER     = new Color(0x2A, 0x2D, 0x3E);
    private final Color COLOR_NUM_BTN    = new Color(0x1F, 0x22, 0x32);
    private final Color COLOR_FUNC_BTN   = new Color(0x2D, 0x31, 0x48);
    private final Color COLOR_OP_BTN     = new Color(0x63, 0x66, 0xF1);
    private final Color COLOR_EQUAL_BTN  = new Color(0x10, 0xB9, 0x81);
    private final Color COLOR_TEXT_PRM   = new Color(0xF3, 0xF4, 0xF6);
    private final Color COLOR_TEXT_SEC   = new Color(0x8F, 0x95, 0xB2);
    private final Color COLOR_TEXT_ACC   = new Color(0xC7, 0xD2, 0xFE);

    // Font
    private final Font FONT_DISPLAY    = new Font("SansSerif", Font.BOLD, 38);
    private final Font FONT_EXPRESSION = new Font("SansSerif", Font.PLAIN, 15);
    private final Font FONT_BUTTON     = new Font("SansSerif", Font.BOLD, 18);
    private final Font FONT_HISTORY    = new Font("Monospaced", Font.PLAIN, 14);

    public Calculator() {
        initUI();
        setupKeyBindings();
    }

    private void initUI() {
        setTitle("Scientific Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(850, 500); 
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel rootPanel = new JPanel(new BorderLayout(20, 0));
        rootPanel.setBackground(COLOR_APP_BG);
        rootPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        setContentPane(rootPanel);

        // ================= KIRI: KALKULATOR =================
        JPanel calcPanel = new JPanel(new BorderLayout(0, 18));
        calcPanel.setOpaque(false);
        calcPanel.setPreferredSize(new Dimension(480, 0));

        // Layar Kalkulator
        RoundedPanel displayPanel = new RoundedPanel(COLOR_SCREEN_BG, COLOR_BORDER, 24);
        displayPanel.setLayout(new BorderLayout(8, 8));
        displayPanel.setBorder(new EmptyBorder(15, 20, 15, 20));

        expressionLabel = new JLabel(" ", SwingConstants.RIGHT);
        expressionLabel.setFont(FONT_EXPRESSION);
        expressionLabel.setForeground(COLOR_TEXT_SEC);

        displayLabel = new JLabel("0", SwingConstants.RIGHT);
        displayLabel.setFont(FONT_DISPLAY);
        displayLabel.setForeground(COLOR_TEXT_PRM);

        displayPanel.add(expressionLabel, BorderLayout.NORTH);
        displayPanel.add(displayLabel, BorderLayout.CENTER);

        // Tombol Kalkulator (Grid 5x5)
        JPanel buttonsPanel = new JPanel(new GridLayout(5, 5, 10, 10));
        buttonsPanel.setOpaque(false);

        String[][] layout = {
                {"√", "x²", "AC", "⌫", "÷"},
                {"sin", "7", "8", "9", "×"},
                {"cos", "4", "5", "6", "-"},
                {"tan", "1", "2", "3", "+"},
                {"log", "±", "0", ".", "="}
        };

        for (String[] row : layout) {
            for (String text : row) {
                RoundedButton btn = createButton(text);
                buttonsPanel.add(btn);
            }
        }

        calcPanel.add(displayPanel, BorderLayout.NORTH);
        calcPanel.add(buttonsPanel, BorderLayout.CENTER);

        // ================= KANAN: RIWAYAT (HISTORY) =================
        RoundedPanel historyContainer = new RoundedPanel(COLOR_SCREEN_BG, COLOR_BORDER, 24);
        historyContainer.setLayout(new BorderLayout(0, 10));
        historyContainer.setBorder(new EmptyBorder(20, 20, 20, 20));

        JLabel historyTitle = new JLabel("Riwayat Kalkulasi");
        historyTitle.setFont(new Font("SansSerif", Font.BOLD, 16));
        historyTitle.setForeground(COLOR_TEXT_ACC);
        historyTitle.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, COLOR_BORDER));

        historyArea = new JTextArea();
        historyArea.setEditable(false);
        historyArea.setBackground(COLOR_SCREEN_BG);
        historyArea.setForeground(COLOR_TEXT_SEC);
        historyArea.setFont(FONT_HISTORY);
        historyArea.setLineWrap(true);

        JScrollPane scrollPane = new JScrollPane(historyArea);
        scrollPane.setBorder(null);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);

        JButton clearHistoryBtn = new RoundedButton("Hapus Riwayat", COLOR_FUNC_BTN, COLOR_TEXT_PRM, 15);
        clearHistoryBtn.setFont(new Font("SansSerif", Font.BOLD, 12));
        clearHistoryBtn.addActionListener(e -> historyArea.setText(""));

        historyContainer.add(historyTitle, BorderLayout.NORTH);
        historyContainer.add(scrollPane, BorderLayout.CENTER);
        historyContainer.add(clearHistoryBtn, BorderLayout.SOUTH);

        rootPanel.add(calcPanel, BorderLayout.WEST);
        rootPanel.add(historyContainer, BorderLayout.CENTER);
    }

    private RoundedButton createButton(String text) {
        Color bg;
        Color fg = COLOR_TEXT_PRM;

        if (text.matches("[0-9]") || text.equals(".")) {
            bg = COLOR_NUM_BTN;
        } else if (text.equals("=")) {
            bg = COLOR_EQUAL_BTN;
            fg = COLOR_APP_BG;
        } else if (text.matches("[÷×\\-+]")) {
            bg = COLOR_OP_BTN;
        } else {
            bg = COLOR_FUNC_BTN;
            fg = COLOR_TEXT_ACC;
        }

        RoundedButton btn = new RoundedButton(text, bg, fg, 20);
        btn.setFont(FONT_BUTTON);
        btn.addActionListener(this);
        return btn;
    }

    private void setupKeyBindings() {
        InputMap im = getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap am = getRootPane().getActionMap();

        // Angka & Desimal
        for (char c = '0'; c <= '9'; c++) bindKeyTyped(im, am, c, String.valueOf(c));
        bindKeyTyped(im, am, '.', ".");
        
        // Operator Biner
        bindKeyTyped(im, am, '+', "+");
        bindKeyTyped(im, am, '-', "-");
        bindKeyTyped(im, am, '*', "×");
        bindKeyTyped(im, am, '/', "÷");
        bindKeyTyped(im, am, '=', "=");

        // Action Khusus
        bindKeyCode(im, am, KeyEvent.VK_ENTER, "=");
        bindKeyCode(im, am, KeyEvent.VK_BACK_SPACE, "⌫");
        bindKeyCode(im, am, KeyEvent.VK_ESCAPE, "AC");
    }

    private void bindKeyTyped(InputMap im, ActionMap am, char keyChar, String command) {
        // PERBAIKAN: Menggunakan getKeyStroke(char)
        im.put(KeyStroke.getKeyStroke(keyChar), command);
        am.put(command, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) { processCommand(command); }
        });
    }

    private void bindKeyCode(InputMap im, ActionMap am, int keyCode, String command) {
        im.put(KeyStroke.getKeyStroke(keyCode, 0), command);
        am.put(command, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) { processCommand(command); }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        processCommand(e.getActionCommand());
    }

    private void processCommand(String command) {
        if (command.matches("[0-9]")) {
            handleNumber(command);
        } else if (command.equals(".")) {
            handleDecimal();
        } else if (command.matches("[÷×\\-+]")) {
            handleBinaryOperator(command);
        } else if (command.equals("=")) {
            handleEquals();
        } else if (command.equals("AC")) {
            handleClearAll();
        } else if (command.equals("⌫")) {
            handleBackspace();
        } else if (command.equals("±")) {
            handleToggleSign();
        } else if (command.matches("(sin|cos|tan|log|√|x²)")) {
            handleUnaryOperation(command);
        }
    }

    private void handleNumber(String num) {
        if (isNewInput || displayLabel.getText().equals("0") || displayLabel.getText().equals("Error")) {
            displayLabel.setText(num);
            isNewInput = false;
        } else {
            if (displayLabel.getText().length() < 15) {
                displayLabel.setText(displayLabel.getText() + num);
            }
        }
    }

    private void handleDecimal() {
        if (isNewInput) {
            displayLabel.setText("0.");
            isNewInput = false;
        } else if (!displayLabel.getText().contains(".")) {
            displayLabel.setText(displayLabel.getText() + ".");
        }
    }

    private void handleBinaryOperator(String op) {
        if (!operator.isEmpty() && !isNewInput) {
            calculate();
        } else {
            try {
                firstOperand = Double.parseDouble(displayLabel.getText());
            } catch (NumberFormatException ex) {
                firstOperand = 0;
            }
        }
        operator = op;
        expressionLabel.setText(df.format(firstOperand) + " " + operator);
        isNewInput = true;
    }

    private void handleEquals() {
        if (operator.isEmpty()) return;
        calculate();
        expressionLabel.setText(" ");
        operator = "";
        isNewInput = true;
    }

    private void calculate() {
        double secondOperand;
        try {
            secondOperand = Double.parseDouble(displayLabel.getText());
        } catch (NumberFormatException ex) {
            return;
        }

        double result = 0;
        boolean error = false;

        switch (operator) {
            case "+": result = firstOperand + secondOperand; break;
            case "-": result = firstOperand - secondOperand; break;
            case "×": result = firstOperand * secondOperand; break;
            case "÷":
                if (secondOperand == 0) error = true;
                else result = firstOperand / secondOperand;
                break;
        }

        if (error) {
            displayLabel.setText("Error");
            firstOperand = 0;
        } else {
            String formatResult = df.format(result);
            displayLabel.setText(formatResult);
            
            String historyLog = df.format(firstOperand) + " " + operator + " " + df.format(secondOperand) + " = " + formatResult + "\n";
            historyArea.append(historyLog);
            
            firstOperand = result;
        }
    }

    private void handleUnaryOperation(String op) {
        try {
            double val = Double.parseDouble(displayLabel.getText());
            double result = 0;
            String logExpression = "";

            switch (op) {
                case "sin":
                    result = Math.sin(Math.toRadians(val));
                    logExpression = "sin(" + df.format(val) + ")";
                    break;
                case "cos":
                    result = Math.cos(Math.toRadians(val));
                    logExpression = "cos(" + df.format(val) + ")";
                    break;
                case "tan":
                    result = Math.tan(Math.toRadians(val));
                    logExpression = "tan(" + df.format(val) + ")";
                    break;
                case "log":
                    if (val <= 0) throw new ArithmeticException();
                    result = Math.log10(val);
                    logExpression = "log(" + df.format(val) + ")";
                    break;
                case "√":
                    if (val < 0) throw new ArithmeticException();
                    result = Math.sqrt(val);
                    logExpression = "√" + df.format(val);
                    break;
                case "x²":
                    result = Math.pow(val, 2);
                    logExpression = df.format(val) + "²";
                    break;
            }

            String formatResult = df.format(result);
            displayLabel.setText(formatResult);
            historyArea.append(logExpression + " = " + formatResult + "\n");
            isNewInput = true;

        } catch (NumberFormatException ignored) {
        } catch (ArithmeticException e) {
            displayLabel.setText("Error");
            isNewInput = true;
        }
    }

    private void handleClearAll() {
        displayLabel.setText("0");
        expressionLabel.setText(" ");
        firstOperand = 0;
        operator = "";
        isNewInput = true;
    }

    private void handleBackspace() {
        if (isNewInput || displayLabel.getText().equals("Error")) return;
        String currentText = displayLabel.getText();
        if (currentText.length() > 1) {
            displayLabel.setText(currentText.substring(0, currentText.length() - 1));
        } else {
            displayLabel.setText("0");
            isNewInput = true;
        }
    }

    private void handleToggleSign() {
        try {
            double val = Double.parseDouble(displayLabel.getText());
            if (val != 0) {
                val = -val;
                displayLabel.setText(df.format(val));
            }
        } catch (NumberFormatException ignored) {}
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }
}

// ================= KOMPONEN CUSTOM (UI) =================

class RoundedPanel extends JPanel {
    private Color backgroundColor;
    private Color borderColor;
    private int cornerRadius;

    public RoundedPanel(Color bg, Color border, int radius) {
        this.backgroundColor = bg;
        this.borderColor = border;
        this.cornerRadius = radius;
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(backgroundColor);
        g2.fill(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, cornerRadius, cornerRadius));
        if (borderColor != null) {
            g2.setColor(borderColor);
            g2.draw(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, cornerRadius, cornerRadius));
        }
        g2.dispose();
        super.paintComponent(g);
    }
}

class RoundedButton extends JButton {
    private Color normalBg;
    private Color hoverBg;
    private Color pressedBg;
    private Color textColor;
    private int cornerRadius;
    private boolean isHovered = false;
    private boolean isPressed = false;

    public RoundedButton(String text, Color bg, Color textCol, int radius) {
        super(text);
        this.normalBg = bg;
        this.hoverBg = brighten(bg, 1.25f);
        this.pressedBg = darken(bg, 0.85f);
        this.textColor = textCol;
        this.cornerRadius = radius;

        setFocusPainted(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setOpaque(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));

        addMouseListener(new MouseAdapter() {
            @Override public void mouseEntered(MouseEvent e) { isHovered = true; repaint(); }
            @Override public void mouseExited(MouseEvent e) { isHovered = false; repaint(); }
            @Override public void mousePressed(MouseEvent e) { isPressed = true; repaint(); }
            @Override public void mouseReleased(MouseEvent e) { isPressed = false; repaint(); }
        });
    }

    private Color brighten(Color c, float factor) {
        return new Color(Math.min((int)(c.getRed() * factor), 255),
                         Math.min((int)(c.getGreen() * factor), 255),
                         Math.min((int)(c.getBlue() * factor), 255), c.getAlpha());
    }

    private Color darken(Color c, float factor) {
        return new Color(Math.max((int)(c.getRed() * factor), 0),
                         Math.max((int)(c.getGreen() * factor), 0),
                         Math.max((int)(c.getBlue() * factor), 0), c.getAlpha());
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        g2.setColor(isPressed ? pressedBg : (isHovered ? hoverBg : normalBg));
        g2.fill(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius));

        g2.setColor(textColor);
        g2.setFont(getFont());
        FontMetrics fm = g2.getFontMetrics();
        int x = (getWidth() - fm.stringWidth(getText())) / 2;
        int y = (getHeight() + fm.getAscent() - fm.getDescent()) / 2;
        g2.drawString(getText(), x, y);

        g2.dispose();
    }
}
