/**
 * 
 */
package awt;
import java.awt.Frame;
import java.awt.Window;

/**
 * @author Walter Rafeiner-Magor
 */
public class FirstWindow extends Window {
	public FirstWindow(){
		super(new Frame("leeres Fenster"));
		this.setSize(480, 320); // Gr��e in Pixel
		this.setVisible(true);	// sichtbar machen!
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new FirstWindow();
	}
}
