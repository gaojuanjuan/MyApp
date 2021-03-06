package gjj.com.myapp.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by GD on 2016/5/4.
 *该类用于提供发送收件人的功能。收件人类
 */
@Entity
public class Addressee {

    @Id
    private Long addresseeId;
    private Long id;
    //该联系人所对应发送通知的id
    private Long noticeId;
    //收件人的姓名
    private String name;
    //用于判断该收件人是否被选择
    private Boolean isSelected = false;

    private String addresseeType;





    @Generated(hash = 77792968)
    public Addressee(Long addresseeId, Long id, Long noticeId, String name,
            Boolean isSelected, String addresseeType) {
        this.addresseeId = addresseeId;
        this.id = id;
        this.noticeId = noticeId;
        this.name = name;
        this.isSelected = isSelected;
        this.addresseeType = addresseeType;
    }

    @Generated(hash = 1999156007)
    public Addressee() {
    }

    public Addressee(Long id,String name , Long noticeId) {
        this.id = id;
        this.noticeId = noticeId;
        this.name = name;
    }



    public String getAddresseeType() {
        return addresseeType;
    }

    public void setAddresseeType(String addresseeType) {
        this.addresseeType = addresseeType;
    }

    public Long getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
    }

    public Boolean getSelected() {
        return isSelected;
    }

    public void setSelected(Boolean selected) {
        isSelected = selected;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean getIsSelected() {
        return this.isSelected;
    }

    public void setIsSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAddresseeId() {
        return addresseeId;
    }

    public void setAddresseeId(Long addresseeId) {
        this.addresseeId = addresseeId;
    }

    public void setIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
    }
}
