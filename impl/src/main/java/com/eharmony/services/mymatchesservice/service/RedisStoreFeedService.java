package com.eharmony.services.mymatchesservice.service;

import rx.Observable;

public interface RedisStoreFeedService {
    
    public Observable<RedisStoreFeedResponse> getUserMatchesSafe(BasicStoreFeedRequestContext request);

}
