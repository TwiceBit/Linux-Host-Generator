
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;


import javax.swing.JOptionPane;

public class HostGenerator {

	public static void main(String[] args) {
		String url = JOptionPane.showInputDialog("DNS Adresse:");
		String urlg = "0.0.0.0         " + url + "%n0.0.0.0         www." + url;
		Clipboard b = Toolkit.getDefaultToolkit().getSystemClipboard();
		String format = String.format(urlg, null);
		b.setContents(new StringSelection(format), null);
		try {
			Thread.sleep(1000 * 20);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
}

