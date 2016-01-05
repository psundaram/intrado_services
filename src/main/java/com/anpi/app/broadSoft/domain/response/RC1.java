package com.anpi.app.broadSoft.domain.response;

import javax.xml.bind.annotation.XmlAttribute;

public class RC1
{
    private String message;

    private String content;

	@XmlAttribute(name="message")
    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

}
			
		