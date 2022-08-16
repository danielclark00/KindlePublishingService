package com.amazon.ata.kindlepublishingservice.converters;

import com.amazon.ata.kindlepublishingservice.dynamodb.models.PublishingStatusItem;
import com.amazon.ata.kindlepublishingservice.models.PublishingStatusRecord;

import java.util.ArrayList;
import java.util.List;

public class PublishingStatusItemConverter {
    public static List<PublishingStatusRecord> toPublishingStatusRecord(List<PublishingStatusItem> list) {
        List<PublishingStatusRecord> records = new ArrayList<>();
        for(PublishingStatusItem item : list) {
            PublishingStatusRecord record = PublishingStatusRecord.builder()
                    .withStatus(item.getStatus().toString())
                    .withBookId(item.getBookId())
                    .withStatusMessage(item.getStatusMessage())
                    .build();
            records.add(record);
        }
        return records;
    }
}
