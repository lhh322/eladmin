/*
 *  Copyright 2019-2025 Zheng Jie
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package me.zhengjie.modules.system.domain;

import me.zhengjie.base.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
* @author Zheng Jie
* @date 2019-03-25
*/

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name = "tb_article")
@DynamicInsert
@DynamicUpdate
public class Article extends BaseEntity implements Serializable {

    @Id
    @Column(name = "ID", length = 32)
    private String id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "category")
    private String category;

    @Column(name = "label")
    private String label;

    @Column(name = "recommend", length = 1)
    private String recommend = "N";

    @Column(name = "sticky", length = 1)
    private String sticky = "N";

    @Column(name = "reading")
    private Integer reading = 0;

    @Column(name = "CREATE_BY")
    private String createBy = "SYSTEM";

    @Column(name = "CREATE_TIMESTAMP")
    private LocalDateTime createTimestamp;

    @Column(name = "LAST_UPDATE_BY")
    private String lastUpdateBy;

    @Column(name = "LAST_UPDATE_TIMESTAMP")
    private LocalDateTime lastUpdateTimestamp;

    @Column(name = "VERSION", length = 32)
    private String version;
}
