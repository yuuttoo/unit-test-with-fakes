package com.ivy.core.domain.action.transaction

import com.ivy.common.time.provider.TimeProvider
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId

class TimeProviderFake: TimeProvider {
    override fun timeNow(): LocalDateTime {
        TODO("Not yet implemented")
    }

    override fun dateNow(): LocalDate {
        TODO("Not yet implemented")
    }

    override fun zoneId(): ZoneId {
        TODO("Not yet implemented")
    }

}
