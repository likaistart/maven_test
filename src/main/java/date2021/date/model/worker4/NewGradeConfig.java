package date2021.date.model.worker4;

import lombok.Data;

import java.util.Date;

/**
 * @program: java-public-service-center
 * @description:师傅等级配置
 * @packagename: com.jdd.zhujia.db.model.worker
 * @author: LiKai
 * @date: 2021-06-22 17:26
 **/
@Data
public class NewGradeConfig {
    private Integer id;

    private String workerGrade;

    private String gradeNickname;

    private Integer completeOrderNum;

    private Double serverQualityScore;

    private Integer workerNum;

    private Byte enableFlag;

    private Date createdAt;

    private Date updatedAt;

    private String describe;

    private Integer nextGradeId;

    private String gradeEquityMap;

    private Double floorQualityScore;

    private Double ceilingQualityScore;

    private Integer floorCompleteNum;

    private Integer ceilingCompleteNum;
}