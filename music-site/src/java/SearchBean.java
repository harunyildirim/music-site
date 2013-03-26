
import java.io.Serializable;
import javax.faces.bean.ManagedBean;


@ManagedBean
public class SearchBean implements Serializable{
    
    private String query;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
    
    //Bu fonksiyon daha sonra yazılıacaktır.
    public void queryResults()
    {
        
    }
    
}
