package br.com.uniritter.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.uniritter.common.TestCaseCommon;

public class TrelloBoardsPage  extends GenericPage{
	private WebElement buttonNewBoard;
	
	public WebElement getButtonNewBoard() {
		return buttonNewBoard;
	}

	public void setButtonNewBoard(WebElement buttonNewBoard) {
		this.buttonNewBoard = buttonNewBoard;
	}

	public TrelloBoardsPage() {
		buttonNewBoard = TestCaseCommon.getDriver().findElement(By.cssSelector("a.board-tile.mod-add > span"));
	}
	
	
}
