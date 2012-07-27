package ro.zg.openid.util;

public class OpenIdAttribute {
    public static final String EMAIL="email";
    
    private String name;
    private String schema;
    
    public OpenIdAttribute(String name, String schema) {
	super();
	this.name = name;
	this.schema = schema;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSchema() {
        return schema;
    }
    public void setSchema(String schema) {
        this.schema = schema;
    }
    
    
}
