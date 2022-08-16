package com.amazon.ata.kindlepublishingservice.publishing;

import javax.inject.Inject;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BookPublishRequestManager {
    private ConcurrentLinkedQueue<BookPublishRequest>  queue;



    @Inject
    public BookPublishRequestManager(ConcurrentLinkedQueue<BookPublishRequest> queue) {
        this.queue = queue;
    }

    public void addBookPublishRequest(BookPublishRequest request) {
        queue.add(request);
    }

    public BookPublishRequest getBookPublishRequestToProcess() {
        return queue.poll();
    }
}
