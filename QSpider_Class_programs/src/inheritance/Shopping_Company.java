package inheritance;
class Regular_customer {
	public void browse_products() {
		System.out.println("customer can browse producs");
	}
	public void cart() {
		System.out.println("customer can add items to cart");
	}
	public void make_purchase() {
		System.out.println("customer can purchase items");
	}
}
	
class premium_customer  extends Regular_customer{
		public void discounts() {
			System.out.println("customer can have discounts");
		}
		public void exclusive_product() { 
			System.out.println("customer can access to exclusive_product");
		}	
}
	
class Administrator extends Regular_customer {
			public void products_catalog() {
				System.out.println("admin can manage product catalog");
			}
			public void view_orders() {
				System.out.println("admin can view all orders");
			}	
}
	
public class Shopping_Company {

	public static void main(String[] args) {
		Administrator admin=new Administrator();
		admin.products_catalog();
		admin.view_orders();
		admin.browse_products();
		admin.cart();
		admin.make_purchase();
		System.out.println("---------------------------------------------------------");
		premium_customer customer=new premium_customer();
		customer.browse_products();
		customer.cart();
		customer.make_purchase();
		customer.discounts();
		customer.exclusive_product();
		

	}

}
