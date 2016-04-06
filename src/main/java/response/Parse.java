package response;
import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.BufferUnderflowException;

/**
 * Created by Vishwas on 5/4/16.
 * Copyright (C) 2015  Vishwas Tripathi
 */
public class Parse {
    private final static Logger logger = Logger.getLogger(Parse.class);
    public Parse(String html) {
        System.out.println(html);
        Document parse = Jsoup.parse(html);
        System.out.println("TEXT\n" + parse.select("body").text());

        logger.debug("title = " );
    }
    public static void main (String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String html = "";
        try {
            String s;
            while ((s = br.readLine())!=null){
                html = s;
            }
        }catch (Exception e) {

        }
        new Parse(html);
    }
}
