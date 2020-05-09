package edu.miu.cs.cs472.lesson14.customTags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentDateTimeTag extends SimpleTagSupport {
    String theColor;
    String theSize;
    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        LocalDate dNow = LocalDate.now();
        dNow.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy"));
        out.write(String.format("<span style='color: %s'; 'font-size: %s'>%s</span>", theColor,theSize, dNow));
    }

    public String getTheColor() {
        return theColor;
    }

    public void setTheColor(String theColor) {
        this.theColor = theColor;
    }

    public String getTheSize() {
        return theSize;
    }

    public void setTheSize(String theSize) {
        this.theSize = theSize;
    }
}
