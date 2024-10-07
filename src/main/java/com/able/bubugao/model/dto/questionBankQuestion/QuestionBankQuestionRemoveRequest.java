package com.able.bubugao.model.dto.questionBankQuestion;

import lombok.Data;

import java.io.Serializable;

/**
 * 题库题目删除请求
 */
@Data
public class QuestionBankQuestionRemoveRequest implements Serializable {
    /**
     * 题库id
     */
    private Long questionBankId;
    /**
     * 题目id
     */
    private Long questionId;
    private static final long serialVersionUID = 1L;

}
