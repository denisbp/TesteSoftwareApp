package br.com.uniritter.testcase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.uniritter.common.TestCaseCommon;
import br.com.uniritter.page.TrelloBoardsPage;
import br.com.uniritter.page.TrelloLoginPage;

public class TestCase01Full extends TestCaseTrello {
	//private String baseUrl;

	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		TestCaseCommon.getDriver().get(TestCaseCommon.URL_TRELLO + "/");
	}

	@After
	public void tearDown() throws Exception {
		TestCaseCommon.getDriver().quit();

		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}

	}

	@Test
	public void testCreateBoard() throws Exception {
		// Login
		TrelloLoginPage loginPage = new TrelloLoginPage();
		loginPage.login();

		// Create new Board
		TrelloBoardsPage boardsPage = new TrelloBoardsPage();
		boardsPage.createNewBoard("Teste de Software " + TestCaseCommon.getTimestamp());
		//assertEquals(boardsPage.getNewTitleElement().get, "");
	}

	@Test
	public void testStandardActivities() throws Exception {
		// Login
		TrelloLoginPage loginPage = new TrelloLoginPage();
		assertEquals("Log in to Trello", loginPage.getTitle());
		loginPage.login();

		// Create new Board
		TrelloBoardsPage boardsPage = new TrelloBoardsPage();
		boardsPage.getButtonNewBoard().click();
		TestCaseCommon.getDriver().findElement(By.id("boardNewTitle")).clear();
		TestCaseCommon.getDriver().findElement(By.id("boardNewTitle")).sendKeys("Teste de Software " + TestCaseCommon.getTimestamp());
		TestCaseCommon.getDriver().findElement(By.xpath("//input[@value='Create']")).click();

		// Create Lists
		// TestCaseCommon.getDriver().get(baseUrl +
		// "/b/7fAwPVeV/teste-de-software");
		TestCaseCommon.getDriver().findElement(By.cssSelector("span.placeholder.js-open-add-list")).click();
		TestCaseCommon.getDriver().findElement(By.name("name")).clear();
		TestCaseCommon.getDriver().findElement(By.name("name")).sendKeys("Test List");
		TestCaseCommon.getDriver().findElement(By.xpath("//input[@value='Save']")).click();
		TestCaseCommon.getDriver().findElement(By.name("name")).clear();
		TestCaseCommon.getDriver().findElement(By.name("name")).sendKeys("Activity List");
		TestCaseCommon.getDriver().findElement(By.xpath("//input[@value='Save']")).click();
		TestCaseCommon.getDriver().findElement(By.name("name")).clear();
		TestCaseCommon.getDriver().findElement(By.name("name")).sendKeys("Personal List");
		TestCaseCommon.getDriver().findElement(By.xpath("//input[@value='Save']")).click();

		// Create Cards
		// TestCaseCommon.getDriver().get(baseUrl +
		// "/b/7fAwPVeV/teste-de-software");
		TestCaseCommon.getDriver().findElement(By.linkText("Add a card…")).click();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).clear();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).sendKeys("Test Activity 1");
		TestCaseCommon.getDriver().findElement(By.xpath("//input[@value='Add']")).click();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).clear();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).sendKeys("Test Activity 2");
		TestCaseCommon.getDriver().findElement(By.xpath("//input[@value='Add']")).click();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).clear();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).sendKeys("Test Activity 3");
		TestCaseCommon.getDriver().findElement(By.xpath("//input[@value='Add']")).click();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).clear();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).sendKeys("Test Activity 4");
		TestCaseCommon.getDriver().findElement(By.xpath("//input[@value='Add']")).click();
		TestCaseCommon.getDriver().findElement(By.xpath("(//a[contains(text(),'Add a card…')])[2]")).click();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).clear();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).sendKeys("Task 1");
		TestCaseCommon.getDriver().findElement(By.xpath("//input[@value='Add']")).click();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).clear();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).sendKeys("Task 2");
		TestCaseCommon.getDriver().findElement(By.xpath("//input[@value='Add']")).click();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).clear();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).sendKeys("Task 3");
		TestCaseCommon.getDriver().findElement(By.xpath("//input[@value='Add']")).click();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).clear();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).sendKeys("Task 4");
		TestCaseCommon.getDriver().findElement(By.xpath("//input[@value='Add']")).click();
		TestCaseCommon.getDriver().findElement(By.xpath("(//a[contains(text(),'Add a card…')])[3]")).click();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).clear();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).sendKeys("Personal Item 1");
		TestCaseCommon.getDriver().findElement(By.xpath("//input[@value='Add']")).click();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).clear();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).sendKeys("Personal Item 2");
		TestCaseCommon.getDriver().findElement(By.xpath("//input[@value='Add']")).click();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).clear();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).sendKeys("Personal Item 3");
		TestCaseCommon.getDriver().findElement(By.xpath("//input[@value='Add']")).click();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).clear();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).sendKeys("Personal Item 4");
		TestCaseCommon.getDriver().findElement(By.xpath("//input[@value='Add']")).click();
		TestCaseCommon.getDriver().findElement(By.xpath("//div[@id='board']/div[2]")).click();

		// Edit Activity Titles
		// TestCaseCommon.getDriver().get(baseUrl +
		// "/b/7fAwPVeV/teste-de-software");
		TestCaseCommon.getDriver().findElement(By.xpath("//div[@id='board']/div/div/div[2]/div[2]/span")).click();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-edit-title.js-edit-card-title")).clear();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-edit-title.js-edit-card-title")).sendKeys("Customized Test Activity");
		TestCaseCommon.getDriver().findElement(By.xpath("(//input[@value='Save'])[2]")).click();
		TestCaseCommon.getDriver().findElement(By.xpath("//div[@id='board']/div[2]/div/div[2]/div[3]/span")).click();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-edit-title.js-edit-card-title")).clear();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-edit-title.js-edit-card-title")).sendKeys("Customized Task");
		TestCaseCommon.getDriver().findElement(By.xpath("(//input[@value='Save'])[2]")).click();
		TestCaseCommon.getDriver().findElement(By.xpath("//div[@id='board']/div[3]/div/div[2]/div[4]/span")).click();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-edit-title.js-edit-card-title")).clear();
		TestCaseCommon.getDriver().findElement(By.cssSelector("textarea.list-card-edit-title.js-edit-card-title")).sendKeys("Customized Personal Item");
		TestCaseCommon.getDriver().findElement(By.xpath("(//input[@value='Save'])[2]")).click();

		// Archive Tasks
		// TestCaseCommon.getDriver().get(baseUrl +
		// "/b/7fAwPVeV/teste-de-software");
		TestCaseCommon.getDriver().findElement(By.xpath("//div[@id='board']/div/div/div[2]/div[2]/span")).click();
		TestCaseCommon.getDriver().findElement(By.cssSelector("a.quick-card-editor-buttons-item.js-archive > span.quick-card-editor-buttons-item-text"))
				.click();
		TestCaseCommon.getDriver().findElement(By.xpath("//div[@id='board']/div[2]/div/div[2]/div[3]/span")).click();
		TestCaseCommon.getDriver().findElement(By.cssSelector("a.quick-card-editor-buttons-item.js-archive > span.quick-card-editor-buttons-item-text"))
				.click();
		TestCaseCommon.getDriver().findElement(By.xpath("//div[@id='board']/div[3]/div/div[2]/div[4]/span")).click();
		TestCaseCommon.getDriver().findElement(By.cssSelector("a.quick-card-editor-buttons-item.js-archive > span.quick-card-editor-buttons-item-text"))
				.click();

		// Archive Lists
		// TestCaseCommon.getDriver().get(baseUrl +
		// "/b/7fAwPVeV/teste-de-software");
		TestCaseCommon.getDriver().findElement(By.xpath("//div[@id='board']/div[3]/div/div/a")).click();
		TestCaseCommon.getDriver().findElement(By.linkText("Archive This List")).click();
	}

}
