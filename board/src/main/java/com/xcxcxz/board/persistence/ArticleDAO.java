package com.xcxcxz.board.persistence;

import java.util.List;

import com.xcxcxz.board.commons.paging.Criteria;
import com.xcxcxz.board.commons.paging.SearchCriteria;
import com.xcxcxz.board.domain.ArticleVO;

public interface ArticleDAO {
	void create(ArticleVO articleVO) throws Exception;

	ArticleVO read(Integer article_no) throws Exception;

	void update(ArticleVO articleVO) throws Exception;

	void delete(Integer article_no) throws Exception;

	List<ArticleVO> listPaging(int page) throws Exception;

	List<ArticleVO> listAll() throws Exception;

	List<ArticleVO> listCriteria(Criteria criteria) throws Exception;

	int countArticles(Criteria criteria) throws Exception;

	List<ArticleVO> listSearch(SearchCriteria searchCriteria) throws Exception;

	int countSearchedArticles(SearchCriteria searchCriteria) throws Exception;

}
