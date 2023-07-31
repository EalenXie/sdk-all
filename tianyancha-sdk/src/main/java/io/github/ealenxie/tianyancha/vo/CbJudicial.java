package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/29 16:58
 */
@Getter
@Setter
public class CbJudicial {
    /**
     * 诉讼列表
     */
    @JsonProperty("lawSuitList")
    private List<Lawsuit> lawSuitList;

    /**
     * 开庭公告列表
     */
    @JsonProperty("ktAnnouncementList")
    private List<KtAnnouncement> ktAnnouncementList;

    /**
     * 被执行人列表
     */
    @JsonProperty("zhixingList")
    private List<Zhixing> zhixingList;

    /**
     * 法院公告列表
     */
    @JsonProperty("courtAnnouncementList")
    private List<CourtAnnouncement> courtAnnouncementList;

    /**
     * 立案信息列表
     */
    @JsonProperty("courtRegisterList")
    private List<CourtRegister> courtRegisterList;

    /**
     * 送达公告列表
     */
    @JsonProperty("sendAnnouncementList")
    private List<SendAnnouncement> sendAnnouncementList;

    /**
     * 失信人列表
     */
    @JsonProperty("dishonestList")
    private List<Dishonest> dishonestList;

}





