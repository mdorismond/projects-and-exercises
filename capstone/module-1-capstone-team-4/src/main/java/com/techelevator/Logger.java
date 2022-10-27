package com.techelevator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;

public class Logger {
    private final String LOG_PATH = "Log.txt";
    private File logFile;

    public void createLogFile() {
        logFile = new File(LOG_PATH);

        if (logFile.exists()) {
            try (PrintWriter writer = new PrintWriter(logFile)) {
                //writer.println("******************************");
            } catch (IOException ex) {
                System.err.println("Error occurred. Unable to create new log file: " + logFile.getAbsolutePath());
            }
        } else {
            try {
                logFile.createNewFile();
            } catch (IOException ex) {
                System.err.println("Error occurred. Unable to create log file: " + logFile.getAbsolutePath());
            }
        }
    }

    public void writeToLog(String description, BigDecimal transactionAmount, BigDecimal transactionBalance) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        String logMessage = String.format("%tD %tr %-20s $%4.2f $%4.2f\n",date, time, description, transactionAmount, transactionBalance);

        try (PrintWriter writer = new PrintWriter(new FileWriter(logFile, true))) {
            writer.append(logMessage);
            writer.flush();
        } catch (IOException ex) {
            System.err.println("Error occurred. Unable to write to log file: " + logFile.getAbsolutePath());
        }
    }

    public void createSalesReport(Map<String, Integer> inventorySales, BigDecimal totalSales) {
        String salesReportName = createSalesReportName();
        File salesReport = new File(salesReportName);

        try (PrintWriter writer = new PrintWriter(salesReport)) {

            for (Map.Entry<String, Integer> item : inventorySales.entrySet()) {
                writer.print(String.format("%-20s | %d\n", item.getKey(), item.getValue()));
            }

            writer.println(String.format("**TOTAL SALES** $%4.2f", totalSales.doubleValue()));

        } catch (IOException ex) {
            System.err.println("Error occurred. Unable to create sales report: " + logFile.getAbsolutePath());
        }

        System.out.println("Sales Report created: " + salesReport.getAbsolutePath());
    }

    public String createSalesReportName() {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        String reportName = String.format("SalesReport_%tm_%td_%tY_%tI_%tM_%tS_%Tp.txt", date, date, date, time, time, time, time);
        return reportName;
    }
}
