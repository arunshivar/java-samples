package com.arun;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
import java.util.Date;

public class DateTag extends TagSupport {
    public int doStartTag() //
    {
        Date date = new Date();
        try {
            JspWriter out = pageContext.getOut();
            out.println(date);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return SKIP_BODY;
    }
}