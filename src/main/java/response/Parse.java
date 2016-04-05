package response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Created by Vishwas on 5/4/16.
 * Copyright (C) 2015  Vishwas Tripathi
 */
public class Parse {
    public Parse(String html) {
        final Document parse = Jsoup.parse(html);


    }
}
