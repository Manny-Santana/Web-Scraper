/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webscraper;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author ARES
 */
public class WebScraper {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        

        
         //URL to be crawled and scraped
      String url ="https://newhaven.craigslist.org/d/cars-trucks/search/cta";
        
      //get the html elements from the URL
        Document document;
      
        // may not connect to url if connection issues are present  
        document = Jsoup.connect(url).get(); 
        
        
        //Designates the title and price as desired objects to be retreived
        Elements results = document.select(".result-title.hdrlnk");
        Elements price = document.select(".result-price:contains($)");
        
      
        
        //iterate through each listing and print the title and price of each listing
            for(int i = 0; i < results.size(); i++){
                System.out.println("Car #" + i + ": " + results.get(i).text() + " Price: " + price.get(i).text());
              
            }
            
            
            /*
                TODO create an accumulator variable or place each listing in an 
                array or dictionary to easily be able to access the values in a 
                web program or calculate averages/min/max values for data processing
            */
//        
    }
    
}
