package com.software.lukaszwelnicki.msc.model;

import com.software.lukaszwelnicki.msc.utils.RandomUtils;
import lombok.*;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Document(collection = "compressor_efficiency")
public class CompressorEfficiency extends Measurement {

    private static final double MIDDLE_VALUE = 88.0;
    private static final double SPREAD = 5.0;

    private double compressorEfficiency;

    public CompressorEfficiency random() {
        return new CompressorEfficiency(RandomUtils.randomMiddleAndSpread(MIDDLE_VALUE, SPREAD));
    }
}
