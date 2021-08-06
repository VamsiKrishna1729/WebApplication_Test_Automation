import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String host="localhost";
		String port="3306";
		
		// by below way, we are connecting the java code to MySql database
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/demo","root","Admin");
		Statement s=con.createStatement();
		// give the required criteria below
		ResultSet rs=s.executeQuery("select * from Credentials where username='teja'");
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		
		while(rs.next())
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys(rs.getString("username"));
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys(rs.getString("username"));
		driver.findElement(By.cssSelector("input[id='Login']")).click();
		}
	}

}
