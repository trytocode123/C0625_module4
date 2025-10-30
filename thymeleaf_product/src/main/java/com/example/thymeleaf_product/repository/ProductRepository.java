package com.example.thymeleaf_product.repository;

import com.example.thymeleaf_product.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    final static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "iPhone 15", 22000000,
                "iPhone 15 là mẫu điện thoại mới nhất của Apple, trang bị chip A16 Bionic cực mạnh, camera nâng cấp với khả năng chụp ảnh ban đêm ấn tượng và thiết kế tinh tế mang phong cách sang trọng đặc trưng của Apple.",
                "Apple"));

        productList.add(new Product(2, "Samsung Galaxy S23", 21000000,
                "Samsung Galaxy S23 sở hữu màn hình Dynamic AMOLED 2X siêu mượt, chip Snapdragon 8 Gen 2, cùng hệ thống camera được tối ưu mạnh mẽ cho chụp ảnh đêm và quay video 8K sắc nét.",
                "Samsung"));

        productList.add(new Product(3, "Nokia G22", 5000000,
                "Nokia G22 nổi bật với thiết kế bền bỉ, pin dung lượng lớn 5000mAh, hỗ trợ sạc nhanh và cam kết cập nhật phần mềm dài hạn, phù hợp cho người dùng phổ thông cần một chiếc máy ổn định, bền và dễ sử dụng.",
                "Nokia"));

        productList.add(new Product(4, "Xiaomi Redmi Note 13", 6000000,
                "Redmi Note 13 mang đến hiệu năng mạnh mẽ trong tầm giá với chip MediaTek Helio G99, màn hình AMOLED 120Hz, camera 108MP và thiết kế mỏng nhẹ thời trang, phù hợp với học sinh, sinh viên hoặc người dùng phổ thông.",
                "Xiaomi"));

        productList.add(new Product(5, "Huawei P60", 18000000,
                "Huawei P60 là flagship mới nhất của Huawei, nổi bật với cụm camera XMAGE chuyên nghiệp, khả năng chụp đêm vượt trội, cùng thiết kế cong viền tinh tế và hiệu năng cao cho công việc lẫn giải trí.",
                "Huawei"));

        productList.add(new Product(6, "OnePlus 12", 17000000,
                "OnePlus 12 mang lại trải nghiệm mượt mà với chip Snapdragon 8 Gen 2, màn hình AMOLED 120Hz và sạc nhanh 100W, hướng tới người dùng yêu thích hiệu năng mạnh mẽ và thiết kế tối giản hiện đại.",
                "OnePlus"));

        productList.add(new Product(7, "Vivo V29", 7000000,
                "Vivo V29 nổi bật với camera selfie chất lượng cao, hỗ trợ chế độ chụp chân dung ánh sáng vòng độc đáo, cùng thiết kế mỏng nhẹ và hiệu năng ổn định, rất phù hợp cho người thích chụp ảnh và mạng xã hội.",
                "Vivo"));

        productList.add(new Product(8, "Oppo Reno 12", 8000000,
                "Oppo Reno 12 là mẫu điện thoại tầm trung nổi bật với khả năng chụp ảnh chân dung ấn tượng, màn hình AMOLED 120Hz rực rỡ và pin 5000mAh cùng sạc nhanh SuperVOOC 67W tiện lợi.",
                "Oppo"));

        productList.add(new Product(9, "Realme GT Neo 6", 7500000,
                "Realme GT Neo 6 hướng đến người dùng yêu thích hiệu năng với chip Snapdragon mạnh mẽ, tản nhiệt tốt và màn hình tần số quét cao 144Hz, mang lại trải nghiệm gaming mượt mà và ổn định.",
                "Realme"));

        productList.add(new Product(10, "Sony Xperia 1 V", 25000000,
                "Sony Xperia 1 V là chiếc điện thoại cao cấp với màn hình OLED 4K HDR độc quyền của Sony, hệ thống camera mang công nghệ Alpha nổi tiếng, mang lại trải nghiệm quay phim và chụp ảnh chuyên nghiệp trong thiết kế sang trọng.",
                "Sony"));

    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public boolean delete(int i) {
        productList.remove(i);
        return true;
    }

    @Override
    public Product find(int id) {
        List<Product> products = findAll();
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public boolean update(Product product, int i) {
        productList.set(i, product);
        return true;
    }
}
