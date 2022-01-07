package web.seller.domain;

import lombok.*;
import web.common.entity.BaseEntity;
import web.user.domain.Role;
import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Seller extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SELLER_NO")
    private Long id;

    private String email;

    private String password;

    private String brandName;

    @Column(length = 1000)
    private String brandContent;

    @Column(length = 1000)
    private String itemContent;

    private String imagePath;
    private Role role;

    @Enumerated(value = EnumType.STRING)
    private SellerStatus sellerStatus;

    @Enumerated(EnumType.STRING)
    private Role role;

    public void approved() {
        this.sellerStatus = SellerStatus.APPROVAL;
    }

    @Builder
    public Seller(Long id, String email, String password, String brandName, String brandContent, String itemContent, String imagePath, SellerStatus sellerStatus, Role role) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.brandName = brandName;
        this.brandContent = brandContent;
        this.itemContent = itemContent;
        this.imagePath = imagePath;
        this.sellerStatus = sellerStatus;
        this.role = Role.ROLE_SELLER;
    }
}
