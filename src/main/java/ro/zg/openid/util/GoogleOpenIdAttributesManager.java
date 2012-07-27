package ro.zg.openid.util;

public class GoogleOpenIdAttributesManager extends OpenIdProviderAttributesManager{
    
    public GoogleOpenIdAttributesManager(){
	addAttribute(new OpenIdAttribute(OpenIdAttribute.EMAIL, "http://schema.openid.net/contact/email"));
    }

}
