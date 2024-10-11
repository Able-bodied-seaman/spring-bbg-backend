package com.able.bubugao.esdao;

import com.able.bubugao.model.dto.question.QuestionEsDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface QuestionEsDao extends ElasticsearchRepository<QuestionEsDTO, Long> {

}
