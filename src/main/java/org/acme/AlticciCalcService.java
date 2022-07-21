package org.acme;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.cache.CacheResult;

@ApplicationScoped
class AlticciCalcService {

    @CacheResult(cacheName = "alticci-cache")
    public int calc(int n){
        try {
            //only for validate cache
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (n <= 0) {
            return 0;
        }

        if (n >= 1 && n <= 2) {
            return 1;
        }

        return calc(n - 3) + calc(n - 2);
    }
}
