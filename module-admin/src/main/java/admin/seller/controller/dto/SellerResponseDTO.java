package admin.seller.controller.dto;

import lombok.*;
import web.seller.domain.Seller;
import web.seller.domain.SellerStatus;

import java.time.LocalDateTime;

@Getter
public class SellerResponseDTO {

    private Long id;
    private String email;
    private String password;
    private String brandName;
    private String brandContent;
    private String itemContent;
    private String imagePath;
    private SellerStatus sellerStatus;
    private LocalDateTime createDate;
    private LocalDateTime modifiedDate;

    public SellerResponseDTO(Seller entity) {
        id = entity.getId();
        email = entity.getEmail();
        password = entity.getPassword();
        brandName = entity.getBrandName();
        brandContent = entity.getBrandContent();
        itemContent = entity.getItemContent();
        imagePath = entity.getImagePath();
        sellerStatus = entity.getSellerStatus();
        createDate = entity.getCreateDate();
        modifiedDate = entity.getModifiedDate();
    }
}
