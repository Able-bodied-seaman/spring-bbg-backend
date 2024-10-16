package com.able.bubugao.service;

import com.able.bubugao.model.entity.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.able.bubugao.model.dto.questionBankQuestion.QuestionBankQuestionQueryRequest;
import com.able.bubugao.model.entity.QuestionBankQuestion;
import com.able.bubugao.model.vo.QuestionBankQuestionVO;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 题库题目关联服务
 *
 *
 *  
 */
public interface QuestionBankQuestionService extends IService<QuestionBankQuestion> {

    /**
     * 校验数据
     *
     * @param questionBankQuestion
     * @param add 对创建的数据进行校验
     */
    void validQuestionBankQuestion(QuestionBankQuestion questionBankQuestion, boolean add);

    /**
     * 获取查询条件
     *
     * @param questionBankQuestionQueryRequest
     * @return
     */
    QueryWrapper<QuestionBankQuestion> getQueryWrapper(QuestionBankQuestionQueryRequest questionBankQuestionQueryRequest);
    
    /**
     * 获取题库题目关联封装
     *
     * @param questionBankQuestion
     * @param request
     * @return
     */
    QuestionBankQuestionVO getQuestionBankQuestionVO(QuestionBankQuestion questionBankQuestion, HttpServletRequest request);

    /**
     * 分页获取题库题目关联封装
     *
     * @param questionBankQuestionPage
     * @param request
     * @return
     */
    Page<QuestionBankQuestionVO> getQuestionBankQuestionVOPage(Page<QuestionBankQuestion> questionBankQuestionPage, HttpServletRequest request);

    /**
     * 批量添加题库题目关联
     * @param questionIdList
     * @param questionBankId
     * @param loginUser
     */
    void batchQuestionBankQuestionVoAdd(List<Long> questionIdList , Long questionBankId , User loginUser);

    /**
     * 批量删除题库题目关联
     * @param questionIDList
     * @param questionBankId
     */
    void batchQuestionBankQuestionVoRemove(List<Long> questionIDList, Long questionBankId);

    /**
     * 批量删除题目
     * @param questionIDList
     */
    void batchDeleteQuestions( List<Long> questionIDList);


    /**
     * 批量添加题目到题库（事务，仅供内部调用）
     *
     * @param questionBankQuestions
     */
    @Transactional(rollbackFor = Exception.class)
    void batchQuestionBankQuestionVoAdd(List<QuestionBankQuestion> questionBankQuestions);

}
