package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static	WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static JavascriptExecutor js;
	public static Select s;
	public static Alert A;


		public static void lanchchromebrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}	
		public static void lanchfirefox() {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
		}
		public static void launchurl(String url) {
			driver.get(url);		
		}
		public static void getpagetitle() {
			String title = driver.getTitle();
			System.out.println("page title "+title);	
		}
		public static void getcurrenturl() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println("current page url "+currentUrl);
		}
		public static void close() {
			driver.close();	
		}
		public static void quit() {
			driver.quit();
		}
		public static void passvalue(WebElement element,String value) {
			element.sendKeys(value);
			
		}
		public static void click(WebElement element) {
			element.click();	
		}
		public static void gettext(WebElement element) {
			String text = element.getText();
			System.out.println("print the existing text "+text);		
		}
		public static void getattribute(WebElement element,String value) {
			String attribute = element.getAttribute(value);
			System.out.println("get the corresponding text"+attribute);
		}
		public static void maxi() {
			driver.manage().window().maximize();
		}
		public static void mini() {
			driver.manage().window().minimize();
		}
		
		//WINDOWS HANDLING
		public static void switchwindow(String value) {
			driver.switchTo().window(value);
		}
		public static void getparentid() {
			String parentid = driver.getWindowHandle();
			System.out.println("parent id "+parentid);
		}
		public static void getallId(int window) {
			Set<String> AllIds = driver.getWindowHandles();
			List<String>l=new ArrayList();
			l.addAll(AllIds);
			String childId = l.get(window);
			System.out.println(childId);
		}
		
		//FRAMES
		public static void switchframe(String value) {
			driver.switchTo().frame(value);
		}
		public static void parentframe() {
			driver.switchTo().parentFrame();
		}
		public static void mainhtml() {
			driver.switchTo().defaultContent();
		}
		
		//navigation
		public static void urllaunch(WebElement element,String value) {
			driver.navigate().to(value);
		}
		public static void forward() {
			driver.navigate().forward();	
		}
		public static void back() {
			driver.navigate().back();
		}
		public static void refresh() {
			driver.navigate().refresh();
			}
		
		//ACTIONS
	    public static void move(WebElement element) {
		a=new Actions(driver);
		a.moveToElement(element).perform();
	}	
		public static void doubleclick(WebElement element) {
			a=new Actions(driver);
			a.doubleClick(element).perform();
		}	
		public static void rightclick(WebElement element) {
			a=new Actions(driver);
			a.contextClick(element).perform();
		}	
		public static void dragdrop(WebElement src ,WebElement des) {
			a=new Actions(driver);
			a.dragAndDrop(src, des).perform();		
		}
		
		//ROBOT
		public static void copy() throws AWTException {
			r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);	

		}
		public static void paste() throws AWTException {
			r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_CONTROL);
			
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_P);	
		}
		public static void selectall() throws AWTException {
			r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_A);
			
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_A);
		}
		public static void delete() throws AWTException {
			r=new Robot();
			r.keyPress(KeyEvent.VK_DELETE);
			r.keyRelease(KeyEvent.VK_DELETE);
		}
		
		//SCREENSHOT
		public static void takesnap(String filename) throws IOException {
			TakesScreenshot t = (TakesScreenshot)driver;
			File src = t.getScreenshotAs(OutputType.FILE);
			File desc = new File("C:\\Users\\DELL\\eclipse-workspace\\mavensample\\target\\"+filename+".png");
			FileUtils.copyFile(src, desc);
		}
		
		//JAVA SCRIPT EXECUTOR
		public static void jsclick(WebElement element) {
			js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", element);	
		}
		public static void jspassvalue(String value,WebElement element) {
			js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','"+value+"')", element);
		}
		public static void jsgettext(String value) {
			js=(JavascriptExecutor)driver;
			Object print = js.executeScript("arguments[0].getAttribute('value')");
			System.out.println(print);
		}
		public static void scrollup(WebElement element) {
			js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoview", element);
		}
		public static void scrolldown(WebElement element) {
			js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoview", element);
		}
		
		//DROPDOWN
		public static void selectbyvalue(WebElement element ,String value) {
			 s = new Select(element);
			 s.selectByValue(value);
		}
		public static void selectbyindex(WebElement element,int value) {
			 s = new Select(element);
			s.selectByIndex(value);
		}
		public static void selectbtvisibletext(WebElement element,String value) {
			 s = new Select(element);
			 s.selectByVisibleText(value);
		}
		public static void deselectbyvalue(WebElement element,String value) {
			 s = new Select(element);
			 s.deselectByValue(value);
		}
		public static void deselectbyindex(WebElement element,int index) {
			 s = new Select(element);
			s.deselectByIndex(index);
		}
		public static void deselectbtvisibletext(WebElement element,String text) {
			 s = new Select(element);
			 s.deselectByVisibleText(text);
		}
		public static void deselectall(WebElement element) {
			 s = new Select(element);
			 s.deselectAll();
		}
		
		public static void getoptions(WebElement element) {
			 s = new Select(element);
			 List<WebElement> options = s.getOptions();
			 for (int i = 0; i <options.size() ; i++) {
				 System.out.println(options.get(i).getText());
				}	
		}
		private void getselectedoptions(WebElement element) {
			 s = new Select(element);
			 List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (int i = 0; i < allSelectedOptions.size(); i++) {
				 System.out.println(allSelectedOptions.get(i).getText());
		}
		}
		private void firstselectedoption(WebElement element) {
			 s = new Select(element);
			 WebElement firstSelectedOption = s.getFirstSelectedOption();
			 System.out.println("first seleted option is"+firstSelectedOption.getText());
		}
		private void multiple(WebElement element) {
			 s = new Select(element);
			if (s.isMultiple()) {
				System.out.println("dropdown is multiple");
				} else {
					System.out.println("dropdown is single");
			}
		}
		
		//ALERT
		public static void switchtoalert() {
		driver.switchTo().alert();
		}
		public static void accept() {
		A =	driver.switchTo().alert();
		A.accept();	
		}
		public static void dismiss() {
			A =	driver.switchTo().alert();
			A.dismiss();
		}
		public static void entertextinalert(String value) {
			A =	driver.switchTo().alert();
			A.sendKeys(value);
		}
		public static void gettextinalert() {
			String text = A.getText();
			System.out.println(text);
		}
		
		//WAITS
		public static void implict(int duration) {
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(duration));
		}
		public static void webdriverwait(int duration) {
			WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(duration));
		}
		public static void tempwait(int duration) throws InterruptedException {
			Thread.sleep(duration);
		}
		//access the excel sheet
		public static void alldataexcel(String value, String value2) throws IOException {
			File f = new File(value);
			FileInputStream fin = new FileInputStream(f);
			Workbook book = new XSSFWorkbook(fin);
			Sheet s = book.getSheet(value2);
			for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
				Row r = s.getRow(i);
				for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
					Cell c = r.getCell(j);
					System.out.println(c);		
	}		}
			}
		public static void particulardataexcel(String value1,String value2,int row, int cell) throws IOException {
			File f = new File(value1);
			FileInputStream fin = new FileInputStream(f);
			Workbook book = new XSSFWorkbook(fin);
			Sheet s = book.getSheet(value2);
			Row r = s.getRow(row);
			Cell cells = r.getCell(cell);
			System.out.println(cells);
		}
		public static String exceldata(String file,String sheet,int row,int cell) throws IOException {
			File f = new File(file);
			FileInputStream fin = new FileInputStream(f);
			Workbook book = new XSSFWorkbook(fin);
			Sheet s = book.getSheet(sheet);
			Row r = s.getRow(row);
			Cell c = r.getCell(cell);
			int type = c.getCellType();
			String name ="";
			
			if (type==1) {
				 name = c.getStringCellValue();
				
				}
			else if (DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yy");
				 name = sim.format(d);
				
			}
			else {
				double d = c.getNumericCellValue();
				long l = (long)d;
				 name = String.valueOf(l);
				
			}
			return name;


		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//WEB TABLE
		public static void alldata(int t) {
			List<WebElement> alltable = driver.findElements(By.tagName("table"));
			WebElement table = alltable.get(t);
			List<WebElement> allrow = table.findElements(By.tagName("tr"));
			for (int i = 0; i < allrow.size(); i++) {
				WebElement row = allrow.get(i);
				List<WebElement> alldata = row.findElements(By.tagName("td"));
				for (int j = 0; j < alldata.size(); j++) {
					WebElement data = alldata.get(j);
					System.out.println(data.getText());
				}
					
				}
			}
		public static void alldatawithheading(int t) {
			List<WebElement> alltable = driver.findElements(By.tagName("table"));
			WebElement table = alltable.get(t);
			List<WebElement> allrow = table.findElements(By.tagName("tr"));
			for (int i = 0; i < allrow.size(); i++) {
				WebElement row = allrow.get(i);
				List<WebElement> allhead = row.findElements(By.tagName("th"));
				for (int j = 0; j < allhead.size(); j++) {
					WebElement heading = allhead.get(j);
					System.out.println(heading.getText());
					}
				List<WebElement> alldata = row.findElements(By.tagName("td"));
				for (int k = 0; k <alldata.size() ; k++) {
					WebElement data = alldata.get(k);
					System.out.println(data.getText());	
				}
				}
			}
		public static void particulardata(int t,int r,int d) {
			List<WebElement> alltable = driver.findElements(By.tagName("table"));
			WebElement table = alltable.get(t);
			List<WebElement> allrows = table.findElements(By.tagName("tr"));
			WebElement row = allrows.get(r);
			List<WebElement> alldata = row.findElements(By.tagName("td"));
			WebElement data = alldata.get(d);
			System.out.println(data.getText());

		}
		public static void odddata(int t) {
			List<WebElement> alltable = driver.findElements(By.tagName("table"));
			WebElement table = alltable.get(t);
			List<WebElement> allrows = table.findElements(By.tagName("tr"));
			for (int i = 0; i <allrows.size() ; i++) {
				if (i%2!=0) {
					WebElement row = allrows.get(i);
			List<WebElement> alldata = row.findElements(By.tagName("td"));		
					for (int j = 0; j <alldata.size(); j++) {
						if (j%2!=0) {
							WebElement data = alldata.get(j);
							System.out.println(data.getText());
						}	
					}
				}
			}
		}
		public static void evendata(int t) {
			List<WebElement> alltable = driver.findElements(By.tagName("table"));
			WebElement table = alltable.get(t);
			List<WebElement> allrows = table.findElements(By.tagName("tr"));
			for (int i = 0; i <allrows.size() ; i++) {
				if (i%2==0) {
					WebElement row = allrows.get(i);
			List<WebElement> alldata = row.findElements(By.tagName("td"));		
					for (int j = 0; j <alldata.size(); j++) {
						if (j%2==0) {
							WebElement data = alldata.get(j);
							System.out.println(data.getText());
						}	
					}
				}
			}
		}
			public static void middlerowdata(int t) {
				List<WebElement> alltable = driver.findElements(By.tagName("table"));
				WebElement table = alltable.get(t);
				List<WebElement> allrows = table.findElements(By.tagName("tr"));
				WebElement middlerow = allrows.get(allrows.size()/2);
				List<WebElement> alldata = middlerow.findElements(By.tagName("td"));
				WebElement middledata = alldata.get(alldata.size()/2);
				System.out.println(middledata.getText());
				}
			public static void lastrowdata(int t) {
				List<WebElement> alltable = driver.findElements(By.tagName("table"));
				WebElement table = alltable.get(t);
				List<WebElement> allrows = table.findElements(By.tagName("tr"));
				WebElement lastrow = allrows.get(allrows.size()-1);
				List<WebElement> alldata = lastrow.findElements(By.tagName("td"));
				WebElement lastdata = alldata.get(alldata.size()-1);
				System.out.println(lastdata.getText());
			}
	

}
