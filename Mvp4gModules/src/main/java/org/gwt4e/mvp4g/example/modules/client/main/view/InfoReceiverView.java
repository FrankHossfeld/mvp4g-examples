package org.gwt4e.mvp4g.example.modules.client.main.view;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.DecoratedPopupPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import org.gwt4e.mvp4g.example.modules.client.main.presenter.InfoReceiverPresenter;

public class InfoReceiverView extends DecoratedPopupPanel implements InfoReceiverPresenter.IInfoReceiverView {

	private static int position = 0;

	private Anchor close = new Anchor( "Close" );

	private Label info = new Label();

	public InfoReceiverView() {
		FlowPanel fp = new FlowPanel();
		fp.add( close );
		fp.add( info );
		setWidget( fp );
		setPopupPosition( position, position );
		position += 20;
	}

	@Override
	public void setInfo( String[] info ) {
		StringBuilder builder = new StringBuilder( info.length * 20 );
		builder.append( "Info: " );
		for ( String s : info ) {
			builder.append( s ).append( "," );
		}
		this.info.setText( builder.toString() );
	}

	@Override
	public HasClickHandlers getClose() {
		return close;
	}

}
