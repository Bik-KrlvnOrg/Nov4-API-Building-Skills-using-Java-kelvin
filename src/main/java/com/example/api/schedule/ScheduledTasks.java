package com.example.api.schedule;


import com.example.api.model.Sdn;
import com.example.api.service.SdnEntryService;
import com.example.api.service.SdnApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ScheduledTasks {

    private SdnApiService sdnApiService;
    private SdnEntryService sdnEntryService;

    public ScheduledTasks() {
    }

    @Autowired
    public ScheduledTasks(SdnApiService sdnApiService, SdnEntryService sdnEntryService) {
        this.sdnApiService = sdnApiService;
        this.sdnEntryService = sdnEntryService;
    }

    @Scheduled(cron = "0 0 0 * * ?")
    public void fetchAt12AmEachDay() throws IOException {
        Sdn data = sdnApiService.getData();
        sdnEntryService.saveData(data.getSdnEntry());
    }
}
