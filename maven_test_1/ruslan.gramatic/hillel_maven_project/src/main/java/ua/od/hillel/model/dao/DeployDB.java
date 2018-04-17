package ua.od.hillel.model.dao;

import ua.od.hillel.model.helpers.QueryHelper;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;

/**
 * Created by ruslangramatic on 4/14/18.
 */
public class DeployDB extends QueryHelper {
    protected void executeQuery(Statement statement) throws SQLException {

        statement.executeUpdate("drop database if exists card_battle_rts");
        statement.executeUpdate("create database card_battle_rts");
        statement.executeUpdate("use card_battle_rts");

        // statement.executeUpdate("create user 'sqluser'@'localhost' identified by 'sqlpassword'");
        // statement.executeUpdate("grant select,insert,update,delete on card_battle_rts.* TO 'sqluser'@'localhost'");
        // statement.executeUpdate("flush privileges");

        //Get file from resources folder
        ClassLoader classLoader = getClass().getClassLoader();
        //executeSqlFile(statement, new File(classLoader.getResource("db_deloy_scripts/01_CardBattleRTS.sql").getFile()));

        //load all sql files and run all sql scripts into them
        File folder = new File(classLoader.getResource("db_deloy_scripts").getFile());
        loadSqlFilesFromFolder(statement, folder);
    }

    private void loadSqlFilesFromFolder(Statement statement, final File folder) throws SQLException {
        for (final File file : folder.listFiles()) {
            if (file.isDirectory()) {
                loadSqlFilesFromFolder(statement, file);
            } else if (file.getName().endsWith(".sql")){
                executeSqlFile(statement, file);
            }
        }
    }

    private void executeSqlFile(Statement statement, File inputFile) throws SQLException {
        System.out.println("********Execute File: " + inputFile.getName() + " ********\n");
        String delimiter = ";"; // delimiter
        Scanner scanner; // create scanner
        try {
            scanner = new Scanner(inputFile).useDelimiter(delimiter);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
            return;
        }

        while(scanner.hasNext()) { // loop through the sql file statements
            String rawStatement = scanner.next().trim();
            if(rawStatement.length() > 0) {
                rawStatement += delimiter; // Get statement
                System.out.println("=======Execute Statement=======");
                System.out.println(rawStatement.trim());
                statement.execute(rawStatement);// Execute statement
                System.out.println("=======Execution Success!=======\n");
            }
        }
        scanner.close();
        System.out.println("********Execution of File: " + inputFile.getName() + " Success!********\n");
    }
}
