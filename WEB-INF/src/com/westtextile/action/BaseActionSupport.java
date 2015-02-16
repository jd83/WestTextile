package com.westtextile.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseActionSupport extends ActionSupport implements SessionAware{

    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Session Map∂‘œÛ
    protected Map<String, Object> session;

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
    
    public Map<String, Object> getSessionMap(){
        return this.session;
    }
    
	public String execute() throws Exception {
		return SUCCESS;
	}
}