package com.owneroftime.guestbook.common.utility;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "ExecutionContext")
public class ExecutionContext implements Serializable {
	
    /**
	 * serial Version Id
	 */
	private static final long serialVersionUID = 1L;
	
	private Long userId;
    private String userEmail;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
