package com.able.bubugao.model.dto.questionBankQuestion;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 创建题库题目关联请求
 *
 *
 *  
 */
@Data
public class QuestionBatchDeleteRequestion implements Serializable {

        /**
         * 题目 id 列表
         */
        private List<Long> questionIdList;

    private static final long serialVersionUID = 1L;
}