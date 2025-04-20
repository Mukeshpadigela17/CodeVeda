import java.io.*;
public class FileProcessor 
{
public static void main(String[] args) 
{
String inputFile="input.txt";
String outputFile="output.txt";
int lineCount=0;
int wordCount=0;
try 
{
BufferedReader reader=new BufferedReader(new FileReader(inputFile));
String line;
while((line=reader.readLine()) != null) 
{
lineCount++;
wordCount+=line.split("\\s+").length;
}
reader.close();
BufferedWriter writer=new BufferedWriter(new FileWriter(outputFile));
writer.write("Line Count:"+lineCount+"\n");
writer.write("Word Count:"+wordCount+"\n");
writer.close();
System.out.println("File processed successfully. Output written to"+outputFile);
} catch (FileNotFoundException e) {
System.out.println("Input file not found:"+inputFile);
} catch (IOException e) {
System.out.println("An error occurred while reading/writing the file.");
}
}
}
