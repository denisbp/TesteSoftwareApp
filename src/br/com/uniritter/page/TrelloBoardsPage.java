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
		newTitleElement = TestCaseCommon.getDriver().findElement(By.id("boardNewTitle"));
		buttonCreate = TestCaseCommon.getDriver().findElement(By.xpath("//input[@value='Create']"));
	}
	
	public void createNewBoard(String boardName){
		this.buttonNewBoard.click();
		this.newTitleElement.clear();
		this.newTitleElement.sendKeys("Teste de Software " + TestCaseCommon.getTimestamp());
		this.buttonCreate.click();
	}
	
	public WebElement getButtonCreate() {
		return buttonCreate;
	}

	public void setButtonCreate(WebElement buttonCreate) {
		this.buttonCreate = buttonCreate;
	}

	public WebElement getButtonNewBoard() {
		return buttonNewBoard;
	}

	public void setButtonNewBoard(WebElement buttonNewBoard) {
		this.buttonNewBoard = buttonNewBoard;
	}

	public WebElement getNewTitleElement() {
		return newTitleElement;
	}

	public void setNewTitleElement(WebElement newTitleElement) {
		this.newTitleElement = newTitleElement;
	}

	
	
}
