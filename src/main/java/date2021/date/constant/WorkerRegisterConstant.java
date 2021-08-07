package date2021.date.constant;

/**
 * @program: zhujia-java-user-center
 * @description: 师傅注册常量
 * @packagename: com.jdd.zhujia.user.constant
 * @author: LiKai
 * @date: 2021-07-06 16:35
 **/
public class WorkerRegisterConstant {
    //生成的随机数长度
    public static final int RANDOM_LENGTH = 6;
    public static final int INVITE_LENGTH = 8;
    //默认值
    public static final Byte DEFAULT_ZERO_BYTE_VALUE = 0;
    public static final Byte DEFAULT_ONE_BYTE_VALUE = 1;
    public static final Byte DEFAULT_TWO_BYTE_VALUE = 2;
    public static final Integer DEFAULT_ZERO_INTEGER_VALUE = 0;
    public static final Integer DEFAULT_ONE_INTEGER_VALUE = 1;
    public static final Integer DEFAULT_TWO_INTEGER_VALUE = 2;
    /**
     * 账号状态
     * 正常【normal】
     * 冻结【hidden】
     * 拉黑【locked】
     * 冻结账户【frozenaccount】
     * 冻结接单【frozenorder】
     * 临时【temporary】
     */
    public static final String NORMAL_STATUS = "normal";
    public static final String HIDDEN_STATUS = "hidden";
    public static final String LOCKED_STATUS = "locked";
    public static final String TEMPORARY_STATUS = "temporary";
    public static final String FROZEN_ACCOUNT_STATUS = "frozenaccount";
    public static final String FROZEN_ORDER_STATUS = "frozenorder";
    //师傅默认密码
    public static final String DEFAULT_PWD = "123456";
    //非法值
    public static final Integer ILLEGALITY_VALUE = -999999;
}