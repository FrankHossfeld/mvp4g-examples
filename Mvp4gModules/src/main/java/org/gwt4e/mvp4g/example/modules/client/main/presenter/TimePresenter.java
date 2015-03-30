package org.gwt4e.mvp4g.example.modules.client.main.presenter;

import java.util.Date;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import org.gwt4e.mvp4g.example.modules.client.main.MainEventBus;
import org.gwt4e.mvp4g.example.modules.client.main.StatusSplitter;
import org.gwt4e.mvp4g.example.modules.client.main.view.TimeView;
import org.gwt4e.mvp4g.example.modules.client.util.HasBeenThereHandler;

@Presenter( view = TimeView.class, async = StatusSplitter.class )
public class TimePresenter extends BasePresenter<TimePresenter.ITimeView, MainEventBus> implements HasBeenThereHandler {

	public interface ITimeView {

		void setTime(Date date);

	}

	public void bind() {
		// doesn't make sense to call this in the bind method but I'm just tested this method is correctly called.
		setTime();
	}

	public void onHasBeenThere() {
		setTime();
	}

	public void onBroadcastInfo( String[] info ) {
		setTime();
	}

	private void setTime() {
		view.setTime( new Date() );
	}

}
