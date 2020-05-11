package edu.miu.cs.cs472.lesson14.customTags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class CurrentTimeTag extends SimpleTagSupport {
    String theColor;
    String theSize;
    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        LocalTime tNow = LocalTime.now();
        DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("hh:mm:ss a", Locale.US);
        String timeFormatted = FORMATTER.format(tNow);
        out.write(String.format("<span style='color: %s'; 'font-size: %s'>%s</span>", theColor,theSize, timeFormatted));
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
