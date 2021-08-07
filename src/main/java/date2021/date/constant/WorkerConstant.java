package date2021.date.constant;

import java.math.BigDecimal;

/**
 * @program: zhujia-java-user-center
 * @description:
 * @packagename: com.jdd.zhujia.user.constant
 * @author: LiKai
 * @date: 2021-07-02 13:38
 **/
public class WorkerConstant {
    //师傅档案
    public static final String SPLIT_SIGN = ",";
    public static final String FIXED_PRICE_TYPE = "一口价";
    public static final String BIDDING_PRICE_TYPE = "竞价";
    public static final String ADD_DEAL_RESULT = "增加";
    public static final String REDUCE_DEAL_RESULT = "减少";

    //师傅综合评分
    public static final Byte CAN_ENABLE_FLAG = 1;
    public static final Byte FULL_GRADE_FLAG = 5;

    //分页查询默认页码 默认显示条数
    public static final Integer DEFAULT_PAGE = 1;
    public static final Integer DEFAULT_PAGE_SIZE = 10;

    //默认查询索引值
    public static final int DEFAULT_INDEX = 0;

    //证书或者服务类型是否存在
    public static final String EXISIT_VALUE = "是";
    public static final String EXISIT_VALUE_INDEX = "1";
    public static final String NO_EXISIT_VALUE = "无";
    public static final String NO_EXISIT_INDEX = "0";


    //师傅综合评分状态
    public static final String STATUS_ENABLE_NAME = "启用";
    public static final String STATUS_FORBIDDEN_NAME = "禁用";
    public static final String STATUS_ENABLE = "1";
    public static final String STATUS_FORBIDDEN = "0";
    //分割符(标签,获取区域)
    public static final String SEGMENTTATION_SIGN = ",";

    //师傅区域城市分隔符
    public static final String COUNTY_SPLIT_SIGN = "\\|";
    //师傅区域城市 追加分隔符,使用\\|会变为\|格式
    public static final String COUNTY_APPEND_SPLIT_SIGN = "|";
    //师傅标签类型
    public static final String AUTO_TITTLE_NAME = "自动标签";
    public static final String MANUAL_TITTLE_NAME = "手动标签";
    //师傅标签名称
    public static final Byte AUTO_TITTLE_TYPE = 0;
    public static final Byte MANUAL_TITTLE_TYPE = 1;
    public static final Integer MANUAL_TITTLE_TYPE_INTEGER = 1;
    //权益模板占位符
    public static final String PLACE_HOLDER = "$value";
    //评分级别 评价:1=好评,2=中评,3=差评
    public static final Byte GOOD_APPRAISE = 1;
    public static final Byte MIDDLE_APPRAISE = 2;
    public static final Byte NEGATIVE_APPRAISE = 3;


    //重点服务区域行政编码
    public static final Integer SER_ARE_IM_FLAG = 1;
    //优先服务区域行政编码
    public static final Integer SER_ARE_PR_FLAG = 2;
    //普通服务区域行政编码
    public static final Integer SER_ARE_NO_FLAG = 3;
    //主要服务类目--最多可选择5个
    public static final Integer SER_CLASS_IM_FLAG = 1;
    //副服务类目--最多可选择3个
    public static final Integer SER_CLASS_SE_FLAG = 2;


    //重点服务区域行政编码
    public static final Integer SER_ARE_IM_INDEX = 0;
    //优先服务区域行政编码
    public static final Integer SER_ARE_PR_INDEX = 1;
    //普通服务区域行政编码
    public static final Integer SER_ARE_NO_INDEX = 2;
    //主要服务类目--最多可选择5个
    public static final Integer SER_CLASS_IM_INDEX = 3;
    //副服务类目--最多可选择3个
    public static final Integer SER_CLASS_SE_INDEX = 4;


    //区域 类目 已经更新标识
    public static final String NEW_UPDATED_FLAG = "1";

    //重点服务区域行政编码--最多可选择个数
    public static final Integer MAX_SER_ARE_IM = 5;
    //优先服务区域行政编码--最多可选择个数
    public static final Integer MAX_SER_ARE_PR = 5;
    //普通服务区域行政编码--最多可选择个数
    public static final Integer MAX_SER_ARE_NO = 5;
    //主要服务类目--最多可选择5个
    public static final Integer MAX_SER_CLASS_IM = 5;
    //副服务类目--最多可选择3个
    public static final Integer MAX_SER_CLASS_SE = 3;

    //非法值
    public static final Integer ILLEGALITY_VALUE = -999999;

    public static final String TIME_YYYY = "yyyy";
    public static final String TIME_YYYY_MM = "yyyy-MM";
    public static final String TIME_YYYY_MM_DD = "yyyy-MM-dd";
    public static final String TIME_YMD_HMS = "yyyy-MM-dd hh:mm:ss";
    public static final String DAY_BEGIN_HMS = " 00:00:00";
    public static final String DAY_END_HMS = " 23:59:59";
    public static final String BLANK_FLAG = " ";

    //默认服务区域 服务类别
    public static final String DEFAULT_SER_AREA_CLASS = "0,0,0,0,0";

    //师傅性别
    public static final String GENDER_GENTLEMAN = "男";
    public static final String GENDER_LADIES = "女";

    //师傅保险金额
    public static final BigDecimal INSURANCE_PRICE = BigDecimal.ONE;
    //佣金比例
    public static final BigDecimal COMMISSION_RATE = BigDecimal.valueOf(0.95);
    public static final String REPLACE_VARCHAR = "$value";
    //师傅分层--师傅等级--权益MAP
    public static final String GRADE_MAP_KEY = "key_";
    public static final String GRADE_MAP_VALUE = "value_";
    public static final Integer MIN_FLOOR = 4;
    public static final String DEFAULT_MONEY = "0.00";

    //师傅标签
    public static final Byte WORKER_AUTO_TITLE_FLAG = 0;
    public static final Byte WORKER_MANUAL_TITLE_FLAG = 1;
    //权益关系共5项
    public static final int FIVE_VALUE = 5;
    //服务质量分最大最小值设置
    public static final Integer MAX_SCORE_VALUE = 50;
    public static final Integer MIN_SCORE_VALUE = 1;
    //枚举空值
    public static final String ENUM_DEFAULT = "0";


    //1.周完成率
    public static final Integer WEEK_COMPLETE_RATE =80 ;
    //2.月售后率
    public static final Integer MONTH_DEFAULT_AFTER_RATE =5 ;
    //3.好评率
    public static final Integer GOOD_APPRAISE_RATE = 95;
    //4.1预约率
    public static final int APPOINT_DEFAULT_RATE = 75;
    //4.2准时上门率
    public static final int ONDOOR_DEFAULT_RATE = 75;

    //5.1统计抢单率时间
    public static final int GRAB_DEFAULT_DAYS = 60;
    //5.2统计抢单率次数
    public static final int GRAB_DEFAULT_TIMES = 30;
    //5.3统计抢单率时间
    public static final int HIRED_DEFAULT_DAYS = 60;
    //5.4统计抢单率次数
    public static final int INTERVAL_DEFAULT_DAY = 30;
}