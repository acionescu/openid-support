/*******************************************************************************
 * Copyright 2012 AdrianIonescu
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package ro.zg.openid.util;

import java.util.HashMap;
import java.util.Map;

public class OpenIdAttributesManager {
    private static Map<String, OpenIdProviderAttributesManager> providers = new HashMap<String, OpenIdProviderAttributesManager>();
    private static OpenIdProviderAttributesManager defaultManager;
    private static OpenIdAttributesManager _instance;
    
    private OpenIdAttributesManager(){
	defaultManager = new YahooOpenIdAttributesManager();
	providers.put("https://www.google.com/accounts/o8/id", new GoogleOpenIdAttributesManager());
	providers.put("https://me.yahoo.com", defaultManager);
    }
    
    public static OpenIdAttributesManager getInstance() {
	if(_instance == null) {
	    _instance = new OpenIdAttributesManager();
	}
	return _instance;
    }
    
    public OpenIdAttribute[] getAttributes(String providerUrl, String... names){
	OpenIdProviderAttributesManager oam = resolveProvider(providerUrl);
	
	if(oam != null){
	    return oam.getAttributesByName(names);
	}
	
	return null;
    }
    
    private OpenIdProviderAttributesManager resolveProvider(String providerUrl){
	OpenIdProviderAttributesManager openIdProviderAttributesManager = providers.get(providerUrl);
	if(openIdProviderAttributesManager == null) {
	    return defaultManager;
	}
	return openIdProviderAttributesManager;
	
	
    }
}
