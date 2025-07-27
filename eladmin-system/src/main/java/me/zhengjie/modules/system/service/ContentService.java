package me.zhengjie.modules.system.service;

import cn.hutool.core.util.ObjectUtil;
import com.alibaba.fastjson.JSON;
import me.zhengjie.modules.system.repository.ContentRepository;
import me.zhengjie.modules.system.swagger.model.ArticleListTableItem;
import me.zhengjie.modules.system.swagger.model.SearchArticleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ContentService {
    @Autowired
    private ContentRepository contentRepository;

    public SearchArticleResponse searchArticle(String title, String category, String label, Integer page, Integer size, String sort) {
        SearchArticleResponse response = new SearchArticleResponse();
        org.springframework.data.domain.Pageable pageable = PageRequest.of(page , size);
        Page<Map<String, Object>> dataPage = contentRepository.searchContent(title, category, label, pageable);
        if (ObjectUtil.isNotEmpty(dataPage)) {
            List<ArticleListTableItem> list = new ArrayList<>(dataPage.getNumberOfElements());
                for (Map<String, Object> map : dataPage.getContent()) {
                    ArticleListTableItem item = JSON.parseObject(JSON.toJSONString(map), ArticleListTableItem.class);
                    list.add(item);
                }
                response.setArticleList(list);
        }
        return response;
    }

}
