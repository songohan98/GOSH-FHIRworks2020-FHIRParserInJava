import org.json.JSONException;

public class Parser {

    public static void main(String[] args) throws JSONException{

        SSLHandShake ssl = new SSLHandShake();
        ssl.sslHandShakeFix();

        String link = "https://localhost:5001/api/Patient/";
        GetDataFromApi ap = new GetDataFromApi();
        StringBuilder data = ap.getDataFromApi(link);

        SaveFile sv = new SaveFile();
        sv.savefile("file.json",data);

        GetMethods get = new GetMethods(data.toString());
        get.getAllPatientDetails();

    }
}