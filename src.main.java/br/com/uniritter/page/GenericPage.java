package br.com.uniritter.page;

import br.com.uniritter.common.TestCaseCommon;

public class GenericPage {

	String title;
	
	public GenericPage() {
		
		title = TestCaseCommon.getDriver().getTitle();
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
