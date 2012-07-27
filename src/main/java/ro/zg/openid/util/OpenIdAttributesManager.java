package ro.zg.openid.util;

import java.util.HashMap;
import java.util.Map;

public class OpenIdAttributesManager {
    private Map<String, OpenIdProviderAttributesManager> providers = new HashMap<String, OpenIdProviderAttributesManager>();
    
    public OpenIdAttributesManager(){
	providers.put("https://www.google.com/accounts/o8/id", new GoogleOpenIdAttributesManager());
	providers.put("https://me.yahoo.com", new YahooOpenIdAttributesManager());
    }
    
    
    public OpenIdAttribute[] getAttributes(String providerUrl, String... names){
	OpenIdProviderAttributesManager oam = resolveProvider(providerUrl);
	
	if(oam != null){
	    return oam.getAttributesByName(names);
	}
	
	return null;
    }
    
    private OpenIdProviderAttributesManager resolveProvider(String providerUrl){
	return providers.get(providerUrl);
    }
}
