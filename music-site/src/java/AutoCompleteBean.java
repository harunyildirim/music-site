
import java.util.ArrayList;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class AutoCompleteBean {
    private String txt1; 
    
    public List<String> complete(String query) {  
        List<String> results = new ArrayList<String>();  
          
        for (int i = 0; i < 10; i++) {  
            results.add(query + i);  
        }  
          
        return results;  
    }  

  
    public String getTxt1() {
        return txt1;
    }

   
    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }
    
}
