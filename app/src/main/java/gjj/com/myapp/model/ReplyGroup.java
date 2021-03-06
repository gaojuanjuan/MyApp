package gjj.com.myapp.model;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

import java.util.List;

/**
 * Created by Administrator on 2016/1/21.
 * 答辩小组，与老师是多对一的关系。
 */
@Entity
public class ReplyGroup {
    @Id(autoincrement = false)
    private Long id;
    private String description;                                    //答辩小组名称
    private String location;                                       //答辩的地点
    private Integer leader_id;                                     //答辩小组组长的id
    private String leader_name;                                     //答辩小组组长的id
    private long beginTime = -1;                                     //答辩的开始时间
    private long endTime = -1;                                       //答辩的结束时间
    @Transient
    private List<GraduateProject> graduateProjects;
    private long tutorId;   //登陆用户的id
    private String major; //答辩专业
    private String replyMembers;

    @Generated(hash = 257994268)
    public ReplyGroup(Long id, String description, String location,
            Integer leader_id, String leader_name, long beginTime, long endTime,
            long tutorId, String major, String replyMembers) {
        this.id = id;
        this.description = description;
        this.location = location;
        this.leader_id = leader_id;
        this.leader_name = leader_name;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.tutorId = tutorId;
        this.major = major;
        this.replyMembers = replyMembers;
    }

    @Generated(hash = 21646655)
    public ReplyGroup() {
    }

    public long getTutorId() {
        return tutorId;
    }

    public void setTutorId(long tutorId) {
        this.tutorId = tutorId;
    }

    public String getReplyMembers() {
        return replyMembers;
    }

    public void setReplyMembers(String replyMembers) {
        this.replyMembers = replyMembers;
    }

    public List<GraduateProject> getGraduateProjects() {
        return graduateProjects;
    }

    public void setGraduateProjects(List<GraduateProject> graduateProjects) {
        this.graduateProjects = graduateProjects;
    }

    public String getLeader_name() {
        return leader_name;
    }

    public void setLeader_name(String leader_name) {
        this.leader_name = leader_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Integer getLeader_id() {
        return leader_id;
    }

    public void setLeader_id(Integer leader_id) {
        this.leader_id = leader_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(long beginTime) {
        this.beginTime = beginTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public class ReplyTime {
        private long beginTime;                                     //答辩的开始时间
        private long endTime;                                       //答辩的结束时间


        public long getBeginTime() {
            return beginTime;
        }

        public void setBeginTime(long beginTime) {
            this.beginTime = beginTime;
        }

        public long getEndTime() {
            return endTime;
        }

        public void setEndTime(long endTime) {
            this.endTime = endTime;
        }
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }



    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
}
