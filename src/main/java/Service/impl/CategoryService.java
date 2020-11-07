package Service.impl;

import java.util.List;

import javax.inject.Inject;

import DAO.ICategoryDAO;
import DAO.impl.CategoryDAO;
import Model.CategoryModel;
import Service.ICategoryService;

public class CategoryService implements ICategoryService {

//	@Inject
//	private ICategoryDAO categoryDao;
//	
	
	private ICategoryDAO categoryDao;
	public CategoryService() {
		categoryDao = new CategoryDAO();
	}
	@Override
	public List<CategoryModel> GetCategoryAll() {
		return categoryDao.GetCategoryAlL();
	}

}
