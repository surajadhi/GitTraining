package resources;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Baselibrary extends Log {
	
	//private static final By By = null;
	public static WebDriver driver;
	public static Properties prop = new Properties();
	
	
	/**
	 * This method is used to 
	 * @param 
	 * @param 
	 * @throws Exception
	 */	
	
	public  void readSendKeysData() throws IOException{
		
		File file = new File("D:\\eclipse-workspace\\Orangehrm_E2E_Test\\Data.properties");
		  
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 //
		
		//load properties file
		try {
			prop.load(fileInput);
		} catch (IOException I) {
			log.error("exception found" +I);
			I.printStackTrace();
		}
//		driver.findElement(By.id("txtUsername")).sendKeys(prop.getProperty("Login"));
		 
	}
	
	
public  WebDriver initializeDriver() throws IOException {
	readSendKeysData(); 
	String browsername=prop.getProperty("browser");
	System.out.println(browsername);
	
	if (browsername.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", prop.getProperty("ChromePath"));
		 driver = new ChromeDriver();
		
	}else if (browsername.equals("firefox")) {
		
		 driver = new FirefoxDriver();
	}else if (browsername.equals("IE")) {
		
		System.setProperty("webdriver.IE.driver", prop.getProperty("IEPath"));
		 driver = new InternetExplorerDriver();
	}else if (browsername.isEmpty()) {
		System.setProperty("webdriver.chrome.driver", prop.getProperty("ChromePath"));
		 driver = new ChromeDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
}

/**
 * This method is used to take screenshot
 * 
 * @param result
 * @throws Exception
 */
	public void getScreenshot(String result) throws IOException {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(prop.getProperty("ScreenshotPath")+result + timestamp()+"Screenshot.png"));
	}
	
	public String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
}
	/**
	 * Common method for all the locator
	 * @param webElement
	 * @throws Exception
	 */	
	public static  WebElement webElement(By webElement){
		
			return driver.findElement(webElement);
	}
	
	
	/**
	 * This method is used to verify the whether field is displayed and enabled
	 * @param element
	 * @param sText
	 * @throws Exception
	 */	
	
	public static void verifywebElement(WebElement element,String sText){
		try{
		if (!element.isDisplayed() && !element.isEnabled() ){
				log.error(sText+" is not displayed  or not enabled");
				
				
		}
		} catch (Exception e){
			log.error("Exception occurred" +e);
			e.printStackTrace();
		}
		
	}
/**
 * This method is used for clicking the webelement
 * @param element
 * @param sText
 * @throws Exception
 */	
public void clickWebElement(WebElement element,String sText){	
		verifywebElement(element,sText);
		try {
		element.click();
		
		}catch(Exception e){
			log.error(sText + " is not Clicked successfully");
			e.printStackTrace();
		}
		
	}
	

/**
 * This method is used for entering the text in the fields
 * @param element
 * @param sText
 * @throws Exception
 */	
	public void enteredText(WebElement element, String sText,String sKeys){
		verifywebElement(element,sText);
		
		try {
		element.sendKeys(sKeys);
		}catch (Exception e){
			log.error("Field is not available");
			e.printStackTrace();
		}
	}
