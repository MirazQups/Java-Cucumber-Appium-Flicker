package core.utils.AndroidCore;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ssh {

    public static void executeScript() throws IOException {
        System.out.println("Checking 1");
        String []command ={"/bin/bash","-c", "ls"};
        Process exec = Runtime.getRuntime().exec(command,null,new
                File("/home/jenkins/localScripts/Backend_Pipeline/webservices_deployment/mock_bank_service_down.sh"));
        java.util.Scanner s = new java.util.Scanner(exec.getInputStream()).useDelimiter("\\A");
        System.out.println(s.next());
        System.out.println("Checking 2");
    }

    public static void executeBash(String filePath) {
        System.out.println("In execute Script");
        ProcessBuilder bashObj = new ProcessBuilder();
        bashObj.command(filePath);
        try {
            Process process = bashObj.start();
            StringBuilder output = new StringBuilder();
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
            }

            int exitVal = process.waitFor();
            if (exitVal == 0) {
                System.out.println("Success!");
                System.out.println(output);
            } else {
                //abnormal...
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Out execute Script");
    }

    public static void executeBash(String filePath, String date, String time) {
        System.out.println("In execute Script");
        ProcessBuilder bashObj = new ProcessBuilder();
        bashObj.command(filePath , date , time);

        try {

            Process process = bashObj.start();
            StringBuilder output = new StringBuilder();
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
            }

            int exitVal = process.waitFor();
            if (exitVal == 0) {
                System.out.println("Success!");
                System.out.println(output);
            } else {
                //abnormal...
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Out execute Script");
    }
}
