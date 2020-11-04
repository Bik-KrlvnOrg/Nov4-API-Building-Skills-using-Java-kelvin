package com.example.api.schedule;


import com.example.api.model.Sdn;
import com.example.api.service.SdnRepoService;
import com.example.api.service.SdnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ScheduledTasks {

    private SdnService sdnService;
    private SdnRepoService sdnRepoService;

    public ScheduledTasks() {
    }

    @Autowired
    public ScheduledTasks(SdnService sdnService, SdnRepoService sdnRepoService) {
        this.sdnService = sdnService;
        this.sdnRepoService = sdnRepoService;
    }

    @Scheduled(cron = "0 0 0 * * ?")
    public void fetchAt12AmEachDay() throws IOException {
        Sdn data = sdnService.getData();
        sdnRepoService.saveData(data.getSdnEntry());
    }
}
