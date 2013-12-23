package uj.edu.pl.gui.actionlisteners;

import java.awt.event.ActionEvent;

import uj.edu.pl.gui.MainFrame;
import uj.edu.pl.gui.state.threads.MonitorSOG;

public class ActionLmpgOutput extends AbstractListenerClass{

	public ActionLmpgOutput(MainFrame mF, MonitorSOG mSOG) {
		super(mF, mSOG);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		super.sOG.setGifOutputRadio(false);
		super.sOG.setBmpOutputRadio(false);
		super.sOG.setJpgOutputRadio(false);
		super.sOG.setAviOutputRadio(false);
		super.sOG.setMpgOutputRadio(true);
		
		super.sOG.setoImageFormat(null);
		super.sOG.setoVideoFormat("mpg");
		
		
		mSOG.write();
	}

}
