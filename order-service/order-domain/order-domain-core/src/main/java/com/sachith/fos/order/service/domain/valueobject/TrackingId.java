package com.sachith.fos.order.service.domain.valueobject;

import com.sachith.fos.order.service.domain.entity.BaseEntity;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {
    public TrackingId(UUID value) {
        super(value);
    }
}
