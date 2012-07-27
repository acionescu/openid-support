package ro.zg.openid.util;

import java.util.HashMap;
import java.util.Map;

public class OpenIdProviderAttributesManager {
    private Map<String,OpenIdAttribute> attributes= new HashMap<String, OpenIdAttribute>();
    
    
    public void addAttribute(OpenIdAttribute attribute){
	attributes.put(attribute.getName(), attribute);
    }
    
    public OpenIdAttribute[] getAttributesByName(String... names){
	OpenIdAttribute[] res = new OpenIdAttribute[names.length];
	
	int i=0;
	for(String name : names){
	    res[i++]= attributes.get(name);
	}
	
	return res;
    }
}
