package com.wineshop.services;

import org.granite.messaging.service.annotations.RemoteDestination;
import org.granite.tide.data.DataEnabled;
import org.granite.tide.data.DataEnabled.PublishMode;
import org.granite.tide.spring.data.FilterableJpaRepository;

import com.wineshop.entities.Vineyard;

@RemoteDestination
@DataEnabled(topic="wineshopTopic", publish=PublishMode.ON_SUCCESS)
public interface VineyardRepository
    extends FilterableJpaRepository<Vineyard, Long> {
}