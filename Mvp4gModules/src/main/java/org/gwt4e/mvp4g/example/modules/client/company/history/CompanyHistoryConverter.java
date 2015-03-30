package org.gwt4e.mvp4g.example.modules.client.company.history;

import com.mvp4g.client.annotation.History;
import com.mvp4g.client.history.HistoryConverter;
import org.gwt4e.mvp4g.example.modules.client.company.CompanyEventBus;
import org.gwt4e.mvp4g.example.modules.client.company.bean.CompanyBean;

@History
public class CompanyHistoryConverter implements HistoryConverter<CompanyEventBus> {

	public void convertFromToken( String eventType, String param, CompanyEventBus eventBus ) {
		String[] paramTab = param.split( "&" );
		CompanyBean company = new CompanyBean();
		company.setId( Integer.parseInt( paramTab[0].split( "=" )[1] ) );
		company.setName( paramTab[1].split( "=" )[1] );
		eventBus.goToDisplay( company );
	}

	public String onGoToDisplay( CompanyBean company ) {
		return convertCompanyToToken( company );
	}

	private String convertCompanyToToken( CompanyBean company ) {
		return "id=" + company.getId() + "&name=" + company.getName();
	}

	public boolean isCrawlable() {
		return true;
	}

}
