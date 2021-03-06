package Progress;

import static Constants.Constants.PROGRESS;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.JButton;

public final class SaveProgress {

	public static String getPosition(JButton button[][], Icon soldier1, Icon tank1, Icon airplane1,
			Icon rocket1, Icon hq1, Icon soldier2, Icon tank2, Icon airplane2,
			Icon rocket2, Icon hq2) {
		String txt = "";
		for (byte i = 0; i < 18; i++)
			for (byte j = 0; j < 18; j++) {
				if (button[i][j].getIcon() == null) {
					// o=0
					txt += 'o';
				} else if (button[i][j].getIcon() == soldier1) {
					// soldier
					txt += 's';
				} else if (button[i][j].getIcon() == tank1) {
					// tank
					txt += 't';
				} else if (button[i][j].getIcon() == airplane1) {
					// airplane
					txt += 'a';
				} else if (button[i][j].getIcon() == rocket1) {
					// rocket
					txt += 'r';
				} else if (button[i][j].getIcon() == hq1) {
					// head
					txt += 'h';
				} else if (button[i][j].getIcon() == soldier2) {
					// Soldier
					txt += 'S';
				} else if (button[i][j].getIcon() == tank2) {
					// Tank
					txt += 'T';
				} else if (button[i][j].getIcon() == airplane2) {
					// Airplane
					txt += 'A';
				} else if (button[i][j].getIcon() == rocket2) {
					// Rocket
					txt += 'R';
				} else if (button[i][j].getIcon() == hq2) {
					// Head
					txt += 'H';
				}
			}
		return txt;
	}

	public SaveProgress(JButton button[][], Icon soldier1, Icon tank1, Icon airplane1, Icon rocket1,
			Icon hq1, Icon soldier2, Icon tank2, Icon airplane2, Icon rocket2, Icon hq2) {
		try (FileWriter progress = new FileWriter(PROGRESS.getDirection());) {
			progress.write(getPosition(button, soldier1, tank1, airplane1, rocket1, hq1, soldier2, tank2, airplane2,
					rocket2, hq2));
		} catch (IOException e) {
		}
	}

}