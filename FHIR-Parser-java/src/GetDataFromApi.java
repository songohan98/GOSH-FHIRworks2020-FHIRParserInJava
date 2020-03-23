import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class GetDataFromApi {
    protected static StringBuilder getDataFromApi(String link) {

        URL url;
        InputStream is = null;
        BufferedReader br;
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            url = new URL(link);
            is = url.openStream();  // throws an IOException
            br = new BufferedReader(new InputStreamReader(is));

            while ((line = br.readLine()) != null) {
                stringBuilder.append(line);
            }
            return stringBuilder;
        } catch (MalformedURLException mue) {
            mue.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (is != null) is.close();
            } catch (IOException ioe) {

            }
            return stringBuilder;
        }

    }
}
