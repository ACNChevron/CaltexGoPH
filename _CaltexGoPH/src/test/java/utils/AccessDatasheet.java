package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.xssf.usermodel.*;
import java.util.HashMap;

public class AccessDatasheet {

	public HashMap<String, String> ReadGlobalTestData (String ExcelFileName) throws IOException {
		System.out.println("AccessDatasheet > ReadGlobalTestData() was invoked.");
		
		String excelFilePath = ".\\src\\test\\resources\\Global Datasheets\\"+ExcelFileName+".xlsx";
		System.out.println("Excel File Path '"+excelFilePath+"' was stored.");
		
		return ReadTestData(excelFilePath, "Sheet1");
		
	}
	public HashMap<String, String> ReadLocalTestData (String scenarioName, String sheetName) throws IOException {			    
		System.out.println("AccessDatasheet > ReadTestData() was invoked.");
		
		String excelFilePath = ".\\src\\test\\resources\\Local Datasheets\\"+scenarioName+".xlsx";
		System.out.println("Excel File Path '"+excelFilePath+"' was stored.");

		return ReadTestData(excelFilePath, sheetName);	
	}
	
	public void WriteTestData(String ScenarioName, String DataName, String DataValue) throws IOException {
		System.out.println("AccessDatasheet > WriteTestData() was invoked.");
		
		String excelfilePath = ".\\src\\test\\resources\\Datasheets\\"+ScenarioName+".xlsx";
		System.out.println("Excel File Path '"+excelfilePath+"' was stored.");
		
		FileInputStream inputstream = new FileInputStream(excelfilePath);
		System.out.println("FileInputStream was stored.");
		
		XSSFWorkbook workbook = new XSSFWorkbook (inputstream);
		System.out.println("Workbook was stored.");
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		System.out.println("Sheet was stored.");
		
		int cols = sheet.getRow(0).getLastCellNum();
		System.out.println("Number of columns '"+cols+"' was stored.");
		
		XSSFRow rowHeader = sheet.getRow(0);
		System.out.println("Row Header was stored.");
		
		for(int c=0;c<cols;c++) {
			if(rowHeader.getCell(c).getStringCellValue().equals(DataName)) {
				XSSFRow row = sheet.getRow(1);
				XSSFCell cell = row.getCell(c);
				cell.setCellValue(DataValue);
				System.out.println("Cell value '"+DataValue+"' was set.");
			}
		}
		
		workbook.setForceFormulaRecalculation(true);
		System.out.println("Set Force Formula Recalcuation was set to True.");		
		
		FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
		System.out.println("Formula Evaludator was stored.");
		
		evaluator.evaluateAll();
		System.out.println("Evaluate All was invoked.");
		
		evaluator.clearAllCachedResultValues();
		System.out.println("Clear All Cached Result Values was invoked.");
		
		FileOutputStream fos = new FileOutputStream(excelfilePath);
		System.out.println("File Output Stream was stored.");
		
		workbook.write(fos);
		System.out.println("Workbook.write was invoked.");
		
        fos.close();
        System.out.println("File Output Stream was closed.");
        
        fos.flush();
        System.out.println("File Output Stream was flushed.");
        
        fos.close();
        System.out.println("File Output Stream was closed.");

		workbook.close();
		System.out.println("Workbook was closed.");
	}
	
	private HashMap<String, String> ReadTestData (String excelFilePath, String sheetName) throws IOException {
		FileInputStream inputstream = new FileInputStream(excelFilePath);
		System.out.println("FileInputStream was stored.");
		
		XSSFWorkbook workbook = new XSSFWorkbook (inputstream);
		System.out.println("Workbook was stored.");
		
		XSSFSheet sheet = workbook.getSheet(sheetName);
		System.out.println("Sheet was stored.");
		
		HashMap<String, String> testData = new HashMap<String, String>();
		System.out.println("Test Data HashMap was declared.");
		
		try {
			int cols = sheet.getRow(0).getLastCellNum();
			System.out.println("Number of columns '"+cols+"' was stored.");
			
			XSSFRow rowHeader = sheet.getRow(0);
			System.out.println("Row Header was stored.");
			
			workbook.setForceFormulaRecalculation(true);
			System.out.println("Set Force Formula Recalcuation was set to True.");
			
			FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
			System.out.println("Formula Evaludator was stored.");
			
			evaluator.evaluateAll();
			System.out.println("Evaluate All was invoked.");
			
			evaluator.clearAllCachedResultValues();
			System.out.println("Clear All Cached Result Values was invoked.");
			
			for(int c=0;c<cols;c++) {
				XSSFCell cellHeader = rowHeader.getCell(c);
				String currColumn = cellHeader.getStringCellValue();
				
				XSSFRow rowTestData = sheet.getRow(1);
				XSSFCell cellTestData = rowTestData.getCell(c);
				
				String currTestData = cellTestData.getStringCellValue();;
				
				testData.put(currColumn, currTestData);
				System.out.println("Test Data ("+currColumn+","+currTestData+") was stored.");
			}
		} catch (NullPointerException e) {
			System.out.println("NullPointException ("+e+") was encountered.");
		}

		workbook.close();
		System.out.println("Workbook was closed.");
		
		return testData;
	}
}
