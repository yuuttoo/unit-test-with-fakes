package com.ivy.core.domain.action.transaction

import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class WriteTrnsActTest {
    //WriteTrnsAct 需要的建構參數di 都要拿過來初始化
    private lateinit var writeTrnsAct: WriteTrnsAct
    private lateinit var transationDaoFake: TransactionDaoFake
    private lateinit var timeProviderFake: TimeProviderFake
    private lateinit var accountCacheDaoFake: AccountCacheDaoFake



    @BeforeEach
    fun setUp() {

    }

    @Test
    fun `Test transactions are saved` () {

    }

}