/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.project.base;

import java.io.Serializable;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.StandardToStringStyle;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author Previn
 */
public class BaseObject implements Serializable {
    private static final StandardToStringStyle style = new StandardToStringStyle();
    static{
        style.setNullText("---NULL---");
        style.setFieldSeparator(";");
        style.setArrayStart("{{{");
        style.setArrayEnd("}}}");
        style.setArraySeparator("|");
        style.setFieldNameValueSeparator(":");
    }
    
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }
    
    public boolean equals(BaseObject newObject){
        return EqualsBuilder.reflectionEquals(this, newObject);
    }
    
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
