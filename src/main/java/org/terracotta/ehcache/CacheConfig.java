package org.terracotta.ehcache;


import org.springframework.boot.autoconfigure.cache.JCacheManagerCustomizer;
import org.springframework.stereotype.Component;

import javax.cache.Cache;
import javax.cache.CacheManager;
import javax.cache.configuration.MutableConfiguration;
import javax.cache.expiry.CreatedExpiryPolicy;
import javax.cache.expiry.Duration;
import java.util.concurrent.TimeUnit;


@Component
public class CacheConfig implements JCacheManagerCustomizer
{
    @Override
    public void customize(CacheManager cacheManager)
    {
        cacheManager.createCache("people", new MutableConfiguration<>()
                .setExpiryPolicyFactory(CreatedExpiryPolicy.factoryOf(new Duration(TimeUnit.SECONDS, 10)))
                .setStoreByValue(false)
                .setStatisticsEnabled(true));

    }
}