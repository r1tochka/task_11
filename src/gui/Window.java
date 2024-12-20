package gui;

import logic.Transliteration1;


import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private JTextArea textAreaStart;
    private JButton buttonConvert;
    private JTextArea textAreaFinal;
    private JPanel JPanelConvert;


    public Window() {
        setTitle("Транслитерация");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textAreaStart = new JTextArea(10, 30);
        buttonConvert = new JButton("Транслитеровать!");
        textAreaFinal = new JTextArea(10, 30);

        textAreaStart.setPreferredSize(new Dimension(300, 100)); // Ширина 300, высота 100
        textAreaFinal.setPreferredSize(new Dimension(300, 100)); // Ширина 300, высота 100
        buttonConvert.setPreferredSize(new Dimension(50, 10));

        add(new JScrollPane(textAreaStart), "North"); // Добавляем текстовую область с прокруткой в верхнюю часть
        add(buttonConvert, "Center"); // Добавляем кнопку в центр
        add(new JScrollPane(textAreaFinal), "South");

        buttonConvert.addActionListener(new ActionListener() {
            @id86240433 (@Override)
            public void actionPerformed(ActionEvent e) {

                String inputText = textAreaStart.getText();
// Выполняем транслитерацию
                String transliteratedText = Transliteration1.transliterateCyrillicToLatin(inputText);
// Выводим результат обратно в текстовое поле
                textAreaFinal.setText(transliteratedText);

            }
        });
    }

    public static void main(String[] args) {
        Window w = new Window();
        w.setSize(600, 500);
        w.setLocation(300, 200);
        w.setVisible(true);
    }


    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(3, 3, new Insets(0, 0, 0, 0), -1, -1));
        JPanelConvert = new JPanel();
        JPanelConvert.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel1.add(JPanelConvert, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        buttonConvert = new JButton();
        buttonConvert.setText("Транслитерировать!");
        JPanelConvert.add(buttonConvert, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        JPanelConvert.add(spacer1, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        panel1.add(scrollPane1, new GridConstraints(0, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        textAreaStart = new JTextArea();
        scrollPane1.setViewportView(textAreaStart);
        final JScrollPane scrollPane2 = new JScrollPane();
        panel1.add(scrollPane2, new GridConstraints(2, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        textAreaFinal = new JTextArea();
        textAreaFinal.setEditable(false);
        scrollPane2.setViewportView(textAreaFinal);
    }
}
