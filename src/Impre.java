import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Locale;

public class Impre {
    private JPanel p1;
    private JLabel datos;
    public Impre() {
        datos.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                conexion s1 = new conexion();
                JLabel.setDefaultLocale(Locale.of(s1.toString()));
            }
        });

    }

}
