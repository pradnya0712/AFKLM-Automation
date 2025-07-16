package testCases;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

import utilities.readExcelData;

public class demo {
	 public static void main(String[] args) {
	        int[] numbers = {
	            13258206, 52727673, 52727673, 8947573, 51764705, 99979235, 24823503,
	            9008053, 9008053, 13263692, 13263692, 13279151, 13279151, 13279162,
	            13279162, 13315551, 13315551, 13316866, 13318443, 5528191, 52892394,
	            52892394, 73369251, 73369251, 13333331, 52695893, 52695893, 13342766,
	            9183230, 73371642, 9060074, 9060074, 13292860, 13297863, 70397666,
	            45722994, 53494103, 13382246, 13382246, 13383650, 63442665, 93092812,
	            93092812, 9547871, 63656515, 52625694, 52625705, 53416716, 53416720,
	            53417556
	        };

	        long sum = 0;
	        for (int num : numbers) {
	            sum += num;
	        }

	        System.out.println("Total sum: " + sum);
	    }
}



