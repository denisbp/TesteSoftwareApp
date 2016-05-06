package br.com.uniritter.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.uniritter.common.TestCaseCommon;

public class TrelloListsPage extends GenericPage {

	private WebElement newListItem;
	private WebElement listNameElement;
	private WebElement buttonSave;
	
	public TrelloListsPage() {
		newListItem = TestCaseCommon.getDriver().findElement(By.cssSelector("span.placeholder.js-open-add-list"));
	}
	
	public WebElement getButtonSave() {
		if (buttonSave == null) buttonSave = TestCaseCommon.getDriver().findElement(By.xpath("//input[@value='Save']"));
		
		return buttonSave;
	}

	public void createList(String listName) {
		if (this.newListItem.isDisplayed()) {
			this.newListItem.click();
		}
		this.getListNameElement().clear();
		this.getListNameElement().sendKeys(listName);
		this.getButtonSave().click();
		
	}
	
	public WebElement getNewListItem() {
		return newListItem;
	}

	public WebElement getListNameElement() {
		if (listNameElement == null) listNameElement = TestCaseCommon.getDriver().findElement(By.name("name"));
		
		return listNameElement;
	}
}
