package ro.zg.openid.util;

public class YahooOpenIdAttributesManager extends OpenIdProviderAttributesManager{

    public YahooOpenIdAttributesManager() {
	addAttribute(new OpenIdAttribute(OpenIdAttribute.EMAIL, "http://axschema.org/contact/email"));
    }

    
    
}
