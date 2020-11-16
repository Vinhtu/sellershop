package Service;

import java.util.List;

import Model.ProductModel;

public interface IProductService {
    
    List<ProductModel> findProductId();
    ProductModel save(ProductModel productModel);
    ProductModel update(ProductModel updateProductModel);
	void delete(int id);
    	
}
