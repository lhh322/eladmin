package me.zhengjie.modules.system.service;

import me.zhengjie.modules.system.swagger.model.SearchArticleResponse;
import org.springframework.stereotype.Service;

@Service
public class ContentService {


    public SearchArticleResponse searchArticle(String title, String category, String label, Integer page, Integer size, String sort) {
        SearchArticleResponse response = new SearchArticleResponse();
        return response;
    }

}
