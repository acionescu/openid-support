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

public class OpenIdConstants {
    public static final String USER_OPENID="USER_OPENID";
    /* the url to redirect to after the openid client successfully authenticated a user
     * against an openid provider
     */
    public static final String RETURN_URL="RETURN_URL";
    public static final String PROVIDER_URL="PROVIDER_URL";
    public static final String REQUEST_ATTRIBUTES="REQUEST_ATTRIBUTES";
    
    /* the url to redirect to after the user was successfully authenticated 
     * by the login service */
    public static final String LOGIN_SERVICE_RETURN_URL="LOGIN_SERVICE_RETURN_URL";
    
    /* a flag used by the openid provider, to know if a request comes from the login service */
    public static final String WAIT_LOGIN_SERVICE_RESPONSE="WAIT_LOGIN_SERVICE_RESPONSE";
    
    /* a variable to store the client request params on session, while doing authentication */
    public static final String ORIGINAL_OPENID_PARAMS="ORIGINAL_OPENID_PARAMS";
}
