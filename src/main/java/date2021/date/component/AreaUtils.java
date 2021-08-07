package date2021.date.component;


import date2021.date.mapper.worker4.B2CAreaMapper;
import date2021.date.model.worker4.B2CArea;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: zhujia-java-user-center
 * @url:
 * @description: 区域工具类
 * @packagename: com.jdd.zhujia.user.utils
 * @author: LiKai
 * @date: 2021-08-04 18:51
 **/

public class AreaUtils {
//    /**
//     * 功能描述: 通过街道获取id
//     * floor说明
//     * floor=4 乡镇、街道
//     * floor=3 区县
//     * floor=2 城市
//     * floor=1 省会
//     * 〈〉
//     *
//     * @Param: [serAreaIm]
//     * @Return: java.lang.Integer
//     * @Author: Likai
//     * @Date: 2021/8/4 18:45
//     */
//    public Integer getStreetIdByStreets(String serAreaIm) {
//        if (StringUtils.isEmpty(serAreaIm)) {
//            return 0;
//        }
//        String[] split = serAreaIm.split(WorkerConstant.SPLIT_SIGN);
//        if (split.length < 1 || !StringOptimizedUtil.judgePositiveByToCharArray(split[0])) {
//            return 0;
//        }
//        return Integer.valueOf(split[0]);
//    }



//    public Integer getAsignLevelByStreet(Integer areaId, Integer curFloor, Integer targetFloor) {
//        B2CArea AreaEntity = b2CAreaMapper.selectByPrimaryKey(areaId);
//        if (null != AreaEntity && null != AreaEntity.getParentId()) {
//            B2CArea countyEntiy = b2CAreaMapper.selectByPrimaryKey(AreaEntity.getParentId());
//            if (null != countyEntiy && null != countyEntiy.getParentId()) {
//                return countyEntiy.getParentId();
//            }
//        }
//        return -1;
//    }
}