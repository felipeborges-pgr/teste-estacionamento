package Controle;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
;

public class ChamarRelatorio {
	
	public void ImprimeRelatorio() throws JRException, Exception {
        Connection conn = conexao(); //aqui no lugar do metodo conectaBanco() vc usa o seu tipo de conexão com o banco
        try {
            Map Map = new HashMap();
            String arquivo = null;
            arquivo = System.getProperty("user.dir") + "Escala.jasper";
            JasperPrint jp = JasperFillManager.fillReport(arquivo, Map, conn);
             JasperViewer view = new JasperViewer(jp, false);
            view.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            view.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }

	
}