//*****This method is used for verifying the header of the page
/**
 * This method is used for entering the text in the fields
 * @param oElement
 * @param Req
 * @throws Exception
 */	
		public static void verifyTitleActtoExp(WebElement oElement, String Req){
			String Act=oElement.getText();
			System.out.println("Actual Page header:"+Act);
			try{
			if (Act.equals(Req)){
				log.info("Actual and Expected page header are matched");
				System.out.println("Text is matched");
			}else{
				log.error("Actual and Expected page header are not matched");
				
			}
			} catch (Exception e){
				log.error("Exception occurred");
				e.printStackTrace();
			}	
		}

		/**
		 * This method is used for uploading the file in browse window
		 * @param oElement
		 * @param Req
		 * @throws Exception
		 */	
		public static void BrowseButtonToOpenMyComputerWindow(String id,String Folderpath) throws InterruptedException, AWTException{
			try {
			driver.findElement(By.id(id)).click();
			Thread.sleep(5000);
			StringSelection SS=new StringSelection(Folderpath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(SS, null);
			
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			
			robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(7000);
			}catch (Exception e){
				log.error("Unable to Open My Computer Window");
				e.printStackTrace();
			}
			
		}
		
		/**
		 * This method is used for checkbox verification
		 * @param oElement
		 * @param sText
		 * @throws Exception
		 */	
		

		public static void checkboxSelection(WebElement oElement,String sText){
			try{
			verifywebElement(oElement,sText);
			if(!oElement.isSelected()){
				oElement.click();
			}
			}
			catch (Exception e){
				log.error("Checkbox is not found");
				e.printStackTrace();
			}
		}
		
		/**
		 * This method is used for radiobutton verification
		 * @param oElement
		 * @param sText
		 * @throws Exception
		 */	
		public static void radiobuttonSelection(WebElement oElement,String sText){
			try{
			verifywebElement(oElement,sText);
			if(!oElement.isSelected()){
				oElement.click();
		        
			}
		
			}
			catch (Exception e){
				log.error("Checkbox is not found");
				e.printStackTrace();
			}
		}
		
		
		/**
		 * This method is used for drop down value selection
		 * @param webElement
		 * @param sType
		 * @param i
		 * @throws Exception
		 */	
		
		public void selectdropdownvalue(WebElement webElement,String sType,String sVal){
			try{
				Select listbox=new Select(webElement);
				switch (sType){
				 case "selectByValue":
				 listbox.selectByValue(sVal);
				 break;
				 
					 
				 case "selectByVisibleText":
					 listbox.selectByVisibleText(sVal);
					 break;	 
					 
				 case "selectByIndex":
				 listbox.selectByIndex(Integer.parseInt(sVal));
				 break;
					 
				}
			
				
			}catch (Exception e){
				log.error("Exception occurred");
				e.printStackTrace();
			}

			
		}
	
		/**
		 * This method is used for drop down value selection
		 * @param locator
		 * @param timeout
		 * @throws Exception
		 */	
	public static void clickWhenReady(By locator, int timeout) {
	 
	WebElement element = null;
	 
	WebDriverWait wait = new WebDriverWait(driver, timeout);
	
	//Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);	 
	element = wait.until(ExpectedConditions.elementToBeClickable(locator));
	 
	element.click();
	 
	 }
	 //*****This method is used for verifying the Webtableclass like Results table
	public String webtableclass(WebElement oElement1, WebElement oElement2, String strText,WebElement oElement3)
    {
    	try{
    	WebElement Table = oElement1;
        int Row_count =  Table.findElements(By.tagName("tr")).size();
        Log.info("Number Of Rows = "+Row_count);
           @SuppressWarnings("unused")  
           int j=0;
           
           @SuppressWarnings("unused")
         Boolean F= false;  
            for (int i=1;i<=Row_count;i++)
           {
            	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            	log.info(i);
            	
            	 Log.info(oElement2.getText());
            	
             if( oElement2.getText().equals(strText))
             {
            	 Log.info(strText+ " is available in the grid");
              j=i;
             
              F = true;
              break;
             
              
             }
            
            
            }
            WebElement checkbox = oElement3; 
            checkbox.click();
            
            if ( F = false  ){
            	Log.error("Required record is deleted/not available in the table grid");
             	       
    	}   
           
            
            if ( F = false  ){
            	System.out.println("Required record is deleted/not available in the table grid");
             	
             }
             
    	}    
            catch(Exception e){
        	Log.error("Required table is not identified");
        	e.printStackTrace();
     	}
    	return strText;
    		
    }
	  //*****For clicking the delete button in the dialog box    
    public void deletebuttonClick(WebElement oElement,String ButtonName){
    	
    	try{
    	oElement.click();
    	Log.info(ButtonName+" Is clicked successfully");
    	}catch(Exception e){
    		Log.error(ButtonName+"Is not clicked successfully");
    		e.printStackTrace();
    	}
    	
    }

	
	//*****For verifying that there are no records in the grid
    public static void  noRecordsInGrid(WebElement oElement){
    	try{
    	WebElement NoRecords= oElement;
		     if(NoRecords.getText().contains("No Records Found"))
	     {
	      Log.info("TestPassed: Deleted record is not displayed in resultant grid");
	     }
	     else
	     {
	      Log.error("Test Failed: Deleted record is not displayed in resultant grid");
	    }
	    
    } catch (Exception e){
		Log.error("Exception occurred");
		e.printStackTrace();
	}

    }
 
		
    
	
	

}