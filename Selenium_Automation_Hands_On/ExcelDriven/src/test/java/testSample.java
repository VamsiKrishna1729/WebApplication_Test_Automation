import java.io.IOException;
import java.util.ArrayList;

public class testSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	 dataDriven d=new dataDriven();
	 ArrayList data=d.getData("Add Profile");
	for(int i=0;i<4;i++)
	{
		System.out.println(data.get(i));
	}
		
	}

}
