package com.ivy.core.domain.action.transaction

import androidx.sqlite.db.SupportSQLiteQuery
import com.ivy.core.persistence.dao.trn.AccountIdAndTrnTime
import com.ivy.core.persistence.dao.trn.TransactionDao
import com.ivy.core.persistence.entity.attachment.AttachmentEntity
import com.ivy.core.persistence.entity.trn.TransactionEntity
import com.ivy.core.persistence.entity.trn.TrnMetadataEntity
import com.ivy.core.persistence.entity.trn.TrnTagEntity
import com.ivy.data.SyncState

class TransactionDaoFake: TransactionDao() {

    val transactions = mutableListOf<TransactionEntity>()
    val tags = mutableListOf<TrnTagEntity>()
    val attachments = mutableListOf<AttachmentEntity>()
    val metadatas = mutableListOf<TrnMetadataEntity>()

    override suspend fun saveTrnEntity(entity: TransactionEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun updateTrnTagsSyncByTrnId(trnId: String, sync: SyncState) {
        TODO("Not yet implemented")
    }

    override suspend fun saveTags(entity: List<TrnTagEntity>) {
        TODO("Not yet implemented")
    }

    override suspend fun updateAttachmentsSyncByAssociatedId(
        associatedId: String,
        sync: SyncState
    ) {
        TODO("Not yet implemented")
    }

    override suspend fun saveAttachments(entity: List<AttachmentEntity>) {
        TODO("Not yet implemented")
    }

    override suspend fun updateMetadataSyncByTrnId(trnId: String, sync: SyncState) {
        TODO("Not yet implemented")
    }

    override suspend fun saveMetadata(entity: List<TrnMetadataEntity>) {
        TODO("Not yet implemented")
    }

    override suspend fun findAllBlocking(): List<TransactionEntity> {
        TODO("Not yet implemented")
    }

    override suspend fun findBySQL(query: SupportSQLiteQuery): List<TransactionEntity> {
        TODO("Not yet implemented")
    }

    override suspend fun findAccountIdAndTimeById(trnId: String): AccountIdAndTrnTime? {
        TODO("Not yet implemented")
    }

    override suspend fun updateTrnEntitySyncById(trnId: String, sync: SyncState) {
        TODO("Not yet implemented")
    }

}
