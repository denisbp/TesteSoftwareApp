package br.com.uniritter.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.uniritter.common.TestCaseCommon;

public class TrelloBoardsPage  extends GenericPage{
	private WebElement buttonNewBoard;
	private WebElement newTitleElement;
	private WebElement buttonCreate;
	
	public TrelloBoardsPage() {
		buttonNewBoard = TestCaseCommon.getDriver().findElement(By.cssSelector("a.board-tile.mod-add > span"));
	}
	
	public void createNewBoard(String boardName){
		this.buttonNewBoard.click();
		this.getNewTitleElement().clear();
		this.getNewTitleElement().sendKeys("Teste de Software " + TestCaseCommon.getTimestamp());
		this.getButtonCreate().click();
	}
	
	/*
	 * Initialize the button at first call, once it depends on other elements actions
	 */
	public WebElement getButtonCreate() {		
		if (buttonCreate == null) buttonCreate = TestCaseCommon.getDriver().findElement(By.xpath("//input[@value='Create']"));
		
		return buttonCreate;
	}

	public WebElement getButtonNewBoard() {		
		return buttonNewBoard;
	}

	/*
	 * Initialize the button at first call, once it depends on other elements actions
	 */
	public WebElement getNewTitleElement() {
		if (newTitleElement == null) newTitleElement = TestCaseCommon.getDriver().findElement(By.id("boardNewTitle"));
		
		return newTitleElement;
	}
}
