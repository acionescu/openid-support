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
