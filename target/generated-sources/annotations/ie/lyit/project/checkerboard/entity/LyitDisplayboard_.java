package ie.lyit.project.checkerboard.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-30T14:56:44")
@StaticMetamodel(LyitDisplayboard.class)
public class LyitDisplayboard_ { 

    public static volatile SingularAttribute<LyitDisplayboard, String> flightNo;
    public static volatile SingularAttribute<LyitDisplayboard, String> route;
    public static volatile SingularAttribute<LyitDisplayboard, String> aircraft;
    public static volatile SingularAttribute<LyitDisplayboard, Date> schTime;
    public static volatile SingularAttribute<LyitDisplayboard, Date> actTime;
    public static volatile SingularAttribute<LyitDisplayboard, Integer> id;
    public static volatile SingularAttribute<LyitDisplayboard, String> gate;
    public static volatile SingularAttribute<LyitDisplayboard, Date> estTime;
    public static volatile SingularAttribute<LyitDisplayboard, String> status;

}