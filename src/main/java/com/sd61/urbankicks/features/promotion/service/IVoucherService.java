package com.sd61.urbankicks.features.promotion.service;

import com.sd61.urbankicks.entity.Voucher;
import com.sd61.urbankicks.features.promotion.dto.VoucherRequest;

import java.util.List;
import java.util.UUID;

public interface IVoucherService {
    Voucher create(VoucherRequest request);
    Voucher update(UUID id, VoucherRequest request);
    void delete(UUID id);
    Voucher getById(UUID id);
    List<Voucher> getAll();
}
