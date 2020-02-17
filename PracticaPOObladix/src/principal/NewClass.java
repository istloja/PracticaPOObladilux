
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class NewClass extends JFrame {

    private JList imagenes;

    private JLabel etiqueta;
    private JTextArea text;
    private JPanel panel;

    private String nombres[] = {
        "leon", "ist", "vida moderna"
    };
    private Icon iconos[] = {
        new ImageIcon(getClass().getResource("\\imageness\\amor.jpg")),
        new ImageIcon(getClass().getResource("\\imageness\\pasion.jpg")),
        new ImageIcon(getClass().getResource("\\imageness\\deseo.jpg")),};
    private String texto[]
            = {"el leon es un animal ", "ist es el instituto superior de loja", "vida moderna es donde vivimos actualmemte"};

    public NewClass() {
        super("prueba");
        dispose();
        setSize(400, 400);
        setLocation(100, 100);
        setVisible(true);
        crearComponentes();
    }

    public void crearComponentes() {
        panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(new GridBagLayout());
        GridBagConstraints b = new GridBagConstraints();
        b.insets = new Insets(10, 50, 20, 10);
        b.gridx = 0;
        b.gridy = 0;

        imagenes = new JList(nombres);
        panel.add(imagenes, b);

        imagenes.addListSelectionListener(new oyentejlist());

        b.gridx = 1;
        b.gridy = 0;
        etiqueta = new JLabel("aqui se casrga la imagen");
        panel.add(etiqueta, b);

        b.gridx = 1;
        b.gridy = 1;

        text = new JTextArea("aqui se carga el texto");
        text.setEditable(false);
        panel.add(text, b);

    }

    public class oyentejlist implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {
            etiqueta.setText("");
            etiqueta.setIcon(iconos[imagenes.getSelectedIndex()]);
            text.setText(texto[imagenes.getSelectedIndex()]);
        }

    }

    public static void main(String[] args) {
        NewClass h = new NewClass();
    }
}
