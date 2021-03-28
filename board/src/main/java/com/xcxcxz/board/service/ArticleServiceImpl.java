package com.xcxcxz.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.xcxcxz.board.commons.paging.Criteria;
import com.xcxcxz.board.commons.paging.SearchCriteria;
import com.xcxcxz.board.domain.ArticleVO;
import com.xcxcxz.board.persistence.ArticleDAO;

@Service
public class ArticleServiceImpl implements ArticleService {
	private final ArticleDAO articleDAO;

	@Inject
	public ArticleServiceImpl(ArticleDAO articleDAO) {
		this.articleDAO = articleDAO;
	}

	@Override
	public void create(ArticleVO articleVO) throws Exception {
		articleDAO.create(articleVO);
	}

	@Override
	public ArticleVO read(Integer article_no) throws Exception {
		return articleDAO.read(article_no);
	}

	@Override
	public void update(ArticleVO articleVO) throws Exception {
		articleDAO.update(articleVO);
	}

	@Override
	public void delete(Integer article_no) throws Exception {
		articleDAO.delete(article_no);
	}

	@Override
	public List<ArticleVO> listAll() throws Exception {
		return articleDAO.listAll();
	}

	@Override
	public List<ArticleVO> listCriteria(Criteria criteria) throws Exception {
		return articleDAO.listCriteria(criteria);
	}

	@Override
	public int countArticles(Criteria criteria) throws Exception {
		return articleDAO.countArticles(criteria);
	}

	@Override
	public List<ArticleVO> listSearch(SearchCriteria searchCriteria) throws Exception {
		return articleDAO.listSearch(searchCriteria);
	}

	@Override
	public int countSearchedArticles(SearchCriteria searchCriteria) throws Exception {
		return articleDAO.countSearchedArticles(searchCriteria);
	}

}
