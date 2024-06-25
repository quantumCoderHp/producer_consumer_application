package com.example.producerconsumer.util;

import java.util.LinkedList;
import java.util.Queue;
import com.example.producerconsumer.model.Message;

public class MessageQueue {
    private Queue<Message> queue = new LinkedList<>();
    private int totalMessagesProcessed = 0;
    private int errorsEncountered = 0;

    public synchronized void addMessage(Message message) {
        queue.add(message);
        totalMessagesProcessed++;
    }

    public synchronized Message getMessage() {
        return queue.poll();
    }

    public int getTotalMessagesProcessed() {
        return totalMessagesProcessed;
    }

    public int getErrorsEncountered() {
        return errorsEncountered;
    }

    public void incrementErrors() {
        errorsEncountered++;
    }
}
