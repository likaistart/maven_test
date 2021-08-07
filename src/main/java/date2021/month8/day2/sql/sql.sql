-- b2c_worker_extends 师傅扩展表
ALTER TABLE b2c_worker_extends ADD COLUMN `ser_area_class_flag` varchar(45)  DEFAULT '0,0,0,0,0'
    COMMENT '服务区域，服务类目 是否使用新逻辑更新标识 eg.存在五个占位符0,0,0,0,0依次代表:重点服务区域、优先服务区域、普通服务区域、主服务类目、副服务类目';
ALTER TABLE b2c_worker_extends ADD COLUMN `title_ids` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT ''
    COMMENT '对应b2c_worker_new_title_config标签表id';
ALTER TABLE b2c_worker_extends ADD COLUMN `grade_id` int(11) DEFAULT '0'
    COMMENT '对应师傅等级ID,即b2c_worker_new_grade_config表id';
ALTER TABLE b2c_worker_extends ADD COLUMN `server_skill_ids` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL
    COMMENT '服务技能多个用,隔开,即b2c_worker_new_server_skill表id';
ALTER TABLE b2c_worker_extends ADD COLUMN `server_city_ids` varchar(255) COLLATE utf8_bin DEFAULT NULL
    COMMENT '服务城市id,多个用‘，’隔开';

-- 字段长度改为255
ALTER TABLE b2c_worker_extends CHANGE `ser_area_im` `ser_area_im` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '重点服务区域行政编码，最多1个';
-- 字段长度改为255
ALTER TABLE b2c_worker_extends CHANGE `ser_area_pr` `ser_area_pr` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '优先服务区域行政编码，最多2个';
-- 添加注释
ALTER TABLE b2c_worker_extends CHANGE `ser_type` `ser_type` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT ''
    COMMENT '服务类型:1.安装2.测量3.维修4.送货到楼下5.送货到家6.送货到家并安装';
-- 修改
ALTER TABLE b2c_worker_extends CHANGE `ser_class_im` `ser_class_im` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '主要服务类目';


--
ALTER TABLE b2c_workers `status` `status` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT ''
    COMMENT '账号状态--正常【normal】冻结【hidden】拉黑【locked】冻结账户【frozenaccount】冻结接单【frozenorder】临时【temporary】';




