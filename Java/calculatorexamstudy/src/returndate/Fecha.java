package returndate;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Fecha {
    SimpleDateFormat format;
    Date today;
    public Fecha(){
        today = new Date();
    }
    public String DevuelveFecha (int type){
        String chain = "";
        switch (type) {
            case 1: {
            format=new SimpleDateFormat ("yyyy/MM");
            chain = format.format(today);
            break;
            }
            case 2:{
            format = new SimpleDateFormat("MM/yyyy");
            chain = format.format(today);
            break;
            }
            case 3: {
                format = new SimpleDateFormat("MM/yy");
                chain = format.format(today);
                break;
            }
            default: {
                chain = "ERROR";
            }
        }
        return chain;
    }//
}
