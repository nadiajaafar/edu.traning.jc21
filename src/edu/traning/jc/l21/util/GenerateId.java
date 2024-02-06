package edu.traning.jc.l21.util;

import java.io.*;

public final class GenerateId {

    private GenerateId() {}

    private static int nextId = 1;

    public static int nextId() throws IOException{
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream("resources/notes.txt"), "UTF-8");
             BufferedReader breader = new BufferedReader(reader)) {

            String line = null;

            while ((line = breader.readLine()) != null) {

                nextId++;
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return nextId;
    }

}
