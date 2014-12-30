package ie.lyit.project.checkerboard.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-30T14:56:44")
@StaticMetamodel(LyitUser.class)
public class LyitUser_ { 

    public static volatile SingularAttribute<LyitUser, String> usrFname;
    public static volatile SingularAttribute<LyitUser, String> usrLname;
    public static volatile SingularAttribute<LyitUser, String> password;
    public static volatile SingularAttribute<LyitUser, Date> loginTime;
    public static volatile SingularAttribute<LyitUser, String> othrDetails;
    public static volatile SingularAttribute<LyitUser, String> id;

}