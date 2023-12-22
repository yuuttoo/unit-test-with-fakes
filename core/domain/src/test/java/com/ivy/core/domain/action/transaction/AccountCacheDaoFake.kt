package com.ivy.core.domain.action.transaction

import com.ivy.core.persistence.algorithm.accountcache.AccountCacheDao
import com.ivy.core.persistence.algorithm.accountcache.AccountCacheEntity
import kotlinx.coroutines.flow.Flow
import java.time.Instant

class AccountCacheDaoFake: AccountCacheDao {
    override fun findAccountCache(accountId: String): Flow<AccountCacheEntity?> {
        TODO("Not yet implemented")
    }

    override suspend fun findTimestampById(accountId: String): Instant? {
        TODO("Not yet implemented")
    }

    override suspend fun save(cache: AccountCacheEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun delete(accountId: String) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAll() {
        TODO("Not yet implemented")
    }

}
