package springbymyself.resource.re;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlResource implements Resource {
    private String url;

    public UrlResource(String url) {
        this.url = url;
    }


    @Override
    public InputStream getInputstream() throws Exception {
        URL resource = this.getClass().getClassLoader().getResource(url);
        URLConnection urlConnection = resource.openConnection();
        urlConnection.connect();
        return urlConnection.getInputStream();
    }
}
