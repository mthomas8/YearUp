import java.io.*;

public class FileIO
{

	public static void main(String[] args) 
	{
		try
		{
		String filePath = "C:\\User\\Brandon\\Text.txt";
		String iReadThis = Read(filePath);
		String originalWord = "dolor";
		String replacedWord = "hedon";
		String replacedString = Replace(iReadThis, originalWord, replacedWord);
		Write(replacedString, filePath);
		}
		catch (IOException ex1)
		{
			System.out.println("Something went wrong while reading or writing from the file!");
			ex1.printStackTrace();
		}
		catch (NullPointerException ex2)
		{
			System.out.println("You did not supply a valid supply path!");
		}
	}
	
	private static void Write(String replacedString, String filePath) throws IOException
	{
		FileWriter writer = null;
		try
		{	
			writer = new FileWriter(filePath);
			writer.write(replacedString);
		}
		finally
		{
			if(writer != null)
			{
				writer.close();
			}
		}
	}
	
	private static String Replace(String stringToBeReplaced, String orignalWord, String replaceWord) 
	{
		String replacedString = null;

		if(stringToBeReplaced != null)
		{
			replacedString = stringToBeReplaced.replace(orignalWord, replaceWord);
		}
		return replacedString;
	}
	
	public static String Read(String filePath) throws NullPointerException, IOException, FileNotFoundException
	{
		FileReader fileReader = null;
		String fullFile = null;
		BufferedReader bufferedReader = null;

		try
		{
			if (filePath == null)
			{
				throw new NullPointerException();
			}
			fileReader = new FileReader(filePath);
			bufferedReader = new BufferedReader(fileReader);
			StringBuilder builder = new StringBuilder();

			String iReadThis = bufferedReader.readLine();

			while(iReadThis != null)
			{
				builder.append(iReadThis);
				iReadThis = bufferedReader.readLine();
			}

			fullFile = builder.toString();
		}
		finally
		{
			if (fileReader != null)
			{
				fileReader.close();
			}
			if (bufferedReader != null)
			{
				bufferedReader.close();
			}
		}
		return fullFile;
	}
}
		
	
