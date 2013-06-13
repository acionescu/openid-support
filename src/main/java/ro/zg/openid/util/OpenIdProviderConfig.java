package ro.zg.openid.util;

public class OpenIdProviderConfig {
    private String endPointUrl;
    private String loginServiceUri;
    
    /**
     * @return the endPointUrl
     */
    public String getEndPointUrl() {
        return endPointUrl;
    }
    /**
     * @return the loginServiceUri
     */
    public String getLoginServiceUri() {
        return loginServiceUri;
    }
    /**
     * @param endPointUrl the endPointUrl to set
     */
    public void setEndPointUrl(String endPointUrl) {
        this.endPointUrl = endPointUrl;
    }
    /**
     * @param loginServiceUri the loginServiceUri to set
     */
    public void setLoginServiceUri(String loginServiceUri) {
        this.loginServiceUri = loginServiceUri;
    }
}
