package com.sd61.urbankicks.features.promotion.service.impl;

import com.sd61.urbankicks.entity.Voucher;
import com.sd61.urbankicks.features.promotion.dto.VoucherRequest;
import com.sd61.urbankicks.features.promotion.repository.VoucherRepository;
import com.sd61.urbankicks.features.promotion.service.IVoucherService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class VoucherServiceImpl implements IVoucherService {

    private final VoucherRepository voucherRepository;

    @Override
    public Voucher create(VoucherRequest request) {
        if (voucherRepository.existsByCode(request.getCode())) {
            throw new RuntimeException("Voucher code đã tồn tại");
        }

        Voucher v = new Voucher();
        BeanUtils.copyProperties(request, v);
        v.setUsedQuantity(0);

        return voucherRepository.save(v);
    }

    @Override
    public Voucher update(UUID id, VoucherRequest request) {
        Voucher v = voucherRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy voucher"));

        BeanUtils.copyProperties(request, v);
        return voucherRepository.save(v);
    }

    @Override
    public void delete(UUID id) {
        voucherRepository.deleteById(id);
    }

    @Override
    public Voucher getById(UUID id) {
        return voucherRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy voucher"));
    }

    @Override
    public List<Voucher> getAll() {
        return voucherRepository.findAll();
    }
}

