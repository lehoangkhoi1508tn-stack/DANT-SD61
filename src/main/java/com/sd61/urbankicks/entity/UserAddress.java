package com.sd61.urbankicks.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "user_addresses")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserAddress extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Nationalized
    @Column(name = "label_addresses", nullable = false, length = 50)
    private String labelAddresses;

    @Nationalized
    @Column(name = "receiver_name", nullable = false)
    private String receiverName;

    @Column(name = "receiver_phone", nullable = false, length = 15)
    private String receiverPhone;

    @Nationalized
    @Column(name = "address_detail", nullable = false, length = 500)
    private String addressDetail;

    @Column(name = "ghn_province_id", nullable = false)
    private Integer ghnProvinceId;

    @Column(name = "ghn_district_id", nullable = false)
    private Integer ghnDistrictId;

    @Column(name = "ghn_ward_code", nullable = false, length = 50)
    private String ghnWardCode;

    @Nationalized
    @Column(name = "province_name", nullable = false, length = 100)
    private String provinceName;

    @Nationalized
    @Column(name = "district_name", nullable = false, length = 100)
    private String districtName;

    @Nationalized
    @Column(name = "ward_name", nullable = false, length = 100)
    private String wardName;

    @ColumnDefault("0")
    @Column(name = "is_default", nullable = false)
    private Boolean isDefault = false;

    @ColumnDefault("0")
    @Column(name = "is_deleted", nullable = false)
    private Boolean isDeleted = false;

}