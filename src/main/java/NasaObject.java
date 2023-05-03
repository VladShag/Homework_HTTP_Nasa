import com.fasterxml.jackson.annotation.JsonProperty;

public class NasaObject {
    private final String copyright;
    private final String date;
    private final String explanation;
    private final String mediaType;
    private final String serviceVersion;
    private final String title;
    private final String url;
    private final String hdurl;

    public NasaObject(@JsonProperty("copyright") String copyright,
                      @JsonProperty("date") String date,
                      @JsonProperty("explanation") String explanation,
                      @JsonProperty("media_type") String mediaType,
                      @JsonProperty("service_version") String serviceVersion,
                      @JsonProperty("title") String title,
                      @JsonProperty("url") String url,
                      @JsonProperty("hdurl") String hdurl) {
        this.copyright = copyright;
        this.date = date;
        this.explanation = explanation;
        this.mediaType = mediaType;
        this.serviceVersion = serviceVersion;
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
        return mediaType;
    }

    public String getService_version() {
        return serviceVersion;
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
