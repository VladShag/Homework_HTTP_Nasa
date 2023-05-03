import com.fasterxml.jackson.annotation.JsonProperty;

public class NasaObject {
    private final String copyright;
    private final String date;
    private final String explanation;
    private final String media_type;
    private final String service_version;
    private final String title;
    private final String url;
    private final String hdurl;

    public NasaObject(@JsonProperty("copyright") String copyright,
                      @JsonProperty("date") String date,
                      @JsonProperty("explanation") String explanation,
                      @JsonProperty("media_type") String media_type,
                      @JsonProperty("service_version") String service_version,
                      @JsonProperty("title") String title,
                      @JsonProperty("url") String url,
                      @JsonProperty("hdurl") String hdurl) {
        this.copyright = copyright;
        this.date = date;
        this.explanation = explanation;
        this.media_type = media_type;
        this.service_version = service_version;
        this.title = title;
        this.url = url;
        this.hdurl = hdurl;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getDate() {
        return date;
    }

    public String getExplanation() {
        return explanation;
    }

    public String getMedia_type() {
        return media_type;
    }

    public String getService_version() {
        return service_version;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }
    public String getHdurl() {
        return hdurl;
    }
}
