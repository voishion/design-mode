CREATE TABLE `testbylilu`
(
    `id`                 INT(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
    `song_name`          VARCHAR(32)      NOT NULL DEFAULT ''     COMMENT '歌曲名',
    `deleted`            TINYINT(1)       NOT NULL DEFAULT '0'    COMMENT '是否删除 1：是 ，0：否',
    `speed`              INT(11)          NOT NULL DEFAULT '0'    COMMENT '速度',
    `create_user_id`     BIGINT(20)       NOT NULL DEFAULT '0'    COMMENT '创建人',
    `verify_time`        DATETIME                  DEFAULT NULL   COMMENT '审核时间',
    `create_time`        DATETIME         NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `music_score_detail` TEXT                      DEFAULT NULL   COMMENT '曲谱详情',
    `edit_data`          JSON                      DEFAULT NULL   COMMENT '曲谱信息（客户端用）',
    PRIMARY KEY (`id`),
    KEY `idx_create_time` (`create_time`),
    KEY `idx_deleted_speed` (`deleted`, `speed`),
    UNIQUE KEY `uk_deleted_create_user_id` (`deleted`,`create_user_id`)
) ENGINE=INNODB COMMENT='LILU用于TEST';

-- 修改字段
ALTER TABLE `t_teacher` MODIFY COLUMN `note` VARCHAR(1000)  DEFAULT '' COMMENT '备注';

-- 增加字段
ALTER TABLE `zq_pull_message` ADD COLUMN `link_url` varchar(255)  NOT NULL DEFAULT '' COMMENT '连接路径';

-- 删除索引
DROP INDEX `weixin_no` ON `t_navy`;

-- 新增索引
CREATE UNIQUE INDEX `uk_weixinno_del` ON `t_navy`(`weixin_no`,`del`) USING BTREE;
CREATE INDEX `from_room_wxid_index` ON `zq_message`(`wxid_from`,`room_wxid`) USING BTREE;
