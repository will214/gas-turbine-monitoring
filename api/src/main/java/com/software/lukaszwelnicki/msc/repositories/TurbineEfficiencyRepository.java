package com.software.lukaszwelnicki.msc.repositories;

import com.software.lukaszwelnicki.msc.measurements.documents.TurbineEfficiency;
import reactor.core.publisher.Flux;

public interface TurbineEfficiencyRepository extends MeasurementRepository<TurbineEfficiency> {
    @Override
    Flux<TurbineEfficiency> findBy();
}
